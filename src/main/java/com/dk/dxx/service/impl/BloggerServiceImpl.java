package com.dk.dxx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dk.dxx.dao.BloggerDao;
import com.dk.dxx.entity.Blogger;
import com.dk.dxx.service.BloggerService;

/**
 * 博主service实现类
 * 
 * @author dxx
 *
 */
@Service
public class BloggerServiceImpl implements BloggerService {

	@Autowired
	private BloggerDao bloggerDao;
	
	/**
	 * 新增账号
	 */
	public Integer addBloger(Blogger blogger) {
		return bloggerDao.addBlogger(blogger);
	}

	/**
	 * 通过用户名查询博主信息
	 */
	public Blogger getByUsername(String username) {
		return bloggerDao.getByUsername(username);
	}

	/**
	 * 查询博主信息
	 */
	public Blogger getBloggerData() {
		return bloggerDao.getBloggerData();
	}

	/**
	 * 更新博主信息
	 */
	public Integer updateBlogger(Blogger blogger) {
		return bloggerDao.updateBloggerData(blogger);
	}

}
