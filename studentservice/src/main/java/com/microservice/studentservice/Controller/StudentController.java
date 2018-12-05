package com.microservice.studentservice.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.studentservice.Repository.StudentReporsitory;
import com.microservice.studentservice.model.Student;

@RestController
public class StudentController {

	@Autowired
	StudentReporsitory studentRepository;

	@GetMapping("/student")
	public Student getStudentByName(@RequestParam(name = "name") String studentName) {
		System.out.println("StudentController.getStudentByName()");
		return studentRepository.findByName(studentName);
	}

}
