package kr.s01.extention;

//�θ�Ŭ����
class A{
	int x = 100;
	private int y = 200; //����ȭ
	
	public int getY() {
		return y;
	}
}
//�ڽ�Ŭ����
class B extends A{
	int z = 300;
}

public class ExtentionMain03 {
	public static void main(String[] args) {
		B bp = new B();
		System.out.println(bp.x);
		//private ��������� ��Ӱ��踦 �ξ ���� Ŭ������ �ƴϱ� ������
		//ȣ�� �Ұ�
		//System.out.println(bp.y);
		System.out.println(bp.getY());
		System.out.println(bp.z);
	}
}



