package com.hhd.controller;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.annotation.Resource;
import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.hhd.pojo.Shop;
import com.hhd.service.IShopService;
import com.hhd.tools.Tools;
/**
 * 
 * @author xjy
 *@version 1.0
 */
@Controller
@RequestMapping("/shop")
public class ShopController {

	private String REPOSITORY_PATH = "home/hhd/images";
	
	@Resource
	private IShopService shopService;
	// 允许上传的格式
	/*private static final String[] IMAGE_TYPE = new String[] { ".bmp", ".jpg",
			".jpeg", ".gif", ".png" };*/
	/**
	 * 上传商店信息
	 * @param uploadFile 图片
	 * @param request
	 * @param response
	 */
	@RequestMapping(value = "/upload",produces="text/html;charset=UTF-8")
	public void uploadShopInfo(
			@RequestParam("uploadPic") MultipartFile[] uploadFile,
			HttpServletRequest request, HttpServletResponse response) {
		Tools.ip2log(request);					//将访问者IP写入log 
//		REPOSITORY_PATH = request.getSession().getServletContext()
//				.getRealPath("upload");
		System.out.println(REPOSITORY_PATH);
		MultipartFile multipartFile = null;
		String json = request.getParameter("shopInfo");
		System.out.println(json);
		//json = Tools.transcoding(json);
		Shop info = JSONObject.parseObject(json, Shop.class);
		info.setPictureAddress(new ArrayList());
		for (int i = 0; i < uploadFile.length; i++) {
			multipartFile = uploadFile[i];
			// 文件新路径
			String filePath =  Tools.getFilePath(
					multipartFile.getOriginalFilename(), REPOSITORY_PATH);
			System.out.println(filePath);
			// 生成图片的绝对引用地址
			String picUrl = StringUtils.replace(
					StringUtils.substringAfter(filePath, REPOSITORY_PATH),
					"\\", "/");
			System.out.println(picUrl);
			File newFile = new File(filePath);
			// 写文件到磁盘
			try {
				multipartFile.transferTo(newFile);
				boolean isLegal = false;  
	            try {  
	                BufferedImage image = ImageIO.read(newFile);  		//判断图片是否合法
	                if (image != null) {    
	                    isLegal = true;  
	                }
	            } catch (IOException e) {  
	            	e.printStackTrace();
	            }  
	            if(isLegal == false){
	            	newFile.delete();
	            }else{
	            	info.getPictureAddress().add(picUrl);				//加入到picUrl
	            }
			} catch (IllegalStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		JSONObject result = shopService.saveShopInfo(info);
		Tools.writerToAndroid(response, result);
	}
	/**
	 * 查找出该运营商下商家所有未审核的商店，page是页数，pagesize是每一页显示的数据数
	 * @param request
	 * @param response
	 */
	@RequestMapping("/checkShop")
	public void checkShop(HttpServletRequest request,HttpServletResponse response){
		Tools.ip2log(request);					//将访问者IP写入log 
		int page = Integer.valueOf(request.getParameter("page"));
		int pageSize = Integer.valueOf(request.getParameter("pageSize"));
		int superiorID = Integer.valueOf(request.getParameter("superiorID"));
		JSONObject result = shopService.checkShop(page,pageSize,superiorID);
		Tools.writerToAndroid(response, result);
	}

	/**
	 * 查找该用户旗下所有商店，page是页数，pagesize是每一页显示的数据
	 * @param request
	 * @param response
	 */
	@RequestMapping("/queryShopByUser")
	public void queryShopByUser(HttpServletRequest request,HttpServletResponse response){
		Tools.ip2log(request);
		int page = Integer.valueOf(request.getParameter("page"));
		int pageSize = Integer.valueOf(request.getParameter("pageSize"));
		int userID = Integer.valueOf(request.getParameter("userID"));
		JSONObject result = shopService.queryShopByUser(page,pageSize,userID);
		Tools.writerToAndroid(response,result);
	}
	@RequestMapping("/queryAllShop")
	public void queryAllShop(HttpServletRequest request,HttpServletResponse response){
		Tools.ip2log(request);					//将访问者IP写入log 
		String page = request.getParameter("page");
		String pageSize = request.getParameter("pageSize");
		JSONObject result;
		if(page==null || pageSize == null){
			 result = shopService.queryAllShop();
		}else{
			int page1 = Integer.valueOf(page);
			int pageSize1 = Integer.valueOf(pageSize);
			 result = shopService.queryAllShop(page1,pageSize1);
		}
		Tools.writerToAndroid(response, result);
	}
	@RequestMapping("/queryShopByDesInfo")
	public void queryShopByDesInfo(HttpServletRequest request,HttpServletResponse response){
		Tools.ip2log(request);					//将访问者IP写入log 
		String describe = request.getParameter("describe");
		describe = Tools.transcoding(describe);
		Logger log = Logger.getLogger(ShopController.class);
		log.info("descirbe is:"+ describe);
		JSONObject result = shopService.queryShopByInfo(describe);
		Tools.writerToAndroid(response, result);
	}
}
