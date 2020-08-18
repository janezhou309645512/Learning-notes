package com.bootdo.system.service;

import java.util.List;
import java.util.Map;

import com.bootdo.system.domain.GrossSalesViewDO;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2019-03-14 17:00:42
 */
public interface GrossSalesViewService {
	
	GrossSalesViewDO get(Integer id);
	
	List<GrossSalesViewDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(GrossSalesViewDO grossSalesView);
	
	int update(GrossSalesViewDO grossSalesView);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);
	
	int batchSave(List<GrossSalesViewDO> list);
	
	boolean syncDate(List<GrossSalesViewDO> list);
	
	int batchUpdate(List<GrossSalesViewDO> list);
	
}
