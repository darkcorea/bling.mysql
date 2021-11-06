package bling.com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bling.com.dao.JoinDAO;

@Service("JoinService")
public class JoinServiceImpl implements JoinService {

	@Autowired
	JoinDAO joinDAO;
	
	
	
}
