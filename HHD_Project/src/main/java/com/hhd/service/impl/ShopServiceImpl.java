package com.hhd.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
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
		System.out.println(info.getAddress());
		int resultInt2 = shopMapper.insert(info);		//插入
		for(int i = 0;i < info.getPictureAddress().size();i++){
			ShopPic temp = new ShopPic();
			temp.setPictureaddress(info.getPictureAddress().get(i));
			temp.setShopid(info.getShopid());
			pic.add(temp);
		}
		int resultInt = picMapper.insertAll(pic);
		JSONObject result = new JSONObject();
		if(resultInt >= 1 && resultInt2 == 1){
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

	public JSONObject queryAllShop(int page, int pageSize) {
		// TODO Auto-generated method stub
		JSONObject result = new JSONObject();
		try{
			List<Shop> shopInfo = shopMapper.queryAllShopLimit((page-1)*pageSize,pageSize);
			if(shopInfo.size() > 0){
				for(int i = 0;i<shopInfo.size();i++){
					List<String> shopPic = picMapper.selectByShopID(shopInfo.get(i).getShopid());
					shopInfo.get(i).setPictureAddress(shopPic);
				}
				result.put("status", 1);
				result.put("result", shopInfo);
			}else{
				result.put("status", 1);
				result.put("result", null);
			}
			return result;
		}catch(RuntimeException e){
			Logger logger = Logger.getLogger(ShopServiceImpl.class);
			logger.error("queryAllShop 查询错误！");
			logger.error("错误原因："+e.toString());
			result.put("result", null);
			result.put("status", 0);
			return result;
		}
	}

	public JSONObject queryAllShop() {
		// TODO Auto-generated method stub
		JSONObject result = new JSONObject();
		try{
			List<Shop> shopInfo = shopMapper.queryAllShop();
			if(shopInfo.size() > 0){
				for(int i = 0;i<shopInfo.size();i++){
					List<String> shopPic = picMapper.selectByShopID(shopInfo.get(i).getShopid());
					shopInfo.get(i).setPictureAddress(shopPic);
				}
				result.put("status", 1);
				result.put("result", shopInfo);
			}else{
				result.put("status", 1);
				result.put("result", null);
			}
			return result;
		}catch(RuntimeException e){
			Logger logger = Logger.getLogger(ShopServiceImpl.class);
			logger.error("queryAllShop 查询错误！");
			logger.error("错误原因："+e.toString());
			result.put("result", null);
			result.put("status", 0);
			return result;
		}
	}

	public JSONObject queryShopByInfo(String valueOf) {
		// TODO Auto-generated method stub
		JSONObject result = new JSONObject();
		try{
			valueOf = "%"+valueOf+"%";
			List<Shop> shopInfo = shopMapper.queryByInfo(valueOf);
			if(shopInfo.size() > 0){
				for(int i = 0;i<shopInfo.size();i++){
					List<String> shopPic = picMapper.selectByShopID(shopInfo.get(i).getShopid());
					shopInfo.get(i).setPictureAddress(shopPic);
				}
				result.put("status", 1);
				result.put("result", shopInfo);
			}else{
				result.put("status", 1);
				result.put("result", null);
			}
			return result;
		}catch(RuntimeException e){
			Logger logger = Logger.getLogger(ShopServiceImpl.class);
			logger.error("queryShopByInfo 查询错误！");
			logger.error("错误原因："+e.toString());
			result.put("result", null);
			result.put("status", 0);
			return result;
		}
	}
}
