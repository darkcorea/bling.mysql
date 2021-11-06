package bling.com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bling.com.dao.AddrDAO;

@Service("AddrService")
public class AddrServiceImpl implements AddrService {

	@Autowired
	AddrDAO addrDAO;
	
	
	
}
