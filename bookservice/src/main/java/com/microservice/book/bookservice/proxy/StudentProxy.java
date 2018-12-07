package com.microservice.book.bookservice.proxy;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.microservice.book.bookservice.model.Student;

@FeignClient(name = "studentservice")
@RibbonClient(name = "studentservice")
public interface StudentProxy {

	@GetMapping("/student")
	public Student getStudentByName(@RequestParam(name = "name") String studentName);

}
