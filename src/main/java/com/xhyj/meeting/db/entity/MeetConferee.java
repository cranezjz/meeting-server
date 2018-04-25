package com.xhyj.meeting.db.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the MEET_CONFEREE database table.
 * 
 */
@Entity
@Table(name="MEET_CONFEREE")
@NamedQuery(name="MeetConferee.findAll", query="SELECT m FROM MeetConferee m")
public class MeetConferee implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	@Column(name="APPLY_MEET_FEASTS")
	private String applyMeetFeasts;

	@Column(name="APPLY_MEET_PLACES")
	private String applyMeetPlaces;

	@Column(name="APPLY_WAY")
	private String applyWay;

	private String department;

	@Column(name="INSERT_DATE")
	private String insertDate;

	@Column(name="IS_LIVE_TOGETHER")
	private String isLiveTogether;

	@Column(name="MEET_ID")
	private String meetId;

	@Column(name="MEET_ROLE")
	private String meetRole;

	private String mobile;

	@Column(name="MODIFY_DATE")
	private String modifyDate;

	private String name;

	@Column(name="OPERATE_ID")
	private String operateId;

	@Column(name="ORGANIZATION_ID")
	private String organizationId;

	@Column(name="ORGANIZATION_NAME")
	private String organizationName;

	private BigDecimal rank;

	@Column(name="SIGN_TIME")
	private String signTime;

	@Column(name="SIGN_TYPE")
	private String signType;

	private String stt;

	private String title;

	@Column(name="USER_ID")
	private String userId;

	public MeetConferee() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getApplyMeetFeasts() {
		return this.applyMeetFeasts;
	}

	public void setApplyMeetFeasts(String applyMeetFeasts) {
		this.applyMeetFeasts = applyMeetFeasts;
	}

	public String getApplyMeetPlaces() {
		return this.applyMeetPlaces;
	}

	public void setApplyMeetPlaces(String applyMeetPlaces) {
		this.applyMeetPlaces = applyMeetPlaces;
	}

	public String getApplyWay() {
		return this.applyWay;
	}

	public void setApplyWay(String applyWay) {
		this.applyWay = applyWay;
	}

	public String getDepartment() {
		return this.department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getInsertDate() {
		return this.insertDate;
	}

	public void setInsertDate(String insertDate) {
		this.insertDate = insertDate;
	}

	public String getIsLiveTogether() {
		return this.isLiveTogether;
	}

	public void setIsLiveTogether(String isLiveTogether) {
		this.isLiveTogether = isLiveTogether;
	}

	public String getMeetId() {
		return this.meetId;
	}

	public void setMeetId(String meetId) {
		this.meetId = meetId;
	}

	public String getMeetRole() {
		return this.meetRole;
	}

	public void setMeetRole(String meetRole) {
		this.meetRole = meetRole;
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getModifyDate() {
		return this.modifyDate;
	}

	public void setModifyDate(String modifyDate) {
		this.modifyDate = modifyDate;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOperateId() {
		return this.operateId;
	}

	public void setOperateId(String operateId) {
		this.operateId = operateId;
	}

	public String getOrganizationId() {
		return this.organizationId;
	}

	public void setOrganizationId(String organizationId) {
		this.organizationId = organizationId;
	}

	public String getOrganizationName() {
		return this.organizationName;
	}

	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}

	public BigDecimal getRank() {
		return this.rank;
	}

	public void setRank(BigDecimal rank) {
		this.rank = rank;
	}

	public String getSignTime() {
		return this.signTime;
	}

	public void setSignTime(String signTime) {
		this.signTime = signTime;
	}

	public String getSignType() {
		return this.signType;
	}

	public void setSignType(String signType) {
		this.signType = signType;
	}

	public String getStt() {
		return this.stt;
	}

	public void setStt(String stt) {
		this.stt = stt;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}