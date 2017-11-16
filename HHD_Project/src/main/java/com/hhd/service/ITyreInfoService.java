package com.hhd.service;

import com.alibaba.fastjson.JSONObject;

public interface ITyreInfoService {

	JSONObject showBrand();

	JSONObject queryStreakByBrand(String brand);

	JSONObject queryTyreInfoByStreak(String streak);

	JSONObject queryTyreInfoByName(String name);

}
