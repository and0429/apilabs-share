package cn.apilabs.share.service;

import java.util.List;

import cn.apilabs.share.domain.Book;

/**
 * 
 * @author and04
 *
 */
public interface BookService {

	/**
	 * 
	 * @param condition
	 *            查询条件
	 * @return
	 */
	List<Book> getAll(Book condition);

	/**
	 * 
	 * @param id
	 */
	void updateCount(Integer id);
}
