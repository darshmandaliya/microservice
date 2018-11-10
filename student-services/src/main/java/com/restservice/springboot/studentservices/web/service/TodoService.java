package com.restservice.springboot.studentservices.web.service;

import java.util.List;

import com.restservice.springboot.studentservices.web.model.Todo;

public interface TodoService {
	public List<Todo> retrieveTodoList(String user);
}
