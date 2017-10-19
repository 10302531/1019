package com.zhiyou100.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhiyou100.ssm.mapper.UserMapper;
import com.zhiyou100.ssm.model.RoleVO;
import com.zhiyou100.ssm.model.User;
import com.zhiyou100.ssm.service.UserService;
@Service
public class UserServiceImpl implements UserService{
	@Autowired
	UserMapper um;

	@Override
	public User login(RoleVO rv) {
		// TODO Auto-generated method stub
		return um.login(rv);
	}



}
