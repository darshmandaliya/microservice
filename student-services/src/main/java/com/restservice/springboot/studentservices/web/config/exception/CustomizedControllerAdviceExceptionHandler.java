package com.restservice.springboot.studentservices.web.config.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomizedControllerAdviceExceptionHandler {

	@ExceptionHandler(Exception.class)
	// @ResponseBody
	    ResponseEntity<Object> handleControllerException(HttpServletRequest req, Throwable ex) {
	        if(ex instanceof Exception) {
	           System.out.println("Exception");
	        }
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}

}