package com.dk.dxx.dao;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.dk.dxx.BaseTest;
import com.dk.dxx.entity.Blog;
import com.dk.dxx.entity.BlogType;

/**
 * BlogMapper������
 * 
 * @author dxx
 *
 */
public class TestBlogMapper extends BaseTest {
	
	public static Logger logger = Logger.getLogger(TestBlogMapper.class);

	@Autowired
	private BlogDao blogDao;
	
	/**
	 * ������Ӳ���
	 * 
	 */
	@Test
	public void testAddBlog() {
		Blog blog = new Blog();
		BlogType blogType = new BlogType();
		try {
			for (int i = 1; i <= 10; i++) {
				blog.setId(1L);
				blog.setTitle("��[%s]������" + i);
				blog.setSummary("[%s]springѧϰ�ʼ�" + i);
				blog.setReleaseDate(new Date());
				blog.setClickHit(1);
				blog.setReplyHit(1);
				blog.setContent("%s ssm��Ŀ�������ҵĵ�һ��������Ŀ" + i);
				blog.setKeyWord("%s spring spring mybatis" + i);
				
				blogType.setId(i);
				blog.setBlogType(blogType);
				
//				blogDao.updateBlog(blog);
//				System.out.println("��Ӳ�����Ϣ�ɹ�");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	@Test
	public void testDeleteBlog() {
		Long id = 1L;
		try {
//			blogDao.deleteBlog(id);
//			logger.warn("ɾ��������Ϣ�ɹ�");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	/**
	 * �����޸Ĳ�����Ϣ
	 * 
	 */
	@Test
	public void testUpdateBlog() {
		Blog blog = new Blog();
		BlogType blogType = new BlogType();
		
			blog.setId(1L);
			blog.setTitle("��[%s]������" + "5");
			blog.setSummary("springѧϰ�ʼ�");
			blog.setReleaseDate(new Date());
			blog.setClickHit(1);
			blog.setReplyHit(1);
			blog.setContent(" ssm��Ŀ�������ҵĵ�һ��������Ŀ");
			blog.setKeyWord(" spring spring mybatis");
			
			blogType.setId(5);
			blog.setBlogType(blogType);
		try {	
//			blogDao.addBlog(blog);
//			System.out.println("���²�����Ϣ�ɹ�");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	/**
	 * ��ѯ�����б�
	 */
	@Test
	public void testQueryBlogList() {
		try {
//			List<Blog> list = blogDao.queryBlogList();
//			logger.warn("��ѯ�����б�ɹ�");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	/**
	 * ��ҳ��ѯ����
	 */
	@Test
	public void testQueryBlogByPage() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("start", 1);
		map.put("pageSize", 5);
		try {
//			List<Blog> list = blogDao.queryBlogListByPage(map);
//			System.out.println("��ҳ��ѯ���ͳɹ�");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * ����������ѯ��������
	 */
	@Test
	public void testGetBlogTotal() {
		try {
//			Map<String, Object> map = new HashMap<String, Object>();
//			int total = blogDao.getBlogTotal(map);
//			System.out.println("��ѯ�����ɹ� = " + total);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
	@Test 
	public void testGetBlogById() {
		Long id = 5L;
		try {
//			Blog blog = blogDao.getBlogById(id);
//			System.out.println("��ѯ������Ϣ�ɹ�" + blog.getTitle());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testGetPreviousBlog() {
		Long id = 5L;
		try {
//			Blog blog = blogDao.getPreviousBlog(id);
//			System.out.println("��һ������id = " + blog.getId());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	@Test
	public void testGetNextBlog() {
		Long id = 5L;
		try {
//			Blog blog = blogDao.getNextBlog(id);
//			System.out.println("��һ������id = " + blog.getId());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	@Test
	public void testGetBlogCountByTypeId() {
		Long id = 5L;
		try {
//			int total = blogDao.getBlogCountByTypeId(id);
//			logger.warn("��������[%d]������" + total);
//			System.out.printf("%d", total);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
