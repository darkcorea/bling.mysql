package bling.com.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class OrderDAO {

	@Autowired
	private SqlSession sqlSession;
	
	private String om = "bling.com.mapper.orderMapper.";
	
}
