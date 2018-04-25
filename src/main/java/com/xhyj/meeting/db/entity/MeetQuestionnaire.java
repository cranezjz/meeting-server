package com.xhyj.meeting.db.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the MEET_QUESTIONNAIRE database table.
 * 
 */
@Entity
@Table(name="MEET_QUESTIONNAIRE")
@NamedQuery(name="MeetQuestionnaire.findAll", query="SELECT m FROM MeetQuestionnaire m")
public class MeetQuestionnaire implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	private String account;

	private String address;

	@Column(name="\"ALIAS\"")
	private String alias;

	@Column(name="INSERT_DATE")
	private String insertDate;

	@Column(name="MEET_CODE")
	private String meetCode;

	@Column(name="MEET_ID")
	private String meetId;

	@Column(name="MODIFY_DATE")
	private String modifyDate;

	@Column(name="OPERATOR_ID")
	private String operatorId;

	private String password;

	@Column(name="QR_CODE")
	private String qrCode;

	@Column(name="QUESTION_CODE")
	private String questionCode;

	public MeetQuestionnaire() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAccount() {
		return this.account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAlias() {
		return this.alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getInsertDate() {
		return this.insertDate;
	}

	public void setInsertDate(String insertDate) {
		this.insertDate = insertDate;
	}

	public String getMeetCode() {
		return this.meetCode;
	}

	public void setMeetCode(String meetCode) {
		this.meetCode = meetCode;
	}

	public String getMeetId() {
		return this.meetId;
	}

	public void setMeetId(String meetId) {
		this.meetId = meetId;
	}

	public String getModifyDate() {
		return this.modifyDate;
	}

	public void setModifyDate(String modifyDate) {
		this.modifyDate = modifyDate;
	}

	public String getOperatorId() {
		return this.operatorId;
	}

	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getQrCode() {
		return this.qrCode;
	}

	public void setQrCode(String qrCode) {
		this.qrCode = qrCode;
	}

	public String getQuestionCode() {
		return this.questionCode;
	}

	public void setQuestionCode(String questionCode) {
		this.questionCode = questionCode;
	}

}