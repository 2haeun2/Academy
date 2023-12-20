package kr.s02.method;

public class MethodMain01 {
	
	//인자 전달 방식 : 값 호출(Call by value)
	//기본 자료형의 값을 인자로 전달하는 방식. 값을 복사하여 전달
	public int increase(int n) {
		++n;
		return n;
	}
	
	public static void main(String[] args) {
		int var1 = 100;
		
		MethodMain01 me = new MethodMain01();
		int var2 = me.increase(var1);
		
		System.out.println("var1 : " + var1 + ", var2 : " + var2);
		
	}
}




