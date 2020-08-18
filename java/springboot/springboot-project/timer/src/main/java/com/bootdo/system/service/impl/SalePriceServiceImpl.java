package com.bootdo.system.service.impl;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bootdo.system.dao.SalePriceDao;
import com.bootdo.system.domain.OutPutValueDO;
import com.bootdo.system.domain.OutputValueJobDO;
import com.bootdo.system.domain.SalePriceDO;
import com.bootdo.system.service.SalePriceService;

//@CacheConfig(cacheNames = "user")
@Transactional
@Service
public class SalePriceServiceImpl implements SalePriceService {
    @Autowired
    SalePriceDao downDao;
    private static final Logger logger = LoggerFactory.getLogger(SalePriceService.class);


    @Override
    public List<SalePriceDO> salePriceView(Map<String, Object> map) {
        return downDao.salePriceView(map);
    }


    @Override
    public List<OutPutValueDO> outPutView(Map<String, Object> map) {
        return downDao.outPutView(map);
    }


    @Override
    public List<OutputValueJobDO> outPutJob(Map<String, Object> map) {
        // TODO Auto-generated method stub
        return downDao.outPutJob(map);
    }


    @Override
    public List<SalePriceDO> punchingSalePriceView(Map<String, Object> map) {
        return downDao.punchingSalePriceView(map);
    }


    @Override
    public List<SalePriceDO> dieCutCrossWiringSalePriceview(Map<String, Object> map) {
        return downDao.dieCutCrossWiringSalePriceview(map);
    }


}
