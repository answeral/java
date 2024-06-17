package p0617;

import java.util.Scanner;

public class C0617_15 {

	public static void main(String[] args) {
		Math.random(); // 0~0.999999.......: 0 <= x && x < 1
		System.out.println(Math.random()); //15자리까지 나옴 double
		
		Math.round(0); //int 소수점x
		Math.ceil(0); //double 소수점o
		Math.max(10.5,5);
		
		int n = (int)(Math.random()*10);
		System.out.println(n);
		//1-10까지 랜덤숫자를 출력
		int num = (int)(Math.random()*10)+1;
		System.out.println(num);
		
		int num2 =(int)(Math.random()*100)+1;
		System.out.println(num2);
		
		int num3 = (int)(Math.random()*5);
		System.out.println(num3);
		
		int num4 = (int)(Math.random()*20);
		System.out.println(num4);

		//2부터 10까지
		int n2 = (int)(Math.random()*9)+2; 
		
		//1-100까지 숫자를 랜덤으로 생성해서 출력
		int n3 = (int)(Math.random()*100)+1;
		System.out.println(n3);
		
		//1부터 3까지
		int n4 = (int)(Math.random()*3)+1;
		System.out.println(n4);
		
		//1부터 45까지
		int n5 = (int)(Math.random()*45)+1;
		System.out.println(n5);
		
		//1-10까지 랜덤숫자를 생성해서 숫자 1개를 입력받아 정답인지 아닌지 출력하시오
		//같으면 당첨, 다르면 꽝
		int n6 = (int)(Math.random()*10)+1;
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요.>>");
		int input = scan.nextInt();
		
		if (n6 == input) {
			System.out.println("당첨");
		}else {
			System.out.println("꽝");
		}
		
		
		
	}

}
