package com.xhyj.meeting.db.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the MEET_BASE_INFO database table.
 * 
 */
@Entity
@Table(name="MEET_BASE_INFO")
@NamedQuery(name="MeetBaseInfo.findAll", query="SELECT m FROM MeetBaseInfo m")
public class MeetBaseInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	private String address;

	@Column(name="ALLOW_APPLY_GROUP")
	private String allowApplyGroup;

	@Column(name="APPLY_CONFIRM_FLAG")
	private String applyConfirmFlag;

	@Column(name="BEGIN_DATE")
	private String beginDate;

	@Column(name="END_DATE")
	private String endDate;

	@Column(name="FEAST_CONFIRM_FLAG")
	private String feastConfirmFlag;

	@Column(name="HOST_ORG")
	private String hostOrg;

	@Column(name="INSERT_DATE")
	private String insertDate;

	@Column(name="ISSUE_DATE")
	private String issueDate;

	@Column(name="LAST_APPLY_DATE")
	private String lastApplyDate;

	@Column(name="MODIFY_DATE")
	private String modifyDate;

	private String name;

	@Column(name="OPERATOR_ID")
	private String operatorId;

	private String stt;

	public MeetBaseInfo() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAllowApplyGroup() {
		return this.allowApplyGroup;
	}

	public void setAllowApplyGroup(String allowApplyGroup) {
		this.allowApplyGroup = allowApplyGroup;
	}

	public String getApplyConfirmFlag() {
		return this.applyConfirmFlag;
	}

	public void setApplyConfirmFlag(String applyConfirmFlag) {
		this.applyConfirmFlag = applyConfirmFlag;
	}

	public String getBeginDate() {
		return this.beginDate;
	}

	public void setBeginDate(String beginDate) {
		this.beginDate = beginDate;
	}

	public String getEndDate() {
		return this.endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getFeastConfirmFlag() {
		return this.feastConfirmFlag;
	}

	public void setFeastConfirmFlag(String feastConfirmFlag) {
		this.feastConfirmFlag = feastConfirmFlag;
	}

	public String getHostOrg() {
		return this.hostOrg;
	}

	public void setHostOrg(String hostOrg) {
		this.hostOrg = hostOrg;
	}

	public String getInsertDate() {
		return this.insertDate;
	}

	public void setInsertDate(String insertDate) {
		this.insertDate = insertDate;
	}

	public String getIssueDate() {
		return this.issueDate;
	}

	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}

	public String getLastApplyDate() {
		return this.lastApplyDate;
	}

	public void setLastApplyDate(String lastApplyDate) {
		this.lastApplyDate = lastApplyDate;
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

	public String getOperatorId() {
		return this.operatorId;
	}

	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	public String getStt() {
		return this.stt;
	}

	public void setStt(String stt) {
		this.stt = stt;
	}

	@Override
	public String toString() {
		return "MeetBaseInfo [id=" + id + ", address=" + address + ", allowApplyGroup=" + allowApplyGroup
				+ ", applyConfirmFlag=" + applyConfirmFlag + ", beginDate=" + beginDate + ", endDate=" + endDate
				+ ", feastConfirmFlag=" + feastConfirmFlag + ", hostOrg=" + hostOrg + ", insertDate=" + insertDate
				+ ", issueDate=" + issueDate + ", lastApplyDate=" + lastApplyDate + ", modifyDate=" + modifyDate
				+ ", name=" + name + ", operatorId=" + operatorId + ", stt=" + stt + "]";
	}
	
}