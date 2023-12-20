package kr.s03.capsule;

class Capsule{
	//은닉화
	//private 같은 클래스에서만 접근 가능
	private int a;
	
	//캡슐화
	public void setA(int n) {
		if(n>=0) {
			a = n;
		}else {//음수
			System.out.println("음수는 허용되지 않습니다.");
		}
	}
	
	public int getA() {
		return a;
	}
	
}

public class CapsuleMain {
	public static void main(String[] args) {
		Capsule cap = new Capsule();
		//변수 a의 접근지정자(제한자)가 private이기 때문에 같은 클래스내에서는
		//호출이 가능하지만 다른 클래스에서는 호출 불가능
		//cap.a = -10;
		
		//데이터 저장
		cap.setA(100);
		System.out.println(cap.getA());//데이터 호출
		System.out.println("------------");
		
		cap.setA(-100);//음수는 허용되지 않음
		System.out.println(cap.getA());
		
	}
}






