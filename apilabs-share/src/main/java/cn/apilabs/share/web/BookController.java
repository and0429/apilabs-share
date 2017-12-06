package cn.apilabs.share.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import cn.apilabs.share.domain.Book;
import cn.apilabs.share.service.BookService;

/**
 * 
 * @author and04
 *
 */
@RestController
@RequestMapping("/books")
public class BookController {

	@Autowired
	private BookService bookService;

	/**
	 * 
	 * @param condition
	 * @return
	 */
	@GetMapping
	public List<Book> get(Book condition) {
		return bookService.getAll(condition);
	}

	/**
	 * 计数
	 * 
	 * @param api
	 */
	@PutMapping("/count")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void putCount(@RequestBody Book api) {
		bookService.updateCount(api.getId());
	}

}
