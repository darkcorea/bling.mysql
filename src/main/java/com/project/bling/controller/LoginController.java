package com.project.bling.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.bling.service.LoginService;

@RequestMapping(value="/ Login")
@Controller
public class LoginController {

	@Autowired
	 LoginService  loginService;
	
	@RequestMapping(value="/main.do")
	public String main(Locale locale, Model model) {
		return "login/main";
	}
}
