package com.mm.fun.bean;

import org.apache.ibatis.annotations.Select;

public interface UserMapper {
	
	
	@Select("SELECT * FROM MEMBER WHERE MOBILE_PHONE = #{phone_num}")
	User getUserByPhoneNum(String phone_num);

}
