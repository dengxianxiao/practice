package com.dk.dxx.dao;

import org.apache.ibatis.annotations.Param;

import com.dk.dxx.entity.Appointment;

/**
 * 预约书appointment表操作
 * @author dxx
 *
 */
public interface AppointmentDao {
	
	/**
	 * 插入预约图书记录
	 * 
	 * @param bookId
	 * @param studentId
	 * @return
	 */
	Integer insertAppointment(@Param("bookId") Long bookId, @Param("studentId") Long studentId);
	
	/**
	 * 通过主键查询预约图书记录，并携带图书实体
	 * 
	 * @param bookId
	 * @param studentId
	 * @return
	 */
	Appointment queryByKeyWithBook(@Param("bookId") Long bookId, @Param("studentId") Long studentId);
}
