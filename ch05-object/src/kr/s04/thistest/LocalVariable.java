package kr.s04.thistest;

public class LocalVariable {
	//멤버 변수
	int b = 200;
	
	public void make() {
		//지역변수 : 메서드, 생성자, 제어문 블럭 내에서 생성된 변수,
		//         해당 블럭이 종료되면 변수는 소멸함
		int a = 100;
		System.out.println("a : " + a);
		System.out.println("b : " + b);
	}
	
	public void fun() {
		//fun 메서드 안에 a 변수가 정의되지 않아서 호출 불가
		//System.out.println("a : " + a);
		System.out.println("b : " + b); //멤버 변수
	}
	
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {//제어문 블럭안의 지역변수
			System.out.print(i + "\t");
		}
		System.out.println("\n-----------------");
		//main 블럭 안에 i 변수가 없서 호출 오류
		//System.out.println(i);
		
		int a;
		for(a=1;a<=5;a++) {
			System.out.print(a + "\t");
		}
		System.out.println();//단순 줄바꿈
		//반복문이 종료되어도 main블럭에서 a변수를 생성했기 때문에
		//호출 가능
		System.out.println(a);
	}
	
}








