package com.dk.dxx.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.dk.dxx.entity.Book;

/**
 * 查询book表实体
 * @author dxx
 *
 */
public interface BookDao {
	
	/**
	 * 通过ID查询单本图书
	 * 
	 * @param bookId
	 * @return
	 */
	Book queryById(Long bookId);
	
	/**
	 * 查询所有图书
	 * 
	 * @param offset 查询起始位置
	 * @param limit 查询条数
	 * @return
	 */
	List<Book> queryAll(@Param("offset") int offset, @Param("limit") int limit);
	
	/**
	 * 减少书的数量
	 * 
	 * @param bookId
	 * @return
	 */
	Integer reduceNumber(Long bookId);
}
