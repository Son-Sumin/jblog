package com.bitacademy.jblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

	@RequestMapping("/user/join")
	public String join() {
		return "user/join";
	}
	
	@RequestMapping("/user/joinsuccess")
	public String joinsuccess() {
		return "user/joinsuccess";
	}
	
	@RequestMapping("/user/login")
	public String login() {
		return "user/login";
	}
}
