package kr.s01.a;

class Tv{
	//�������(�Ӽ�)
	boolean power;//��������(on/off)
	int channel;//ä��
	
	//����޼���(����)
	public void isPower() {
		power = !power;//Tv�� ���� ������ ���� ���������� ��
	}
	public void channelUp() {//ä���� ���̴� ���
		++channel;
	}
	public void channelDown() {//ä���� ���ߴ� ���
		--channel;
	}
}

public class TvMain {
	public static void main(String[] args) {
		//��ü ���� �� ����
		Tv t = new Tv();
		//Tv�� ����
		t.isPower();
		System.out.println("Tv ���� ���� : " + t.power);
		System.out.println("���� ä�� : " + t.channel);
		System.out.println("--------------");
		//ä�� ����
		t.channel = 7;
		System.out.println("ù��° ����� ä�� : " + t.channel);
		System.out.println("--------------");
		//ä�� ����
		t.channelDown();
		System.out.println("�ι�° ����� ä�� : " + t.channel);
		System.out.println("--------------");
		//Tv ����
		t.isPower();
		System.out.println("Tv ���� ���� : " + t.power);
	}
}










