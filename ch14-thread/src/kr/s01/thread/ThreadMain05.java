package kr.s01.thread;

class MyRunnableTwo implements Runnable{
	@Override
	public void run() {
		System.out.println("run");
		first();
	}
	public void first() {
		System.out.println("first");
		second();
	}
	public void second() {
		System.out.println("second");
	}
}
public class ThreadMain05 {
	public static void main(String[] args) {
		System.out.println(
				Thread.currentThread().getName() + " start");
		
		MyRunnableTwo mt = new MyRunnableTwo();
		//쓰레드 생성
		Thread myThread = new Thread(mt);
		myThread.start();//MyRunnableTwo의 run 메서드 실행
		
		//join() : join()메서드를 호출한 쓰레드가 종료할 때까지
		//현재의 쓰레드는 기다리게 함.
		try {
			myThread.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName() + " end");
		
	}
}




