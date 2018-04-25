package com.xhyj.meeting.db.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the MEET_ADJUNCT database table.
 * 
 */
@Entity
@Table(name="MEET_ADJUNCT")
@NamedQuery(name="MeetAdjunct.findAll", query="SELECT m FROM MeetAdjunct m")
public class MeetAdjunct implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	@Column(name="FILE_PATH")
	private String filePath;

	@Column(name="FILE_TYPE")
	private String fileType;

	@Column(name="INSERT_DATE")
	private String insertDate;

	@Column(name="MEET_ID")
	private String meetId;

	@Column(name="MODIFY_DATE")
	private String modifyDate;

	@Column(name="OPERATOR_ID")
	private String operatorId;

	@Column(name="SEQ_NO")
	private BigDecimal seqNo;

	public MeetAdjunct() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFilePath() {
		return this.filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public String getFileType() {
		return this.fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
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

	public BigDecimal getSeqNo() {
		return this.seqNo;
	}

	public void setSeqNo(BigDecimal seqNo) {
		this.seqNo = seqNo;
	}

}