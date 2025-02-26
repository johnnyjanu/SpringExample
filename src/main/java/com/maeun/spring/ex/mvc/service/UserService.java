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
	
	// 이메일을 전달 받고 중복 여부를 확인하는 기능
	public boolean isDuplicateEmail(String email) {
		int count = userRepository.selectCountByEmail(email);
		if(count == 0) {
			return false;
		} else {
			return true;
		}
	}
	
	
}
