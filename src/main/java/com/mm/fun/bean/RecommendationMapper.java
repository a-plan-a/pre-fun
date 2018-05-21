package com.mm.fun.bean;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

public interface RecommendationMapper {
	@Insert("INSERT INTO RECOMMANDATION (TITLE,NAME,PROFILE_PHOTO,PHONE,DISCRIBUTION) VALUES (#{title},#{name},#{profilePhoto},#{phone},#{detail})")
	int insert(Recommendation commend);
	
	@Select("select * from RECOMMANDATION where CATEGORY_NO =#{categoryNO}")  
	@Results({  
	    @Result(id=true,property="id",column="ID"),  
	    @Result(property="title",column="TITLE"),  
	    @Result(property="name",column="NAME"),
	    @Result(property="profilePhoto",column="PROFILE_PHOTO")  
	}) 
	List<Recommendation> select(String categoryNO);

}
