package bling.com.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import bling.com.service.JoinService;

@RequestMapping(value="/Join")
@Controller
public class JoinController {

	@Autowired
	JoinService joinService;
	
	@RequestMapping(value="/main.do")
	public String main(Locale locale, Model model) {
		return "join/main";
	}
}
