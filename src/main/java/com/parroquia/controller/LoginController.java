package com.parroquia.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class LoginController {
	
	@RequestMapping("/verLogin")
	public String verLogin() { return "login"; }

}
