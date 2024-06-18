package p0618;

import java.util.Scanner;

public class C0618_02 {

	public static void main(String[] args) {
		//if 문으로 변경
		Scanner scan = new Scanner(System.in);
		System.out.println("주민등록번호를 입력하세요.(ex.990802-1111111)>>");
		String input = scan.nextLine();
		String year = input.substring(0,2);
		String flag = input.substring(7,8);
		
		int age = 0;
		if (flag.equals("1")||flag.equals("2")) {
			age = 2024 - Integer.parseInt("19"+year);
		}else if (flag.equals("3")||flag.equals("4")) {
			age = 2024 - Integer.parseInt("20"+year);
		}
		System.out.println("당신의 나이 : "+age);
	}//main

}//class
