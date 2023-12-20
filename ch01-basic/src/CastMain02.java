public class CastMain02 {
	public static void main(String[] args) {
		System.out.println("=====명시적 형변환(강제 형변환)====");
		//큰 자료형에서 작은 자료형으로 강등이 일어나는 형태, 
		//정보의 손실이 발생할 수 있음.
		
		byte b1 = 127;
		byte b2 = 127;
		//자동적으로 int로 승격된 것을 byte로 명시적 형변환
		byte result1 = (byte)(b1 + b2);
		System.out.println("result1 = " + result1);
		
		short s1 = 1000;
		short s2 = 2000;
		short result2 = (short)(s1 + s2);
		System.out.println("result2 = " + result2);
		
		System.out.println("==============");
		
		int in1 = 2345;
		float f1 = 25.67f;
		int result3 = in1 + (int)f1;//f1의 자료형 float -> int로
		                            //강제 형변환, 정보의 손실 발생
		System.out.println("result3 = " + result3);
		
		int in2 = 1234;
		long lg1 = 1234L;
		int result4 = in2 + (int)lg1;//lg1의 자료형 long -> int로
		                             //강제 형변환, 정보의 손실은 발생하지 않음
		System.out.println("result4 = " + result4);
	}
}


