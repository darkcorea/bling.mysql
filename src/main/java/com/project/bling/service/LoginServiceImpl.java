package com.project.bling.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.bling.dao.LoginDAO;

@Service("LoginService")
public class LoginServiceImpl implements LoginService {

	@Autowired
	LoginDAO loginDAO;
	
	
	
}
