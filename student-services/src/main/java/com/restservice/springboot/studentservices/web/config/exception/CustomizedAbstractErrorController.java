package com.restservice.springboot.studentservices.web.config.exception;

import org.springframework.stereotype.Controller;

@Controller
public class CustomizedAbstractErrorController {// extends AbstractErrorController {

	/*
	 * public CustomizedURLMappingExceptionHandler(ErrorAttributes errorAttributes)
	 * { super(errorAttributes); }
	 * 
	 * @Override public String getErrorPath() { return null; }
	 * 
	 * @RequestMapping("/error") public ResponseEntity<?>
	 * handleErrors(HttpServletRequest request) { HttpStatus status =
	 * getStatus(request);
	 * 
	 * if (status.equals(HttpStatus.NOT_FOUND))
	 * System.out.println("Invalid URL...");
	 * 
	 * return ResponseEntity.status(status).body(getErrorAttributes(request,
	 * false)); // return ResponseEntity.status(status).body(new
	 * ModelAndView("RequestError")); }
	 */

}
