package kr.s02.overloading;

public class OverloadingMain02 {
	//���޵Ǵ� ������ Ÿ���� ��� String���� ��ȯ�ؼ� ���ڿ��� ���̸� ���ϴ�
	//�޼��� �����
	public void getLength(int n) {
		String s = String.valueOf(n);//int -> String ��ȯ
		getLength(s);
	}
	
	void getLength(float n) {
		String s = String.valueOf(n); //float -> String ��ȯ
		getLength(s);
	}
	
	private void getLength(String s) {
		System.out.println(s + "�� ���� : " + s.length());
	}
	
	public static void main(String[] args) {
		OverloadingMain02 om = new OverloadingMain02();
		om.getLength(1000);
		om.getLength(3.14f);
		om.getLength("Hello");
	}
}




