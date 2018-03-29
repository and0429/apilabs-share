/**
 * 
 */
package cn.apilabs.share.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.apilabs.share.dao.BookDao;
import cn.apilabs.share.domain.Book;
import cn.apilabs.share.service.BookService;

/**
 * @author and04
 *
 */
@Service
@Transactional(rollbackFor = RuntimeException.class)
public class BookServiceImpl implements BookService {

	@Autowired
	private BookDao bookDao;

	/*
	 * (non-Javadoc)
	 * 
	 * @see cn.apilabs.share.service.ApiService#getAll(cn.apilabs.share.domain.Api)
	 */
	@Override
	@Transactional(readOnly = true, rollbackFor = RuntimeException.class)
	public List<Book> getAll(Book condition) {
		return bookDao.getAll(condition);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see cn.apilabs.share.service.ApiService#updateCount(java.lang.Integer)
	 */
	@Override
	public void updateCount(Integer id) {
		bookDao.updateCount(id);
	}

}
