package com.hhd.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.hhd.service.IGarageService;
import com.hhd.tools.Tools;

@Controller
@RequestMapping("/garage")
public class GarageController {

	@Resource
	public IGarageService service;
	/**
	 * 根据用户ID来搜索车辆
	 * @param request
	 * @param response
	 */
	@RequestMapping("/queryGarageByUserID")
	public void queryGarageByUserID(HttpServletRequest request,HttpServletResponse response){
		Tools.ip2log(request);					//将访问者IP写入log 
		int userID = Integer.valueOf(request.getParameter("userID"));
		JSONObject result = service.queryGarageByUserID(userID);
		Tools.writerToAndroid(response, result);
	}
	/**
	 * 根据主键garageID来搜索车辆
	 * @param request
	 * @param response
	 */
	@RequestMapping("/queryCarByGarageID")
	public void queryCarByGarageID(HttpServletRequest request,HttpServletResponse response){
		Tools.ip2log(request);					//将访问者IP写入log 
		int garageID = Integer.valueOf(request.getParameter("garageID"));
		JSONObject result = service.queryCarByGarageID(garageID);
		Tools.writerToAndroid(response, result);
	}
	/**
	 * 添加用户车辆
	 * @param request
	 * @param response
	 */
	@RequestMapping("/insertCarByUserID")
	public void insertCarByUserID(HttpServletRequest request,HttpServletResponse response){
		Tools.ip2log(request);					//将访问者IP写入log 
		String carInfo = request.getParameter("carInfo");
		JSONObject result = service.insertCarByUserID(carInfo);
		Tools.writerToAndroid(response, result);
	}
}
