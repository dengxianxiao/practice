package com.dk.dxx.dao;

import java.util.List;
import java.util.Map;

import com.dk.dxx.entity.BlogType;

/**
 * ��������dao
 * 
 * @author dxx
 *
 */
public interface BlogTypeDao {

	/**
	 * ��ȡ���������Ϣ
	 * 
	 * @return
	 */
	List<BlogType> queryBlogTypeList();

	/**
	 * ����id���Ҳ���������Ϣ
	 * 
	 * @param id
	 * @return
	 */
	BlogType getBlogTypeById(Integer id);

	/**
	 * ��ҳ��ѯ���������Ϣ
	 * 
	 * @param map
	 * @return
	 */
	List<BlogType> queryBlogTypeByPage(Map<String, Object> map);
	
	/**
	 * ��ȡ�����������
	 * 
	 * @param map
	 * @return
	 */
	Integer getBlogTypeTotal(Map<String, Object> map);
	
	/**
	 * ��Ӳ������
	 * 
	 * @param blogType
	 * @return
	 */
	Integer addBlogType(BlogType blogType);
	
	/**
	 * ���²������
	 * 
	 * @param blogType
	 * @return
	 */
	Integer updateBlogType(BlogType blogType);
	
	/**
	 * ɾ���������
	 * 
	 * @param id
	 * @return
	 */
	Integer deleteBlogType(Integer id);
}
