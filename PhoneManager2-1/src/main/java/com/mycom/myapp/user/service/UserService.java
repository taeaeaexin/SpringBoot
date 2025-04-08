package com.mycom.myapp.user.service;

import com.mycom.myapp.user.dto.UserDto;

public interface UserService {
	int registerUser(UserDto user);
	UserDto loginUser(UserDto user);
}
