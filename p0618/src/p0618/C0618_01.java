package p0618;

import java.util.Scanner;

public class C0618_01 {

	public static void main(String[] args) {
		//주민등록번호 앞자리를 입력받아, 봄, 여름, 가을 , 겨울인지 출력
		//990101-2222222
		//12-02:겨유르 03-05:봄, 06-08여름, 09-11겨울
		Scanner scan = new Scanner(System.in);
		System.out.println("주민등록번호를 입력하세요.(ex.990802-1111111)>>");
		//1,2 1900 3,4 2000 ,2024-1988 = 36
		//3,4 2024-2000
		String input = scan.nextLine();
		String age1 = input.substring(0,2);
		String age2 = input.substring(7,8);
		int age = 0;
		switch (age2) {
		case "1": case "2": 
			age = 2024 - Integer.parseInt("19"+age1);
			break;
			
		case "3": case "4":
			age = 2024 - Integer.parseInt("20"+age1);
			break;
		
		}
		System.out.println("당신의 나이 : "+age);
		
		
		
		
		
		
		
		// switch 문을 사용하기
//		String bitrhM = input.substring(2,4);
		
//		switch(bitrhM) {
//		case "12": case "01": case"02":
//			System.out.println("겨울입니다");
//			break;
//		case "03": case "04": case "05":
//			System.out.println("봄입니다");
//			break;
//		case "06": case "07": case "08":
//			System.out.println("여름입니다");
//			break;
//		case "09": case "10": case "11":
//			System.out.println("가을입니다");
//			break;
//		}
		
		
		
		
		
		
		
		
		
//		String str = "990101";
//		String birthM = str.substring(2,4);//substring():
//		System.out.println(birthM);

	}//main

}//class
