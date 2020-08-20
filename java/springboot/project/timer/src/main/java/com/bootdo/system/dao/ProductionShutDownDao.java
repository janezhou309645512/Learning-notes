package com.bootdo.system.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

import com.bootdo.system.domain.ADUserDO;
import com.bootdo.system.domain.GrossSalesDO;
import com.bootdo.system.domain.ProductionShutDownDO;

@Mapper
public interface ProductionShutDownDao {

    List<ProductionShutDownDO> productionShutDownView(Map<String, Object> map);

}
