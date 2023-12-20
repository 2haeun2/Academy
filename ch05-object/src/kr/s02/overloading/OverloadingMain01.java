package kr.s02.overloading;

public class OverloadingMain01 {
	/*
	 * Method Overloading(�ߺ�����)�� �ϳ��� Ŭ���� ������ ���� �̸��� ������ �޼��尡
	 * ���� �� ���ǵǴ� ���� ���Ѵ�. (�޼��带 �������ִ� ��ҷ�) ������ Ÿ�� �Ǵ� ����,
	 * ��ġ�� ������ �ٸ� ��� �ٸ� �޼���� �ν���.
	 */
	public void print(int n) {
		System.out.println("���� n = " + n);
	}
	public void print(double a) {
		System.out.println("�Ǽ� a = " + a);
	}
	public void print(double n, long a) {
		System.out.println("�Ǽ� n = " + n + ", ���� a = " + a);
	}
	public void print(long a, double n) {
		System.out.println("���� a = " + a + ", �Ǽ� n = " + n);
	}
	
	public static void main(String[] args) {
		OverloadingMain01 ot = new OverloadingMain01();
		ot.print(20);
		ot.print(5.6);
		ot.print(3.7, 1234L);
		ot.print(1000L,5.8);
	}
}





