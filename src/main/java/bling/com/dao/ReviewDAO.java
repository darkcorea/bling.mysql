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

	
	// pidx 에 달린 리뷰 총 갯수 가져오기
	public int reviewCount(int pidx) throws Exception{
		return sqlSession.selectOne(rm + "reviewCount", pidx);
	}
	
	// 페이징된 리뷰 가져오기
	public List<CombineVO> reviewPaging(PageMaker pm)throws Exception{
		return sqlSession.selectList(rm + "reviewPaging", pm);
	}
	
	// 상품 pidx로 상품의 리뷰들 최신순으로 가져오기
	public List<CombineVO> reviewProduct_1(PageMaker pm) throws Exception{
		return sqlSession.selectList(rm+"reviewProduct_1", pm);
	}
	// 상품 pidx로 상품의 리뷰들 평점 높은순으로 가져오기
	public List<CombineVO> reviewProduct_2(PageMaker pm) throws Exception{
		return sqlSession.selectList(rm+"reviewProduct_2", pm);
	}
}
