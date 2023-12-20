package kr.s01.a;

public class MethodMain01 {
	//반환하는 데이터가 있는 경우
	public int add(int a, int b) {
		return a + b;
	}
	//반환하는 데이터가 없는 경우
	public void print(String str) {
		System.out.println(str);
	}

	public static void main(String[] args) {
		//객체 선언 및 생성
		MethodMain01 method = new MethodMain01();
		//반환하는 데이터가 있는 메서드 호출
		int result = method.add(5, 8);
		System.out.println("result = " + result);
		
		//반환하는 데이터가 없는 메서드 호출
		method.print("가을");
	}
}






