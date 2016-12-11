package com.dk.dxx.dao;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.dk.dxx.BaseTest;
import com.dk.dxx.entity.Blogger;


/**
 * ����bloggerMapper��ʵ��
 * 
 * @author dxx
 *
 */
public class TestBloggerMapper extends BaseTest {
	
	@Autowired
	private BloggerDao bloggerDao;
	
	/**
	 * ��������û�
	 */
	@Test
	public void testAddBlogger() throws Exception {
		Blogger blogger = new Blogger();
		blogger.setId(1000);
		blogger.setUsername("dxx");
		blogger.setPassword("123456");
		blogger.setNickname("dk");
		blogger.setProfile("�ں�");
		blogger.setSign("����");
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
