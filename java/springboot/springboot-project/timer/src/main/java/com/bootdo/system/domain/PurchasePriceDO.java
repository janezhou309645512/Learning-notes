package com.bootdo.system.domain;

import java.io.Serializable;
import java.math.BigDecimal;


/**
 * 采购单价表
 *
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2019-03-15 11:22:32
 */
public class PurchasePriceDO implements Serializable {
    private static final long serialVersionUID = 1L;

    //采购组织
    private String purchaseName;
    //来源单据编码
    private String srcnumber;
    //单据编码
    private String billfnumber;
    //单据状态 4-审核
    private String billstatus;
    //业务日期
    private String bizdate;
    //业务类型
    private String bizName;
    //事务类型
    private String tranName;
    //是否赠品
    private String FisPresent;
    //物料编码
    private String materialNumber;
    //物料名称
    private String materialName;
    //规格型号
    private String fmodel;
    //数量
    private BigDecimal entryqty = BigDecimal.ZERO;
    //计量单位
    private String measurename;
    //基本数量
    private String entrybaseqty;
    //基本计量单位
    private String basemeasurename;
    //部门
    private String depName;
    //仓库
    private String warename;
    //建单人
    private String creatorName;
    //建单时间
    private String createTime;
    //审核人
    private String auditorName;
    //审核时间
    private String auditTime;
    //修改人
    private String modifyName;
    //修改时间
    private String modifyTime;
    //采购员
    private String purchasePersion;
    //报关单号
    private String declaraNumber;
    //备注
    private String remark;
    //摘要
    private String pmcRequ;
    //采购成本
    private BigDecimal purchaseCost = BigDecimal.ZERO;
    //单位采购成本
    private BigDecimal fUnitPurchaseCost = BigDecimal.ZERO;
    //供应商
    private String supplierName;
    //币别
    private String bb;
    //汇率
    private String hl;
    //是否含税
    private String sfhs;

    //编码1
    private String bm1;

    //编码2
    private String bm2;

    //编码3
    private String bm3;
    //单价含关税
    private BigDecimal priceOne = BigDecimal.ZERO;
    //单价不含关税
    private BigDecimal priceTwo = BigDecimal.ZERO;
    //关税率
    private BigDecimal gsl = BigDecimal.ZERO;
    //常用单价
    private BigDecimal dailyPrice = BigDecimal.ZERO;
    //基本单位单价
    private BigDecimal baseUnitPrice = BigDecimal.ZERO;

    public String getPurchaseName() {
        return purchaseName;
    }

    public void setPurchaseName(String purchaseName) {
        this.purchaseName = purchaseName;
    }

    public String getSrcnumber() {
        return srcnumber;
    }

    public void setSrcnumber(String srcnumber) {
        this.srcnumber = srcnumber;
    }

    public String getBillfnumber() {
        return billfnumber;
    }

    public void setBillfnumber(String billfnumber) {
        this.billfnumber = billfnumber;
    }

    public String getBizdate() {
        return bizdate;
    }

    public void setBizdate(String bizdate) {
        this.bizdate = bizdate;
    }

    public String getBizName() {
        return bizName;
    }

    public void setBizName(String bizName) {
        this.bizName = bizName;
    }

    public String getTranName() {
        return tranName;
    }

    public void setTranName(String tranName) {
        this.tranName = tranName;
    }

    public String getMaterialNumber() {
        return materialNumber;
    }

    public void setMaterialNumber(String materialNumber) {
        this.materialNumber = materialNumber;
    }

    public BigDecimal getEntryqty() {
        return entryqty;
    }

    public void setEntryqty(BigDecimal entryqty) {
        this.entryqty = entryqty.setScale(4, BigDecimal.ROUND_HALF_DOWN);
    }

    public String getMeasurename() {
        return measurename;
    }

    public void setMeasurename(String measurename) {
        this.measurename = measurename;
    }

    public String getEntrybaseqty() {
        return entrybaseqty;
    }

    public void setEntrybaseqty(String entrybaseqty) {
        this.entrybaseqty = entrybaseqty;
    }

    public String getBasemeasurename() {
        return basemeasurename;
    }

    public void setBasemeasurename(String basemeasurename) {
        this.basemeasurename = basemeasurename;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public String getWarename() {
        return warename;
    }

    public void setWarename(String warename) {
        this.warename = warename;
    }

    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getAuditorName() {
        return auditorName;
    }

    public void setAuditorName(String auditorName) {
        this.auditorName = auditorName;
    }

    public String getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(String auditTime) {
        this.auditTime = auditTime;
    }

    public String getModifyName() {
        return modifyName;
    }

    public void setModifyName(String modifyName) {
        this.modifyName = modifyName;
    }

    public String getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getPurchasePersion() {
        return purchasePersion;
    }

    public void setPurchasePersion(String purchasePersion) {
        this.purchasePersion = purchasePersion;
    }

    public String getDeclaraNumber() {
        return declaraNumber;
    }

    public void setDeclaraNumber(String declaraNumber) {
        this.declaraNumber = declaraNumber;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getPmcRequ() {
        return pmcRequ;
    }

    public void setPmcRequ(String pmcRequ) {
        this.pmcRequ = pmcRequ;
    }

    public BigDecimal getPurchaseCost() {
        return purchaseCost;
    }

    public void setPurchaseCost(BigDecimal purchaseCost) {
        this.purchaseCost = purchaseCost.setScale(4, BigDecimal.ROUND_HALF_DOWN);
    }

    public BigDecimal getfUnitPurchaseCost() {
        return fUnitPurchaseCost;
    }

    public void setfUnitPurchaseCost(BigDecimal fUnitPurchaseCost) {
        this.fUnitPurchaseCost = fUnitPurchaseCost.setScale(4, BigDecimal.ROUND_HALF_DOWN);
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }


    public String getBillstatus() {
        return billstatus;
    }

    public void setBillstatus(String billstatus) {
        this.billstatus = billstatus;
    }


    public String getSfhs() {
        return sfhs;
    }

    public void setSfhs(String sfhs) {
        this.sfhs = sfhs;
    }


    public String getBb() {
        return bb;
    }

    public void setBb(String bb) {
        this.bb = bb;
    }

    public String getHl() {
        return hl;
    }

    public void setHl(String hl) {
        this.hl = hl;
    }

    public String getFisPresent() {
        return FisPresent;
    }

    public void setFisPresent(String fisPresent) {
        FisPresent = fisPresent;
    }


    public String getBm1() {
        return bm1;
    }

    public void setBm1(String bm1) {
        this.bm1 = bm1;
    }

    public String getBm2() {
        return bm2;
    }

    public void setBm2(String bm2) {
        this.bm2 = bm2;
    }


    public String getBm3() {
        return bm3;
    }

    public void setBm3(String bm3) {
        this.bm3 = bm3;
    }

    public BigDecimal getPriceOne() {
        return priceOne;
    }

    public void setPriceOne(BigDecimal priceOne) {
        this.priceOne = priceOne;
    }

    public BigDecimal getPriceTwo() {
        return priceTwo;
    }

    public void setPriceTwo(BigDecimal priceTwo) {
        this.priceTwo = priceTwo;
    }

    public BigDecimal getGsl() {
        return gsl;
    }

    public void setGsl(BigDecimal gsl) {
        this.gsl = gsl;
    }


    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }

    public String getFmodel() {
        return fmodel;
    }

    public void setFmodel(String fmodel) {
        this.fmodel = fmodel;
    }


    public BigDecimal getDailyPrice() {
        return dailyPrice;
    }

    public void setDailyPrice(BigDecimal dailyPrice) {
        this.dailyPrice = dailyPrice;
    }

    public BigDecimal getBaseUnitPrice() {
        return baseUnitPrice;
    }

    public void setBaseUnitPrice(BigDecimal baseUnitPrice) {
        this.baseUnitPrice = baseUnitPrice;
    }

    @Override
    public String toString() {
        return "PurchasePriceDO [purchaseName=" + purchaseName + ", srcnumber=" + srcnumber + ", billfnumber="
                + billfnumber + ", billstatus=" + billstatus + ", bizdate=" + bizdate + ", bizName=" + bizName
                + ", tranName=" + tranName + ", FisPresent=" + FisPresent + ", materialNumber=" + materialNumber
                + ", materialName=" + materialName + ", fmodel=" + fmodel + ", entryqty=" + entryqty + ", measurename="
                + measurename + ", entrybaseqty=" + entrybaseqty + ", basemeasurename=" + basemeasurename + ", depName="
                + depName + ", warename=" + warename + ", creatorName=" + creatorName + ", createTime=" + createTime
                + ", auditorName=" + auditorName + ", auditTime=" + auditTime + ", modifyName=" + modifyName
                + ", modifyTime=" + modifyTime + ", purchasePersion=" + purchasePersion + ", declaraNumber="
                + declaraNumber + ", remark=" + remark + ", pmcRequ=" + pmcRequ + ", purchaseCost=" + purchaseCost
                + ", fUnitPurchaseCost=" + fUnitPurchaseCost + ", supplierName=" + supplierName + ", bb=" + bb + ", hl="
                + hl + ", sfhs=" + sfhs + ", bm1=" + bm1 + ", bm2=" + bm2 + ", bm3=" + bm3 + ", priceOne=" + priceOne
                + ", priceTwo=" + priceTwo + ", gsl=" + gsl + ", dailyPrice=" + dailyPrice + ", baseUnitPrice="
                + baseUnitPrice + "]";
    }


}
