package com.xhyj.meeting.db.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the MEET_MESSAGE database table.
 * 
 */
@Entity
@Table(name="MEET_MESSAGE")
@NamedQuery(name="MeetMessage.findAll", query="SELECT m FROM MeetMessage m")
public class MeetMessage implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	@Column(name="INSERT_DATE")
	private String insertDate;

	@Column(name="MEET_ID")
	private String meetId;

	@Column(name="MESSAGE_CONTENT")
	private String messageContent;

	@Column(name="MESSAGE_PRODUCER")
	private String messageProducer;

	@Column(name="MODIFY_DATE")
	private String modifyDate;

	@Column(name="OPERATOR_ID")
	private String operatorId;

	private String stt;

	@Column(name="SUBMIT_TIME")
	private String submitTime;

	public MeetMessage() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getMessageContent() {
		return this.messageContent;
	}

	public void setMessageContent(String messageContent) {
		this.messageContent = messageContent;
	}

	public String getMessageProducer() {
		return this.messageProducer;
	}

	public void setMessageProducer(String messageProducer) {
		this.messageProducer = messageProducer;
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

}