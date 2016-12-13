package com.dk.dxx.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dk.dxx.dao.LinkDao;
import com.dk.dxx.entity.Link;
import com.dk.dxx.service.LinkService;

/**
 * 链接service实现类
 * 
 * @author dxx
 *
 */
@Service
public class LinkServiceImpl implements LinkService {
	
	@Autowired
	private LinkDao linkDao;
	

	public List<Link> getLinkList() {
		return linkDao.getLinkList();
	}

	public List<Link> queryLinkByPage(Map<String, Object> map) {
		return linkDao.queryLinkByPage(map);
	}

	public Integer getLinkTotal(Map<String, Object> map) {
		return linkDao.getLinkTotal(map);
	}

	public Integer addLink(Link link) {
		return linkDao.addLink(link);
	}

	public Integer updateLink(Link link) {
		return linkDao.updateLink(link);
	}

	public Integer deleteLink(Integer id) {
		return linkDao.deleteLink(id);
	}

}
