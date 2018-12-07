package com.restservice.springboot.studentservices.web.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.restservice.springboot.studentservices.web.common.UsersJPARepository;

@Repository
public class LoginDaoImpl implements LoginDao {

	@Autowired
	UsersJPARepository userJPARepository;

	@Override
	public boolean valiadteUser(String name, String password) {
		return !userJPARepository.findById(name).equals(Optional.empty());
	}

}
