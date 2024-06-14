package p0614;

import java.util.Scanner;

public class C0614_14 {

	public static void main(String[] args) {
//		int a = 10;
//		if (a == 10) {
//			System.out.println("10이랑 같다");
//		}else {
//			System.out.println("10이랑 같지 않다");
//		}
		
//		if (a>0) {
//			System.out.println("양수");
//		}else {
//			System.out.println("음수");
//		}//if

		//입력한 숫자가 양수인지 음수인지 출력하시오
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요>>");
		int num = scan.nextInt();
		if (num>= 0) {
			System.out.println("양수입니다");
		}else {
			System.out.println("음수입니다");
		}
				
		
		
	}//main

}//class
