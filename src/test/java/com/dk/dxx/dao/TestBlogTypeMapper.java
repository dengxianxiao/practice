package com.dk.dxx.dao;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.dk.dxx.BaseTest;
import com.dk.dxx.entity.BlogType;

/**
 * 测试BlogTypeMapper的实现
 * 
 * @author dxx
 *
 */
public class TestBlogTypeMapper extends BaseTest {

	@Autowired
	private BlogTypeDao blogTypeDao;
	
	/**
	 * 测试添加博客类型
	 */
	@Test
	public void testAddBlogType() {
		BlogType blogType = new BlogType();
		try {
			
			for (int i = 0; i < 10; i++) {
				blogType.setTypeName("博客类型" + i);
//				blogTypeDao.addBlogType(blogType);
//				System.out.println("添加博客类型成功");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
