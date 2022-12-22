package com.joe.springsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SecurityController {
  
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String welcome() {
		System.out.println("welcome");
		return "welcome";
	}
}
