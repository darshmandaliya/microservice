package com.restservice.springboot.studentservices.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.restservice.springboot.studentservices.web.service.LoginService;

@Controller
@SessionAttributes("name")
public class LoginController {

	private final Logger LOGGER = LoggerFactory.getLogger(LoginController.class);

	@Autowired
	LoginService LoginService;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String showLoginPage(ModelAndView modelView) {
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String validateUser(ModelMap modelView, @RequestParam String name, @RequestParam String password) {

		LOGGER.info("Name : " + name);
		LOGGER.info("Password : " + password);

		System.out.println("name");

		boolean isValidUser = LoginService.valiadteUser(name, password);

		if (!isValidUser) {
			modelView.addAttribute("errorMessage", "Invalid Credential");
			return "login";
		}

		modelView.put("name", name);
		modelView.put("password", password);
		return "welcome";
	}

	@RequestMapping(value = "/login", params = "version=1", method = RequestMethod.POST)
	public String validateUserV2(ModelMap modelView, @RequestParam String name, @RequestParam String password) {

		LOGGER.info("Name V2: " + name);
		LOGGER.info("Password V2: " + password);

		System.out.println("name V2");

		boolean isValidUser = LoginService.valiadteUser(name, password);

		if (!isValidUser) {
			modelView.addAttribute("errorMessage", "Invalid Credential V2");
			return "login";
		}

		modelView.put("name", name);
		modelView.put("password", password);
		return "welcome";
	}

}
