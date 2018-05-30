package com.mm.fun.bean;

import java.util.List;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

public interface CategoryMapper {

	@Select("SELECT * FROM CATEGORY")
	@Results({ @Result(id = true, property = "id", column = "ID"), @Result(property = "categoryNo", column = "CATEGORY_NO"),
			@Result(property = "categoryName", column = "CATEGORY_NAME")})
	List<Category> select();
}
