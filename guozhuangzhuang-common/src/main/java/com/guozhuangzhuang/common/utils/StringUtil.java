package com.guozhuangzhuang.common.utils;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.Test;

//字符串工具类(StringUtil.java)
public class StringUtil<E> {
  		
	//方法1：判断源字符串是否有值，空引号(空白字符串)也算没值 (5分)
	public boolean hasLength(String src){
	    //实现代码
		boolean flag=false;
		//循环字符串
		for(int i=0;i<src.length();i++){
			//获取字符
			Character c = src.charAt(i);
			//判断是否有值
			if(src.length()>0){
				//判断空引号(空白字符串)也算没值
				if(c.equals(null)||c.equals("")||c.equals(" ")){
					flag= false;
				}else {
					flag= true;
				}
			}else{
				flag= false;
			}
		}
		return flag;
	}
//方法2：判断源字符串是否有值，空引号(空白字符串)和空格也算没值 (5分)
	public boolean hasText(String src){
		 //实现代码
		boolean flag=false;
		//循环字符串
		for(int i=0;i<src.length();i++){
			//获取字符
			Character c = src.charAt(i);
			//判断是否有值
			if(src.length()>0){
				//判断空引号(空白字符串)也算没值
				if(c.equals(null)||c.equals("")||c.equals(" ")){
					flag= false;
				}else {
					flag= true;
				}
			}else{
				flag= false;
			}
		}
		return flag;
	}
		//方法3：判断是否为手机号码 (5分)
	public boolean isMobile(String src){
		//手机号正则验证
		String regMobile="1[35789]\\d{9}";
	    //判断字符串长度是否为11
		if(src.matches(regMobile)){
			return true;
		}else{
			return false;
		}
	}
	//方法4：判断是否为邮箱 (5分)
	public boolean isEmail(String src){
	    //正则验证是否为邮箱
		String regEmail="\\w+@\\w+\\.(cn|com)";
		if(src.matches(regEmail)){
			return true;
		}else{
			return false;
		}
	}
		//方法5：反转字符串，例如参数值是“abcdefg”，则输出“gfedcba” (5分)
	public String reverse(String src){
		//创建list集合
		ArrayList<Character> list = new ArrayList<Character>();
		for(int i = 0; i<src.length();i++){
			list.add(src.charAt(i));
		}
		//顺序反转
		Collections.reverse(list);
		//全局变量
		String str = "";
		//遍历拼接
	    for (Character c : list) {
			str+=c;
		}
	    return str;
	}
	
}
