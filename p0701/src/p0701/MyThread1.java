package p0701;

public class MyThread1 extends Thread{//상속받으면 멀티쓰레드로 구현
	
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.println(i+" : "+"-");
		}
		
	}

}
