public class CastMain01 {
	public static void main(String[] args) {
		System.out.println("====������ ����ȯ(�ڵ� ����ȯ)=====");
		//���� �ڷ������� ū �ڷ������� �°��� �Ͼ�� ����
		//������ �ս��� ���� ������ �ڵ������� �߻�
		
		 byte b1 = 127;//byte ǥ������ : -128 ~ 127 (8bit)
		 byte b2 = 127;
		 int result1 = b1 + b2;//32bit �̸� byte�� �����͸� �����ϸ�
		                       //32bit�� �°�
		System.out.println("result1 = " + result1);
		
		short s1 = 32767;//short ǥ������ : -32,768 ~ 32,767
		short s2 = 32767;
		int result2 = s1 + s2;//32bit �̸� short�� �����͸� �����ϸ�
		                      //32bit�� �°�
		System.out.println("result2 = " + result2);
		
		System.out.println("---------------");
		
		int in1 = 1000;
		long lg1 = 2000L;
		long result3 = in1 + lg1;//in1�� �ڷ��� int -> long
		System.out.println("result3 = " + result3);
		
		double du1 = 5.3;
		int in2 = 20;
		double result4 = du1 + in2;//in2�� �ڷ��� int -> double
		System.out.println("result4 = " + result4);
		
	}
}





