package com.project.bling.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.bling.dao.ReviewDAO;
import com.project.bling.domain.PageMaker;
import com.project.bling.vo.CombineVO;

@Service("ReviewService")
public class ReviewServiceImpl implements ReviewService {

	@Autowired
	ReviewDAO reviewDAO;

	@Override
	public int reviewCount(int pidx) throws Exception {
		return reviewDAO.reviewCount(pidx);
	}

	@Override
	public List<CombineVO> reviewPaging(PageMaker pm) throws Exception {
		return reviewDAO.reviewPaging(pm);
	}
	
	// 상품에 대한 리뷰 갯수 최신순 
	@Override
	public List<CombineVO> reviewProduct_1(PageMaker pm) throws Exception {
		return reviewDAO.reviewProduct_1(pm);
	}
	
	// 상품에 대한 리뷰 갯수 평점순
	@Override
	public List<CombineVO> reviewProduct_2(PageMaker pm) throws Exception {
		return reviewDAO.reviewProduct_2(pm);
	}
	
}
