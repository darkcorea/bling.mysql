package bling.com.service;

import java.util.List;

import bling.com.vo.ImageVO;
import bling.com.vo.OptionVO;
import bling.com.vo.ProductVO;

public interface AdminService {
	
	void insert(ProductVO vo) throws Exception;
	void insertOpt(OptionVO vo) throws Exception;
	void insertImg(ImageVO vo) throws Exception;
	List<ProductVO> list() throws Exception;

}
