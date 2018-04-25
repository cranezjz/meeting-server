package com.xhyj.meeting.db.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ROLE_DEF database table.
 * 
 */
@Entity
@Table(name="ROLE_DEF")
@NamedQuery(name="RoleDef.findAll", query="SELECT r FROM RoleDef r")
public class RoleDef implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	@Column(name="INSERT_DATE")
	private String insertDate;

	@Column(name="MODIFY_DATE")
	private String modifyDate;

	@Column(name="OPERATOR_ID")
	private String operatorId;

	@Column(name="ROLE_NAME")
	private String roleName;

	public RoleDef() {
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

	public String getOperatorId() {
		return this.operatorId;
	}

	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	public String getRoleName() {
		return this.roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

}