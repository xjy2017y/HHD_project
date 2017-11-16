package com.hhd.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.hhd.dao.CarLinkTyreInfoMapper;
import com.hhd.pojo.CarLinkTyreInfo;
import com.hhd.service.ICarLinkTyreInfoService;
@Service
public class CarLinkTyreInfoServiceImpl implements ICarLinkTyreInfoService {

	@Resource
	CarLinkTyreInfoMapper carMapper;
	
	public JSONObject queryTyreListByGarageID(int garageID) {
		// TODO Auto-generated method stub
		List<CarLinkTyreInfo> tyreInfo = new ArrayList<CarLinkTyreInfo>();
		tyreInfo = carMapper.selectByGarageID(garageID);
		JSONObject result = new JSONObject();
		if(tyreInfo.size() > 0){
			result.put("result", tyreInfo);
			result.put("status", 1);
		}else{
			result.put("result", null);
			result.put("status", 0);
		}
		return result;
	}

	public JSONObject insertCarLinkTyre(CarLinkTyreInfo tyreInfo) {
		// TODO Auto-generated method stub
		CarLinkTyreInfo tyre = carMapper.selectByGarageIDAndPosition(tyreInfo);		//搜索对应位置有没有登记
		JSONObject result = new JSONObject();
		if(tyre == null){			//如果没有登记 则添加轮胎信息
			try{
				carMapper.insertSelective(tyreInfo);	//插入信息
				result.put("status", 1);
				result.put("result", null);
			}catch(RuntimeException e){
				result.put("status", 0);
				result.put("result", null);
				return result;
			}
		}else{
			result.put("status", 0);
			result.put("result", null);
		}
		
		return result;
	}

}
