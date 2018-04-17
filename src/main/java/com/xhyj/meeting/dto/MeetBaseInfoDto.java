/**
 * 
 */
package com.xhyj.meeting.dto;

import javax.persistence.Column;
import javax.persistence.Id;

/**
 * <p>Title: MeetBaseInfoDto.java</p>  
 * <p>Description: </p>  
 * @author zhaojz
 * @date 2018年4月17日
 */
public class MeetBaseInfoDto implements CommonDto{
	@Id
	public java.lang.String id;
	/**
	 * 名称
	 */
	@Column
	public java.lang.String name;
	/**
	 * 会议主办机构
	 */
	@Column
	public java.lang.String host_org;
	/**
	 * 起始日期
	 */
	@Column
	public java.lang.String begin_date;
	/**
	 * 状态：00:未发布；10：已发布；20：已结束
	 */
	@Column
	public java.lang.String stt;
	/**
	 * 发布日期
	 */
	@Column
	public java.lang.String issue_date;
	public java.lang.String getId() {
		return id;
	}
	public void setId(java.lang.String id) {
		this.id = id;
	}
	public java.lang.String getName() {
		return name;
	}
	public void setName(java.lang.String name) {
		this.name = name;
	}
	public java.lang.String getHost_org() {
		return host_org;
	}
	public void setHost_org(java.lang.String host_org) {
		this.host_org = host_org;
	}
	public java.lang.String getBegin_date() {
		return begin_date;
	}
	public void setBegin_date(java.lang.String begin_date) {
		this.begin_date = begin_date;
	}
	public java.lang.String getStt() {
		return stt;
	}
	public void setStt(java.lang.String stt) {
		this.stt = stt;
	}
	public java.lang.String getIssue_date() {
		return issue_date;
	}
	public void setIssue_date(java.lang.String issue_date) {
		this.issue_date = issue_date;
	}
	@Override
	public String toString() {
		return "MeetBaseInfoDto [id=" + id + ", name=" + name + ", host_org=" + host_org + ", begin_date=" + begin_date
				+ ", stt=" + stt + ", issue_date=" + issue_date + "]";
	}
	/* (non-Javadoc)
	 * @see com.xhyj.meeting.dto.CommonDto#getNewSelf()
	 */
	@Override
	public CommonDto getNewSelf() {
		return new MeetBaseInfoDto();
	}
	
}
