package com.apachetiles.config;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyBatisConfig {
	
	@Bean
	public SqlSessionFactory sqlSessionFactory() throws Exception {
		Reader reader = Resources.getResourceAsReader("MyBatis-config.xml");
		return new SqlSessionFactoryBuilder().build(reader);
	}
}
