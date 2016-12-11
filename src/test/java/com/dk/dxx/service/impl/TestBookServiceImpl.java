package com.dk.dxx.service.impl;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.dk.dxx.dto.AppointExecution;
import com.dk.dxx.service.BookService;

/**
 * 娴嬭瘯bookService鐨勫疄鐜�
 * @author dxx
 *
 */
public class TestBookServiceImpl {
	
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
