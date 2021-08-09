package com.bootdo.fm.controller;

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

import com.bootdo.fm.domain.GrossDO;
import com.bootdo.fm.service.GrossService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2020-08-21 15:43:24
 */
 
@Controller
@RequestMapping("/fm/gross")
public class GrossController {
	@Autowired
	private GrossService grossService;
	
	@GetMapping()
	@RequiresPermissions("fm:gross:gross")
	String Gross(){
	    return "fm/gross/gross";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("fm:gross:gross")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<GrossDO> grossList = grossService.list(query);
		int total = grossService.count(query);
		PageUtils pageUtils = new PageUtils(grossList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("fm:gross:add")
	String add(){
	    return "fm/gross/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("fm:gross:edit")
	String edit(@PathVariable("id") Integer id,Model model){
		GrossDO gross = grossService.get(id);
		model.addAttribute("gross", gross);
	    return "fm/gross/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("fm:gross:add")
	public R save( GrossDO gross){
		if(grossService.save(gross)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("fm:gross:edit")
	public R update( GrossDO gross){
		grossService.update(gross);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("fm:gross:remove")
	public R remove( Integer id){
		if(grossService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("fm:gross:batchRemove")
	public R remove(@RequestParam("ids[]") Integer[] ids){
		grossService.batchRemove(ids);
		return R.ok();
	}
	
}
