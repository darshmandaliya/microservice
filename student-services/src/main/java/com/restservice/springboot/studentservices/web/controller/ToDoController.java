package com.restservice.springboot.studentservices.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.restservice.springboot.studentservices.web.service.TodoService;

@Controller
@SessionAttributes("name")
public class ToDoController {

	Logger LOGGER = LoggerFactory.getLogger(ToDoController.class);

	@Autowired
	TodoService todoService;

	@RequestMapping(value = "/list-todos", method = RequestMethod.GET)
	public String retrieveTodos(ModelMap model, @SessionAttribute("name") String user) {
		// String user = (String) model.get("name");
		LOGGER.info("User: " + user);
		model.put("todos", todoService.retrieveTodoList(user));
		return "list-todos";
	}
}
