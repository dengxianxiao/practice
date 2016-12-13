package com.dk.dxx.service;

import java.util.List;
import java.util.Map;

import com.dk.dxx.entity.Blog;

/**
 * ����service�ӿ�
 * 
 * @author dxx
 *
 */
public interface BlogService {

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
	Integer deleteBlog(Long id);
	
	/**
	 * ���²�����Ϣ
	 * 
	 * @param blog
	 * @return
	 */
	Integer updateBlog(Blog blog);


	/**
	 * ��ȡ������Ҫ���ݣ����������·ݷ����ѯ
	 * 
	 * @return
	 */
	List<Blog> queryBlogInfo();
	
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
	Blog getBlogById(Long id);

	

	/**
	 * ��ȡ��һƪ����
	 * 
	 * @param id
	 * @return
	 */
	Blog getPreviousBlog(Long id);

	/**
	 * ��ȡ��һƪ����
	 * 
	 * @param id
	 * @return
	 */
	Blog getNextBlog(Long id);
	
	
	
	/**
	 * ���ݲ������͵�id��ѯ�������µĲ������� 
	 * 
	 * @param id
	 * @return
	 */
	Integer getBlogCountByTypeId(Long id);
}
