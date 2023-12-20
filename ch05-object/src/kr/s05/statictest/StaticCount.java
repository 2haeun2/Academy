package kr.s05.statictest;

public class StaticCount {
	int c; //인스턴스 변수
	static int count; //static(클래스) 변수
	
	//생성자
	public StaticCount() {
		c++;
		count++;
	}
}
