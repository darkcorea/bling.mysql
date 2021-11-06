package bling.com.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import bling.com.domain.PageMaker;
import bling.com.vo.CombineVO;

@Repository
public class ReviewDAO {

	@Autowired
	private SqlSession sqlSession;
	
	private String rm = "bling.com.mapper.reviewMapper.";

	
	// pidx 3에 달린 리뷰 총 갯수 가져오기
	public int reviewCount() throws Exception{
		return sqlSession.selectOne(rm + "reviewCount");
	}
	
	// 페이징된 리뷰 가져오기
	public List<CombineVO> reviewPaging(PageMaker pm)throws Exception{
		return sqlSession.selectList(rm + "reviewPaging", pm);
	}
}
