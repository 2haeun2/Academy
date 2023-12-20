package kr.s05.statictest;

public class StaticMain02 {
	
	int a; //인스턴스 변수
	static String s; //static(클래스) 변수
	
	public static void main(String[] args) {
		//인스턴스 변수는 객체 생성 이후에 호출
		//a = 10;
		
		s = "자바의 꿈";
		System.out.println("s = " + s);
	}
}



