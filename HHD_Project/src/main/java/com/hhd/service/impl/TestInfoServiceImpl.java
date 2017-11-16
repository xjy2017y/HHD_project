package com.hhd.service.impl;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSONObject;
import com.hhd.dao.TestInfoMapper;
import com.hhd.pojo.TestInfo;
import com.hhd.service.ITestInfoService;

@Service
public class TestInfoServiceImpl implements ITestInfoService {

	@Resource
	public TestInfoMapper testMapper;

	
	
	@Transactional
	public JSONObject insertTestInfo(List<TestInfo> testInfo) {
		// TODO Auto-generated method stub
		try {
			Timestamp time = new Timestamp(System.currentTimeMillis());
			for (int i = 0; i < testInfo.size(); i++) {
				testInfo.get(i).setTesttime(time);
				testMapper.insertSelective(testInfo.get(i));
			}
			JSONObject result = new JSONObject();
			result.put("status", 1);
			result.put("result", null);
			return result;
		} catch (RuntimeException e) {
			Logger logger = Logger.getLogger(TestInfoServiceImpl.class);
			logger.error("插入错误！");
			JSONObject result = new JSONObject();
			result.put("result", null);
			result.put("status", 0);
			return result;
		}
	}

	public JSONObject queryTyreTestByLinkedID(int linkedID, int page,
			int pageSize) {
		// TODO Auto-generated method stub
		List<TestInfo> list = testMapper.selectByLinkedID(linkedID, (page - 1)
				* pageSize, pageSize);
		JSONObject result = new JSONObject();
		if (list.size() > 0) {
			result.put("status", 1);
			result.put("result", list);
		} else {
			result.put("status", 0);
			result.put("result", null);
		}
		return result;
	}

}
