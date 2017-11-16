package com.hhd.service;

import java.util.List;

import com.alibaba.fastjson.JSONObject;
import com.hhd.pojo.TestInfo;

public interface ITestInfoService {

	JSONObject insertTestInfo(List<TestInfo> testInfo);

	JSONObject queryTyreTestByLinkedID(int linkedID, int page, int pageSize);

}
