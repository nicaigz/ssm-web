package me.gacl.service.impl;

import org.springframework.stereotype.Service;

import me.gacl.service.UserService;

/**
 * 
 * @author Puhui
 * 
 * 使用Spring提供的@Service注解将UserServiceImpl标注为一个Service
 */

@Service("userService")
public class UserServiceImpl implements UserService {

	public String test() {
		// TODO Auto-generated method stub
		return "hello world";

	}

}