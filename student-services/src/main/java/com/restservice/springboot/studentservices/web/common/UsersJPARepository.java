package com.restservice.springboot.studentservices.web.common;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restservice.springboot.studentservices.web.model.Users;

@Repository
public interface UsersJPARepository extends JpaRepository<Users, String> {

}
