package com.microservice.studentservice.Controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class StudentExceptionHandler {

	@ExceptionHandler(Exception.class)
	public String handleSQLException(HttpServletRequest request, Exception ex) {
		System.out.println("SQLException Occured:: URL=" + request.getRequestURL());
		return "database_error";
	}
}
