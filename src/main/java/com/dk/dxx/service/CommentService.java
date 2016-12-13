package com.dk.dxx.service;

import java.util.List;
import java.util.Map;

import com.dk.dxx.entity.Comment;


/**
 * 评论service接口
 * @author dxx
 *
 */
public interface CommentService {
	
	/**
	 * 获取评论信息
	 * 
	 * @param map
	 * @return
	 */
	List<Comment> queryCommentList(Map<String, Object> map);

	/**
	 * 添加评论
	 * 
	 * @param comment
	 * @return
	 */
	Integer addComment(Comment comment);

	/**
	 * 获取总记录数
	 * 
	 * @param map
	 * @return
	 */
	Integer getCommentTotal(Map<String, Object> map);

	/**
	 * 修改评论信息
	 * 
	 * @param comment
	 * @return
	 */
	Integer updateComment(Comment comment);

	/**
	 * 删除评论信息
	 * 
	 * @param id
	 * @return
	 */
	Integer deleteCommentById(Integer id);
	
	/**
	 * 根据博客id删除评论信息，用于删除某篇博客前，先删掉该博客的评论，因为有外键
	 * 
	 * @param blogId
	 * @return
	 */
	Integer deleteCommentByBlogId(Integer blogId);

}
