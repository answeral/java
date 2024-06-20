package p0620;

public class C0620_06 {

	public static void main(String[] args) {
		//클래스 - 데이터와 함수의 결합
		
		int a =10;
		int b = 5;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a+b+6);
		System.out.println(a-b-6);
		System.out.println(a*b*6);
		System.out.println(a/b/2);
		
		
		
		
		int num = 0;
		int num2 =10;
		
		num2 = num;
		System.out.println(num2);
		
		
		
		//Class는 객체선언
		TV  t1 = new TV();
		TV t2 = new TV();
		System.out.println("t2채녈 :"+t2.channel);
		
		t2=t1; //주소값만 복사함. 얕은 복사
		t1.channel = 7;
		System.out.println("t2채녈 :"+t2.channel);
		
		
		
		
		
//		TV t = new TV();
//		// 참조변수명.변수명 값을 넣을 수 있음.
//		
//		
		
//		t.channel = 7;
//		t.channelUp();
//		
//		System.out.println("현재 채널 : "+t.channel); //8
//		t.channelDown(); //7
//		t.channelDown(); //6
//		System.out.println("현재 채널2 : "+t.channel);
		
		
		
		
		
		
		
		
		
		
		
	}

}
