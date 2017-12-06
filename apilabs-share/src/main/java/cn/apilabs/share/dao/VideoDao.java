package cn.apilabs.share.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

import cn.apilabs.share.domain.Video;

@Mapper
public interface VideoDao {

	/**
	 * 
	 * @param condition
	 * @return
	 */
	List<Video> getAll(Video condition);

	/**
	 * 
	 * @param id
	 */
	@Update("update video set count_ = count_ + 1 where id_ = #{id}")
	void updateCount(@Param("id") Integer id);

}
