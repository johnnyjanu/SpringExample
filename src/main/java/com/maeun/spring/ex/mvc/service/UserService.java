package com.maeun.spring.ex.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maeun.spring.ex.mvc.domain.User;
import com.maeun.spring.ex.mvc.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	// 사용자 정보를 전달 받고 저장기능
	public int addUser(
			String name
			, String birthday
			, String email
			, String introduce) {
		return userRepository.insertUser(name, birthday, email, introduce);
	}
	
	public int addUserByObject(User user) {
		return userRepository.insertUserByObject(user);
	}
	
	public User getLastUser() {
		return userRepository.selectLastUser();
	}
	
	
}
