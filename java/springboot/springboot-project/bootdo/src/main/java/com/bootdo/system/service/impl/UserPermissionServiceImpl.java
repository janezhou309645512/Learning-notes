package com.bootdo.system.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.system.dao.UserPermissionDao;
import com.bootdo.system.domain.UserPermissionDO;
import com.bootdo.system.service.UserPermissionService;



@Service
public class UserPermissionServiceImpl implements UserPermissionService {
	@Autowired
	private UserPermissionDao userPermissionDao;
	
	@Override
	public UserPermissionDO get(Integer id){
		return userPermissionDao.get(id);
	}
	
	@Override
	public List<UserPermissionDO> list(Map<String, Object> map){
		return userPermissionDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return userPermissionDao.count(map);
	}
	
	@Override
	public int save(UserPermissionDO userPermission){
		return userPermissionDao.save(userPermission);
	}
	
	@Override
	public int update(UserPermissionDO userPermission){
		return userPermissionDao.update(userPermission);
	}
	
	@Override
	public int remove(Integer id){
		return userPermissionDao.remove(id);
	}
	
	@Override
	public int batchRemove(Integer[] ids){
		return userPermissionDao.batchRemove(ids);
	}
	
}
