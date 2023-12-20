package kr.s02.method;

public class MethodMain03 {
	//Variable Arguments
	//�ڷ����� ��ġ�� �� �����ϰ��� �ϴ� ���� ������ �ٸ��� ������ �� �ִ�.
	//���޵Ǵ� �����ʹ� ���������� �迭�� �ν�
	public void argTest(int ... n) {
		for(int i=0;i<n.length;i++) {
			System.out.println("n["+i+"]:" + n[i]);
		}
		System.out.println("-----------");
	}
	
	public static void main(String[] args) {
		//��ü ���� �� ����
		MethodMain03 me = new MethodMain03();
		
		me.argTest();
		me.argTest(10);
		me.argTest(20,30);
		me.argTest(40,50,60);
	}
}




