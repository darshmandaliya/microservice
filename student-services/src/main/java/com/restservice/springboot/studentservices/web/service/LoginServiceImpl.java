package com.restservice.springboot.studentservices.web.service;

import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

	@Override
	public boolean valiadteUser(String name, String password) {
		System.out.println("Validate User Service : " + name + "-" + password);
		return true;
	}

}
