package com.dk.dxx.dao;

import com.dk.dxx.entity.Blogger;

/**
 * 博主dao接口
 * 
 * @author dxx
 *
 */
public interface BloggerDao {
	
	/**
	 * 添加账号
	 * 
	 * @param blogger
	 */
	Integer addBlogger(Blogger blogger);

	/**
	 * 通过用户名查询博主
	 * 
	 * @param username
	 * @return
	 */
	Blogger getByUsername(String username);
	
	/**
	 * 查询博主信息
	 * @return
	 */
	Blogger getBloggerData();
	
	/**
	 * 更新博主信息
	 * 
	 * @param blogger
	 * @return
	 */
	Integer updateBloggerData(Blogger blogger);
}
