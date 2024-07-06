package com.dongjin.backend.practice.servicer;

import org.springframework.beans.factory.annotation.Autowired;

import com.dongjin.backend.practice.model.User;
import com.dongjin.backend.practice.repository.UserRepository;

public class UserServicer {
//	UserRepository userrepo = new UserRepository();

	@Autowired
	private UserRepository userRepository;
	
	public static void addUser(User newUser) {
		String name = newUser.getName();
		System.out.println(name);
		System.out.println(newUser.getEmail());
		System.out.println(newUser.getUsername());
		System.out.println(newUser.getId());
		
		//add the new user through UserRepository.
	}
	
}
