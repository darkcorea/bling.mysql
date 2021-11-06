package bling.com.service;

import java.util.List;

import bling.com.vo.ImageVO;
import bling.com.vo.CombineVO;
import bling.com.vo.OptionVO;
import bling.com.vo.ProductVO;

public interface ProductService {

	// 홈, 상품 리스트에서 같이 쓰는 서비스
	List<CombineVO> prodBest() throws Exception;
	List<CombineVO> prodNew() throws Exception;
	List<CombineVO> newList(String kind) throws Exception;
	
	
	// 상품 리스트에서 쓰는 서비스
	List<CombineVO> bestList(String kind) throws Exception;
	List<CombineVO> highPrice(String kind) throws Exception;
	List<CombineVO> rowPrice(String kind) throws Exception;

	
	
	// 상품 디테일에에서 쓰는 서비스
	ProductVO detail(int pidx) throws Exception;
	List<OptionVO> options(int pidx) throws Exception;
	ImageVO image(int pidx) throws Exception;
	List<CombineVO> reviewProduct_1(int pidx) throws Exception;
	List<CombineVO> reviewProduct_2(int pidx) throws Exception;

}
