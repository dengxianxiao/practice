package com.dk.dxx.dao;

import java.util.List;
import java.util.Map;

import com.dk.dxx.entity.Comment;

/**
 * �������۱�dao�ӿ�
 * @author dxx
 *
 */
public interface CommentDao {

	/**
	 * ��ȡ������Ϣ
	 * 
	 * @param map
	 * @return
	 */
	List<Comment> queryCommentList(Map<String, Object> map);

	/**
	 * �������
	 * 
	 * @param comment
	 * @return
	 */
	Integer addComment(Comment comment);

	/**
	 * ��ȡ�ܼ�¼��
	 * 
	 * @param map
	 * @return
	 */
	Integer getCommentTotal(Map<String, Object> map);

	/**
	 * �޸�������Ϣ
	 * 
	 * @param comment
	 * @return
	 */
	Integer updateComment(Comment comment);

	/**
	 * ɾ��������Ϣ
	 * 
	 * @param id
	 * @return
	 */
	Integer deleteCommentById(Integer id);
	
	/**
	 * ���ݲ���idɾ��������Ϣ������ɾ��ĳƪ����ǰ����ɾ���ò��͵����ۣ���Ϊ�����
	 * 
	 * @param blogId
	 * @return
	 */
	Integer deleteCommentByBlogId(Integer blogId);
}
