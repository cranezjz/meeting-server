/**
 * 
 */
package com.xhyj.meeting.dto;

/**
 * <p>Title: ReturnSimplePage.java</p>  
 * <p>Description: </p>  
 * @author zhaojz
 * @date 2018年4月25日
 */
public class ReturnSimplePage {
	long totalElements;
	int totalPages;
	int number;
	int size;
	int numberOfElements;
	public long getTotalElements() {
		return totalElements;
	}
	public void setTotalElements(long totalElements) {
		this.totalElements = totalElements;
	}
	public int getTotalPages() {
		return totalPages;
	}
	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getNumberOfElements() {
		return numberOfElements;
	}
	public void setNumberOfElements(int numberOfElements) {
		this.numberOfElements = numberOfElements;
	}
	@Override
	public String toString() {
		return "ReturnSimplePage [totalElements=" + totalElements + ", totalPages=" + totalPages + ", number=" + number
				+ ", size=" + size + ", numberOfElements=" + numberOfElements + "]";
	}
	
}
