package com.mm.fun.bean;

import org.apache.ibatis.annotations.Select;

public interface UserMapper {
	
	
	@Select("SELECT * FROM user WHERE phone_num = #{phone_num}")
	User getUserByPhoneNum(String phone_num);

}
