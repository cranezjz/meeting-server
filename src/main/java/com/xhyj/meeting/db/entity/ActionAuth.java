package com.xhyj.meeting.db.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ACTION_AUTH database table.
 * 
 */
@Entity
@Table(name="ACTION_AUTH")
@NamedQuery(name="ActionAuth.findAll", query="SELECT a FROM ActionAuth a")
public class ActionAuth implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	@Column(name="ACTION_ID")
	private String actionId;

	@Column(name="CN_NAME")
	private String cnName;

	@Column(name="INSERT_DATE")
	private String insertDate;

	@Column(name="IS_PUBLIC")
	private String isPublic;

	@Column(name="MODIFY_DATE")
	private String modifyDate;

	@Column(name="OPERATOR_ID")
	private String operatorId;

	@Column(name="\"ROLES\"")
	private String roles;

	public ActionAuth() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getActionId() {
		return this.actionId;
	}

	public void setActionId(String actionId) {
		this.actionId = actionId;
	}

	public String getCnName() {
		return this.cnName;
	}

	public void setCnName(String cnName) {
		this.cnName = cnName;
	}

	public String getInsertDate() {
		return this.insertDate;
	}

	public void setInsertDate(String insertDate) {
		this.insertDate = insertDate;
	}

	public String getIsPublic() {
		return this.isPublic;
	}

	public void setIsPublic(String isPublic) {
		this.isPublic = isPublic;
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

	public String getRoles() {
		return this.roles;
	}

	public void setRoles(String roles) {
		this.roles = roles;
	}

}