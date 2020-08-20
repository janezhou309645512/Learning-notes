package com.bootdo.system.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.bootdo.system.domain.FmaterialJobDO;
import com.bootdo.system.domain.PurchasePriceDO;
import com.bootdo.system.domain.PurchasePriceTmpDO;

@Mapper
public interface PurchasePriceDao {

    List<PurchasePriceDO> purchasePriceView(Map<String, Object> map);

    //查询分切料八码匹配采购单价表数据
    List<PurchasePriceTmpDO> fqlTmp(Map<String, Object> map);

    //查询分切料全码匹配采购单价表数据
    List<PurchasePriceTmpDO> fqlAllTmp(Map<String, Object> map);

    List<FmaterialJobDO> fmaterialJobView(Map<String, Object> map);

    int purchasePriceCount(Map<String, Object> map);

    List<PurchasePriceDO> purchasePriceExportView(Map<String, Object> map);

    List<PurchasePriceDO> purchasePriceJob(Map<String, Object> map);

    List<PurchasePriceDO> getWareHouseList(Map<String, Object> map);

    List<PurchasePriceTmpDO> fqlAllTmpThree(Map<String, Object> map);

    List<PurchasePriceDO> punchingPurchasePriceJob(Map<String, Object> map);

    List<FmaterialJobDO> findRkslList(Map<String, Object> map);

}
