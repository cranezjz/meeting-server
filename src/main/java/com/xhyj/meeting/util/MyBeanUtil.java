/**
 * 
 */
package com.xhyj.meeting.util;

import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;

import com.xhyj.meeting.dto.ReturnData;
import com.xhyj.meeting.dto.ReturnSimplePage;

/**
 * <p>
 * Title: MyBeanUtil.java
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @author zhaojz
 * @date 2018年4月17日
 */
public class MyBeanUtil {
	static Logger logger = LoggerFactory.getLogger(MyBeanUtil.class);
	public static ReturnData getSuccReturnData() {
		return getBaseReturnData(null,null);
	}
	/**
	 * 
	 * @param code
	 * @param msg
	 * @return
	 */
	public static ReturnData getBaseReturnData(String code,String msg) {
		ReturnData returnData = new ReturnData();
		if(code != null) {
			returnData.setCode(code);
		}
		if(msg != null) {
			returnData.setCode(msg);
		}
		return returnData;
	}
	/**
	 * 
	 * @param originalData
	 * @return
	 */
	public static ReturnData getSuccReturnData(Object originalData) {
		return getSuccReturnData(originalData,null);
	}
	/**
	 * 
	 * @param originalData
	 * @param filterObject
	 * @return
	 */
	public static ReturnData getSuccReturnData(Object originalData, Object filterObject) {
		ReturnData returnData = new ReturnData();
		if(originalData instanceof Page) {
			@SuppressWarnings("rawtypes")
			Page page = (Page)originalData;
			loadPage(returnData,page);
			List<?>originList = page.getContent();
			loadList(returnData,originList,filterObject);
		}else if(originalData instanceof List){
			loadList(returnData,originalData,filterObject);
		}else {
			if(filterObject == null) {
				returnData.setCentent(originalData);
			}else {
				copyBean(originalData, filterObject);
				returnData.setCentent(filterObject);
			}
		}
		return returnData;
	}
	/**
	 * @param originList
	 * @param filterObject
	 */
	private static void loadList(ReturnData returnData,Object originObject, Object filterObject) {
		if(filterObject == null) {
			returnData.setCentent(originObject);
		}else {
			List<Object> targetList = new ArrayList<Object>();
			List<?> originList = (List<?>)originObject;
			for (Object originItem : originList) {
				try {
					Object tmp = filterObject.getClass().newInstance();
					copyBean(originItem,tmp);
					targetList.add(tmp);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			returnData.setCentent(targetList);
		}
		
	}
	/**
	 * 抽取分页常用属性
	 * @param returnData
	 * @param originalData
	 */
	private static void loadPage(ReturnData returnData, Page<?> page) {
		ReturnSimplePage returnSimplePage = new ReturnSimplePage();
		returnSimplePage.setNumber(page.getNumber());
		returnSimplePage.setNumberOfElements(page.getNumberOfElements());
		returnSimplePage.setSize(page.getSize());
		returnSimplePage.setTotalElements(page.getTotalElements());
		returnSimplePage.setTotalPages(page.getTotalPages());
		returnData.setPage(returnSimplePage);
	}
	/**
	 * 
	 * @param code
	 * @param errorMsg
	 * @param originalData
	 * @return
	 */
	public static ReturnData getFailReturnData(String code, String errorMsg,Object originalData) {
		return getFailReturnData(code, errorMsg,originalData, null);
	}
	/**
	 * 
	 * @param code
	 * @param errorMsg
	 * @param originalData
	 * @param filterObject
	 * @return
	 */
	public static ReturnData getFailReturnData(String code, String errorMsg,Object originalData, Object filterObject) {
		ReturnData returnData = getSuccReturnData(originalData, filterObject);
		returnData.setCode(code);
		returnData.setMsg(errorMsg);
		return returnData;
	}
	/**
	 * 从原对象中取部分值复制到目标对象中，按照字段名相同的规则复制
	 * @param originObject
	 * @param targetEmptyObject
	 * @throws NoSuchFieldException
	 * @throws SecurityException
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 */
	public static void copyBean(Object originObject,Object targetEmptyObject) {
		Field[] targetFields = targetEmptyObject.getClass().getDeclaredFields();
		for (Field targetField : targetFields) {
			Field originField=null;
			try {
				originField = originObject.getClass().getDeclaredField(targetField.getName());
				originField.setAccessible(true);
				targetField.setAccessible(true);
				targetField.set(targetEmptyObject,originField.get(originObject));
			}catch (Exception e) {
				logger.warn("copy字段"+targetEmptyObject.getClass().getSimpleName()+"."+targetField.getName()+"出错了："+e.getMessage());
			}
		}
	}
	/**
	 * 将valueObject 中的非空属性值，覆盖targetObject的同名属性值
	 * @param valueObject
	 * @param targetObject
	 */
	public static void setBean(Object valueObject,Object targetObject) {
		Field[] fields = valueObject.getClass().getDeclaredFields();
		for (Field field : fields) {
			Field targetField=null;
			try {
				targetField = targetObject.getClass().getDeclaredField(field.getName());
				targetField.setAccessible(true);
				field.setAccessible(true);
				if(field.get(valueObject)==null) {
					continue;
				}
				targetField.set(targetObject,field.get(valueObject));
			}catch (Exception e) {
				logger.warn("copy字段"+valueObject.getClass().getSimpleName()+"."+targetField.getName()+"出错了："+e.getMessage());
			}
		}
	}
	/**
	 * 保存对象是补充一些公共属性
	 * @param valueObject
	 * @param targetObject
	 */
	public static void complementAddBean(Object targetObject,String operatorId) {
		Field[] fields = targetObject.getClass().getDeclaredFields();
		String currentDate = new SimpleDateFormat("yyyyMMdd").format(new Date());
		for (Field field : fields) {
			try {
				if("id".equals(field.getName())) {
					field.setAccessible(true);
					field.set(targetObject,UUID.randomUUID().toString().replace("-", ""));
				}
				if("insertDate".equals(field.getName())) {
					field.setAccessible(true);
					field.set(targetObject,currentDate);
				}
				if("modifyDate".equals(field.getName())) {
					field.setAccessible(true);
					field.set(targetObject,currentDate);
				}
				if("operatorId".equals(field.getName())) {
					field.setAccessible(true);
					field.set(targetObject,operatorId);
				}
			}catch (Exception e) {
				logger.warn("copy字段"+targetObject.getClass().getSimpleName()+"."+field.getName()+"出错了："+e.getMessage());
			}
		}
	}
	/**
	 * @param meetBaseInfo
	 * @param operatorIdFromToken
	 */
	public static void complementUpdateBean(Object targetObject, String operatorId) {
		Field[] fields = targetObject.getClass().getDeclaredFields();
		String currentDate = new SimpleDateFormat("yyyyMMdd").format(new Date());
		for (Field field : fields) {
			try {
				if("modifyDate".equals(field.getName())) {
					field.setAccessible(true);
					field.set(targetObject,currentDate);
				}
				if("operatorId".equals(field.getName())) {
					field.setAccessible(true);
					field.set(targetObject,operatorId);
				}
			}catch (Exception e) {
				logger.warn("copy字段"+targetObject.getClass().getSimpleName()+"."+field.getName()+"出错了："+e.getMessage());
			}
		}
	}
}
