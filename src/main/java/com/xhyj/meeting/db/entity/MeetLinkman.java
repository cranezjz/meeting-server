package com.xhyj.meeting.db.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the MEET_LINKMAN database table.
 * 
 */
@Entity
@Table(name="MEET_LINKMAN")
@NamedQuery(name="MeetLinkman.findAll", query="SELECT m FROM MeetLinkman m")
public class MeetLinkman implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	@Column(name="INSERT_INTO")
	private String insertInto;

	@Column(name="MEET_ID")
	private String meetId;

	@Column(name="MODIFY_DATE")
	private String modifyDate;

	private String name;

	@Column(name="OPERATOR_ID")
	private String operatorId;

	private String phone;

	public MeetLinkman() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getInsertInto() {
		return this.insertInto;
	}

	public void setInsertInto(String insertInto) {
		this.insertInto = insertInto;
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

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}