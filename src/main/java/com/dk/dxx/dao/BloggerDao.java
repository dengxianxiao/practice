package com.dk.dxx.dao;

import com.dk.dxx.entity.Blogger;

/**
 * ����dao�ӿ�
 * 
 * @author dxx
 *
 */
public interface BloggerDao {
	
	/**
	 * ����˺�
	 * 
	 * @param blogger
	 */
	Integer addBlogger(Blogger blogger);

	/**
	 * ͨ���û�����ѯ����
	 * 
	 * @param username
	 * @return
	 */
	Blogger getByUsername(String username);
	
	/**
	 * ��ѯ������Ϣ
	 * @return
	 */
	BloggerDao getBloggerData();
	
	/**
	 * ���²�����Ϣ
	 * 
	 * @param blogger
	 * @return
	 */
	Integer updateBloggerData(Blogger blogger);
}
