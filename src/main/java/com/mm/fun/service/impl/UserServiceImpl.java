package com.mm.fun.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mm.fun.bean.User;
import com.mm.fun.bean.UserMapper;
import com.mm.fun.service.UserService;
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public User getUserByPhoneNum(String phone_num) {

		return userMapper.getUserByPhoneNum(phone_num);

	}

}
