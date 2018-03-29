package cn.apilabs.share.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

import cn.apilabs.share.domain.Api;

/**
 * 
 * @author and04
 *
 */
@Mapper
public interface ApiDao {

	/**
	 * get all
	 * @param condition
	 * @return
	 */
	List<Api> getAll(Api condition);

	/**
	 * update count
	 * @param id
	 */
	@Update("update api set count_ = count_ + 1 where id_ = #{id}")
	void updateCount(@Param("id") Integer id);

}
