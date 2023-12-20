package kr.s01.extention;

//부모클래스
class A{
	int x = 100;
	private int y = 200; //은닉화
	
	public int getY() {
		return y;
	}
}
//자식클래스
class B extends A{
	int z = 300;
}

public class ExtentionMain03 {
	public static void main(String[] args) {
		B bp = new B();
		System.out.println(bp.x);
		//private 멤버변수는 상속관계를 맺어도 같은 클래스가 아니기 때문에
		//호출 불가
		//System.out.println(bp.y);
		System.out.println(bp.getY());
		System.out.println(bp.z);
	}
}



