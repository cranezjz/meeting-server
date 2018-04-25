package com.xhyj.meeting.db.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ORG_GROUP_RELATION database table.
 * 
 */
@Entity
@Table(name="ORG_GROUP_RELATION")
@NamedQuery(name="OrgGroupRelation.findAll", query="SELECT o FROM OrgGroupRelation o")
public class OrgGroupRelation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	@Column(name="GROUP_ID")
	private String groupId;

	@Column(name="INSERT_DATE")
	private String insertDate;

	@Column(name="MODIFY_DATE")
	private String modifyDate;

	private String operater;

	@Column(name="ORG_ID")
	private String orgId;

	public OrgGroupRelation() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
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

	public String getOperater() {
		return this.operater;
	}

	public void setOperater(String operater) {
		this.operater = operater;
	}

	public String getOrgId() {
		return this.orgId;
	}

	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}

}