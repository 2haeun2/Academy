package kr.s01.enumtest;

//열거형 상수
enum Lesson{
	JAVA,JSP,SERVLET
}

public class EnumMain02 {
	public static void main(String[] args) {
		System.out.println(Lesson.JAVA);
		System.out.println(Lesson.JSP);
		System.out.println(Lesson.SERVLET);
		System.out.println("----------------");
		//열거 객체의 문자열 반환
		System.out.println(Lesson.JAVA.name());
		System.out.println(Lesson.JSP.name());
		System.out.println(Lesson.SERVLET.name());
		System.out.println("----------------");
		//열거 객체의 순번(0부터 시작) 반환
		System.out.println(Lesson.JAVA.ordinal());
		System.out.println(Lesson.JSP.ordinal());
		System.out.println(Lesson.SERVLET.ordinal());
	}
}




