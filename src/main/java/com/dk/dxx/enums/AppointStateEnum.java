package com.dk.dxx.enums;

/**
 * 预约书枚举类型
 * 
 * @author dxx
 *
 */
public enum AppointStateEnum {
	
	SUCCESS(1, "成功预约"), NO_NUMBER(0, "库存不足"), 
	REPEAT_APPOINT(-1, "重复预约"), INNER_ERROR(-2, "系统异常");
	
	private Integer state;
	private String stateInfo;
	
	private AppointStateEnum(int state, String stateInfo) {
		this.state = state;
		this.stateInfo = stateInfo;
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
	
	/**
	 * 判断是否有该类型
	 * 
	 * @param index
	 * @return
	 */
	public static AppointStateEnum stateOf(int index) {
		for (AppointStateEnum state : values()) {
			if(index == state.getState()) {
				return state;
			}
		}
		return null;
	}
	
	
}
