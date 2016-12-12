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
 * BlogMapper测试类
 * 
 * @author dxx
 *
 */
public class TestBlogMapper extends BaseTest {
	
	public static Logger logger = Logger.getLogger(TestBlogMapper.class);

	@Autowired
	private BlogDao blogDao;
	
	/**
	 * 测试添加博客
	 * 
	 */
	@Test
	public void testAddBlog() {
		Blog blog = new Blog();
		BlogType blogType = new BlogType();
		try {
			for (int i = 1; i <= 10; i++) {
				blog.setId(1L);
				blog.setTitle("第[%s]个博客" + i);
				blog.setSummary("[%s]spring学习笔记" + i);
				blog.setReleaseDate(new Date());
				blog.setClickHit(1);
				blog.setReplyHit(1);
				blog.setContent("%s ssm项目，这是我的第一个博客项目" + i);
				blog.setKeyWord("%s spring spring mybatis" + i);
				
				blogType.setId(i);
				blog.setBlogType(blogType);
				
//				blogDao.updateBlog(blog);
//				System.out.println("添加博客信息成功");
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
//			logger.warn("删除博客信息成功");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	/**
	 * 测试修改博客信息
	 * 
	 */
	@Test
	public void testUpdateBlog() {
		Blog blog = new Blog();
		BlogType blogType = new BlogType();
		
			blog.setId(1L);
			blog.setTitle("第[%s]个博客" + "5");
			blog.setSummary("spring学习笔记");
			blog.setReleaseDate(new Date());
			blog.setClickHit(1);
			blog.setReplyHit(1);
			blog.setContent(" ssm项目，这是我的第一个博客项目");
			blog.setKeyWord(" spring spring mybatis");
			
			blogType.setId(5);
			blog.setBlogType(blogType);
		try {	
//			blogDao.addBlog(blog);
//			System.out.println("更新博客信息成功");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	/**
	 * 查询博客列表
	 */
	@Test
	public void testQueryBlogList() {
		try {
//			List<Blog> list = blogDao.queryBlogList();
//			logger.warn("查询博客列表成功");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	/**
	 * 分页查询博客
	 */
	@Test
	public void testQueryBlogByPage() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("start", 1);
		map.put("pageSize", 5);
		try {
//			List<Blog> list = blogDao.queryBlogListByPage(map);
//			System.out.println("分页查询博客成功");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 根据条件查询博客总数
	 */
	@Test
	public void testGetBlogTotal() {
		try {
//			Map<String, Object> map = new HashMap<String, Object>();
//			int total = blogDao.getBlogTotal(map);
//			System.out.println("查询总数成功 = " + total);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
	@Test 
	public void testGetBlogById() {
		Long id = 5L;
		try {
//			Blog blog = blogDao.getBlogById(id);
//			System.out.println("查询博客信息成功" + blog.getTitle());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testGetPreviousBlog() {
		Long id = 5L;
		try {
//			Blog blog = blogDao.getPreviousBlog(id);
//			System.out.println("上一条博客id = " + blog.getId());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	@Test
	public void testGetNextBlog() {
		Long id = 5L;
		try {
//			Blog blog = blogDao.getNextBlog(id);
//			System.out.println("下一条博客id = " + blog.getId());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	@Test
	public void testGetBlogCountByTypeId() {
		Long id = 5L;
		try {
//			int total = blogDao.getBlogCountByTypeId(id);
//			logger.warn("该类型有[%d]条博客" + total);
//			System.out.printf("%d", total);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
