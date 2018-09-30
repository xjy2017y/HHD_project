package com.hhd.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSONObject;
import com.hhd.pojo.UserInfo;
import com.hhd.service.IUserService;
import com.hhd.tools.Tools;

@Controller
@RequestMapping("/user")
public class UserController {
	@Resource
	private IUserService userService;
	@RequestMapping(value="/login",produces="text/html;charset=UTF-8")
	public void login(HttpServletRequest request,HttpServletResponse response){
		Tools.ip2log(request);					//将访问者IP写入log 
		String  assPhone = request.getParameter("assPhone");
		JSONObject result = userService.login(assPhone,request);
		Tools.writerToAndroid(response, result);
	}
	@RequestMapping("/register")
	public void register(HttpServletResponse response,HttpServletRequest request){
		Tools.ip2log(request);					//将访问者IP写入log 
		String info = request.getParameter("userInfo");
		info = Tools.transcoding(info);
		//通过对应的二进制数 手动编码成utf-8的字符串
		UserInfo userInfo = JSONObject.parseObject(info,UserInfo.class);
		JSONObject result = userService.register(userInfo,request);
		Tools.writerToAndroid(response, result);
	}
	@RequestMapping("/queryShopUser")
	public void queryShopUser(HttpServletRequest request,HttpServletResponse response){
		Tools.ip2log(request);					//将访问者IP写入log 
		int page = Integer.valueOf(request.getParameter("page"));
		int pageSize = Integer.valueOf(request.getParameter("pageSize"));
		JSONObject result = userService.queryShopUser(page,pageSize);
		Tools.writerToAndroid(response, result);
	}
	@RequestMapping("/queryUserByAssPhone")
	public void queryUserByAssPhone(HttpServletRequest request,HttpServletResponse response){
		Tools.ip2log(request);					//将访问者IP写入log 
		String  assPhone = request.getParameter("assPhone");
		UserInfo userInfo = userService.getUserInfo(assPhone);	
		JSONObject result = new JSONObject();
		if(userInfo != null){
			result.put("status", 1);			
			result.put("result", userInfo);
		}else{
			result.put("status",0);			
			result.put("result", null);
		}
		Tools.writerToAndroid(response, result);
	}
	@RequestMapping("/updateUserType")
	public void updateUserType(HttpServletRequest request,HttpServletResponse response){
		Tools.ip2log(request);					//将访问者IP写入log 
		UserInfo userInfo = new UserInfo();
		userInfo.setUserid(Integer.valueOf(request.getParameter("userID")));
		userInfo.setUsertype(Integer.valueOf(request.getParameter("type")));
		userInfo.setSuperiorid(Integer.valueOf(request.getParameter("superiorID")));
		JSONObject result = userService.updateUserType(userInfo);
		Tools.writerToAndroid(response, result);
	}
}
