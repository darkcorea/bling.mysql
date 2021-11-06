package bling.com.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BuyDAO {

	@Autowired
	private SqlSession sqlSession;
	
	private String am = "bling.com.mapper.addrMapper.";
	
}
