package com.bootdo.system.service.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.poi.xssf.streaming.SXSSFRow;
import org.apache.poi.xssf.streaming.SXSSFSheet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSONArray;
import com.bootdo.common.utils.DateUtils;
import com.bootdo.common.utils.HttpHelper;
import com.bootdo.common.utils.excel.PoiUtil;
import com.bootdo.common.utils.excel.WriteExcelDataDelegated;
import com.bootdo.system.dao.PurchasePriceDao;
import com.bootdo.system.domain.FmaterialJobDO;
import com.bootdo.system.domain.MaterialTariffDO;
import com.bootdo.system.domain.PurchasePriceDO;
import com.bootdo.system.domain.PurchasePriceTmpDO;
import com.bootdo.system.service.PurchasePriceService;
import com.bootdo.system.service.SalePriceService;
import com.github.pagehelper.PageHelper;

//@CacheConfig(cacheNames = "user")
@Transactional
@Service
public class PurchasePriceServiceImpl implements PurchasePriceService {
    @Autowired
    PurchasePriceDao downDao;
    private static final Logger logger = LoggerFactory.getLogger(SalePriceService.class);


    @Override
    public List<PurchasePriceDO> purchasePriceView(Map<String, Object> map) {
        return downDao.purchasePriceView(map);
    }

    @Override
    public int purchasePriceCount(Map<String, Object> map) {
        return downDao.purchasePriceCount(map);
    }


    @Override
    public List<FmaterialJobDO> fmaterialJobView(Map<String, Object> map) {
        // TODO Auto-generated method stub
        return downDao.fmaterialJobView(map);
    }


    @Override
    public List<PurchasePriceTmpDO> purchasePriceTmp(Map<String, Object> map) {
        if (map.get("findtype").toString().equals("1")) {
            return downDao.fqlTmp(map);
        } else if (map.get("findtype").toString().equals("0")) {
            return downDao.fqlAllTmp(map);
        } else {
            return downDao.fqlAllTmpThree(map);
        }
    }


    public void export(Map<String, Object> map, HttpServletResponse response) throws Exception {
        // 总记录数
        Integer totalRowCount = 0;

        // 导出EXCEL文件名称
        String filaName = "采购单价表" + DateUtils.format(new Date(), "yyyyMMddHHmmss");

        // 标题
        String[] titles = new String[50];

        map.put("zzfws", map.get("zzfws").toString().split("@"));

        totalRowCount = downDao.purchasePriceCount(map);
        titles = new String[]{"采购组织", "来源单据编码", "单据编码", "物料名称", "规格型号", "单据状态", "业务日期", "业务类型", "事物类型", "是否赠送", "物料编码", "数量", "计量单位", "基本数量", "基本计量单位", "部门", "仓库", "建单人", "建单时间", "审核人", "审核时间", "修改人", "修改时间", "采购员", "编码1", "编码2", "编码3", "单价含关税", "单价不含关税", "关税率", "报关单号", "摘要", "采购成本", "单位采购成本", "供应商", "币别", "汇率", "是否含税", "备注"};

        // 开始导入
        PoiUtil.exportExcelToWebsite(response, totalRowCount, filaName, titles, new WriteExcelDataDelegated() {
            @Override
            public void writeExcelData(SXSSFSheet eachSheet, Integer startRowCount, Integer endRowCount, Integer currentPage, Integer pageSize) throws Exception {

                PageHelper.startPage(currentPage, pageSize);
                List<PurchasePriceDO> dos = downDao.purchasePriceExportView(map);

                String params = HttpHelper.httpClientPost("http://10.0.40.89/view/materialTariff/getList", new HashMap<String, Object>(), "UTF-8");
                List<MaterialTariffDO> list = new ArrayList<MaterialTariffDO>();
                Map<String, BigDecimal> mapMater = new HashMap<String, BigDecimal>();
                if (StringUtils.isNotBlank(params) && !"[]".equals(params)) {
                    JSONArray obj = JSONArray.parseArray(params);
                    if (obj.size() > 0) {
                        list = obj.toJavaList(MaterialTariffDO.class);
                    }

                    for (MaterialTariffDO materialTariffDO : list) {
                        mapMater.put(materialTariffDO.getWlbm(), materialTariffDO.getTariff());
                    }
                }


                for (PurchasePriceDO purchasePriceDO : dos) {
                    if ("美元".equals(purchasePriceDO.getBb()) && purchasePriceDO.getWarename().indexOf("非保税") >= 0) {
                        purchasePriceDO.setGsl(mapMater.get(purchasePriceDO.getMaterialNumber()) == null ? BigDecimal.ZERO : mapMater.get(purchasePriceDO.getMaterialNumber()));
                    } else {
                        purchasePriceDO.setGsl(BigDecimal.ZERO);
                    }

                    String wlbms[] = purchasePriceDO.getMaterialNumber().split("-");
                    System.out.println(purchasePriceDO.toString());
                    if ("㎡".equals(purchasePriceDO.getBasemeasurename()) && wlbms.length == 3) {
                        if (new BigDecimal(purchasePriceDO.getBm3()).compareTo(BigDecimal.ZERO) == 0 || purchasePriceDO.getEntryqty().compareTo(BigDecimal.ZERO) == 0) {
                            purchasePriceDO.setPriceTwo(BigDecimal.ZERO);
                        } else {
                            BigDecimal cs = new BigDecimal(purchasePriceDO.getBm3()).divide(new BigDecimal(1000), 6, BigDecimal.ROUND_HALF_UP).multiply(purchasePriceDO.getEntryqty());
                            purchasePriceDO.setPriceTwo(purchasePriceDO.getPurchaseCost().divide(cs, 6, BigDecimal.ROUND_HALF_UP));
                        }
                    } else {
                        purchasePriceDO.setPriceTwo(purchasePriceDO.getfUnitPurchaseCost());
                    }
                    purchasePriceDO.setPriceOne(purchasePriceDO.getPriceOne().multiply((new BigDecimal(1).add(purchasePriceDO.getGsl()))));
                    if (StringUtils.isNotBlank(purchasePriceDO.getFmodel())) {
                        purchasePriceDO.setFmodel("(" + purchasePriceDO.getFmodel() + ")");
                    } else {
                        purchasePriceDO.setFmodel("");
                    }
                }

                System.out.println("################采购单价表##################" + dos.size());
                if (!CollectionUtils.isEmpty(dos)) {

                    // --------------   这一块变量照着抄就行  强迫症 后期也封装起来     ----------------------
                    for (int i = startRowCount; i <= dos.size() + 1; i++) {
                        SXSSFRow eachDataRow = eachSheet.createRow(i);
                        if ((i - startRowCount) < dos.size()) {
                            PurchasePriceDO salesViewDO = dos.get(i - startRowCount);
                            // ---------   这一块变量照着抄就行  强迫症 后期也封装起来     -----------------------
                            eachDataRow.createCell(0).setCellValue(salesViewDO.getPurchaseName() == null ? "" : salesViewDO.getPurchaseName());
                            eachDataRow.createCell(1).setCellValue(salesViewDO.getSrcnumber() == null ? "" : salesViewDO.getSrcnumber());
                            eachDataRow.createCell(2).setCellValue(salesViewDO.getBillfnumber() == null ? "" : salesViewDO.getBillfnumber());
                            eachDataRow.createCell(3).setCellValue(salesViewDO.getMaterialName() == null ? "" : salesViewDO.getMaterialName());
                            eachDataRow.createCell(4).setCellValue(salesViewDO.getFmodel() == null ? "" : salesViewDO.getFmodel());
                            eachDataRow.createCell(5).setCellValue(salesViewDO.getBillstatus() == null ? "" : salesViewDO.getBillstatus());
                            eachDataRow.createCell(6).setCellValue(salesViewDO.getBizdate());
                            eachDataRow.createCell(7).setCellValue(salesViewDO.getBizName() == null ? "" : salesViewDO.getBizName());
                            eachDataRow.createCell(8).setCellValue(salesViewDO.getTranName() == null ? "" : salesViewDO.getTranName());
                            eachDataRow.createCell(9).setCellValue(salesViewDO.getFisPresent() == null ? "" : salesViewDO.getFisPresent());
                            eachDataRow.createCell(10).setCellValue(salesViewDO.getMaterialNumber() == null ? "" : salesViewDO.getMaterialNumber());
                            eachDataRow.createCell(11).setCellValue(salesViewDO.getEntryqty() == null ? 0.0 : salesViewDO.getEntryqty().doubleValue());
                            eachDataRow.createCell(12).setCellValue(salesViewDO.getMeasurename() == null ? "" : salesViewDO.getMeasurename());
                            eachDataRow.createCell(13).setCellValue(salesViewDO.getEntrybaseqty());
                            eachDataRow.createCell(14).setCellValue(salesViewDO.getBasemeasurename() == null ? "" : salesViewDO.getBasemeasurename());
                            eachDataRow.createCell(15).setCellValue(salesViewDO.getDepName() == null ? "" : salesViewDO.getDepName());
                            eachDataRow.createCell(16).setCellValue(salesViewDO.getWarename() == null ? "" : salesViewDO.getWarename());
                            eachDataRow.createCell(17).setCellValue(salesViewDO.getCreatorName() == null ? "" : salesViewDO.getCreatorName());
                            eachDataRow.createCell(18).setCellValue(salesViewDO.getCreateTime() == null ? "" : salesViewDO.getCreateTime());
                            eachDataRow.createCell(19).setCellValue(salesViewDO.getAuditorName() == null ? "" : salesViewDO.getAuditorName());
                            eachDataRow.createCell(20).setCellValue(salesViewDO.getAuditTime() == null ? "" : salesViewDO.getAuditTime());
                            eachDataRow.createCell(21).setCellValue(salesViewDO.getModifyName() == null ? "" : salesViewDO.getModifyName());
                            eachDataRow.createCell(22).setCellValue(salesViewDO.getModifyTime());
                            eachDataRow.createCell(23).setCellValue(salesViewDO.getPurchasePersion());
                            eachDataRow.createCell(24).setCellValue(salesViewDO.getBm1());
                            eachDataRow.createCell(25).setCellValue(salesViewDO.getBm2());
                            eachDataRow.createCell(26).setCellValue(salesViewDO.getBm3());
                            eachDataRow.createCell(27).setCellValue(salesViewDO.getPriceOne() == null ? 0.0 : salesViewDO.getPriceOne().doubleValue());
                            eachDataRow.createCell(28).setCellValue(salesViewDO.getPriceTwo() == null ? 0.0 : salesViewDO.getPriceTwo().doubleValue());
                            eachDataRow.createCell(29).setCellValue(salesViewDO.getGsl() == null ? 0.0 : salesViewDO.getGsl().doubleValue());
                            eachDataRow.createCell(30).setCellValue(salesViewDO.getDeclaraNumber());
                            eachDataRow.createCell(31).setCellValue(salesViewDO.getPmcRequ() == null ? "" : salesViewDO.getPmcRequ());
                            eachDataRow.createCell(32).setCellValue(salesViewDO.getPurchaseCost() == null ? 0.0 : salesViewDO.getPurchaseCost().doubleValue());
                            eachDataRow.createCell(33).setCellValue(salesViewDO.getfUnitPurchaseCost() == null ? 0.0 : salesViewDO.getfUnitPurchaseCost().doubleValue());
                            eachDataRow.createCell(34).setCellValue(salesViewDO.getSupplierName() == null ? "" : salesViewDO.getSupplierName());
                            eachDataRow.createCell(35).setCellValue(salesViewDO.getBb() == null ? "" : salesViewDO.getBb());
                            eachDataRow.createCell(36).setCellValue(salesViewDO.getHl() == null ? "" : salesViewDO.getHl());
                            eachDataRow.createCell(37).setCellValue(salesViewDO.getSfhs() == null ? "" : salesViewDO.getSfhs());
                            eachDataRow.createCell(38).setCellValue(salesViewDO.getRemark() == null ? "" : salesViewDO.getRemark());
//                           if (null != salesViewDO.getUpdateTime()) {
//                               eachDataRow.createCell(10).setCellValue(DateUtil.formatDate(salesViewDO.getUpdateTime(), DateUtil.YYYY_MM_DD_HH_MM_SS));
//                           }
                        }
                    }
                }

            }
        });
    }

    @Override
    public List<PurchasePriceDO> purchasePriceJob(Map<String, Object> map) {
        return downDao.purchasePriceJob(map);
    }

    @Override
    public List<PurchasePriceDO> getWareHouseList(Map<String, Object> map) {
        return downDao.getWareHouseList(map);
    }

    @Override
    public List<PurchasePriceDO> punchingPurchasePriceJob(Map<String, Object> map) {
        return downDao.punchingPurchasePriceJob(map);
    }

    @Override
    public List<FmaterialJobDO> findRkslList(Map<String, Object> map) {
        return downDao.findRkslList(map);
    }
}
