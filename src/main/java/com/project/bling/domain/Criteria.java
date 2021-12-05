package com.project.bling.domain;

public class Criteria {

	// 검색 기능만 있음
	private String searchType;
	private String keyword;
	private String kind;
	private int price;
	private int start_price;
	private int last_price;
	

	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getStart_price() {
		return start_price;
	}
	public void setStart_price(int start_price) {
		this.start_price = start_price;
	}
	public int getLast_price() {
		return last_price;
	}
	public void setLast_price(int last_price) {
		this.last_price = last_price;
	}
	public String getSearchType() {
		return searchType;
	}
	public void setSearchType(String searchType) {
		this.searchType = searchType;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	
}
