package com.hhd.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSONObject;
import com.hhd.dao.ShopMapper;
import com.hhd.dao.ShopPicMapper;
import com.hhd.dao.UserInfoMapper;
import com.hhd.pojo.Shop;
import com.hhd.pojo.ShopPic;
import com.hhd.service.IShopService;
@Service("shopService")
public class ShopServiceImpl implements IShopService{

	@Resource
	private ShopMapper shopMapper;
	@Resource
	private ShopPicMapper picMapper;
	
	@Transactional
	public JSONObject saveShopInfo(Shop info) {
		// TODO Auto-generated method stub
		List<ShopPic> pic = new ArrayList<ShopPic>();
		ShopPic temp = new ShopPic();
		temp.setShopid(info.getShopid());
		for(int i = 0;i < info.getPictureAddress().size();i++){
			temp.setPictureaddress(info.getPictureAddress().get(i));
			pic.add(temp);
		}
		int resultInt = picMapper.insertAll(pic);
		int resultInt2 = shopMapper.insert(info);
		JSONObject result = new JSONObject();
		if(resultInt == 1 && resultInt2 == 1){
			result.put("result", null);
			result.put("status", 1);
		}else{
			result.put("result", null);
			result.put("status", 0);
		}
		return result;
	}

	public JSONObject checkShop(int page, int pageSize,int superiorID) {
		// TODO Auto-generated method stub
		int state = 0;
		List<Shop> shopInfo = shopMapper.queryShopBysuperiorIDAndState((page-1)*pageSize,pageSize,superiorID,state);
		JSONObject result = new JSONObject();
		if(shopInfo.size() > 0){
			result.put("status", 1);
			result.put("result", shopInfo);
		}else{
			result.put("result", null);
			result.put("status", 0);
		}
		return result;
	}

}
