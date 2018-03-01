package com.hhd.service.impl;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.hhd.dao.BusInfoMapper;
import com.hhd.pojo.BusInfo;
import com.hhd.service.IBusInfoService;
@Service
public class BusInfoServiceImpl implements IBusInfoService {
	
	@Resource
	BusInfoMapper mapper;

	public JSONObject addSeries(BusInfo busInfo) {
		// TODO Auto-generated method stub
		JSONObject result = new JSONObject();
		try{
			if(busInfo.getSeries() == null|| busInfo.getSeries() == ""){
				result.put("result", null);
				result.put("status", 0);
				return result;
			}
			mapper.insert(busInfo);
			result.put("result", null);
			result.put("status",1);
			return result;
		}catch(RuntimeException e){
			Logger logger = Logger.getLogger(BusInfoServiceImpl.class);
			logger.error("addSeries 插入错误！");
			logger.error("错误原因："+e.toString());
			result.put("result", null);
			result.put("status", 0);
			return result;
		}
	}

}
