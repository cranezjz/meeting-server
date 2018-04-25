/**
 * 
 */
package com.xhyj.meeting.dto;

/**
 * <p>Title: MeetBaseInfoDto.java</p>  
 * <p>Description: </p>  
 * @author zhaojz
 * @date 2018年4月17日
 */
public class MeetBaseInfoDto{
	private String id;

	private String beginDate;

	private String endDate;

	private String feastConfirmFlag;

	private String insertDate;

	private String issueDate;

	private String lastApplyDate;

	private String name;

	private String stt;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBeginDate() {
		return beginDate;
	}

	public void setBeginDate(String beginDate) {
		this.beginDate = beginDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getFeastConfirmFlag() {
		return feastConfirmFlag;
	}

	public void setFeastConfirmFlag(String feastConfirmFlag) {
		this.feastConfirmFlag = feastConfirmFlag;
	}

	public String getInsertDate() {
		return insertDate;
	}

	public void setInsertDate(String insertDate) {
		this.insertDate = insertDate;
	}

	public String getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}

	public String getLastApplyDate() {
		return lastApplyDate;
	}

	public void setLastApplyDate(String lastApplyDate) {
		this.lastApplyDate = lastApplyDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStt() {
		return stt;
	}

	public void setStt(String stt) {
		this.stt = stt;
	}

	@Override
	public String toString() {
		return "MeetBaseInfoDto [id=" + id + ", beginDate=" + beginDate + ", endDate=" + endDate + ", feastConfirmFlag="
				+ feastConfirmFlag + ", insertDate=" + insertDate + ", issueDate=" + issueDate + ", lastApplyDate="
				+ lastApplyDate + ", name=" + name + ", stt=" + stt + "]";
	}
	
	
}
