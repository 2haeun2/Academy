package kr.s05.statictest;

class StaticMethod{
	String s1 = "스태틱";
	static String s2 = "static";
	
	public static String getString() {
		return s2;
	}
}

public class StaticMain03 {
	public static void main(String[] args) {
		//인스턴스 변수는 객체를 생성해야 사용할 수 있으나
		//static 변수와 static 메서드는 호출하면 바로 사용 가능
		System.out.println(StaticMethod.getString());
	}
}




