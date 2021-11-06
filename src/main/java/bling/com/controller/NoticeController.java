package bling.com.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import bling.com.service.NoticeService;

@RequestMapping(value="/Notice")
@Controller
public class NoticeController {

	@Autowired
	NoticeService noticeService;
	
	@RequestMapping(value="/main.do")
	public String main(Locale locale, Model model) {
		return "notice/main";
	}
}
