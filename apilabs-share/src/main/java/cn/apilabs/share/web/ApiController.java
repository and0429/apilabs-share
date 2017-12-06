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

import cn.apilabs.share.domain.Api;
import cn.apilabs.share.service.ApiService;

/**
 * 
 * @author and04
 *
 */
@RestController
@RequestMapping("/apis")
public class ApiController {

	@Autowired
	private ApiService apiService;

	/**
	 * 
	 * @param condition
	 * @return
	 */
	@GetMapping
	public List<Api> get(Api condition) {
		return apiService.getAll(condition);
	}

	/**
	 * 计数
	 * 
	 * @param api
	 */
	@PutMapping("/count")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void putCount(@RequestBody Api api) {
		apiService.updateCount(api.getId());
	}

}
