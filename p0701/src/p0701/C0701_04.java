package p0701;

public class C0701_04 {

	public static void main(String[] args) {
		// 프로세스: 실행중인 프로그램 자원과 쓰레드로 구성
		// 쓰레드 - 싱글, 멀티(호출하는 거는 가능) :프로세스 내에서 실제 작업 수행
		// 쓰레드 구현 : Thread클래스를 상속, Runnable인터페이스 구현 
		
		
		// 싱글쓰레드 : 1->2로 처리 : 대부분사용 , 멀티는 게임등에서 사용
		//1번쓰레드 
		for(int i=0; i<300;i++) {
			System.out.println(i+" : "+"-");
		}
		
		//2번쓰레드
		for(int i=0; i<300;i++) {
			System.out.println(i+" : "+"|");
		}
		
//		int max(int a, int b){//인스턴스 메소드
//			return a>b?a:b
//		}
		
		//객체 선언 후 참조변수명.메소드명
//		C0701_04 c = new C0701_04();
//		int n = c.max(20,10);
//		System.out.println(n);
//		
		
		
		
		
		
		
		
		
		
		
	}//main

}//class
