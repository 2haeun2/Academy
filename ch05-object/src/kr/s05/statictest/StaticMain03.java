package kr.s05.statictest;

class StaticMethod{
	String s1 = "����ƽ";
	static String s2 = "static";
	
	public static String getString() {
		return s2;
	}
}

public class StaticMain03 {
	public static void main(String[] args) {
		//�ν��Ͻ� ������ ��ü�� �����ؾ� ����� �� ������
		//static ������ static �޼���� ȣ���ϸ� �ٷ� ��� ����
		System.out.println(StaticMethod.getString());
	}
}




