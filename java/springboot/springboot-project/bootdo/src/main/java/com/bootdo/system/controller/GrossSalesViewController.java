package com.bootdo.system.controller;

import java.util.List;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bootdo.system.domain.GrossSalesViewDO;
import com.bootdo.system.service.GrossSalesViewService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2019-03-14 17:00:42
 */
 
@Controller
@RequestMapping("/system/grossSalesView")
public class GrossSalesViewController {
	@Autowired
	private GrossSalesViewService grossSalesViewService;
	
	@GetMapping()
//	@RequiresPermissions("system:grossSalesView:grossSalesView")
	String GrossSalesView(){
	    return "system/grossSalesView/grossSalesView";
	}
	
	@GetMapping("/listView")
	@RequiresPermissions("system:grossSalesView:listView")
	String listView(){
	    return "system/grossSalesView/listView";
	}
	
	
	@ResponseBody
	@GetMapping("/list")
//	@RequiresPermissions("system:grossSalesView:grossSalesView")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<GrossSalesViewDO> grossSalesViewList = grossSalesViewService.list(query);
		int total = grossSalesViewService.count(query);
		PageUtils pageUtils = new PageUtils(grossSalesViewList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("system:grossSalesView:add")
	String add(){
	    return "system/grossSalesView/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("system:grossSalesView:edit")
	String edit(@PathVariable("id") Integer id,Model model){
		GrossSalesViewDO grossSalesView = grossSalesViewService.get(id);
		model.addAttribute("grossSalesView", grossSalesView);
	    return "system/grossSalesView/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("system:grossSalesView:add")
	public R save( GrossSalesViewDO grossSalesView){
		if(grossSalesViewService.save(grossSalesView)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("system:grossSalesView:edit")
	public R update( GrossSalesViewDO grossSalesView){
		grossSalesViewService.update(grossSalesView);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("system:grossSalesView:remove")
	public R remove( Integer id){
		if(grossSalesViewService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("system:grossSalesView:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] ids){
		grossSalesViewService.batchRemove(ids);
		return R.ok();
	}
	
}
