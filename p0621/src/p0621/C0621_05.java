package p0621;

import java.util.Scanner;

public class C0621_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//입력한 두 수의 더하기, 빼기, 곱하기, 나누기 계산결과 값을 출력
		System.out.println("첫번째 수를 입력해주세요.>>");
		int a = scan.nextInt();
		System.out.println("두번째 수를 입력해주세요.>>");
		int b = scan.nextInt();
		
		Cal2 c = new Cal2();
		int h = c.plus(a,b);
		int n = c.minus(a, b);
		int m = c.multi(a, b);
		int g = c.divide(a, b);

		System.out.printf("더하기 : %d, 빼기 : %d, 곱하기 : %d, 나누기 : %d",h,n,m,g);
		

	}//class
	
	//메소드 선언
	C0621_05 c = new C0621_05();
	int plus(int a, int b) {
		return a+b;
	}
	
	int minus(int a, int b) {
		return a-b;
	}
	
	int multi(int a, int b) {
		return a*b;
	}
	
	int divide(int a, int b) {
		return a/b;
	}
	
}//main
