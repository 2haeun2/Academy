package kr.s01.thread;

public class ThreadMain02 implements Runnable{
	//Runnable �������̽��� �߻�޼��带 ����
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.printf(
				"������ �̸� %s, ", Thread.currentThread().getName());
			System.out.printf("temp value : %d%n", i);
		}
	}
	public static void main(String[] args) {
		ThreadMain02 tm = new ThreadMain02();
		//������ ��ü ����
		                  //Ÿ�ٰ�ü,�������� �̸�
		Thread t = new Thread(tm,"ù��°");
		t.start(); //������ Ÿ�ٰ�ü�� run()�޼��� ȣ��
	}
}



