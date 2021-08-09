package com.bootdo.system.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.bootdo.system.domain.OutPutValueDO;
import com.bootdo.system.domain.OutPutValueVO;
import com.bootdo.system.domain.OutputValueJobDO;
import com.bootdo.system.domain.SalePriceDO;

@Mapper
public interface SalePriceDao {

    List<SalePriceDO> salePriceView(Map<String, Object> map);

    List<OutPutValueDO> outPutView(Map<String, Object> map);

    List<OutputValueJobDO> outPutJob(Map<String, Object> map);

    List<OutPutValueVO> outPutMap(Map<String, Object> map);

    List<SalePriceDO> punchingSalePriceView(Map<String, Object> map);

    List<SalePriceDO> dieCutCrossWiringSalePriceview(Map<String, Object> map);

}
