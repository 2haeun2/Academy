package kr.s04.thistest;

public class ThisMain {

	public ThisMain() {
		System.out.println("��ü ���� : " + this);
	}
	
	public static void main(String[] args) {
		ThisMain tt = new ThisMain();
		System.out.println("��ü ���� �� : " + tt);
	}
}
