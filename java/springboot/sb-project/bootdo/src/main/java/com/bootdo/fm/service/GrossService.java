package com.bootdo.fm.service;

import com.bootdo.fm.domain.GrossDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2020-08-21 15:43:24
 */
public interface GrossService {
	
	GrossDO get(Integer id);
	
	List<GrossDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(GrossDO gross);
	
	int update(GrossDO gross);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);
}
