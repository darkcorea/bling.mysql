package bling.com.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import bling.com.domain.Criteria;
import bling.com.domain.PageMaker;
import bling.com.service.ProductService;
import bling.com.service.ReviewService;

@RequestMapping(value="/Review")
@Controller
public class ReviewController {

	@Autowired
	ReviewService reviewService;
	
	@Autowired
	ProductService productService;
	
	@RequestMapping(value="/main.do")
	public String main(Locale locale, Model model) throws Exception {
		
		return "review/main";
	}
	
	/* 페이징 연습  완료, domain만들어서 관련 VO넣고 매퍼에 등록*/
	@RequestMapping(value="/list.do")
	public String list(Locale locale, Model model, Criteria sc ) throws Exception {
		
		
		int pidx = 3;
		// 상품의 리뷰들
		model.addAttribute("review", productService.reviewProduct_1(pidx));
		
		
		
		/* 
		- 매퍼에서 if절 사용할 예정, 또는 VO에 추가 할 수도 있음
		String searchType = sc.getSearchType();
		if (searchType == null) searchType="subject";
		String keyword = sc.getKeyword();
		if (keyword == null) keyword=""; */
		
		// 총 리뷰 갯수 가져오기 pix3에 해당하는 리뷰만가져옴
		int reviewCount = reviewService.reviewCount();

		// 자동으로 페이징 계산해주는 VO에 필요한 값 넣기, 디폴트 값으로 한페이지당 9개의 리뷰와 10개의 페이지를 보여주게 설정되어 있음
		// sc로 넘어오는건 page정보 나머지는 여기서 입력해줘야함.
		// 나머지 정보는 여기서 입력 하는게 좋음 안 그러면 페이지 갯수와 보여줄 리뷰 갯수를 변경할 수 있는데 그러면 기존에 있던 CSS가 깨짐
		
		//System.out.println("페이지 번호>>>>"+sc.getPage());
		// 가져오는 페이지수 변경 가능한지 확인 -> 변경 가능
		int pageNum = 3;
		sc.setPerPageNum(pageNum);
		
		// 페이징 하기 위해서 필요한 값들 넣음
		PageMaker pm = new PageMaker();
		pm.setScri(sc);
		pm.setTotalCount(reviewCount);
		
		
		/*
		 * System.out.println("StartPage>>>>>>>>>>>"+pm.getStartPage());
		 * System.out.println("EndPage>>>>>>>>>>>>>>"+pm.getEndPage());
		 * System.out.println("StartPost>>>>>>>>>>"+pm.getStartPost());
		 * System.out.println("LastPost>>>>>>>>>>"+pm.getLastPost());
		 */
		 
		
		// 페이징 된 리뷰들 
		model.addAttribute("page", reviewService.reviewPaging(pm));
		// 페이징에 필요한 값과 게시판 아래 숫자 나오는것에 필요함
		model.addAttribute("pm", pm);
		
		
		return "list";
	}
	
}