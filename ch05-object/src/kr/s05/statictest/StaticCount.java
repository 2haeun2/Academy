package kr.s05.statictest;

public class StaticCount {
	int c; //�ν��Ͻ� ����
	static int count; //static(Ŭ����) ����
	
	//������
	public StaticCount() {
		c++;
		count++;
	}
}
