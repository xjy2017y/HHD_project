package com.hhd.service;

import com.alibaba.fastjson.JSONObject;
import com.hhd.pojo.CarLinkTyreInfo;

public interface ICarLinkTyreInfoService {

	JSONObject queryTyreListByGarageID(int garageID);

	JSONObject insertCarLinkTyre(CarLinkTyreInfo tyreInfo);

}
