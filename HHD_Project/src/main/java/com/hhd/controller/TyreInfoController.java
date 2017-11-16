package com.hhd.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSONObject;
import com.hhd.service.ITyreInfoService;
import com.hhd.tools.Tools;


@Controller
@RequestMapping("/tyreInfo")
public class TyreInfoController {
	@Resource
	public ITyreInfoService serivce;
	/**
	 * 调用显示出所有轮胎品牌供选择
	 * @param request
	 * @param response
	 */
	@RequestMapping("/showBrand")
	public void showBrand(HttpServletRequest request,HttpServletResponse response){
		Tools.ip2log(request);
		JSONObject result = serivce.showBrand();
		Tools.writerToAndroid(response, result);
	}
	/**
	 * 通过brand找出该品牌下的轮胎花纹分类
	 * @param request
	 * @param response
	 */
	@RequestMapping("/queryStreakByBrand")
	public void queryStreakByBrand(HttpServletRequest request,HttpServletResponse response){
		Tools.ip2log(request);
		String brand = request.getParameter("brand");
		//brand = Tools.transcoding(brand);
		JSONObject result = serivce.queryStreakByBrand(brand);
		Tools.writerToAndroid(response, result);
	}
	/**
	 * 通过花纹找出轮胎
	 * @param request
	 * @param response
	 */
	@RequestMapping("/queryTyreInfoByStreak")
	public void queryTyreInfoByStreak(HttpServletRequest request,HttpServletResponse response){
		Tools.ip2log(request);
		String streak = request.getParameter("streak");
		JSONObject result = serivce.queryTyreInfoByStreak(streak);
		Tools.writerToAndroid(response, result);
	}
	/**
	 * 通过name模糊查询轮胎
	 * @param request
	 * @param response
	 */
	@RequestMapping("/queryTyreInfoByName")
	public void queryTyreInfoByName(HttpServletRequest request,HttpServletResponse response){
		Tools.ip2log(request);
		String name = request.getParameter("name");
		//name = Tools.transcoding(name);
		JSONObject result =serivce.queryTyreInfoByName(name);
		Tools.writerToAndroid(response, result);
	}
}
