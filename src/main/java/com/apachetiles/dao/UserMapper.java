package com.apachetiles.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.apachetiles.entity.UsersEntity;

@Repository
public class UserMapper {
	
	@Autowired
	private SqlSessionFactory sqlSessionFactory;
	
	public List<UsersEntity> getAllUsers(){
		
		SqlSession session = sqlSessionFactory.openSession();
		List<UsersEntity> userList = session.selectList("getAllUsers");
		session.commit();
		session.close();
		return userList;
		
	}
}
