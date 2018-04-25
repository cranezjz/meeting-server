package com.xhyj.meeting.db.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the USER_BASE database table.
 * 
 */
@Entity
@Table(name="USER_BASE")
@NamedQuery(name="UserBase.findAll", query="SELECT u FROM UserBase u")
public class UserBase implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	private String gender;

	@Column(name="INSERT_DATE")
	private String insertDate;

	@Column(name="LOGIN_NAME")
	private String loginName;

	private String mobile;

	@Column(name="MODIFY_DATE")
	private String modifyDate;

	private String name;

	private String organization;

	private String password;

	private BigDecimal rank;

	@Column(name="SYN_TIME")
	private String synTime;

	private String title;

	@Column(name="USER_TYPE")
	private String userType;

	public UserBase() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getInsertDate() {
		return this.insertDate;
	}

	public void setInsertDate(String insertDate) {
		this.insertDate = insertDate;
	}

	public String getLoginName() {
		return this.loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
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

	public String getOrganization() {
		return this.organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public BigDecimal getRank() {
		return this.rank;
	}

	public void setRank(BigDecimal rank) {
		this.rank = rank;
	}

	public String getSynTime() {
		return this.synTime;
	}

	public void setSynTime(String synTime) {
		this.synTime = synTime;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUserType() {
		return this.userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

}