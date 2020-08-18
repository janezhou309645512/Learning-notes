package com.bootdo.system.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.bootdo.system.domain.OutPutValueDO;
import com.bootdo.system.domain.OutPutValueVO;
import com.bootdo.system.domain.OutputValueJobDO;
import com.bootdo.system.domain.ProductionShutDownDO;
import com.bootdo.system.domain.SalePriceDO;

@Service
public interface SalePriceService {

    List<SalePriceDO> salePriceView(Map<String, Object> map);


    List<OutPutValueDO> outPutView(Map<String, Object> map);

    List<OutputValueJobDO> outPutJob(Map<String, Object> map);


    List<SalePriceDO> punchingSalePriceView(Map<String, Object> map);


    List<SalePriceDO> dieCutCrossWiringSalePriceview(Map<String, Object> map);

}
