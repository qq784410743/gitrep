package com.guozhuangzhuang.common.utils.guozhuangzhuang_common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.guozhuangzhuang.common.utils.CollectionUtil;

public class TestCollectionUtil {

	public static <V> void main(String[] args) {
		CollectionUtil lUtil = new CollectionUtil();
		ArrayList<Object> list = new ArrayList<Object>();
		list.add(1);
		//判断List或Set集合是否有元素
		boolean empty = lUtil.notEmpty(list);
		System.out.println(empty);
		
		//判断Map集合是否有元素，对象为空或对象中没有元素都算没值 
		Map map = new HashMap<String,Integer>();
		Object map1 = map.put(null, null);
		
	}
	
}
