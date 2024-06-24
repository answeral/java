package p0624;

import java.util.Scanner;

public class C0624_05 {

	public static void main(String[] args) {
		// 두 수와 사칙연산을 받을 떄 계산 +, -,*,/
		
		Scanner scan = new Scanner(System.in);
		
//		for(int i=0;i<4;i++) {
//			System.out.println("숫자를 입력하세요");
//			
//			
//			
//			
//		}
		
//		System.out.println("첫번쨰 숫자를 입력하세요");
//		int x = scan.nextInt();
//		System.out.println("두번째 숫자를 입력하세요");
//		int x2 = scan.nextInt();
		int arr[] = new int[2];
		for(int i=0; i<arr.length; i++) {
			System.out.println("숫자를 입력하세요");
			arr[i] = scan.nextInt();
		}
		System.out.println("사칙연산을 입력하세요");
		String str = scan.next();
		
		//인스턴스 메소드 - 객체 선언 후 참조변수.메소드명
		Calculate c = new Calculate();
//		int result = c.cal(x,x2,str);
//		int result = c.cal(arr,str);
		
		
		
		
		
		
		
//		if(str == "+") {
//			System.out.println("더하기 : "+(x+x2));
//		}else if (str == "-") {
//			System.out.println("빼기 :"+(x-x2));
//		}else if (str == "*") {
//			System.out.println("곱하기 :"+(x*x2));
//		}else if (str == "/") {
//			System.out.println("나누기 :"+(x/x2));
//		}
//		int result = 0;
//		switch(str) {
//		case "+":
//			result = x+x2;
//			break;
//		
//		
//		case "-":
//			result = x-x2;
//			break;
//		
//		case "*":
//			result = x*x2;
//			break;
//			
//			
//		case "/":
//			result = x/x2;
//			break;
//		}
		
		
		

	}//main

}//class
