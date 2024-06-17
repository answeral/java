package p0617;

import java.util.Scanner;

public class C0617_10 {

	public static void main(String[] args) {
		//숫자를 입력받아, 60점이상이면 합격, 60점미만이면 불합격을 출력하시오.
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력해주세요.>>");
		int input = scan. nextInt();
		//90점이상 이면 A, 80점이상이면 B, 70점이상이면 C, 60점이상이면 D, 그 외 F
		if (input>=90) {
			System.out.println("A");
		}else if (input>=80) {
			System.out.println("B");
		}else if (input>=70) {
			System.out.println("C");
		}else if (input>=60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
		
		
		//		if (input >=60) {
//			System.out.println("합격입니다");
//		}else {
//			System.out.println("불합격입니다.");
//		}

		
		
		
		
		
	}

}
