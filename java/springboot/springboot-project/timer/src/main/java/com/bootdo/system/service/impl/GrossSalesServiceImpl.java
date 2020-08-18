package com.bootdo.system.service.impl;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bootdo.system.dao.GrossSalesDao;
import com.bootdo.system.domain.GrossSalesDO;
import com.bootdo.system.service.GrossSalesService;

//@CacheConfig(cacheNames = "user")
@Transactional
@Service
public class GrossSalesServiceImpl implements GrossSalesService {
    @Autowired
    GrossSalesDao grossMapper;
    private static final Logger logger = LoggerFactory.getLogger(GrossSalesService.class);


    @Override
    public List<GrossSalesDO> grossSaleView(Map<String, Object> map) {
        return grossMapper.grossSaleView(map);
    }


    @Override
    public int grossSaleViewCount(Map<String, Object> map) {
        return grossMapper.grossSaleViewCount(map);
    }

}
