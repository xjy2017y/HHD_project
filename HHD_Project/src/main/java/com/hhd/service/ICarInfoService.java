package com.hhd.service;

import com.alibaba.fastjson.JSONObject;

public interface ICarInfoService {

	JSONObject queryCarInfoByLatter(String first_latter);

	JSONObject querySeriesByBrand(String brand);

	JSONObject queryCarInfoBySeries(String series);

	JSONObject queryCarInfoByVechiclesID(int model);

}
