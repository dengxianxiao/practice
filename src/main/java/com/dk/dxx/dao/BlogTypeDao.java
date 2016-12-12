package com.dk.dxx.dao;

import java.util.List;
import java.util.Map;

import com.dk.dxx.entity.BlogType;

/**
 * 博客类型dao
 * 
 * @author dxx
 *
 */
public interface BlogTypeDao {

	/**
	 * 获取博客类别信息
	 * 
	 * @return
	 */
	List<BlogType> queryBlogTypeList();

	/**
	 * 根据id查找博客类型信息
	 * 
	 * @param id
	 * @return
	 */
	BlogType getBlogTypeById(Integer id);

	/**
	 * 分页查询博客类别信息
	 * 
	 * @param map
	 * @return
	 */
	List<BlogType> queryBlogTypeByPage(Map<String, Object> map);
	
	/**
	 * 获取博客类别总数
	 * 
	 * @param map
	 * @return
	 */
	Integer getBlogTypeTotal(Map<String, Object> map);
	
	/**
	 * 添加博客类别
	 * 
	 * @param blogType
	 * @return
	 */
	Integer addBlogType(BlogType blogType);
	
	/**
	 * 更新博客类别
	 * 
	 * @param blogType
	 * @return
	 */
	Integer updateBlogType(BlogType blogType);
	
	/**
	 * 删除博客类别
	 * 
	 * @param id
	 * @return
	 */
	Integer deleteBlogType(Integer id);
}
