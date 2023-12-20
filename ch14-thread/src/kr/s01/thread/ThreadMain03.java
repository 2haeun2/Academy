package kr.s01.thread;

public class ThreadMain03 implements Runnable{
	//Runnable의 run메서드 구현
	@Override
	public void run() {
		System.out.println(
		 "run 메서드, 스레드 이름 : " + Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		System.out.println("main 메서드, 스레드 이름 : " 
	                              + Thread.currentThread().getName());
		ThreadMain03 tm = new ThreadMain03();
		//쓰레드 생성
		Thread t = new Thread(tm);//타겟객체 지정
		t.start();//ThreadMain03 객체의 run()메서드 호출
		
	}
}



