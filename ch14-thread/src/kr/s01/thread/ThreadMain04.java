package kr.s01.thread;

public class ThreadMain04 implements Runnable{
	//Runnable의 run메서드 구현
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(
			    "스레드 이름 : " + Thread.currentThread().getName());
		}
	}
	public static void main(String[] args) {
		ThreadMain04 tm = new ThreadMain04();
		Thread t1 = new Thread(tm,"첫번째***");
		t1.start();//ThreadMain04 객체의 run메서드 호출
		Thread t2 = new Thread(tm,"두번째~~~");
		t2.start();//ThreadMain04 객체의 run메서드 호출
		Thread t3 = new Thread(tm,"세번째===");
		t3.start();//ThreadMain04 객체의 run메서드 호출
	}
}



