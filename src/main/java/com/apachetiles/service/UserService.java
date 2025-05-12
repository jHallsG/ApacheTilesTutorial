package com.apachetiles.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apachetiles.dao.UserMapper;
import com.apachetiles.entity.UsersEntity;

@Service
public class UserService {
	
	@Autowired
	private UserMapper userMapper;
	
	public List<UsersEntity> fetchAllUsers(){
		
		
		return userMapper.getAllUsers();
	}

}
