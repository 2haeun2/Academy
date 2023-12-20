package kr.s01.a;

public class InstanceMain01 {
	//클래스의 기본 구조
	//필드
	int var1; //멤버변수
	String var2; //멤버변수

	//생성자
	public InstanceMain01() {} 
	
	//멤버메서드
	public int sum(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		//객체 선언
		InstanceMain01 me;
		//객체 생성
		me = new InstanceMain01();
		
		//객체의 멤버변수에 데이터 저장
		me.var1 = 10;
		me.var2 = "가을";
		//객체의 멤버변수에 저장된 데이터 읽기
		System.out.println(me.var1 + "," + me.var2);

		//객체의 멤버메서드에 데이터 전달하고 결과값을 변수에 저장
		int result = me.sum(10, 20);
		System.out.println("result = " + result);
	}
}







