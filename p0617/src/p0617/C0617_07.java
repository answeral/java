package p0617;

import java.util.Scanner;

public class C0617_07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//문자열을 입력받아서, 숫자이면 정수타입으로 변경해서 두 수를 더하는 프로그램을 구현하시오
		System.out.println("첫번째 문자나 숫자를 입력해주세요.");
		String input1 = scan.nextLine();
		char ch1 = input1.charAt(0);
		
		System.out.println("두번째 문자나 숫자를 입력해주세요");
		String input2 = scan.nextLine();
		char ch2 = input2.charAt(0);
		
		if ((ch1 >='0' && ch1 <='9') && (ch2 >='0' && ch2 <='9')) {
			int num1 = ch1 - '0'; //문자숫자를 정수형으로 변경하는 방법 :'0' 빼주기
//			int n = Integer.parseInt(str);//문자열을 정수형으로 변경
			int num2 = ch2 - '0';
			System.out.println("두 수의 합 : "+(num1+num2));
		}else {
			System.out.printf("%c , %c \n", ch1, ch2);
		}
	}

}
