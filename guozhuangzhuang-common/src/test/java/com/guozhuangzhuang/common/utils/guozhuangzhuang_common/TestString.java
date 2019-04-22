package com.guozhuangzhuang.common.utils.guozhuangzhuang_common;

import com.guozhuangzhuang.common.utils.StringUtil;

public class TestString {

	public static void main(String[] args) {
		//验证字符串是否为空
		StringUtil<Object> sUtil = new StringUtil<Object>();
		String string="1";
		boolean hasLength = sUtil.hasLength(string);
		System.out.println(hasLength);
		//验证手机
		boolean b = sUtil.isMobile("13123456789");
		System.out.println(b);
		//验证邮箱
		boolean email = sUtil.isEmail("email@qqcom");
		System.out.println(email);
		//反转字符串
		String reverse = sUtil.reverse("abcdefg");
		System.out.println(reverse);
		
	}
	
}
