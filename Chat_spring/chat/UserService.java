package com.stry.chat;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;
	
	@Transactional
	public User create(User user){
		userRepository.createUser(user);
		return user;
		
	}

	@Transactional
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}
}

