/**
 * 
 */
package cn.apilabs.share.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.apilabs.share.dao.VideoDao;
import cn.apilabs.share.domain.Video;
import cn.apilabs.share.service.VideoService;

/**
 * @author and04
 *
 */
@Service
@Transactional
public class VideoServiceImpl implements VideoService {

	@Autowired
	private VideoDao videoDao;

	/*
	 * (non-Javadoc)
	 * 
	 * @see cn.apilabs.share.service.ApiService#getAll(cn.apilabs.share.domain.Api)
	 */
	@Override
	@Transactional(readOnly = true)
	public List<Video> getAll(Video condition) {
		return videoDao.getAll(condition);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cn.apilabs.share.service.ApiService#updateCount(java.lang.Integer)
	 */
	@Override
	public void updateCount(Integer id) {
		videoDao.updateCount(id);
	}

}
