package com.xhyj.meeting.db.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the USER_LOG database table.
 * 
 */
@Entity
@Table(name="USER_LOG")
@NamedQuery(name="UserLog.findAll", query="SELECT u FROM UserLog u")
public class UserLog implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	@Column(name="CHANNEL_TYPE")
	private String channelType;

	@Column(name="INSERT_DATE")
	private String insertDate;

	@Column(name="INSERT_TIME")
	private String insertTime;

	@Column(name="MODIFY_DATE")
	private String modifyDate;

	@Column(name="OPERATOR_ID")
	private String operatorId;

	@Column(name="SERVER_NODE")
	private String serverNode;

	@Column(name="TRACE_ID")
	private String traceId;

	@Column(name="TRAN_ID")
	private String tranId;

	@Column(name="USE_TIME")
	private BigDecimal useTime;

	@Column(name="USER_ID")
	private String userId;

	public UserLog() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getChannelType() {
		return this.channelType;
	}

	public void setChannelType(String channelType) {
		this.channelType = channelType;
	}

	public String getInsertDate() {
		return this.insertDate;
	}

	public void setInsertDate(String insertDate) {
		this.insertDate = insertDate;
	}

	public String getInsertTime() {
		return this.insertTime;
	}

	public void setInsertTime(String insertTime) {
		this.insertTime = insertTime;
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

	public String getServerNode() {
		return this.serverNode;
	}

	public void setServerNode(String serverNode) {
		this.serverNode = serverNode;
	}

	public String getTraceId() {
		return this.traceId;
	}

	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}

	public String getTranId() {
		return this.tranId;
	}

	public void setTranId(String tranId) {
		this.tranId = tranId;
	}

	public BigDecimal getUseTime() {
		return this.useTime;
	}

	public void setUseTime(BigDecimal useTime) {
		this.useTime = useTime;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}