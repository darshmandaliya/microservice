package com.restservice.springboot.studentservices.web.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.restservice.springboot.studentservices.web.model.Todo;

@Service
public class TodoServiceImpl implements TodoService {

	private static Logger LOGGER = LoggerFactory.getLogger(TodoServiceImpl.class);
	private static List<Todo> todoList = new ArrayList<>();

	static {
		LOGGER.info("Static Block Executed....");
		todoList.add(new Todo(1, "test", "Java 8", new Date(), true));
		todoList.add(new Todo(2, "test", "Spring Boot", new Date(), true));
		todoList.add(new Todo(3, "test", "Spring MVC", new Date(), true));
		todoList.add(new Todo(4, "darsh", "Spring Security", new Date(), false));
	}

	@Override
	public List<Todo> retrieveTodoList(String user) {
		List<Todo> filteredList = new ArrayList<>();
		for (Todo todo : todoList) {
			if (todo.getUser().equals(user)) {
				filteredList.add(todo);
			}
		}
		return filteredList;
	}

}
