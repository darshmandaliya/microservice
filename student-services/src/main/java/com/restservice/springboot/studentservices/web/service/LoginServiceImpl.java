package com.restservice.springboot.studentservices.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restservice.springboot.studentservices.web.dao.LoginDao;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	LoginDao loginDao;

	/*
	 * @Autowired
	 * 
	 * @Qualifier("demoSource2DS") DataSource secondaryDataSource;
	 * 
	 * @Autowired DataSource firstDataSource;
	 */

	@Override
	public boolean valiadteUser(String name, String password) {
		System.out.println("Validate User Service : " + name + "-" + password);
		boolean isValidUser = loginDao.valiadteUser(name, password);
		System.out.println("Is Valid User: " + isValidUser);
		return isValidUser;
	}

}
