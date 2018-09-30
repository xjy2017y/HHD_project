package com.hhd.service;

import javax.servlet.http.HttpServletRequest;

import com.alibaba.fastjson.JSONObject;
import com.hhd.pojo.UserInfo;

public interface IUserService {
	public UserInfo getUserById(int userId);

	public JSONObject login(String assPhone,HttpServletRequest req);

	public JSONObject register(UserInfo userInfo,HttpServletRequest req);

	public JSONObject queryShopUser(int page, int pageSize);

	public JSONObject updateUserType(UserInfo userInfo);

	public UserInfo getUserInfo(String assPhone);
}
