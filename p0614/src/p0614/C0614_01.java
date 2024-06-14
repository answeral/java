package p0614;

public class C0614_01 {

	public static void main(String[] args) {
		
		//논리형 - 소문자로 시작
		boolean bol = true;
		boolean bol2 = false;
		
		//문자형
		char ch1 = 'a';
//		char ch2 = 'xx'; // 에러, char 는 문자 1개만 저장
		char ch3 = ' '; //빈공백은 저장 가능, 사이 한 칸을 띄어야함
//		char ch4 =''; // 에러
		
		
		// 정수형- byte, short, int, long : L접미사 붙여야함
		byte a = 1; //~127까지 입력가능
		short b = 2;
//		int c = 2147483647;//~2147483647까지 입력가능
		long d = 2147483648L;

		//실수형 - float : F를 붙여야 함,double
		float e = 3.14F; // 소수점 8자리 ,  접미사 F를 무조건 붙여야 함.
		double f = 3.14; // 소수점 16자리 , 접미사D 생략가능
		
		//정수형  - byte,short,int,long 타입
//				int num = 10;
//				System.out.println(num);
				
		
	}//main

}//class
