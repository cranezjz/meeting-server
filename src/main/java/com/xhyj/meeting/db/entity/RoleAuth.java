package com.xhyj.meeting.db.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ROLE_AUTH database table.
 * 
 */
@Entity
@Table(name="ROLE_AUTH")
@NamedQuery(name="RoleAuth.findAll", query="SELECT r FROM RoleAuth r")
public class RoleAuth implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	@Column(name="AUTH_ID")
	private String authId;

	@Column(name="INSERT_DATE")
	private String insertDate;

	@Column(name="MODIFY_DATE")
	private String modifyDate;

	@Column(name="OPERATOR_ID")
	private String operatorId;

	@Column(name="ROLE_ID")
	private String roleId;

	public RoleAuth() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAuthId() {
		return this.authId;
	}

	public void setAuthId(String authId) {
		this.authId = authId;
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

	public String getRoleId() {
		return this.roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

}