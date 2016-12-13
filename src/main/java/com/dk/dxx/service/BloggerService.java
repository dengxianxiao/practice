package com.dk.dxx.service;

import com.dk.dxx.entity.Blogger;

/**
 * 管理博主信息service
 * 
 * @author dxx
 *
 */
public interface BloggerService {
	
	Integer addBloger(Blogger blogger);
	
	/**
	 * 根据用户名查询用户信息
	 * 
	 * @param username
	 * @return
	 */
	Blogger getByUsername(String username);

	/**
	 * 查询博主信息
	 * 
	 * @return
	 */
	Blogger getBloggerData();

	/**
	 * 更新博主个人信息
	 * 
	 * @param blogger
	 * @return
	 */
	Integer updateBlogger(Blogger blogger);
}
