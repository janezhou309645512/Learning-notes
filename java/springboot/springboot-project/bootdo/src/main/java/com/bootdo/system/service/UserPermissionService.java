package com.bootdo.system.service;

import com.bootdo.system.domain.UserPermissionDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2019-03-18 14:08:22
 */
public interface UserPermissionService {
	
	UserPermissionDO get(Integer id);
	
	List<UserPermissionDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(UserPermissionDO userPermission);
	
	int update(UserPermissionDO userPermission);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);
}
