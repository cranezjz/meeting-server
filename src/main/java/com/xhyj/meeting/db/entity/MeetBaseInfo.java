package com.xhyj.meeting.db.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * <p>Title: MeetBaseInfo.java</p>  
 * <p>Description: </p>  
 * @author zhaojz
 * @date 2018年4月13日
 */
@Entity
@Table(name="meet_base_info")
public class MeetBaseInfo {
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
	 * 结束日期
	 */
	@Column
	public java.lang.String end_date;
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
	/**
	 * 会议地址
	 */
	@Column
	public java.lang.String address;
	/**
	 * 报名截止日期
	 */
	@Column
	public java.lang.String last_apply_date;
	/**
	 * 可报名机构分组id--备用
	 */
	@Column
	public java.lang.String allow_apply_group;
	/**
	 * 报名是否需确认(0：不需要确认；1：需要确认)
	 */
	@Column
	public java.lang.String apply_confirm_flag;
	/**
	 * 宴会是否需确认（0：不需要确认；1：需要确认）
	 */
	@Column
	public java.lang.String feast_confirm_flag;
	/**
	 * 创建日期
	 */
	@Column
	public java.lang.String insert_date;
	/**
	 * 修改日期
	 */
	@Column
	public java.lang.String modify_date;
	/**
	 * 操作员
	 */
	@Column
	public java.lang.String operator_id;
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
	public java.lang.String getEnd_date() {
		return end_date;
	}
	public void setEnd_date(java.lang.String end_date) {
		this.end_date = end_date;
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
	public java.lang.String getAddress() {
		return address;
	}
	public void setAddress(java.lang.String address) {
		this.address = address;
	}
	public java.lang.String getLast_apply_date() {
		return last_apply_date;
	}
	public void setLast_apply_date(java.lang.String last_apply_date) {
		this.last_apply_date = last_apply_date;
	}
	public java.lang.String getAllow_apply_group() {
		return allow_apply_group;
	}
	public void setAllow_apply_group(java.lang.String allow_apply_group) {
		this.allow_apply_group = allow_apply_group;
	}
	public java.lang.String getApply_confirm_flag() {
		return apply_confirm_flag;
	}
	public void setApply_confirm_flag(java.lang.String apply_confirm_flag) {
		this.apply_confirm_flag = apply_confirm_flag;
	}
	public java.lang.String getFeast_confirm_flag() {
		return feast_confirm_flag;
	}
	public void setFeast_confirm_flag(java.lang.String feast_confirm_flag) {
		this.feast_confirm_flag = feast_confirm_flag;
	}
	public java.lang.String getInsert_date() {
		return insert_date;
	}
	public void setInsert_date(java.lang.String insert_date) {
		this.insert_date = insert_date;
	}
	public java.lang.String getModify_date() {
		return modify_date;
	}
	public void setModify_date(java.lang.String modify_date) {
		this.modify_date = modify_date;
	}
	public java.lang.String getOperator_id() {
		return operator_id;
	}
	public void setOperator_id(java.lang.String operator_id) {
		this.operator_id = operator_id;
	}
	
}
