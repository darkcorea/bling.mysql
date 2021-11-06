package bling.com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bling.com.dao.BuyDAO;

@Service("BuyService")
public class BuyServiceImpl implements BuyService {

	@Autowired
	BuyDAO buyDAO;
	
	
	
}
