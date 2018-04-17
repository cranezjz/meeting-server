/**
 * 
 */
package com.xhyj.meeting.util;

import java.lang.reflect.Field;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.xhyj.meeting.dto.CommonDto;

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
/*	public static List<CommonDto> select(List<?> list, CommonDto simpleBean) {
		List<CommonDto> newList = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			CommonDto cd = simpleBean.getNewSelf();
			BeanUtils.copyProperties(list.get(i), cd);
			newList.add(cd);
		}
		return newList;
	}*/

	@Autowired
	public static void filterField(List<?> list, CommonDto simpleBean) {
		Field[] fields = simpleBean.getClass().getDeclaredFields();
		for (int i = 0; i < list.size(); i++) {
			Object item = list.get(i);
			Field[] item_fields = item.getClass().getDeclaredFields();
			for (Field item_field : item_fields) {
				if (!isValid(item_field, fields)) {
					item_field.setAccessible(true);
					try {
						item_field.set(item, null);
					} catch (IllegalArgumentException e) {
						e.printStackTrace();
					} catch (IllegalAccessException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}

	private static boolean isValid(Field item_field, Field[] fields) {
		for (Field field : fields) {
			if (field.getName().equals(item_field.getName())) {
				return true;
			}
		}
		return false;
	}
}
