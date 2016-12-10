package com.dk.dxx.entity;

/**
 * 书本信息实体
 * @author dxx
 *
 */
public class Book {
	private Long bookId; //书本ID
	private String name; //书本名称
	private Integer number; //数量
	
	
	public Long getBookId() {
		return bookId;
	}
	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", name=" + name + ", number="
				+ number + "]";
	}
	
	
	
}
