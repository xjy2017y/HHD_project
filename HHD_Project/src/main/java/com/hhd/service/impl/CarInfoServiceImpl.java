package com.hhd.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.hhd.dao.CarInfoMapper;
import com.hhd.pojo.CarInfo;
import com.hhd.service.ICarInfoService;
@Service
public class CarInfoServiceImpl implements ICarInfoService {
	
	@Resource
	CarInfoMapper mapper;
	
	public JSONObject queryCarInfoByLatter(String first_latter) {
		// TODO Auto-generated method stub
		JSONObject result = new JSONObject();
		try{
			List<String> list = mapper.selectBrandByLatter(first_latter);
			result.put("result", list);
			result.put("status", 1);
			return result;
		}catch(RuntimeException e){
			Logger logger = Logger.getLogger(CarInfoServiceImpl.class);
			logger.error("queryCarInfoByLatter 搜索错误！");
			logger.error("错误原因："+e.toString());
			result.put("result", null);
			result.put("status", 0);
			return result;
		}
		
	}

	public JSONObject querySeriesByBrand(String brand) {
		// TODO Auto-generated method stub
		JSONObject result = new JSONObject();
		try{
			brand = "%"+brand+"%";
			List<String> list = mapper.selectSeriesByBrand(brand);
			result.put("result", list);
			result.put("status", 1);
			return result;
		}catch (RuntimeException e){
			Logger logger = Logger.getLogger(CarInfoServiceImpl.class);
			logger.error("querySeriesByBrand 搜索错误！");
			result.put("result", null);
			result.put("status", 0);
			return result;
		}
	}

	public JSONObject queryCarInfoBySeries(String series) {
		// TODO Auto-generated method stub
		JSONObject result = new JSONObject();
		try{
			series = "%"+series+"%";
			List<CarInfo> list =mapper.selectCarInfoBySeries(series);
			result.put("result", list);
			result.put("status", 1);
			return result;
		}catch(RuntimeException e){
			Logger logger = Logger.getLogger(CarInfoServiceImpl.class);
			logger.error("queryCarInfoBySeries 搜索错误!");
			result.put("result", null);
			result.put("status", 0);
			return result;
		}
	}


	public JSONObject queryCarInfoByVechiclesID(int vechiclesID) {
		// TODO Auto-generated method stub
		JSONObject result = new JSONObject();
		try{
			CarInfo carInfo = mapper.selectByPrimaryKey(vechiclesID);
			result.put("result", carInfo);
			result.put("status", 1);
			return result;
		}catch(RuntimeException e){
			Logger logger = Logger.getLogger(CarInfoServiceImpl.class);
			logger.error("queryCarInfoByVechiclesID 搜索错误!");
			result.put("result", null);
			result.put("status", 0);
			return result;
		}
	}

}
