package cn.apilabs.share.service;

import java.util.List;

import cn.apilabs.share.domain.Video;

/**
 * 
 * @author and04
 *
 */
public interface VideoService {

	/**
	 * s
	 * @param condition
	 *            查询条件
	 * @return
	 */
	List<Video> getAll(Video condition);

	/**
	 * s
	 * @param id
	 */
	void updateCount(Integer id);
}
