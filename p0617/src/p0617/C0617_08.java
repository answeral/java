package p0617;

import java.util.Scanner;

public class C0617_08 {

	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("문자를 입력하세요.>>");
//		String str = scan.nextLine();//next()띄어쓰기 전까지만
//		System.out.println("입력한 문자의 길이 : "+str.length());
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자를 입력하세요 >>");
//		int x  = scan.nextInt();
//		int absx = x>=10?x:-x;
//		System.out.println(absx);

		//숫자를 입력받아 양수 0 ,음수입니다. 라고 출력
//		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자를 입력하세요.>>");
//		int input = scan.nextInt();
////		if (input >=0) {
////			System.out.println("양수 또는 0입니다");
////		}else {
////			System.out.println("음수입니다");
////		}
//		String str = input>0?"양수입니다":(input<0?"음수입니다":"0입니다");
//		System.out.println(str);
//		
		
		Scanner scan = new Scanner(System.in);
		
		int a = 10;
		if (a>0) {
			System.out.println("양수입니다");
		}else if (a==0) {
			System.out.println("0입니다");
		}else {
			System.out.println("음수입니다");
		}
		
//		System.out.println(); 한 줄 일때는 중괄호 생략가능, 한줄로 쓰기 가능, 두 줄은 불가능
		if(a>0) 
			System.out.println("앙수입니다.");
		else if (a==0) 
			System.out.println("0입니다");
		else 
			System.out.println("음수입니다");
		
		
		
	}//main

}//class
