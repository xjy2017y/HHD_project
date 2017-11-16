package com.hhd.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.hhd.pojo.CarLinkTyreInfo;
import com.hhd.service.ICarLinkTyreInfoService;
import com.hhd.tools.Tools;



@Controller
@RequestMapping("/tyre")
public class CarLinkTyreInfoController {
	@Resource
	ICarLinkTyreInfoService service;
	/**
	 * 通过车辆ID查询到该车轮胎的信息
	 * @param request
	 * @param response
	 */
	@RequestMapping("/queryTyreListByGarageID")
	public void queryTyreListByGarageID(HttpServletRequest request,HttpServletResponse response){
		Tools.ip2log(request);					//将访问者IP写入log 
		int garageID = Integer.valueOf(request.getParameter("garageID"));
		JSONObject result =service.queryTyreListByGarageID(garageID);
		Tools.writerToAndroid(response, result);
	}
	/**
	 * 插入轮胎属性数据
	 * @param request
	 * @param response
	 */
	@RequestMapping("/insertCarLinkTyre")
	public void insertCarLinkTyre(HttpServletRequest request,HttpServletResponse response){
		Tools.ip2log(request);					//将访问者IP写入log 
		
		String json = request.getParameter("tyreInfo");
		json = Tools.transcoding(json);
		CarLinkTyreInfo tyreInfo = JSONObject.parseObject(json, CarLinkTyreInfo.class);
		JSONObject result = service.insertCarLinkTyre(tyreInfo);
		Tools.writerToAndroid(response, result);
	}
}
