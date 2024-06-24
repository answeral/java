package p0624;

import java.util.Scanner;

public class C0624_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//두 수를 입력받아 두 수를 더한 값을 출력하시오.
//		System.out.println("첫번째 숫자를 입력하세요.>>");
//		int n = scan.nextInt();
//		System.out.println("두번째 숫자를 입력하세요.>>");
//		int n2 = scan.nextInt();
//		
//		System.out.println("+:"+(n+n2));

		
		
		//세 개의 수를 입력받아 세 개의 수를 더한 값을 출력 // 배열을 이용
		int[] num = new int[3];
		for(int i=0;i<3;i++){
			System.out.println((i+1)+"번째 숫자를 입력하세요.>>");
			num[i] = scan.nextInt();
			
	}
		//객체 선언 후 참조변수명.메소드명
		Cal c =new Cal();
		int result = c.add(num[0],num[1],num[2]);
		
		int sum = c.add2(num);

		System.out.println("합계 : "+result);
		
//		int sum = 0;
//		for(int i=0;i<3;i++) {
//			System.out.println((i+1)+"번째 숫자를 입력하세요.>>");
//			arr[i] = scan.nextInt();
//			sum += arr[i];
//		}
//		System.out.println("더하기 : "+(arr[0]+arr[1]+arr[2]));
				

	}

}
