package com.dk.dxx.dao;

import java.util.List;
import java.util.Map;

import com.dk.dxx.entity.Blog;

/**
 * ������Ϣ�����ӿ�
 * 
 * @author dxx
 *
 */
public interface BlogDao {


	/**
	 * ��ȡ�����б����������·ݷ����ѯ
	 * 
	 * @return
	 */
	List<Blog> queryBlogList();
	
	/**
	 * ��ҳ��ѯ�����б�
	 * 
	 * @param map
	 * @return
	 */
	List<Blog> queryBlogListByPage(Map<String, Object> map);
	
	/**
	 * ��ȡ��������
	 * 
	 * @param map
	 * @return
	 */
	Integer getBlogTotal(Map<String, Object> map);
	
	/**
	 * ����ID��ѯ������Ϣ
	 * 
	 * @param id
	 * @return
	 */
	Blog getBlogById(Integer id);

	/**
	 * ���²�����Ϣ
	 * 
	 * @param blog
	 * @return
	 */
	Integer updateBlogInfo(Blog blog);

	/**
	 * ��ȡ��һƪ����
	 * 
	 * @param id
	 * @return
	 */
	public Blog getPreviousBlog(Integer id);

	/**
	 * ��ȡ��һƪ����
	 * 
	 * @param id
	 * @return
	 */
	Blog getNextBlog(Integer id);
	
	/**
	 * ��Ӳ���
	 * 
	 * @param blog
	 * @return
	 */
	Integer addBlog(Blog blog);
	
	/**
	 * ����IDɾ������
	 * 
	 * @param id
	 * @return
	 */
	Integer deleteBlog(Integer id);
	
	/**
	 * ���ݲ������͵�id��ѯ�������µĲ������� 
	 * 
	 * @param typeId
	 * @return
	 */
	Integer getBlogByTypeId(Integer typeId);
	
}
