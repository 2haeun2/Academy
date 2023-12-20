package kr.s09.book;

import java.sql.Date;

/*
 * VO(Value Object) : 
 * 테이블의 행에 정보를 제공하고 행으로부터 값을 읽어와 보관할 수 있는 객체
 */
public class BookVO {
	private int bk_num;//도서 번호
	private String bk_name;//도서명
	private String bk_category;//도서 분류
	private Date bk_regdate;//도서 등록일
	
	public int getBk_num() {
		return bk_num;
	}
	public void setBk_num(int bk_num) {
		this.bk_num = bk_num;
	}
	public String getBk_name() {
		return bk_name;
	}
	public void setBk_name(String bk_name) {
		this.bk_name = bk_name;
	}
	public String getBk_category() {
		return bk_category;
	}
	public void setBk_category(String bk_category) {
		this.bk_category = bk_category;
	}
	public Date getBk_regdate() {
		return bk_regdate;
	}
	public void setBk_regdate(Date bk_regdate) {
		this.bk_regdate = bk_regdate;
	}
	

}
