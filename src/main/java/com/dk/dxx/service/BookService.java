package com.dk.dxx.service;

import java.util.List;

import com.dk.dxx.dto.AppointExecution;
import com.dk.dxx.entity.Book;

public interface BookService {
	
	/**
	 * 鏌ヨ涓�湰鍥句功
	 * 
	 * @param bookId
	 * @return
	 */
	Book getById(Long bookId);
	
	/**
	 * 鏌ヨ鎵�湁鍥句功
	 * 
	 * @return
	 */
	List<Book> queryBookList();

	/**
	 * 棰勭害鍥句功
	 * 
	 * @param bookId
	 * @param studentId
	 * @return
	 */
	AppointExecution appointBook(Long bookId, Long studentId);
	
	
}
