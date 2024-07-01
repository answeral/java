package p0701;

public class C0701_05 {

	public static void main(String[] args) {
		
		//2개의 쓰레드가 알아서 동시에 실행
		MyThread1 th1 = new MyThread1();
		MyThread2 th2 = new MyThread2();
		
		th1.start(); //Thread를 상속받아서 안에 있는 start사용할 수 있음
		th2.start();
		

	}

}
