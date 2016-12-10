package com.dk.dxx.dao;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.dk.dxx.BaseTest;
import com.dk.dxx.entity.Appointment;

/**
 * AppointmentDao测试用例
 * 
 * @author dxx
 *
 */
public class AppointmentDaoTest extends BaseTest {

	@Autowired
	private AppointmentDao appointmentDao;
	
	/**
	 * 测试插入appointment表操作
	 */
	@Test
	public void testInsertAppointment() {
		Long bookId = 1003L;
		Long studentId = 123457L;
		int insert = appointmentDao.insertAppointment(bookId, studentId);
		System.out.println(insert);
	}
	
	/**
	 * 测试appointment表查询操作
	 */
	@Test
	public void testQueryByKeyWithBook() {
		Long bookId = 1001L;
		Long studentId = 123456L;
		Appointment appointment = appointmentDao.queryByKeyWithBook(bookId, studentId);
		System.out.println(appointment);
		System.out.println(appointment.getBook());
		
	}
}
