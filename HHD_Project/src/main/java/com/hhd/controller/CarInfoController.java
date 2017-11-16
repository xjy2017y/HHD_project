package com.hhd.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.alibaba.fastjson.JSONObject;
import com.hhd.service.ICarInfoService;
import com.hhd.tools.Tools;



@Controller
@RequestMapping("/carInfo")
public class CarInfoController {

	@Resource
	ICarInfoService service;
	
	/**
	 * 通过首字母来搜索brand
	 * @param request
	 * @param response
	 */
	@RequestMapping("/queryCarInfoByLatter")
	public void queryCarInfoByLatter(HttpServletRequest request,HttpServletResponse response){
		Tools.ip2log(request);
		String first_latter = request.getParameter("first_latter");
		JSONObject result = service.queryCarInfoByLatter(first_latter);
		Tools.writerToAndroid(response, result);
	}
	
	/**
	 * 通过brand来搜索series 输出是乱码，要在android端测试
	 * @param request
	 * @param response
	 */
	@RequestMapping("/querySeriesByBrand")
	public void querySeriesByBrand(HttpServletRequest request,HttpServletResponse response){
		Tools.ip2log(request);
		String brand = request.getParameter("brand");
		//brand = Tools.transcoding(brand);
		System.out.println(brand);
		JSONObject result = service.querySeriesByBrand(brand);
		Tools.writerToAndroid(response, result);
	}
	
	/**
	 * 通过series来搜索carinfo
	 * @param request
	 * @param response
	 */
	@RequestMapping("/queryCarInfoBySeries")
	public void queryCarInfoBySeries(HttpServletRequest request,HttpServletResponse response){
		Tools.ip2log(request);
		String series = request.getParameter("series");
		series = Tools.transcoding(series);
		System.out.println(series);
		JSONObject result = service.queryCarInfoBySeries(series);
		Tools.writerToAndroid(response, result);
	}
	
	/**
	 * 通过vechiclesID来搜索carinfo
	 * @param request
	 * @param response
	 */
	@RequestMapping("/queryCarInfoByVechiclesID")
	public void queryCarInfoByVechiclesID(HttpServletRequest request,HttpServletResponse response){
		Tools.ip2log(request);
		int vechiclesID = Integer.valueOf(request.getParameter("vechiclesID"));
		System.out.println(vechiclesID);
		JSONObject result = service.queryCarInfoByVechiclesID(vechiclesID);
		Tools.writerToAndroid(response, result);
	}
}
