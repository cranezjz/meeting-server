/**
 * 
 */
package com.xhyj.meeting.dto;

/**
 * <p>Title: ReturnData.java</p>  
 * <p>Description: </p>  
 * @author zhaojz
 * @date 2018年4月25日
 */
public class ReturnData {
	private String code = "0";
	private String msg = "succ";
	private ReturnSimplePage page;
	private Object centent;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public ReturnSimplePage getPage() {
		return page;
	}
	public void setPage(ReturnSimplePage page) {
		this.page = page;
	}
	public Object getCentent() {
		return centent;
	}
	public void setCentent(Object centent) {
		this.centent = centent;
	}
	
	
}