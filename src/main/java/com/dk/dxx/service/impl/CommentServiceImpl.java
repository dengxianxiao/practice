package com.dk.dxx.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dk.dxx.dao.CommentDao;
import com.dk.dxx.entity.Comment;
import com.dk.dxx.service.CommentService;

/**
 * commentservice µœ÷¿‡
 * 
 * @author dxx
 *
 */
@Service
public class CommentServiceImpl implements CommentService {
	
	
	@Autowired
	private CommentDao commentDao;

	public List<Comment> queryCommentList(Map<String, Object> map) {
		return commentDao.queryCommentList(map);
	}

	public Integer addComment(Comment comment) {
		return commentDao.addComment(comment);
	}

	public Integer getCommentTotal(Map<String, Object> map) {
		return commentDao.getCommentTotal(map);
	}

	public Integer updateComment(Comment comment) {
		return commentDao.updateComment(comment);
	}

	public Integer deleteCommentById(Integer id) {
		return commentDao.deleteCommentById(id);
	}

	public Integer deleteCommentByBlogId(Integer blogId) {
		return commentDao.deleteCommentByBlogId(blogId);
	}

}
