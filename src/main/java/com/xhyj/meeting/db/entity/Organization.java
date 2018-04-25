package com.xhyj.meeting.db.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the ORGANIZATION database table.
 * 
 */
@Entity
@NamedQuery(name="Organization.findAll", query="SELECT o FROM Organization o")
public class Organization implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	@Column(name="ASSET_SIZE")
	private BigDecimal assetSize;

	private String name;

	@Column(name="ORG_TYPE")
	private String orgType;

	@Column(name="SYN_TIME")
	private String synTime;

	public Organization() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public BigDecimal getAssetSize() {
		return this.assetSize;
	}

	public void setAssetSize(BigDecimal assetSize) {
		this.assetSize = assetSize;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOrgType() {
		return this.orgType;
	}

	public void setOrgType(String orgType) {
		this.orgType = orgType;
	}

	public String getSynTime() {
		return this.synTime;
	}

	public void setSynTime(String synTime) {
		this.synTime = synTime;
	}

}