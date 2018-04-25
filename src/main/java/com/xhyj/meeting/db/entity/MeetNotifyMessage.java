package com.xhyj.meeting.db.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the MEET_NOTIFY_MESSAGE database table.
 * 
 */
@Entity
@Table(name="MEET_NOTIFY_MESSAGE")
@NamedQuery(name="MeetNotifyMessage.findAll", query="SELECT m FROM MeetNotifyMessage m")
public class MeetNotifyMessage implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	@Column(name="INSERT_DATE")
	private String insertDate;

	@Column(name="MEET_ID")
	private String meetId;

	@Column(name="MESSAGE_CONTENT")
	private String messageContent;

	@Column(name="MESSAGE_TYPE")
	private String messageType;

	@Column(name="MODIFY_DATE")
	private String modifyDate;

	@Column(name="OPERATOR_ID")
	private String operatorId;

	private String receiver;

	@Column(name="SEND_TIME")
	private String sendTime;

	@Column(name="SEND_TYPE")
	private String sendType;

	private String title;

	public MeetNotifyMessage() {
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

	public String getMessageType() {
		return this.messageType;
	}

	public void setMessageType(String messageType) {
		this.messageType = messageType;
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

	public String getReceiver() {
		return this.receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public String getSendTime() {
		return this.sendTime;
	}

	public void setSendTime(String sendTime) {
		this.sendTime = sendTime;
	}

	public String getSendType() {
		return this.sendType;
	}

	public void setSendType(String sendType) {
		this.sendType = sendType;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}