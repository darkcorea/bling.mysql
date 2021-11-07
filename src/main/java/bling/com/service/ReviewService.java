package bling.com.service;

import java.util.List;

import bling.com.domain.PageMaker;
import bling.com.vo.CombineVO;

public interface ReviewService {

	int reviewCount(int pidx) throws Exception;
	List<CombineVO> reviewProduct_1(PageMaker pm) throws Exception;
	List<CombineVO> reviewProduct_2(PageMaker pm) throws Exception;
	List<CombineVO> reviewPaging(PageMaker pm)throws Exception;
	
	
}
