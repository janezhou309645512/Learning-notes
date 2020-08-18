package com.bootdo.system.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.bootdo.system.domain.ADUserDO;
import com.bootdo.system.domain.GrossSalesDO;

@Service
public interface GrossSalesService {

    List<GrossSalesDO> grossSaleView(Map<String, Object> map);

    int grossSaleViewCount(Map<String, Object> map);

}
