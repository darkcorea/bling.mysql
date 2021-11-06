package bling.com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bling.com.dao.SearchDAO;

@Service("SearchService")
public class SearchServiceImpl implements SearchService {

	@Autowired
	SearchDAO searchDAO;
	
	
	
}
