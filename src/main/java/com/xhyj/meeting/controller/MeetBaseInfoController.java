/**
 * 
 */
package com.xhyj.meeting.controller;

import java.util.List;

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
}
