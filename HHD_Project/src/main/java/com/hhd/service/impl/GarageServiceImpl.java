package com.hhd.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.hhd.dao.GarageMapper;
import com.hhd.pojo.Garage;
import com.hhd.service.IGarageService;
import com.hhd.tools.Tools;

@Service
public class GarageServiceImpl implements IGarageService {

	@Resource
	public GarageMapper garageMapper;

	public JSONObject queryGarageByUserID(int userID) {
		// TODO Auto-generated method stub
		List<Garage> garageList = new ArrayList<Garage>();
		garageList = garageMapper.selectByUserID(userID);
		JSONObject result = new JSONObject();
		if (garageList.size() > 0) {
			result.put("result", garageList);
			result.put("status", 1);
		} else {
			result.put("result", null);
			result.put("status", 0);
		}
		return result;
	}

	public JSONObject queryCarByGarageID(int garageID) {
		// TODO Auto-generated method stub
		Garage carInfo = garageMapper.selectByPrimaryKey(garageID);
		JSONObject result = new JSONObject();
		if (carInfo != null) {
			result.put("result", carInfo);
			result.put("status", 1);
		} else {
			result.put("result", null);
			result.put("status", 0);
		}
		return result;
	}

	public JSONObject insertCarByUserID(String carInfo) {
		// TODO Auto-generated method stub
		//carInfo = Tools.transcoding(carInfo);
		System.out.println(carInfo.toString());
		Logger logger = Logger.getLogger(TestInfoServiceImpl.class);
		logger.error(carInfo.toString());
		Garage car = JSONObject.parseObject(carInfo, Garage.class);
		JSONObject result = new JSONObject();
		try {
			Garage ifExist = garageMapper.selectByCarNum(car.getCarnum());		//如果数据库里没有相应的记录则添加
			if(ifExist == null){
				garageMapper.insertSelective(car);
				result.put("result", null);
				result.put("status", 1);
			}else{
				result.put("result", null);
				result.put("status", 0);
			}
			return result;
		} catch (RuntimeException e) {
			result.put("result", null);
			result.put("status", 0);
			return result;
		}
	}
}
