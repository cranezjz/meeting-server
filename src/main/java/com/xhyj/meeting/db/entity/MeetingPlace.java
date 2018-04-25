package com.xhyj.meeting.db.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the MEETING_PLACE database table.
 * 
 */
@Entity
@Table(name="MEETING_PLACE")
@NamedQuery(name="MeetingPlace.findAll", query="SELECT m FROM MeetingPlace m")
public class MeetingPlace implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	private String address;

	private BigDecimal code;

	@Column(name="INSERT_DATE")
	private String insertDate;

	@Column(name="MEET_ID")
	private String meetId;

	@Column(name="MODIFY_DATE")
	private String modifyDate;

	private String name;

	@Column(name="OPERATOR_ID")
	private String operatorId;

	@Column(name="PLACE_TYPE")
	private String placeType;

	@Column(name="SEAT_NUM")
	private BigDecimal seatNum;

	@Column(name="SEAT_STT")
	private String seatStt;

	public MeetingPlace() {
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

	public BigDecimal getCode() {
		return this.code;
	}

	public void setCode(BigDecimal code) {
		this.code = code;
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

	public String getPlaceType() {
		return this.placeType;
	}

	public void setPlaceType(String placeType) {
		this.placeType = placeType;
	}

	public BigDecimal getSeatNum() {
		return this.seatNum;
	}

	public void setSeatNum(BigDecimal seatNum) {
		this.seatNum = seatNum;
	}

	public String getSeatStt() {
		return this.seatStt;
	}

	public void setSeatStt(String seatStt) {
		this.seatStt = seatStt;
	}

}