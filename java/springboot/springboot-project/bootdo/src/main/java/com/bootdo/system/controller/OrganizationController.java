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

import com.bootdo.system.domain.OrganizationDO;
import com.bootdo.system.service.OrganizationService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2019-03-18 14:08:13
 */
 
@Controller
@RequestMapping("/system/organization")
public class OrganizationController {
	@Autowired
	private OrganizationService organizationService;
	
	@GetMapping()
	@RequiresPermissions("system:organization:organization")
	String Organization(){
	    return "system/organization/organization";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("system:organization:organization")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<OrganizationDO> organizationList = organizationService.list(query);
		int total = organizationService.count(query);
		PageUtils pageUtils = new PageUtils(organizationList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("system:organization:add")
	String add(){
	    return "system/organization/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("system:organization:edit")
	String edit(@PathVariable("id") Integer id,Model model){
		OrganizationDO organization = organizationService.get(id);
		model.addAttribute("organization", organization);
	    return "system/organization/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("system:organization:add")
	public R save( OrganizationDO organization){
		if(organizationService.save(organization)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("system:organization:edit")
	public R update( OrganizationDO organization){
		organizationService.update(organization);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("system:organization:remove")
	public R remove( Integer id){
		if(organizationService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("system:organization:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] ids){
		organizationService.batchRemove(ids);
		return R.ok();
	}
	
}
