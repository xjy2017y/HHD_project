package com.hhd.service;

import com.alibaba.fastjson.JSONObject;
import com.hhd.pojo.UserInfo;

public interface IUserService {
	public UserInfo getUserById(int userId);

	public JSONObject login(String assPhone);

	public JSONObject register(UserInfo userInfo);

	public JSONObject queryShopUser(int page, int pageSize);

	public JSONObject updateUserType(UserInfo userInfo);

	public UserInfo getUserInfo(String assPhone);
}
