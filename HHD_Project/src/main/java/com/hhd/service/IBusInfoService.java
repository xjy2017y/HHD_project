package com.hhd.service;

import com.alibaba.fastjson.JSONObject;
import com.hhd.pojo.BusInfo;

public interface IBusInfoService {

	JSONObject addSeries(BusInfo busInfo);

}
