package bling.com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bling.com.dao.EventDAO;

@Service("EventService")
public class EventServiceImpl implements EventService {

	@Autowired
	EventDAO eventDAO;
	
	
	
}
