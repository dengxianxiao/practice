package com.dk.dxx.service;

import java.util.List;
import java.util.Map;

import com.dk.dxx.entity.Link;


/**
 * 链接service接口
 * @author dxx
 *
 */
public interface LinkService {

	/**
	 * 获取链接列表
	 * 
	 * @return
	 */
	List<Link> getLinkList();

	/**
	 * 分页获取友情链接
	 * 
	 * @param map
	 * @return
	 */
	List<Link> queryLinkByPage(Map<String, Object> map);

	/**
	 *  获取链接数量
	 *  
	 * @param map
	 * @return
	 */
	Integer getLinkTotal(Map<String, Object> map);

	/**
	 * 添加友情链接
	 * 
	 * @param link
	 * @return
	 */
	Integer addLink(Link link);

	/**
	 * 更新友情链接
	 * 
	 * @param link
	 * @return
	 */
	Integer updateLink(Link link);

	/**
	 * 删除友情链接
	 * 
	 * @param id
	 * @return
	 */
	Integer deleteLink(Integer id);
}
