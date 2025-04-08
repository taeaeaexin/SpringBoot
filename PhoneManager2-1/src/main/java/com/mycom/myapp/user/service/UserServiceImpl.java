package com.mycom.myapp.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycom.myapp.user.dto.UserDto;
import com.mycom.myapp.user.mapper.UserMapper;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserMapper userMapper;

	@Override
	public int registerUser(UserDto user) {
		System.out.println("register");
		return userMapper.insertUser(user);
	}
	
    @Override
    public UserDto loginUser(UserDto user) {
    	System.out.println("login");
        return userMapper.loginUser(user);
    }
}
