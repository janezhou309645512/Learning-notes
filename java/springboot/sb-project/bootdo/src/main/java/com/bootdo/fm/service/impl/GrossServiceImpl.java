package com.bootdo.fm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.fm.dao.GrossDao;
import com.bootdo.fm.domain.GrossDO;
import com.bootdo.fm.service.GrossService;



@Service
public class GrossServiceImpl implements GrossService {
	@Autowired
	private GrossDao grossDao;
	
	@Override
	public GrossDO get(Integer id){
		return grossDao.get(id);
	}
	
	@Override
	public List<GrossDO> list(Map<String, Object> map){
		return grossDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return grossDao.count(map);
	}
	
	@Override
	public int save(GrossDO gross){
		return grossDao.save(gross);
	}
	
	@Override
	public int update(GrossDO gross){
		return grossDao.update(gross);
	}
	
	@Override
	public int remove(Integer id){
		return grossDao.remove(id);
	}
	
	@Override
	public int batchRemove(Integer[] ids){
		return grossDao.batchRemove(ids);
	}
	
}
