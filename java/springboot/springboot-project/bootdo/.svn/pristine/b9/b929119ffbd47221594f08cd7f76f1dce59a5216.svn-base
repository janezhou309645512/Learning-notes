package com.bootdo.system.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.system.dao.OrganizationDao;
import com.bootdo.system.domain.OrganizationDO;
import com.bootdo.system.service.OrganizationService;



@Service
public class OrganizationServiceImpl implements OrganizationService {
	@Autowired
	private OrganizationDao organizationDao;
	
	@Override
	public OrganizationDO get(Integer id){
		return organizationDao.get(id);
	}
	
	@Override
	public List<OrganizationDO> list(Map<String, Object> map){
		return organizationDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return organizationDao.count(map);
	}
	
	@Override
	public int save(OrganizationDO organization){
		return organizationDao.save(organization);
	}
	
	@Override
	public int update(OrganizationDO organization){
		return organizationDao.update(organization);
	}
	
	@Override
	public int remove(Integer id){
		return organizationDao.remove(id);
	}
	
	@Override
	public int batchRemove(Integer[] ids){
		return organizationDao.batchRemove(ids);
	}
	
}
