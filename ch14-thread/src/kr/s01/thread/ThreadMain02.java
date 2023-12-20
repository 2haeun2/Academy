package kr.s01.thread;

public class ThreadMain02 implements Runnable{
	//Runnable 인터페이스의 추상메서드를 구현
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.printf(
				"스레드 이름 %s, ", Thread.currentThread().getName());
			System.out.printf("temp value : %d%n", i);
		}
	}
	public static void main(String[] args) {
		ThreadMain02 tm = new ThreadMain02();
		//쓰레드 객체 생성
		                  //타겟객체,쓰레드의 이름
		Thread t = new Thread(tm,"첫번째");
		t.start(); //지정한 타겟객체의 run()메서드 호출
	}
}



