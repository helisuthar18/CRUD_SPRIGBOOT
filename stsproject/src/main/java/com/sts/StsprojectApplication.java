package com.sts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.sts.dao.userReposetry;
import com.sts.entity.entity;

@SpringBootApplication
public class StsprojectApplication {

	public static void main(String[] args) {
		
		
		ApplicationContext context = SpringApplication.run(StsprojectApplication.class, args);
		userReposetry userReposetry = context.getBean(userReposetry.class);
		
		entity entity = new entity();
		
		entity.setName("heli suthar");
		entity.setEmail("helisuthar18@gmail.com");
		entity.setPassword("1234");
		entity.setContectNum(123456789);
		
		entity entity1 =userReposetry.save(entity);
		System.out.println(entity1);
	}
}
