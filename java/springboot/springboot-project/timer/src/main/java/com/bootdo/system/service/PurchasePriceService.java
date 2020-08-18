package com.bootdo.system.service;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Service;

import com.bootdo.system.domain.FmaterialJobDO;
import com.bootdo.system.domain.PurchasePriceDO;
import com.bootdo.system.domain.PurchasePriceTmpDO;

@Service
public interface PurchasePriceService {

    List<PurchasePriceDO> purchasePriceView(Map<String, Object> map);

    List<PurchasePriceTmpDO> purchasePriceTmp(Map<String, Object> map);

    List<FmaterialJobDO> fmaterialJobView(Map<String, Object> map);

    int purchasePriceCount(Map<String, Object> map);

    void export(Map<String, Object> params, HttpServletResponse response) throws Exception;

    List<PurchasePriceDO> purchasePriceJob(Map<String, Object> map);

    List<PurchasePriceDO> getWareHouseList(Map<String, Object> map);

    List<PurchasePriceDO> punchingPurchasePriceJob(Map<String, Object> map);

    List<FmaterialJobDO> findRkslList(Map<String, Object> map);
}
