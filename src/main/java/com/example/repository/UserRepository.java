package com.example.repository;

import java.util.List;

import com.example.model.User;

public interface UserRepository {
	
	List<User> findAllUsers();
	
}
