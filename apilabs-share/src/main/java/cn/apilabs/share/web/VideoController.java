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

import cn.apilabs.share.domain.Video;
import cn.apilabs.share.service.VideoService;

/**
 * 
 * @author and04
 *
 */
@RestController
@RequestMapping("/videos")
public class VideoController {

	@Autowired
	private VideoService videoService;

	/**
	 * 
	 * @param condition
	 * @return
	 */
	@GetMapping
	public List<Video> get(Video condition) {
		return videoService.getAll(condition);
	}

	/**
	 * 计数
	 * 
	 * @param api
	 */
	@PutMapping("/count")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void putCount(@RequestBody Video api) {
		videoService.updateCount(api.getId());
	}

}
