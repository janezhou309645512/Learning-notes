package com.bootdo.system.service.impl;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bootdo.system.dao.PunchingOutsourceDao;
import com.bootdo.system.domain.PunchingOutsourceDO;
import com.bootdo.system.service.PunchingOutsourceService;
import com.bootdo.system.service.SalePriceService;

//@CacheConfig(cacheNames = "user")
@Transactional
@Service
public class PunchingOutsourceServiceImpl implements PunchingOutsourceService {
    @Autowired
    PunchingOutsourceDao downDao;
    private static final Logger logger = LoggerFactory.getLogger(SalePriceService.class);

    @Override
    public List<PunchingOutsourceDO> list(Map<String, Object> map) {
        return downDao.list(map);
    }


}
