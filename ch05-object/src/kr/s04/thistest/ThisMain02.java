package kr.s04.thistest;

class ThisTest{
	//����ȭ
	private int a;
	
	//ĸ��ȭ
	public void setA(int a) {
	   //���������� �������������� �����ϰ� ����߱� ������
	   //��������� ���������� �����ϱ� ���� this�� �����
	   //������� = ��������
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



