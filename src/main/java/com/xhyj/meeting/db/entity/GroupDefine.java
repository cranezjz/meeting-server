package com.xhyj.meeting.db.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the GROUP_DEFINE database table.
 * 
 */
@Entity
@Table(name="GROUP_DEFINE")
@NamedQuery(name="GroupDefine.findAll", query="SELECT g FROM GroupDefine g")
public class GroupDefine implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	@Column(name="INSERT_DATE")
	private String insertDate;

	@Column(name="MODIFY_DATE")
	private String modifyDate;

	private String name;

	@Column(name="OPERATOR_ID")
	private String operatorId;

	public GroupDefine() {
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

}