/**
 * 
 */
package com.xhyj.meeting.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xhyj.meeting.db.entity.MeetBaseInfo;
import com.xhyj.meeting.service.MeetBaseInfoService;


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
	@RequestMapping("query")
	public Page<MeetBaseInfo> query(MeetBaseInfo user,int pageNum) {
		return meetBaseInfoService.findPage(user, pageNum);
	}
}
