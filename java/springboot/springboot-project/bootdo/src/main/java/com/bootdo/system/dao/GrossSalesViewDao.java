package com.bootdo.system.dao;

import com.bootdo.system.domain.GrossSalesViewDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2019-03-14 17:00:42
 */
@Mapper
public interface GrossSalesViewDao {

	GrossSalesViewDO get(Integer id);
	
	List<GrossSalesViewDO> list(Map<String,Object> map);
	
	int count(Map<String,Object> map);
	
	int save(GrossSalesViewDO grossSalesView);
	
	int update(GrossSalesViewDO grossSalesView);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);
	
	int batchSave(List<GrossSalesViewDO> list);
	
	int batchUpdate(List<GrossSalesViewDO> list);
	
}
