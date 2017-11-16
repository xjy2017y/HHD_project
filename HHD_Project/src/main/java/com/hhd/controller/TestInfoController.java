package com.hhd.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.MDC;
import org.apache.log4j.NDC;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.hhd.pojo.TestInfo;
import com.hhd.service.ITestInfoService;
import com.hhd.tools.Tools;


@Controller
@RequestMapping("/test")
public class TestInfoController {

	@Resource
	public ITestInfoService service;
	/**
	 * 插入测试数据
	 * @param request
	 * @param response
	 */
	@RequestMapping("/insertTestInfo")
	public void insertTestInfo(HttpServletRequest request,HttpServletResponse response){
        Tools.ip2log(request);					//将访问者IP写入log 
		String data = request.getParameter("testInfo");
		List<TestInfo> testInfo = JSONObject.parseArray(data, TestInfo.class);
		JSONObject result = service.insertTestInfo(testInfo);
		Tools.writerToAndroid(response, result);	
	}
	/**
	 * 根据轮胎ID查找测试数据
	 * @param request
	 * @param response
	 */
	@RequestMapping("/queryTyreTestByLinkedID")
	public void queryTyreTestByLinkedID(HttpServletRequest request,HttpServletResponse response){
		Tools.ip2log(request);					//将访问者IP写入log 
		int linkedID = Integer.valueOf(request.getParameter("linkedID"));
		int page = Integer.valueOf(request.getParameter("page"));
		int pageSize = Integer.valueOf(request.getParameter("pageSize"));
		JSONObject result = service.queryTyreTestByLinkedID(linkedID,page,pageSize);
		Tools.writerToAndroid(response, result);
	}
	public void queryTestRecord(HttpServletRequest request,HttpServletResponse response){
		int garageID = Integer.valueOf(request.getParameter("garageID"));
		int page = Integer.valueOf(request.getParameter("page"));
		int pageSize = Integer.valueOf(request.getParameter("pageSize"));
	}
}
