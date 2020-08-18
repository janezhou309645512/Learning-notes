package com.bootdo.system.service.impl;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bootdo.system.dao.ProductionShutDownDao;
import com.bootdo.system.domain.ProductionShutDownDO;
import com.bootdo.system.service.ProductionShutDownService;

//@CacheConfig(cacheNames = "user")
@Transactional
@Service
public class ProductionShutDownServiceImpl implements ProductionShutDownService {
    @Autowired
    ProductionShutDownDao downDao;
    private static final Logger logger = LoggerFactory.getLogger(ProductionShutDownService.class);


    @Override
    public List<ProductionShutDownDO> productionShutDownView(Map<String, Object> map) {
        return downDao.productionShutDownView(map);
    }

}
