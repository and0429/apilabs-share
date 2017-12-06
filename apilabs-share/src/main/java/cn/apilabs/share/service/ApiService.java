package cn.apilabs.share.service;

import java.util.List;

import cn.apilabs.share.domain.Api;

/**
 * 
 * @author and04
 *
 */
public interface ApiService {

	/**
	 * 
	 * @param condition
	 *            查询条件
	 * @return
	 */
	List<Api> getAll(Api condition);

	/**
	 * 
	 * @param id
	 */
	void updateCount(Integer id);
}
