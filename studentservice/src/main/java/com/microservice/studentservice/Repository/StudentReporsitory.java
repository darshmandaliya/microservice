package com.microservice.studentservice.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservice.studentservice.model.Student;

public interface StudentReporsitory extends JpaRepository<Student, Integer> {
	Student findByName(String name);
}
