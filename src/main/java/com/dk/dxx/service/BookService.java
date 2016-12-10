package com.dk.dxx.service;

import java.util.List;

import com.dk.dxx.dto.AppointExecution;
import com.dk.dxx.entity.Book;

public interface BookService {
	
	/**
	 * 查询一本图书
	 * 
	 * @param bookId
	 * @return
	 */
	Book getById(Long bookId);
	
	/**
	 * 查询所有图书
	 * 
	 * @return
	 */
	List<Book> queryBookList();

	/**
	 * 预约图书
	 * 
	 * @param bookId
	 * @param studentId
	 * @return
	 */
	AppointExecution appointBook(Long bookId, Long studentId);
}
