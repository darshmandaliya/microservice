package com.microservice.book.bookservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.book.bookservice.model.Student;
import com.microservice.book.bookservice.proxy.StudentProxy;

@RestController
public class BookController {

	@Autowired
	StudentProxy studentProxy;

	@GetMapping("/books")
	public String getStudentBook(@RequestParam(name = "studentName") String name) {
		System.out.println("BookController.getStudentBook()");

		Student student = studentProxy.getStudentByName(name);
		System.out.println("Student id = " + student.getId());

		return "owl";
	}

}
