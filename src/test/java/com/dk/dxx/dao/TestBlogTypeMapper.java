package com.dk.dxx.dao;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.dk.dxx.BaseTest;
import com.dk.dxx.entity.BlogType;

/**
 * ����BlogTypeMapper��ʵ��
 * 
 * @author dxx
 *
 */
public class TestBlogTypeMapper extends BaseTest {

	@Autowired
	private BlogTypeDao blogTypeDao;
	
	/**
	 * ������Ӳ�������
	 */
	@Test
	public void testAddBlogType() {
		BlogType blogType = new BlogType();
		try {
			
			for (int i = 0; i < 10; i++) {
				blogType.setTypeName("��������" + i);
//				blogTypeDao.addBlogType(blogType);
//				System.out.println("��Ӳ������ͳɹ�");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
