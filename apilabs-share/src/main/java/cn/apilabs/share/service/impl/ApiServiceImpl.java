/**
 * 
 */
package cn.apilabs.share.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.apilabs.share.dao.ApiDao;
import cn.apilabs.share.domain.Api;
import cn.apilabs.share.service.ApiService;

/**
 * @author and04
 *
 */
@Service
@Transactional(rollbackFor = RuntimeException.class)
public class ApiServiceImpl implements ApiService {

	@Autowired
	private ApiDao apiDao;

	/*
	 * (non-Javadoc)
	 * 
	 * @see cn.apilabs.share.service.ApiService#getAll(cn.apilabs.share.domain.Api)
	 */
	@Override
	@Transactional(readOnly = true, rollbackFor = RuntimeException.class)
	public List<Api> getAll(Api condition) {
		return apiDao.getAll(condition);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cn.apilabs.share.service.ApiService#updateCount(java.lang.Integer)
	 */
	@Override
	public void updateCount(Integer id) {
		apiDao.updateCount(id);
	}

}
