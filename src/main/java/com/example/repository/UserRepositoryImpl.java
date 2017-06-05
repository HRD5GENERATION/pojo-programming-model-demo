package com.example.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.model.User;

@Repository
public class UserRepositoryImpl implements UserRepository{
	
	private List<User> users = new ArrayList<>();
	
	public UserRepositoryImpl() {
		for(int i=0; i<10; i++){
			User user = new User(i, "user" + i, "pwd" + i);
			users.add(user);
		}
	}
	
	@Override
	public List<User> findAllUsers() {
		return users;
	}
}
