package com.dk.dxx.service;

import com.dk.dxx.entity.Blogger;

/**
 * ��������Ϣservice
 * 
 * @author dxx
 *
 */
public interface BloggerService {
	
	Integer addBloger(Blogger blogger);
	
	/**
	 * �����û�����ѯ�û���Ϣ
	 * 
	 * @param username
	 * @return
	 */
	Blogger getByUsername(String username);

	/**
	 * ��ѯ������Ϣ
	 * 
	 * @return
	 */
	Blogger getBloggerData();

	/**
	 * ���²���������Ϣ
	 * 
	 * @param blogger
	 * @return
	 */
	Integer updateBlogger(Blogger blogger);
}
