package com.dongjin.backend.practice.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dongjin.backend.practice.model.User;
import com.dongjin.backend.practice.servicer.UserServicer;

@RestController
public class UserController {
	
	@RequestMapping(method=RequestMethod.POST, value="/user/add")
	private void addUser(@RequestBody User newUser) {
		System.out.println("hi");
		UserServicer.addUser(newUser);
	}
}
