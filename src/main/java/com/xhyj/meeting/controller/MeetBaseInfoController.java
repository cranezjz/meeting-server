/**
 * 
 */
package com.xhyj.meeting.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xhyj.meeting.db.entity.MeetBaseInfo;
import com.xhyj.meeting.dto.MeetBaseInfoDto;
import com.xhyj.meeting.dto.ReturnData;
import com.xhyj.meeting.service.MeetBaseInfoService;
import com.xhyj.meeting.util.MyBeanUtil;
import com.xhyj.util.annotation.Label;


/**
 * <p>Title: MeetBaseInfoController.java</p>  
 * <p>Description: </p>  
 * @author zhaojz
 * @date 2018年4月13日
 */
@RestController
@RequestMapping("/meet/")
public class MeetBaseInfoController {
	Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private MeetBaseInfoService meetBaseInfoService;
	@RequestMapping("queryAll")
	@Label("查询会议基本信息")
	public ReturnData queryAll() {
		List<MeetBaseInfo> all = meetBaseInfoService.findAll();
		return MyBeanUtil.getSuccReturnData(all, new MeetBaseInfoDto());
	}
	@RequestMapping("queryOnePage")
	@Label("查询会议基本信息")
	public ReturnData queryOnePage(MeetBaseInfo user,int pageNum) {
		Page<MeetBaseInfo> all = meetBaseInfoService.findPage(user, pageNum);
		return MyBeanUtil.getSuccReturnData(all, new MeetBaseInfoDto());
	}
	@RequestMapping("queryOneById")
	@Label("查询会议基本信息")
	public ReturnData queryOneById(MeetBaseInfo meetBaseInfo) {
		MeetBaseInfo one = meetBaseInfoService.findOneById(meetBaseInfo);
		return MyBeanUtil.getSuccReturnData(one, new MeetBaseInfoDto());
	}
	@RequestMapping("add")
	@Label("修改会议基本信息")
	public ReturnData add(MeetBaseInfo meetBaseInfo) {
		MeetBaseInfo result = meetBaseInfoService.add(meetBaseInfo);
		return MyBeanUtil.getSuccReturnData(result,new MeetBaseInfoDto());
	}
	@RequestMapping("update")
	@Label("修改会议基本信息")
	public ReturnData update(MeetBaseInfo meetBaseInfo) {
		MeetBaseInfo result = meetBaseInfoService.update(meetBaseInfo);
		return MyBeanUtil.getSuccReturnData(result,new MeetBaseInfoDto());
	}
	@RequestMapping("delete")
	@Label("修改会议基本信息")
	public ReturnData delete(MeetBaseInfo meetBaseInfo) {
		try {
			meetBaseInfoService.delete(meetBaseInfo);
			return MyBeanUtil.getSuccReturnData();
		}catch(Exception e) {
    		logger.warn("id为"+meetBaseInfo.getId()+"记录不存在");
    		return MyBeanUtil.getBaseReturnData("1","操作失败");
    	}
	}
}
