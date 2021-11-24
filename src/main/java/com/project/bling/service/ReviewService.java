package com.project.bling.service;

import java.util.List;

import com.project.bling.domain.PageMaker;
import com.project.bling.vo.CombineVO;

public interface ReviewService {

	int reviewCount(int pidx) throws Exception;
	List<CombineVO> reviewProduct_1(PageMaker pm) throws Exception;
	List<CombineVO> reviewProduct_2(PageMaker pm) throws Exception;
	List<CombineVO> reviewPaging(PageMaker pm)throws Exception;
	
	
}
