package com.hhd.service.impl;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.hhd.dao.TyreInfoMapper;
import com.hhd.service.ITyreInfoService;

@Service
public class TyreInfoImpl implements ITyreInfoService {
	@Resource
	private TyreInfoMapper mapper;
	
	public JSONObject showBrand() {
		// TODO Auto-generated method stub
		JSONObject result = new JSONObject();
		try{
			List list = mapper.selectBrand();
			result.put("result", list);
			result.put("status", 1);
			return result;
		}catch(RuntimeException e){
			result.put("result", null);
			result.put("status", 0);
			return result;
		}
	}

	public JSONObject queryStreakByBrand(String brand) {
		// TODO Auto-generated method stub
		JSONObject result = new JSONObject();
		try{
			List list = mapper.selectStreakByBrand(brand);
			result.put("result", list);
			result.put("status",1);
			return result;
		}catch(RuntimeException e){
			result.put("result", null);
			result.put("status", 0);
			return result;
		}
	}

	public JSONObject queryTyreInfoByStreak(String streak) {
		// TODO Auto-generated method stub
		JSONObject result = new JSONObject();
		try{
			List list = mapper.selectTyreInfoByStreak(streak);
			result.put("result", list);
			result.put("status", 1);
			return result;
		}catch(RuntimeException e){
			result.put("result", null);
			result.put("status", 0);
			return result;
		}
	}

	public JSONObject queryTyreInfoByName(String name) {
		// TODO Auto-generated method stub
		JSONObject result= new JSONObject();
		try{
			name = "%" + name + "%";
			List list= mapper.selectTyreInfoByName(name);
			result.put("result", list);
			result.put("status", 1);
			return result;
		}catch (RuntimeException e) {
			// TODO: handle exception
			result.put("result", null);
			result.put("status", 0);
			return result;
		}
	}
}
