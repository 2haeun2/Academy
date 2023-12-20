package kr.s01.a;

public class MethodMain03 {
	
	//멤버변수
	String name;
	int korean;
	int english;
	int math;
	
	//멤버메서드
	//총점 구하기
	public int makeSum() {
		return korean + english + math;
	}
	//평균 구하기
	public int makeAverage() {
		return makeSum() / 3;
	}
	
	public static void main(String[] args) {
		//객체 선언 및 생성
		MethodMain03 me = new MethodMain03();
		me.name = "홍길동";
		me.korean = 98;
		me.english = 97;
		me.math = 96;
		
		System.out.println("이름 : " + me.name);
		System.out.println("국어 : " + me.korean);
		System.out.println("영어 : " + me.english);
		System.out.println("수학 : " + me.math);
		System.out.println("총점 : " + me.makeSum());
		System.out.println("평균 : " + me.makeAverage());
		
	}
}





