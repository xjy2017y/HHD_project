package com.hhd.service.impl;

import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSONObject;
import com.hhd.dao.ShopMapper;
import com.hhd.dao.UserInfoMapper;
import com.hhd.pojo.UserInfo;
import com.hhd.service.IUserService;
@Service("userService")
public class UserServiceImpl implements IUserService {
	
	@Resource//默认安照名称进行装配，名称可以通过name属性进行指定， 如果没有指定name属性，当注解写在字段上时，默认取字段名进行按照名称查找，如果注解写在setter方法上默认取属性名进行装配。 当找不到与名称匹配的bean时才按照类型进行装配。但是需要注意的是，如果name属性一旦指定，就只会按照名称进行装配。   不用在写setter和getter方法了
	private UserInfoMapper userMapper;
	@Resource
	private ShopMapper shopMapper;
	public UserInfo getUserById(int userId) {
		// TODO Auto-generated method stub
		return userMapper.selectByPrimaryKey(userId);
		
	}
	public JSONObject register(UserInfo userInfo,HttpServletRequest req) {
		// TODO Auto-generated method stub
		JSONObject result = new JSONObject();
		UserInfo record = userMapper.selectByAssPhone(userInfo.getAssphone());
		if(record == null){
			userInfo.setLastlogintime(new Timestamp(System.currentTimeMillis()));	//设置当前时间为上次登录时间
			int resultInt = userMapper.insertSelective(userInfo);//返回的是主键吗？
			if(resultInt == 1){
				resultInt = userMapper.selectIdByAssPhone(userInfo.getAssphone());
			}else{		//如果插入不成功返回status
				result.put("status", 0);
				result.put("result", null);
				return result;
			}
			HttpSession session = req.getSession();
			session.setAttribute("username", userInfo.getAssphone());
			JSONObject id = new JSONObject();
			id.put("userid", resultInt);
			result.put("status", 1);
			result.put("result", id);
		}else{
			result.put("status", 0);		//账号已存在
			result.put("result", null);
		}
		return result;
	}
	public JSONObject queryShopUser(int page, int pageSize) {
		// TODO Auto-generated method stub
		List<Integer> idList = shopMapper.selectIdByHavingShop((page-1)*pageSize, pageSize);
		JSONObject result = new JSONObject();
		if(idList.size()>0){
			List<UserInfo> userList = userMapper.selectUserByIdList(idList);
			result.put("result", userList);
			result.put("status", 1);
		}else{
			result.put("status", 0);
			result.put("result", null);
		}
		return result;
	}
	public JSONObject updateUserType(UserInfo userInfo) {
		// TODO Auto-generated method stub
		JSONObject result = new JSONObject();
		try{
		int resultInt = userMapper.updateByPrimaryKeySelective(userInfo);
		if(resultInt == 1){
			result.put("status",1);
			result.put("result", null);
		}else{
			result.put("status",0);
			result.put("result", null);
		}
		}catch(RuntimeException e){				//更新出错，则返回0
			result.put("status", 0);
			result.put("result", null);
			return result;
		}
		return result;
	}
	public JSONObject login(String assPhone,HttpServletRequest req) {
		// TODO Auto-generated method stub
		UserInfo userInfo = userMapper.selectByAssPhone(assPhone);
		JSONObject result = new JSONObject();
		if(userInfo != null){
			Timestamp now = new Timestamp(System.currentTimeMillis());
			long lastTime = userInfo.getLastlogintime().getTime();
			double dayGap = Math.floor(now.getTime()/86400000.0) - Math.floor(lastTime/86400000.0);//  除以86400000换算成天数,计算天数间隔，
			System.out.println(dayGap);
			if(dayGap == 1.0){		
				userInfo.setConlogindays(userInfo.getConlogindays()+1);		//累积天数加1
				userInfo.setCumlogindays(userInfo.getCumlogindays()+1);	//总登录天数加1
			}else if(dayGap > 1.0){
				userInfo.setConlogindays(1);			//如果不是连续登录，则累积天数清零
				userInfo.setCumlogindays(userInfo.getCumlogindays()+1);	//总登录天数加1
			}
			userInfo.setLastlogintime(new Timestamp(System.currentTimeMillis()));		//修改上次登录时间
			userMapper.updateByPrimaryKeySelective(userInfo);
			JSONObject userJson = (JSONObject) JSONObject.toJSON(userInfo);
			HttpSession sesstion = req.getSession();
			sesstion.setAttribute("username",assPhone);
			result.put("status", 1);			//user不存在
			result.put("result", userJson);
		}else{
			result.put("status",0);		
			result.put("result", null);
		}
		return result;
	}
	public UserInfo getUserInfo(String assPhone) {
		// TODO Auto-generated method stub
		return userMapper.selectByAssPhone(assPhone);
	}
}
