package kr.s01.extention;

//�θ�Ŭ����
class Parent extends Object{//�⺻������ ����, �ڵ������� Object�� ��ӵ�
	int a = 100;
}
//�ڽ�Ŭ����
class Child extends Parent{
	int b = 200;
}

public class ExtentionMain01 {
	public static void main(String[] args) {
		Child ch = new Child();
		System.out.println(ch.a);
		System.out.println(ch.b);
	}
}





