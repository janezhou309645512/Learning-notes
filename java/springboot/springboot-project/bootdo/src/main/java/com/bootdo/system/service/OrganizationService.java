package com.bootdo.system.service;

import com.bootdo.system.domain.OrganizationDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2019-03-18 14:08:13
 */
public interface OrganizationService {
	
	OrganizationDO get(Integer id);
	
	List<OrganizationDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(OrganizationDO organization);
	
	int update(OrganizationDO organization);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);
}
