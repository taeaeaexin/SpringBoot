package com.mycom.myapp.user.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.mycom.myapp.user.dto.UserDto;

@Mapper
public interface UserMapper {
	int insertUser(UserDto user);
    UserDto loginUser(UserDto user);
}