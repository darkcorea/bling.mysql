package bling.com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bling.com.dao.BasketDAO;

@Service("BasketService")
public class BasketServiceImpl implements BasketService {

	@Autowired
	BasketDAO basketDAO;
	
	
	
}
