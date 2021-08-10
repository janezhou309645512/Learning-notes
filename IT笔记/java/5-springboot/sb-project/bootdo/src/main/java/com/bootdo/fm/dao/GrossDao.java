package com.bootdo.fm.dao;

import com.bootdo.fm.domain.GrossDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2020-08-21 15:43:24
 */
@Mapper
public interface GrossDao {

	GrossDO get(Integer id);
	
	List<GrossDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(GrossDO gross);
	
	int update(GrossDO gross);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);
}
