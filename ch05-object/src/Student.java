public class Student {
	
	//�ʵ�
	String name;
	int age;
	
	public static void main(String[] args) {
		//��ü ����
		Student s;
		//��ü ����
		s = new Student();
		
		//��ü�� �ʵ��� �⺻���� ���
		System.out.println(s.name + ", " + s.age);
		System.out.println("---------------");
		
		//��ü�� �ʵ忡 ������ ����
		s.name = "ȫ�浿";
		s.age = 20;
		
		//��ü�� �ʵ忡 ����� ������ �б�
		System.out.println(s.name + ", " + s.age);
		
	}
}





