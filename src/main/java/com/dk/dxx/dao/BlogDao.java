package com.dk.dxx.dao;

import java.util.List;
import java.util.Map;

import com.dk.dxx.entity.Blog;

/**
 * 博客信息操作接口
 * 
 * @author dxx
 *
 */
public interface BlogDao {


	/**
	 * 获取博客列表，根据日期月份分组查询
	 * 
	 * @return
	 */
	List<Blog> queryBlogList();
	
	/**
	 * 分页查询博客列表
	 * 
	 * @param map
	 * @return
	 */
	List<Blog> queryBlogListByPage(Map<String, Object> map);
	
	/**
	 * 获取博客总数
	 * 
	 * @param map
	 * @return
	 */
	Integer getBlogTotal(Map<String, Object> map);
	
	/**
	 * 根据ID查询博客信息
	 * 
	 * @param id
	 * @return
	 */
	Blog getBlogById(Integer id);

	/**
	 * 更新博客信息
	 * 
	 * @param blog
	 * @return
	 */
	Integer updateBlogInfo(Blog blog);

	/**
	 * 获取上一篇博客
	 * 
	 * @param id
	 * @return
	 */
	public Blog getPreviousBlog(Integer id);

	/**
	 * 获取下一篇博客
	 * 
	 * @param id
	 * @return
	 */
	Blog getNextBlog(Integer id);
	
	/**
	 * 添加博客
	 * 
	 * @param blog
	 * @return
	 */
	Integer addBlog(Blog blog);
	
	/**
	 * 根据ID删除博客
	 * 
	 * @param id
	 * @return
	 */
	Integer deleteBlog(Integer id);
	
	/**
	 * 根据博客类型的id查询该类型下的博客数量 
	 * 
	 * @param typeId
	 * @return
	 */
	Integer getBlogByTypeId(Integer typeId);
	
}
