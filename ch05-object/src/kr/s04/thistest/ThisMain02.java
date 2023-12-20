package kr.s04.thistest;

class ThisTest{
	//은닉화
	private int a;
	
	//캡슐화
	public void setA(int a) {
	   //멤버변수명과 지역변수명으로 동일하게 명시했기 때문에
	   //멤버변수와 지역변수를 구분하기 위해 this를 사용함
	   //멤버변수 = 지역변수
		this.a = a;
	}
	public int getA() {
		return a;
	}
}

public class ThisMain02 {
	public static void main(String[] args) {
		ThisTest tt = new ThisTest();
		tt.setA(200);
		System.out.println(tt.getA());
	}
}



