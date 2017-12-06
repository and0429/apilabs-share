package cn.apilabs.share.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

import cn.apilabs.share.domain.Book;

@Mapper
public interface BookDao {

	/**
	 * 
	 * @param condition
	 * @return
	 */
	List<Book> getAll(Book condition);

	/**
	 * 
	 * @param id
	 */
	@Update("update book set count_ = count_ + 1 where id_ = #{id}")
	void updateCount(@Param("id") Integer id);

}
