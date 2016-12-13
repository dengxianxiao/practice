package com.dk.dxx.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dk.dxx.dao.BlogDao;
import com.dk.dxx.entity.Blog;
import com.dk.dxx.service.BlogService;

/**
 * ≤©øÕservice µœ÷
 * 
 * @author dxx
 *
 */
@Service
public class BlogServiceImpl implements BlogService {

	@Autowired
	private BlogDao blogDao;
	
	
	
	public Integer addBlog(Blog blog) {
		return blogDao.addBlog(blog);
	}

	
	public Integer deleteBlog(Long id) {
		return blogDao.deleteBlog(id);
	}

	
	public Integer updateBlog(Blog blog) {
		return blogDao.updateBlog(blog);
	}

	
	public List<Blog> queryBlogInfo() {
		return blogDao.queryBlogInfo();
	}

	public List<Blog> queryBlogListByPage(Map<String, Object> map) {
		return blogDao.queryBlogListByPage(map);
	}

	public Integer getBlogTotal(Map<String, Object> map) {
		return blogDao.getBlogTotal(map);
	}
	

	public Blog getBlogById(Long id) {
		return blogDao.getBlogById(id);
	}

	public Blog getPreviousBlog(Long id) {
		return blogDao.getPreviousBlog(id);
	}

	public Blog getNextBlog(Long id) {
		return blogDao.getNextBlog(id);
	}

	public Integer getBlogCountByTypeId(Long id) {
		return blogDao.getBlogCountByTypeId(id);
	}

}
