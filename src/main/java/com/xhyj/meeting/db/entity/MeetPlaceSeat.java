package com.xhyj.meeting.db.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the MEET_PLACE_SEAT database table.
 * 
 */
@Entity
@Table(name="MEET_PLACE_SEAT")
@NamedQuery(name="MeetPlaceSeat.findAll", query="SELECT m FROM MeetPlaceSeat m")
public class MeetPlaceSeat implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	@Column(name="COL_NUM")
	private BigDecimal colNum;

	@Column(name="INSERT_DATE")
	private String insertDate;

	@Column(name="MEET_PLACE_ID")
	private String meetPlaceId;

	@Column(name="MODIFY_DATE")
	private String modifyDate;

	@Column(name="OPERATOR_ID")
	private String operatorId;

	@Column(name="PART_NUM")
	private BigDecimal partNum;

	@Column(name="PRESENT_ID")
	private String presentId;

	@Column(name="ROW_NUM")
	private BigDecimal rowNum;

	@Column(name="SEAT_NUM")
	private BigDecimal seatNum;

	private String stt;

	public MeetPlaceSeat() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public BigDecimal getColNum() {
		return this.colNum;
	}

	public void setColNum(BigDecimal colNum) {
		this.colNum = colNum;
	}

	public String getInsertDate() {
		return this.insertDate;
	}

	public void setInsertDate(String insertDate) {
		this.insertDate = insertDate;
	}

	public String getMeetPlaceId() {
		return this.meetPlaceId;
	}

	public void setMeetPlaceId(String meetPlaceId) {
		this.meetPlaceId = meetPlaceId;
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

	public BigDecimal getPartNum() {
		return this.partNum;
	}

	public void setPartNum(BigDecimal partNum) {
		this.partNum = partNum;
	}

	public String getPresentId() {
		return this.presentId;
	}

	public void setPresentId(String presentId) {
		this.presentId = presentId;
	}

	public BigDecimal getRowNum() {
		return this.rowNum;
	}

	public void setRowNum(BigDecimal rowNum) {
		this.rowNum = rowNum;
	}

	public BigDecimal getSeatNum() {
		return this.seatNum;
	}

	public void setSeatNum(BigDecimal seatNum) {
		this.seatNum = seatNum;
	}

	public String getStt() {
		return this.stt;
	}

	public void setStt(String stt) {
		this.stt = stt;
	}

}