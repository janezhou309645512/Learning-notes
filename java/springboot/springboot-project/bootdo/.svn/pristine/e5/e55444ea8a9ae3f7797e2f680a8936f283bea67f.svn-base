package com.bootdo.system.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

import com.bootdo.system.dao.GrossSalesViewDao;
import com.bootdo.system.domain.GrossSalesViewDO;
import com.bootdo.system.service.GrossSalesViewService;



@Service
public class GrossSalesViewServiceImpl implements GrossSalesViewService {
	@Autowired
	private GrossSalesViewDao grossSalesViewDao;
	
	@Override
	public GrossSalesViewDO get(Integer id){
		return grossSalesViewDao.get(id);
	}
	
	@Override
	public List<GrossSalesViewDO> list(Map<String, Object> map){
		return grossSalesViewDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return grossSalesViewDao.count(map);
	}
	
	@Override
	public int save(GrossSalesViewDO grossSalesView){
		return grossSalesViewDao.save(grossSalesView);
	}
	
	@Override
	public int update(GrossSalesViewDO grossSalesView){
		return grossSalesViewDao.update(grossSalesView);
	}
	
	@Override
	public int remove(Integer id){
		return grossSalesViewDao.remove(id);
	}
	
	@Override
	public int batchRemove(Integer[] ids){
		return grossSalesViewDao.batchRemove(ids);
	}
	
	@Transactional
	@Override
	public int batchSave(List<GrossSalesViewDO> list){
		return grossSalesViewDao.batchSave(list);
	}
	
	@Transactional
	@Override
	public int batchUpdate(List<GrossSalesViewDO> list){
		return grossSalesViewDao.batchUpdate(list);
	}
	
	
	@Transactional
	@Override
	public boolean syncDate(List<GrossSalesViewDO> list){
		if(batchSave(list)>0) {
			return true;
		}else {
			return false;
		}
	};
	

	
}
