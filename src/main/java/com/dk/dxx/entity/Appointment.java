package com.dk.dxx.entity;

import java.util.Date;

/**
 * 预约书实体
 * @author dxx
 *
 */
public class Appointment {
	private Long bookId; //书本ID
	private Long studentId; //学号
	private Date appointTime; //预约时间
	private Book book; //book实体，多对一
	
	public Long getBookId() {
		return bookId;
	}
	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}
	public Long getStudentId() {
		return studentId;
	}
	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}
	public Date getAppointTime() {
		return appointTime;
	}
	public void setAppointTime(Date appointTime) {
		this.appointTime = appointTime;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	@Override
	public String toString() {
		return "Appointment [bookId=" + bookId + ", studentId=" + studentId
				+ ", appointTime=" + appointTime + ", book=" + book + "]";
	}
	
	
}
