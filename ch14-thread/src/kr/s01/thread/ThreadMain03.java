package kr.s01.thread;

public class ThreadMain03 implements Runnable{
	//Runnable�� run�޼��� ����
	@Override
	public void run() {
		System.out.println(
		 "run �޼���, ������ �̸� : " + Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		System.out.println("main �޼���, ������ �̸� : " 
	                              + Thread.currentThread().getName());
		ThreadMain03 tm = new ThreadMain03();
		//������ ����
		Thread t = new Thread(tm);//Ÿ�ٰ�ü ����
		t.start();//ThreadMain03 ��ü�� run()�޼��� ȣ��
		
	}
}



