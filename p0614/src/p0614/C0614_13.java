package p0614;

import java.util.Scanner;

public class C0614_13 {

	public static void main(String[] args) {
//		float pi = 3.141598f;
//		float shortPi = (int)(pi*1000)/1000f; //같은 값을 곱하고, 나누기
//		System.out.println(shortPi);
		
		//입력한 숫자를 소수점 2자리 절사하기
		Scanner scan = new Scanner(System.in);
		System.out.println("소수점 3자리 이상을 포함한 숫자를 입력해주세요");
		double input = scan.nextDouble();
//		double s_input = (int)(input*100)/100d; //절사 floor()
//		double s_input = Math.floor(input*100)/100d; //버림 floor()
//		double s_input = Math.round(input*100)/100d; //반올림 round()
		double s_input = Math.ceil(input*100)/100d; //올림 ceil()
		System.out.println(s_input);
		
		
		
	}

}
