package com.guozhuangzhuang.common.utils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

//Web工具类(WebUtil.java)
public class WebUtil {

	//方法1：获取url上的参数，返回字符串值类型，如果没有该参数则返回默认值 (5分)
	public String getString(HttpServletRequest request, String name, String defaultValue){
		//获取参数
		String name1 = request.getParameter(name);
		//判断字符串内容是否为空
		if(name1.equals(null)||name1.equals("")){
			return name1;
		}else{
			return defaultValue;
		}
	}
	//方法2：获取url上的参数，返回整数类型，如果没有该参数或该参数不是整形值，则返回默认值 (5分)
	public int getInt(HttpServletRequest request, String id, Integer defaultValue){
		//设置默认值为-1；
		defaultValue=-1;
		//获取参数值
		String ids = request.getParameter(id);
		//正则判断是否为正整数
		String regNum = "\\d+";
		if(regNum.matches(ids)){
			//转换为int
			int id1 = Integer.parseInt(ids);
			//返回整数类型
			return id1;
		}else{
			//则返回默认值 
			return defaultValue;
		}
	}
		//方法3：获取url上的参数，返回布尔类型，如果没有该参数或该参数不是布尔类型，则返回false  (5分)
	public boolean getBoolean(HttpServletRequest request,String flag){
	    String flag1 = request.getParameter(flag);
	    //判断是否为Boolean值
		if(flag1.equals("true")||flag1.equals("false")){
			return true;
		}else{
			return false;
		}
		
	}
		//方法4：获取当前请求地址，注意参数不能丢 (5分)
	public String getUrl(HttpServletRequest request){
	    //获取当前请求
		StringBuffer url = request.getRequestURL();
		return url.toString();
		
	}
	//方法5：给定一个Cookie名获得取Cookie值 (5分)
	public String getCookieValue(HttpServletRequest request){
	    Cookie[] cookies = request.getCookies();
	    String str = "";
	    for (Cookie cookie : cookies) {
			str=","+cookie;
		}
	    return str.substring(0);
	}
	
}
