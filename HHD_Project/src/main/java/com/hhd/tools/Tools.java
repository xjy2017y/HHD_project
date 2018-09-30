package com.hhd.tools;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
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
import com.hhd.pojo.BusInfo;

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
	
	 /*
     * 字节数组转16进制字符串
     */
    public static String bytes2HexString(byte[] b) {
        String r = "";
        for (int i = 0; i < b.length; i++) {
            String hex = Integer.toHexString(b[i] & 0xFF);		//将有符号转为无符号用&0xff
            if (hex.length() == 1) {
                hex = '0' + hex;
            }
            r += hex.toUpperCase();
        }
        return r;
    }
    /**
     * 解析协议
     * @param series
     * @return
     */
    public static BusInfo saveData(byte[] series){
    	BusInfo info = new BusInfo();
    	int [] numb = new int [30] ;
    	int x = 0;
    	for(int i = 0; i < series.length;i++ ){		//转换成int
    		numb[i] = series[i] & 0xFF;
    		if(i < series.length - 1){
    			x = x + numb[i];
    		}
    	}
    	System.out.println(x);
    	String recognitionNum = "";
    	for(int i = 2; i<6;i++){					//计算车辆识别码
    		String hex = Integer.toHexString(numb[i]);
    		if(hex.length() == 1){
    			hex = '0' + hex;
    		}
    		recognitionNum +=hex.toUpperCase();
    	}
    	
    	int pressure = (int)calculDecimal(numb,6,7);	//计算温度
    	info.setPressure(String.valueOf(pressure));
    	int temp;
    	if((series[8] & 0x80) == 0x80){		//表示为负数
    		temp = -(series[8] & 0x7F);
    	}else{								//表示为正数
    		temp = numb[8];
    	}
    	String sensorStatus;
    	if((series[10] & 0x01) == 0x01){
    		sensorStatus = "没有收到数据";
    	}else{
    		sensorStatus = "正常接收";
    	}
    	double longitude = calculDecimal(numb,12,15) / 100000.0;
    	String eastOrWest;
    	if(series[16] == 0x01){
    		eastOrWest = "东经";
    	}else{
    		eastOrWest = "西经";
    	}
    	double latitude = calculDecimal(numb, 17, 20) / 100000.0;
    	String northOrSourth;
    	if(series[21] == 0x01){
    		northOrSourth = "北纬";
    	}else{
    		northOrSourth = "南纬";
    	}
    	double altitude;
    	if((series[22] & 0x80) == 0x80){			//负数
    		int i = series[22] & 0x7F;
    		altitude = -((i*256 + numb[23])/10.0);
    	}else{
    		altitude = calculDecimal(numb, 22, 23)/10.0;
    	}
    	double speed = calculDecimal(numb,24,27) /1000.0;
    	info.setRecordTime(new Date(System.currentTimeMillis()));
    	info.setSpeed(String.valueOf(speed));
    	info.setAltitude(String.valueOf(altitude));
    	info.setNorthOrSourth(northOrSourth);
    	info.setLatitude(String.valueOf(latitude));
    	info.setEastOrWest(eastOrWest);
    	info.setLongitude(String.valueOf(longitude));
    	info.setSensorstatus(sensorStatus);
    	info.setRecognitionnum(recognitionNum);
    	info.setTemperature(String.valueOf(temp));
    	info.setSensornum(String.valueOf(numb[9]));		//记录传感器序号
    	info.setSeries(bytes2HexString(series));
    	return info;
    }
    /**
     * 计算10进制总和
     * @param numb
     * @param begin
     * @param end
     * @return
     */
    public static double calculDecimal(int [] numb,int begin,int end){
    	double total = 0;
    	for(int i = begin;i<=end;i++){
    		total = total*256 + numb[i]; 
    	}
    	return total;
    }
}
