package kr.s01.enumtest;

//������ ���
enum Lesson{
	JAVA,JSP,SERVLET
}

public class EnumMain02 {
	public static void main(String[] args) {
		System.out.println(Lesson.JAVA);
		System.out.println(Lesson.JSP);
		System.out.println(Lesson.SERVLET);
		System.out.println("----------------");
		//���� ��ü�� ���ڿ� ��ȯ
		System.out.println(Lesson.JAVA.name());
		System.out.println(Lesson.JSP.name());
		System.out.println(Lesson.SERVLET.name());
		System.out.println("----------------");
		//���� ��ü�� ����(0���� ����) ��ȯ
		System.out.println(Lesson.JAVA.ordinal());
		System.out.println(Lesson.JSP.ordinal());
		System.out.println(Lesson.SERVLET.ordinal());
	}
}




