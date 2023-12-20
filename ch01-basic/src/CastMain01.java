public class CastMain01 {
	public static void main(String[] args) {
		System.out.println("====묵시적 형변환(자동 형변환)=====");
		//작은 자료형에서 큰 자료형으로 승격이 일어나는 형태
		//정보의 손실이 전혀 없으며 자동적으로 발생
		
		 byte b1 = 127;//byte 표현범위 : -128 ~ 127 (8bit)
		 byte b2 = 127;
		 int result1 = b1 + b2;//32bit 미만 byte형 데이터를 연산하면
		                       //32bit로 승격
		System.out.println("result1 = " + result1);
		
		short s1 = 32767;//short 표현범위 : -32,768 ~ 32,767
		short s2 = 32767;
		int result2 = s1 + s2;//32bit 미만 short형 데이터를 연산하면
		                      //32bit로 승격
		System.out.println("result2 = " + result2);
		
		System.out.println("---------------");
		
		int in1 = 1000;
		long lg1 = 2000L;
		long result3 = in1 + lg1;//in1의 자료형 int -> long
		System.out.println("result3 = " + result3);
		
		double du1 = 5.3;
		int in2 = 20;
		double result4 = du1 + in2;//in2의 자료형 int -> double
		System.out.println("result4 = " + result4);
		
	}
}






