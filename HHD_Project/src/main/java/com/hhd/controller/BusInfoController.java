package com.hhd.controller;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSONObject;
import com.hhd.pojo.BusInfo;
import com.hhd.service.IBusInfoService;
import com.hhd.service.impl.ShopServiceImpl;
import com.hhd.tools.Tools;



@Controller
@RequestMapping("/bus")
public class BusInfoController {
	
	@Resource
	IBusInfoService service;
	
	@RequestMapping("/addSeries")
	public void addSeries(HttpServletRequest request,HttpServletResponse response) throws IOException{
		Tools.ip2log(request);
		request.setCharacterEncoding("UTF-8");
		String series = request.getParameter("series");
		byte[] b = series.getBytes("ISO-8859-1");
		//byte[] b = Tools.toByteArray(request.getInputStream());
		//series = Tools.bytes2HexString(b);
		BusInfo busInfo = Tools.saveData(b);
		//busInfo.setSeries(series);
		JSONObject result = service.addSeries(busInfo);
		Tools.writerToAndroid(response, result);
	}
}
