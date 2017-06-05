package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.User;
import com.example.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	//@Autowired
	private UserRepository userRepository;
	
	@Autowired
	public UserServiceImpl(UserRepository userRepositoy) {
		this.userRepository = userRepositoy;
	}

	@Override
	public List<User> findAllUsers() {
		List<User> users = userRepository.findAllUsers();
		return users;
	}

}