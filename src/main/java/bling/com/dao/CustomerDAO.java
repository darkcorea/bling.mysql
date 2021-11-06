package bling.com.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerDAO {

	@Autowired
	private SqlSession sqlSession;
	
	private String cm = "bling.com.mapper.customerMapper.";
	
}
