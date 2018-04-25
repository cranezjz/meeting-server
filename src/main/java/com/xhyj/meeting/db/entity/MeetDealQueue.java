package com.xhyj.meeting.db.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the MEET_DEAL_QUEUE database table.
 * 
 */
@Entity
@Table(name="MEET_DEAL_QUEUE")
@NamedQuery(name="MeetDealQueue.findAll", query="SELECT m FROM MeetDealQueue m")
public class MeetDealQueue implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	@Column(name="\"ACTION\"")
	private String action;

	@Column(name="EVENT_TYPE")
	private String eventType;

	@Column(name="INSERT_DATE")
	private String insertDate;

	@Column(name="MEET_ID")
	private String meetId;

	@Column(name="MODIFYT_DATE")
	private String modifytDate;

	@Column(name="OPERATOR_ID")
	private String operatorId;

	private String stt;

	@Column(name="SUBMIT_TIME")
	private String submitTime;

	private String submitter;

	private String tips;

	public MeetDealQueue() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAction() {
		return this.action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getEventType() {
		return this.eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public String getInsertDate() {
		return this.insertDate;
	}

	public void setInsertDate(String insertDate) {
		this.insertDate = insertDate;
	}

	public String getMeetId() {
		return this.meetId;
	}

	public void setMeetId(String meetId) {
		this.meetId = meetId;
	}

	public String getModifytDate() {
		return this.modifytDate;
	}

	public void setModifytDate(String modifytDate) {
		this.modifytDate = modifytDate;
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

	public String getSubmitTime() {
		return this.submitTime;
	}

	public void setSubmitTime(String submitTime) {
		this.submitTime = submitTime;
	}

	public String getSubmitter() {
		return this.submitter;
	}

	public void setSubmitter(String submitter) {
		this.submitter = submitter;
	}

	public String getTips() {
		return this.tips;
	}

	public void setTips(String tips) {
		this.tips = tips;
	}

}