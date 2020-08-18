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

import com.bootdo.system.domain.UserPermissionDO;
import com.bootdo.system.service.UserPermissionService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2019-03-18 14:08:22
 */
 
@Controller
@RequestMapping("/system/userPermission")
public class UserPermissionController {
	@Autowired
	private UserPermissionService userPermissionService;
	
	@GetMapping()
	@RequiresPermissions("system:userPermission:userPermission")
	String UserPermission(){
	    return "system/userPermission/userPermission";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("system:userPermission:userPermission")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<UserPermissionDO> userPermissionList = userPermissionService.list(query);
		int total = userPermissionService.count(query);
		PageUtils pageUtils = new PageUtils(userPermissionList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("system:userPermission:add")
	String add(){
	    return "system/userPermission/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("system:userPermission:edit")
	String edit(@PathVariable("id") Integer id,Model model){
		UserPermissionDO userPermission = userPermissionService.get(id);
		model.addAttribute("userPermission", userPermission);
	    return "system/userPermission/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("system:userPermission:add")
	public R save( UserPermissionDO userPermission){
		if(userPermissionService.save(userPermission)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("system:userPermission:edit")
	public R update( UserPermissionDO userPermission){
		userPermissionService.update(userPermission);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("system:userPermission:remove")
	public R remove( Integer id){
		if(userPermissionService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("system:userPermission:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] ids){
		userPermissionService.batchRemove(ids);
		return R.ok();
	}
	
}
