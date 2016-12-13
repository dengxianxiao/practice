package com.dk.dxx.service;

import java.util.List;
import java.util.Map;

import com.dk.dxx.entity.Link;


/**
 * ����service�ӿ�
 * @author dxx
 *
 */
public interface LinkService {

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
