package com.mycom.myapp.user.service;

import com.mycom.myapp.user.dto.UserDto;
import com.mycom.myapp.user.dto.UserResultDto;

// UserResultDto 만들어서 return
public interface UserService {
	UserResultDto registerUser(UserDto userDto);

}
