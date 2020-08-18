package com.bootdo.system.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bootdo.common.annotation.Log;
import com.bootdo.common.controller.BaseController;
import com.bootdo.common.domain.FileDO;
import com.bootdo.common.domain.Tree;
import com.bootdo.common.service.FileService;
import com.bootdo.common.utils.MD5Utils;
import com.bootdo.common.utils.R;
import com.bootdo.common.utils.ShiroUtils;
import com.bootdo.system.domain.MenuDO;
import com.bootdo.system.domain.UserDO;
import com.bootdo.system.service.MenuService;
import com.bootdo.system.service.UserService;

@Controller
public class LoginController extends BaseController {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	MenuService menuService;
	@Autowired
	FileService fileService;
	@Autowired
	UserService userService;
	
	@GetMapping({ "/", "" })
	String welcome(Model model) {

		return "redirect:/login";
	}

	@Log("请求访问主页")
	@GetMapping({ "/index" })
	String index(Model model) {
		List<Tree<MenuDO>> menus = menuService.listMenuTree(getUserId());
		model.addAttribute("menus", menus);
		model.addAttribute("name", getUser().getName());
		model.addAttribute("picUrl","/img/photo_s.jpg");
		model.addAttribute("username", getUser().getUsername());
		return "index_v1";
	}

	@GetMapping("/login")
	String login() {
		return "login";
	}

	@Log("登录")
	@PostMapping("/login")
	@ResponseBody
	R ajaxLogin(String username, String password) {
		if(username.equals("jane.zhou1")&&password.equals("123")){
			return R.ok();
			}
			else{
			return R.error("用户或密码错误");
		}

//		password = MD5Utils.encrypt(username, password);
//		UsernamePasswordToken token = new UsernamePasswordToken(username, password);
//		Subject subject = SecurityUtils.getSubject();
//		try {
//			subject.login(token);
//			return R.ok();
//		} catch (AuthenticationException e) {
//			return R.error("用户或密码错误");
//		}

	}
	
	public static void main(String[] args) {
		String password = MD5Utils.encrypt("yue.peng.cheng", "abcd.123456");
		System.out.println(password);
	}
	
	
	@Log("获取权限接口")
	@PostMapping("/getInfo")
	@ResponseBody
	String querryInfo(String userNo) {

//		password = MD5Utils.encrypt(username, password);
//		UsernamePasswordToken token = new UsernamePasswordToken(username, password);
//		Subject subject = SecurityUtils.getSubject();
//		try {
//			subject.login(token);
//			return R.ok();
//		} catch (AuthenticationException e) {
//			return R.error("用户或密码错误");
//		}
		
	 try {
			
				return userService.getInfo(userNo);
			} catch (AuthenticationException e) {
				System.out.print(e.getMessage());
				return "获取信息错误";
			}
		}
	
	
//	@Log("登录")
//	@PostMapping("/Lylogin")
//	@ResponseBody
//	R LyLogin(String username, String password) {
//		Map<String,Object> map = new HashMap<>();
//		userService.login(username,password);
//		map.put("username", username);
//		List<UserDO> usrs = userService.list(map);
//		if(usrs.isEmpty()) {
//			return R.error("该用户未同步或者查不到该用户！请联系管理员");
//		}else {
//			UsernamePasswordToken token = new UsernamePasswordToken(username, usrs.get(0).getPassword());
//			Subject subject = SecurityUtils.getSubject();
//			try {
//				subject.login(token);
//				return R.ok();
//			} catch (AuthenticationException e) {
//				return R.error("用户或密码错误");
//			}
//		}
//	}
	
	

	@GetMapping("/logout")
	String logout() {
		ShiroUtils.logout();
		return "redirect:/login";
	}

	
	
	@GetMapping("/main")
	String main() {
		return "main";
	}

}
