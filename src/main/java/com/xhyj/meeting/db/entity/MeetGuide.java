package com.xhyj.meeting.db.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the MEET_GUIDE database table.
 * 
 */
@Entity
@Table(name="MEET_GUIDE")
@NamedQuery(name="MeetGuide.findAll", query="SELECT m FROM MeetGuide m")
public class MeetGuide implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	@Lob
	private byte[] content;

	@Column(name="INSERT_DATE")
	private String insertDate;

	@Column(name="MEET_ID")
	private String meetId;

	@Column(name="MODIFY_DATE")
	private String modifyDate;

	@Column(name="OPERATOR_ID")
	private String operatorId;

	public MeetGuide() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public byte[] getContent() {
		return this.content;
	}

	public void setContent(byte[] content) {
		this.content = content;
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

}