package p0620;

import java.util.Scanner;

public class C0620_04 {

	public static void main(String[] args) {
		// 객체지향 -class(제품설계도 :1개)와 객체(제품:여러개)
		// 객체 = 인스턴스, 객체 - 속성 :변수 + 기능:매서드
		
		//클래스는 묶음.
		
		
		// 변수 선언
		Scanner scan = new Scanner(System.in);
		//타입 변수명 = 데이터
		int num1 = 0;
		
		String str = new String("aaa");
		//클래스를 만들어 객체선언하면 변수선언을 각각 하지 않아도됨.
		
		//클래스 타입 참조변수명 = new class 타입()
		TV tv1;          //객체를 다루기 위한 참조변수가 선언
		tv1 = new TV();  //객체생성 후, 생성된 객체의 주소를 참조변수에 저장시켜줌.
		System.out.println("tv1 : "+tv1);
		
		int[] num;        //배열을 다루기위한 참조변수가 선언
		num = new int[5]; //배열 생성 후, 생성된 배열의 주소를 참조변수에 저장시켜줌.
		System.out.println("num :"+num);
		
		TV t2 = new TV();//객체선언
		t2.color="black";
		t2.power = false;
		t2.channel = 10;
		t2.volume = 10;
		
		
		
		
		
//		String color ="white";
//		boolean power = false;
//		int channel = 0;
		//volume, size, .....
		
		while(true) {
			System.out.println("1.TV 켜기");
			System.out.println("2.TV 끄기 ");
			System.out.println("----------------------");
			System.out.println("TV 상태를 선택하세요.>>");
			int choice = scan.nextInt();
			
		}//while
		
		
		
		
	}//main

}//class
