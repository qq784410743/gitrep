package com.guozhuangzhuang.common.utils;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

//集合工具类(CollectionUtil.java)
public class CollectionUtil {

	
	//方法1：判断List或Set集合是否有元素，对象为空或对象中没有元素都算没值 (5分)
	public boolean notEmpty(List list){
		//判断集合大小
		if(list.size()!=0){
			return true;
		}else{
			return false;
		}
	}
	//方法2：判断Map集合是否有元素，对象为空或对象中没有元素都算没值 (5分)
	public boolean notEmpty1(Map<String,Integer> map){
		//获取map中所有的key
	    Set<String> k = map.keySet();
	    Iterator<String> iterator = k.iterator();
	    //定义一个变量
	    int count=0;
	    while(iterator.hasNext()){
	    	count++;
	    }
		//判断
	    if(count>0){
	    	return true;
	    }else{
	    	return false;
	    }
	}
	
}
