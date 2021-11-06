package bling.com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bling.com.dao.LoginDAO;

@Service("LoginService")
public class LoginServiceImpl implements LoginService {

	@Autowired
	LoginDAO loginDAO;
	
	
	
}
