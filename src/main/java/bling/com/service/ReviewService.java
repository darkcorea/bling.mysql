package bling.com.service;

import java.util.List;

import bling.com.domain.PageMaker;
import bling.com.vo.CombineVO;

public interface ReviewService {

	int reviewCount() throws Exception;
	List<CombineVO> reviewPaging(PageMaker pm)throws Exception;
	
	
}
