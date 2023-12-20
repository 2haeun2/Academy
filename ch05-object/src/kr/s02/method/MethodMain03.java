package kr.s02.method;

public class MethodMain03 {
	//Variable Arguments
	//자료형이 일치할 때 전달하고자 하는 값의 갯수를 다르게 지정할 수 있다.
	//전달되는 데이터는 내부적으로 배열로 인식
	public void argTest(int ... n) {
		for(int i=0;i<n.length;i++) {
			System.out.println("n["+i+"]:" + n[i]);
		}
		System.out.println("-----------");
	}
	
	public static void main(String[] args) {
		//객체 선언 및 생성
		MethodMain03 me = new MethodMain03();
		
		me.argTest();
		me.argTest(10);
		me.argTest(20,30);
		me.argTest(40,50,60);
	}
}




