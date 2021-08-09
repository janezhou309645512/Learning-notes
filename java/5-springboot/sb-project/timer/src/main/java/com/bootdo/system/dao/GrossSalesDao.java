package com.bootdo.system.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

import com.bootdo.system.domain.ADUserDO;
import com.bootdo.system.domain.GrossSalesDO;

@Mapper
public interface GrossSalesDao {

    List<GrossSalesDO> grossSaleView(Map<String, Object> map);

    int grossSaleViewCount(Map<String, Object> map);

}
