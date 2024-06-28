package p0628;

import java.util.Scanner;

public class C0628_03 {

	public static void main(String[] args) {
		//문자열을 입력받아, 3번째의 문자를 출력하시오.
		//문자열이 3칸미만으로 입력이 되면, 다시 입력을 할 수 있도록 하시오.
		//무한반복 - x가 입력되면, 프로그램종료
		
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("문자열을 입력하세요.>>(x.종료)");
			String s = scan.nextLine();
			if(s.equalsIgnoreCase("x")) {
				System.out.println("프로그램을 종료합니다");
				break;
			}else {
				System.out.println("3번째 문자 : "+s.charAt(3));
			}
			
			if(s.length()<3) {
				System.out.println("문자열 길이가 너무 짧습니다. 다시 입력하세요.");
				continue;
			}
			
			
		}
		

	}//main

}//class
