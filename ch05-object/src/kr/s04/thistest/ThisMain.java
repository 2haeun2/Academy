package kr.s04.thistest;

public class ThisMain {

	public ThisMain() {
		System.out.println("按眉 积己 : " + this);
	}
	
	public static void main(String[] args) {
		ThisMain tt = new ThisMain();
		System.out.println("按眉 积己 饶 : " + tt);
	}
}
