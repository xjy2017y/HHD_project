package com.hhd.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.alibaba.fastjson.JSONObject;
import com.hhd.tools.Tools;

public class LoginInterceptor extends HandlerInterceptorAdapter {
	
	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		super.afterCompletion(request, response, handler, ex);
	}
	
	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		super.postHandle(request, response, handler, modelAndView);
	}
	
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		// TODO Auto-generated method stub
		String url = request.getRequestURI();  
        //URL:login.jsp是公开的;这个demo是除了login.jsp是可以公开访问的，其它的URL都进行拦截控制  
        if(url.indexOf("user/login")>=0 || url.indexOf("user/register")>=0){  
            return true;  
        }  
        //获取Session  
        HttpSession session = request.getSession();  
        String username = (String)session.getAttribute("username");  
        if(username != null){  
            return true;  
        }  
        //不符合条件的，跳转到登录界面  
        JSONObject result = new JSONObject();
        result.put("status", -1);
        result.put("result", "unlogin");
        Tools.writerToAndroid(response, result);
        return false;  
	}
}
