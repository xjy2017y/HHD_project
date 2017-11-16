package com.hhd.tools;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.MDC;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class Tools {

	/**
	 * 得到文件path
	 * @param sourceFileName 文件名
	 * @param baseFolder 基路径
	 * @return
	 */
	public static String getFilePath(String sourceFileName,String baseFolder) {  
        Date nowDate = new Date();  
        // yyyy/MM/dd  
        SimpleDateFormat sy=new SimpleDateFormat("yyyy"); 
        SimpleDateFormat sm=new SimpleDateFormat("MM"); 
        SimpleDateFormat sd=new SimpleDateFormat("dd"); 
        String fileFolder = baseFolder + File.separator+ "shopPic"+  File.separator + sy.format(nowDate) + File.separator + sm.format(nowDate) + File.separator  
				+ sd.format(nowDate);  
        File file = new File(fileFolder);  
        if (!file.isDirectory()) {  
            // 如果目录不存在，则创建目录  
            file.mkdirs();  
        }  
        // 生成新的文件名   10位数字和字母的组合
        String fileName =  RandomUtils.generateString(10)+sourceFileName;  
        return fileFolder + File.separator + fileName;  
    }  
	/**
	 * 转乱码
	 * @param str 需转的json
	 * @return
	 */
	public static String transcoding(String str){
		byte[] temp;
		try {
			temp = str.getBytes("iso-8859-1");
			str = new String(temp, "utf-8");
		} catch (UnsupportedEncodingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return str;
	}
	/**
	 * 输出到Android端
	 * @param response
	 * @param json 需要传输的json
	 */
	public static void writerToAndroid(HttpServletResponse response,JSONObject json){
		response.setCharacterEncoding("UTF-8");
		PrintWriter writer;
		try {
			writer = response.getWriter();
			writer.print(JSONObject.toJSONString(json,SerializerFeature.WriteMapNullValue));
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void ip2log(HttpServletRequest request){
		String remoteAddr = request.getRemoteAddr();
		MDC.put("ip", remoteAddr);
	}
}
