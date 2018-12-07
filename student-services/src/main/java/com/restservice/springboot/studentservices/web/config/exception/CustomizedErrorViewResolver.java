package com.restservice.springboot.studentservices.web.config.exception;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.autoconfigure.web.servlet.error.ErrorViewResolver;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomizedErrorViewResolver implements ErrorViewResolver {
	@Override
	public ModelAndView resolveErrorView(HttpServletRequest request, HttpStatus status, Map<String, Object> model) {
		if (HttpStatus.NOT_FOUND == status) {
			System.out.println("Error 404 for url " + model.get("path"));
			return new ModelAndView("RequestError", model);
		} else if (HttpStatus.INTERNAL_SERVER_ERROR == status) {
			return new ModelAndView("errors/server-error", model);
		}

		return new ModelAndView("errors/server-error", model);
	}
}
