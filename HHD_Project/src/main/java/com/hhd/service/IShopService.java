package com.hhd.service;

import com.alibaba.fastjson.JSONObject;
import com.hhd.pojo.Shop;

public interface IShopService {

	JSONObject saveShopInfo(Shop info);

	JSONObject checkShop(int page, int pageSize, int superiorID);

}
