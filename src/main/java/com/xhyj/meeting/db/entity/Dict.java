package com.xhyj.meeting.db.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the DICT database table.
 * 
 */
@Entity
@NamedQuery(name="Dict.findAll", query="SELECT d FROM Dict d")
public class Dict implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	@Column(name="GROUP_KEY")
	private String groupKey;

	@Column(name="GROUP_TYPE_NAME")
	private String groupTypeName;

	@Column(name="INSERT_DATE")
	private String insertDate;

	@Column(name="MODIFY_DATE")
	private String modifyDate;

	@Column(name="OPERATOR_ID")
	private String operatorId;

	@Column(name="PARAM_CN_NAME")
	private String paramCnName;

	@Column(name="PARAM_VALUE")
	private String paramValue;

	private String remark;

	@Column(name="SHOW_SEQ")
	private BigDecimal showSeq;

	public Dict() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getGroupKey() {
		return this.groupKey;
	}

	public void setGroupKey(String groupKey) {
		this.groupKey = groupKey;
	}

	public String getGroupTypeName() {
		return this.groupTypeName;
	}

	public void setGroupTypeName(String groupTypeName) {
		this.groupTypeName = groupTypeName;
	}

	public String getInsertDate() {
		return this.insertDate;
	}

	public void setInsertDate(String insertDate) {
		this.insertDate = insertDate;
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

	public String getParamCnName() {
		return this.paramCnName;
	}

	public void setParamCnName(String paramCnName) {
		this.paramCnName = paramCnName;
	}

	public String getParamValue() {
		return this.paramValue;
	}

	public void setParamValue(String paramValue) {
		this.paramValue = paramValue;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public BigDecimal getShowSeq() {
		return this.showSeq;
	}

	public void setShowSeq(BigDecimal showSeq) {
		this.showSeq = showSeq;
	}

}