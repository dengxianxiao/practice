package com.dk.dxx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dk.dxx.dao.BloggerDao;
import com.dk.dxx.entity.Blogger;
import com.dk.dxx.service.BloggerService;

/**
 * ����serviceʵ����
 * 
 * @author dxx
 *
 */
@Service
public class BloggerServiceImpl implements BloggerService {

	@Autowired
	private BloggerDao bloggerDao;
	
	/**
	 * �����˺�
	 */
	public Integer addBloger(Blogger blogger) {
		return bloggerDao.addBlogger(blogger);
	}

	/**
	 * ͨ���û�����ѯ������Ϣ
	 */
	public Blogger getByUsername(String username) {
		return bloggerDao.getByUsername(username);
	}

	/**
	 * ��ѯ������Ϣ
	 */
	public Blogger getBloggerData() {
		return bloggerDao.getBloggerData();
	}

	/**
	 * ���²�����Ϣ
	 */
	public Integer updateBlogger(Blogger blogger) {
		return bloggerDao.updateBloggerData(blogger);
	}

}
