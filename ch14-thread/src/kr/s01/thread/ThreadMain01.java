package kr.s01.thread;

public class ThreadMain01 extends Thread{

	public ThreadMain01(String threadname) {
		super(threadname);
	}

	//Thread�� run �޼��� ������
	@Override
	public void run() {
		//���� ����Ǵ� ������ ��ü�� ��ȯ
		Thread t = currentThread();
		System.out.println("���� ������ : " + t);

		for(int i=0;i<10;i++) {
			try {
				//�и�������
				sleep(1000);//������ �ð���ŭ ������ ����
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			//getName() : �������� �̸� ��ȯ
			System.out.printf(
					"������ �̸� : %s ,",currentThread().getName());
			System.out.printf("temp value : %d%n", i);
		}

	}

	public static void main(String[] args) {
		ThreadMain01 tm = new ThreadMain01("ù��°");
		tm.start();//start�޼��带 �����ϸ� run �޼��� ����
	}
}
