package com.xhyj.meeting.db.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the MEET_FEAST database table.
 * 
 */
@Entity
@Table(name="MEET_FEAST")
@NamedQuery(name="MeetFeast.findAll", query="SELECT m FROM MeetFeast m")
public class MeetFeast implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	@Column(name="FEAST_DATE")
	private String feastDate;

	@Column(name="FEAST_TYPE")
	private String feastType;

	@Column(name="INSERT_DATE")
	private String insertDate;

	@Column(name="MEET_ID")
	private String meetId;

	@Column(name="MODIFY_DATE")
	private String modifyDate;

	@Column(name="OPERATOR_ID")
	private String operatorId;

	public MeetFeast() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFeastDate() {
		return this.feastDate;
	}

	public void setFeastDate(String feastDate) {
		this.feastDate = feastDate;
	}

	public String getFeastType() {
		return this.feastType;
	}

	public void setFeastType(String feastType) {
		this.feastType = feastType;
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