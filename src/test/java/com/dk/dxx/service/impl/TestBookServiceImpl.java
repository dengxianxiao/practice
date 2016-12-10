package com.dk.dxx.service.impl;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.dk.dxx.BaseTest;
import com.dk.dxx.dto.AppointExecution;
import com.dk.dxx.service.BookService;

/**
 * 测试bookService的实现
 * @author dxx
 *
 */
public class TestBookServiceImpl extends BaseTest{
	
	@Autowired
	private BookService bookService;
	
	@Test
	public void testAppointBook() {
		Long bookId = 1000L;
		Long studentId = 123459L;
		AppointExecution execution = bookService.appointBook(bookId, studentId);
		System.out.println(execution);
	}
}
