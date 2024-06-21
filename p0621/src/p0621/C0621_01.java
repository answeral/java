package p0621;

public class C0621_01 {

	static int j = 0;
	//인스턴스변수
	int i = 0; 
	
	void add() {
		int i=0;
	}
	
	void add2() {
		int i=0;
	}
	
	
	
	public static void main(String[] args) {
		
		//객체선언
		C0621_01 c = new C0621_01();
		c.i = 10;
		
		C0621_01.j = 11; 
		j = 11;      // 클래스변수 : 같은 클래스 내에 있으면 클래스명을 생략가능 
		int j = 100; // 지역변수: 메소드 내에 있으면 지역변수 먼저 가져옴. 
		System.out.println(j);
		
//		int i =0; //같은 변수 사용 불가능
		for (int i =0; i<5; i++) {
			System.out.println(i);
		}
		
		for(int i=0; i<6; i++) {//위의 for문과는 다른 개념이라서 int i=0;다시 선언해도 상관X
			System.out.println(i);
		}
		
		Time tt = new Time(); //객체선언 , 현재 하나만 사용
		
		Time[] t = new Time[3]; //배열선언 , 세 개 사용 가능
		
		t[0] = new Time(); // 객체선언 
		t[1] = new Time(); // 객체선언
		t[2] = new Time(); // 객체선언
		
		Time.day = 21;	// 클래스명.변수명 사용
		t[0].hour = 10; // 참조변수명.변수명
		t[0].minute = 10;
		t[0].second = 10;
		
		Time.day = 25;
		t[1].hour = 20;
		t[1].minute = 11;
		t[1].second = 11;
		
		System.out.printf("일시 : %d일 %d시 %d분 %d초 \n",Time.day,t[0].hour,t[0].minute,t[0].second);
		System.out.printf("일시 : %d일 %d시 %d분 %d초 \n",Time.day,t[1].hour,t[1].minute,t[1].second);
		
		
		

	}//main

}//class
