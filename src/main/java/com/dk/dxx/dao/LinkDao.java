package com.dk.dxx.dao;

import java.util.List;
import java.util.Map;

import com.dk.dxx.entity.Link;

/**
 * ��������dao�ӿ�
 * 
 * @author dxx
 *
 */
public interface LinkDao {

	/**
	 * ��ȡ�����б�
	 * 
	 * @return
	 */
	List<Link> getLinkList();

	/**
	 * ��ҳ��ȡ��������
	 * 
	 * @param map
	 * @return
	 */
	List<Link> queryLinkByPage(Map<String, Object> map);

	/**
	 *  ��ȡ��������
	 *  
	 * @param map
	 * @return
	 */
	Integer getLinkTotal(Map<String, Object> map);

	/**
	 * �����������
	 * 
	 * @param link
	 * @return
	 */
	Integer addLink(Link link);

	/**
	 * ������������
	 * 
	 * @param link
	 * @return
	 */
	Integer updateLink(Link link);

	/**
	 * ɾ����������
	 * 
	 * @param id
	 * @return
	 */
	Integer deleteLink(Integer id);
}
