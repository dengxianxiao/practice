package com.dk.dxx.dao;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.dk.dxx.BaseTest;
import com.dk.dxx.entity.Blogger;


/**
 * 测试bloggerMapper的实现
 * 
 * @author dxx
 *
 */
public class TestBloggerMapper extends BaseTest {
	
	@Autowired
	private BloggerDao bloggerDao;
	
	/**
	 * 测试添加用户
	 */
	@Test
	public void testAddBlogger() throws Exception {
		Blogger blogger = new Blogger();
		blogger.setId(1000);
		blogger.setUsername("dxx");
		blogger.setPassword("123456");
		blogger.setNickname("dk");
		blogger.setProfile("黑河");
		blogger.setSign("哈哈");
		blogger.setImagename("dddd");
		
//		int insert = bloggerDao.addBlogger(blogger);
//		System.out.println(insert);
	}
	
	@Test
	public void testGetByName() throws Exception {
		String username = "dxx";
		Blogger blogger = bloggerDao.getByUsername(username);
		System.out.println(blogger.getPassword());
	}
}
