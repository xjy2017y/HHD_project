package com.hhd.service;

import com.alibaba.fastjson.JSONObject;

public interface IGarageService {

	JSONObject queryGarageByUserID(int userID);

	JSONObject queryCarByGarageID(int garageID);

	JSONObject insertCarByUserID(String carInfo);
}
