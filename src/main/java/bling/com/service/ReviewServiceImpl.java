package bling.com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bling.com.dao.ReviewDAO;
import bling.com.domain.PageMaker;
import bling.com.vo.CombineVO;

@Service("ReviewService")
public class ReviewServiceImpl implements ReviewService {

	@Autowired
	ReviewDAO reviewDAO;

	@Override
	public int reviewCount() throws Exception {
		return reviewDAO.reviewCount();
	}

	@Override
	public List<CombineVO> reviewPaging(PageMaker pm) throws Exception {
		return reviewDAO.reviewPaging(pm);
	}
	
	
	
}
