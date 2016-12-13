package com.dk.dxx.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dk.dxx.dao.BlogTypeDao;
import com.dk.dxx.entity.BlogType;
import com.dk.dxx.service.BlogTypeService;

/**
 * 博客类型service实现
 * 
 * @author dxx
 *
 */
@Service
public class BlogTypeServiceImpl implements BlogTypeService {

	@Autowired 
	private BlogTypeDao blogTypeDao;
	
	
	public List<BlogType> queryBlogTypeList() {
		return blogTypeDao.queryBlogTypeList();
	}

	public BlogType getBlogTypeById(Integer id) {
		return blogTypeDao.getBlogTypeById(id);
	}

	public List<BlogType> queryBlogTypeByPage(Map<String, Object> map) {
		return blogTypeDao.queryBlogTypeByPage(map);
	}

	public Integer getBlogTypeTotal(Map<String, Object> map) {
		return blogTypeDao.getBlogTypeTotal(map);
	}

	public Integer addBlogType(BlogType blogType) {
		return blogTypeDao.addBlogType(blogType);
	}

	public Integer updateBlogType(BlogType blogType) {
		return blogTypeDao.updateBlogType(blogType);
	}

	public Integer deleteBlogType(Integer id) {
		return blogTypeDao.deleteBlogType(id);
	}

}
