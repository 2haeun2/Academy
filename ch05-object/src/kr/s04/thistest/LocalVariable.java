package kr.s04.thistest;

public class LocalVariable {
	//��� ����
	int b = 200;
	
	public void make() {
		//�������� : �޼���, ������, ��� �� ������ ������ ����,
		//         �ش� ���� ����Ǹ� ������ �Ҹ���
		int a = 100;
		System.out.println("a : " + a);
		System.out.println("b : " + b);
	}
	
	public void fun() {
		//fun �޼��� �ȿ� a ������ ���ǵ��� �ʾƼ� ȣ�� �Ұ�
		//System.out.println("a : " + a);
		System.out.println("b : " + b); //��� ����
	}
	
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {//��� ������ ��������
			System.out.print(i + "\t");
		}
		System.out.println("\n-----------------");
		//main �� �ȿ� i ������ ���� ȣ�� ����
		//System.out.println(i);
		
		int a;
		for(a=1;a<=5;a++) {
			System.out.print(a + "\t");
		}
		System.out.println();//�ܼ� �ٹٲ�
		//�ݺ����� ����Ǿ main������ a������ �����߱� ������
		//ȣ�� ����
		System.out.println(a);
	}
	
}








