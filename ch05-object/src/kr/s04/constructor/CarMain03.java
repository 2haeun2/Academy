package kr.s04.constructor;

public class CarMain03 {
	
	//������ �����ε�
	public CarMain03(int n) {
		//�����ڳ����� �� �ٸ� �����ڸ� ȣ���� ���� �����ڸ��� �� �� ����
		//this��� ǥ���ؾ� ��
		this(String.valueOf(n)); //int -> String
	}
	public CarMain03(float n) {
		//�����ڳ����� �� �ٸ� �����ڸ� ȣ���ϱ� ���� ���๮�� ��ġ�ϸ� ���� �߻�
		//System.out.println("float ������ ��ȯ");
		this(String.valueOf(n)); //float -> String
		System.out.println("float ������ ��ȯ");
	}
	public CarMain03(String s) {
		System.out.println(s + "�� ���� : " + s.length());
	}
	
	public static void main(String[] args) {
		CarMain03 cm1 = new CarMain03(2000);
		CarMain03 cm2 = new CarMain03(3.141592f);
		CarMain03 cm3 = new CarMain03("World");
	}
}


