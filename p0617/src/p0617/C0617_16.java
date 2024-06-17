package p0617;

import java.util.Scanner;

public class C0617_16 {

	public static void main(String[] args) {
//			int sum = 0;
		//for문
//		for (int i=1;i<=10;i++) {
//			sum = sum + i; 
//			System.out.println("i :"+i);
//			System.out.println("sum :"+sum);
//		}
//		System.out.println("최종 sum :"+sum);

		//1-100까지 홀수만 더해서 최종값 출력
		//1-100까지 숫자를 더해서 출력
//		int sum = 0;
//		for (int i=1; i<=100; i++){
//			if (i%2!=0) {
//				sum += i;
//			System.out.println("i :"+i);
//			System.out.println("sum :"+sum);
//			}
//		}
//		
//		System.out.println("최종 sum :"+sum);
		
		//10번 입력 받을 때 마다 합계를 출력하시오.
		//5->5, 10->5
		
//		int sum2 = 0;
//		Scanner scan = new Scanner(System.in);
//		for (int i=1; i<=10;i++) {
//			System.out.println("숫자를 입력해주세요");
//			int input2 = scan.nextInt();
//			sum2 += input2;
//			System.out.println("i :"+i);
//			System.out.println("sum :"+sum2);
//		}
//		System.out.println("최종 sum :"+sum2);
		
		//구구단 중첩 for문 사용
		
//		for (int i=2; i<=9; i++) {
//			System.out.printf("[%d단]\n",i);
//			for (int j=1; j<=9; j++)
////				System.out.println(i+"*"+j+"="+i*j);
//				System.out.printf("%d*%d=%d \n",i,j,i*j);
//			}
//			System.out.println();
		
		//1-100까지 합을 구하는데, sum값이 150이 넘었을 때 i값과 sum값을 출력해라
//		int sum = 0;
//		int i = 0;
//		for(i=1; i<=100; i++) {
//			sum += i;
//			if (sum >=150)break;
//		}
//		System.out.println("i 값 :"+i);
//		System.out.println("sum 값 :"+sum);
	
		//1-10까지 합을 출력
//		int sum = 0;
//		int i = 0;
//		for (i=1;i<=10; i++) {
//			sum += i;
//		}
//		System.out.println((i-1)+"까지의 합"+sum);
		//구구단 출력 1,3,5,7,9단 홀수단을 출력하시오.
		
		for (int i=2; i<10; i++) {
			if (i == 2) continue; 
				System.out.printf("[%d단] \n",i);
			if (i%2 == 1) {
				for (int j=1; j<10; j++)
				System.out.printf("%d*%d=%d \n",i,j,i*j);
			}
		}
		
		
			
		
		
}//main
}//class