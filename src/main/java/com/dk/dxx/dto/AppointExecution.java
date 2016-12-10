package com.dk.dxx.dto;

import com.dk.dxx.entity.Appointment;
import com.dk.dxx.enums.AppointStateEnum;

/**
 * 封装预约执行后的结果
 * @author dxx
 *
 */
public class AppointExecution {
	
	private Long bookId; //图书ID
	private Integer state; //图书状态
	private String stateInfo; //图书状态信息
	private Appointment appointment; //预约成功的书的信息
	
	public AppointExecution() {
		
	}
	
	//预约失败构造器
	public AppointExecution(Long bookId, AppointStateEnum appointStateEnum) {
		this.bookId = bookId;
		this.state = appointStateEnum.getState();
		this.stateInfo = appointStateEnum.getStateInfo();
	}
	
	//预约成功构造器
	public AppointExecution(Long bookId, AppointStateEnum appointStateEnum, Appointment appointment) {
		this.bookId = bookId;
		this.state = appointStateEnum.getState();
		this.stateInfo = appointStateEnum.getStateInfo();
		this.appointment = appointment;
	}

	public Long getBookId() {
		return bookId;
	}

	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public String getStateInfo() {
		return stateInfo;
	}

	public void setStateInfo(String stateInfo) {
		this.stateInfo = stateInfo;
	}

	public Appointment getAppointment() {
		return appointment;
	}

	public void setAppointment(Appointment appointment) {
		this.appointment = appointment;
	}

	@Override
	public String toString() {
		return "AppointExecution [bookId=" + bookId + ", state=" + state
				+ ", stateInfo=" + stateInfo + ", appointment=" + appointment
				+ "]";
	}
	
	
}
