package com.bootdo.system.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.bootdo.system.domain.PunchingOutsourceDO;

@Mapper
public interface PunchingOutsourceDao {
    List<PunchingOutsourceDO> list(Map<String, Object> map);
}
