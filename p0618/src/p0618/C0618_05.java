package p0618;

import java.util.Scanner;

public class C0618_05 {

	public static void main(String[] args) {
		int [] score = new int[5];
//		int score[] =new int[5];
		score[0] = 1;
		score[1] = 2;
		score[2] = 3;
		score[3] = 4;
		score[4] = 5;
		
//		System.out.println(score[3]);
		//배열에 입력하는 방법
//		int i=0;
//		for (i=0; i<5; i++) {
//			score[i] = i+1;
//			System.out.println(score[i]);
//		}
		
		
//		//배열에 출력하는 방법
		for (int i=0; i<5; i++) {
			System.out.println(score[i]);
		}
		System.out.println(score); //주소값이 나타남
//		System.out.println(Arrays.toString(score));
		Scanner scan = new Scanner(System.in);
//		
//		for(int i=0; i<5; i++) {
//			System.out.println("숫자를 입력하세요.>>");
//			score[i] = scan.nextInt();
//		}
//		System.out.println(score[3]);
		// 5개 숫자를 모두 입력받은 후, 출력하기 
//		Scanner scan = new Scanner(System.in);
//		
//		loop1 : for (int i=0; i<5; i++) {
//			System.out.println("숫자를 입력해주세요.>>");
//			String num = scan.nextLine();
//			if (str.length(num) == 3) {
//				
//				System.out.println(num);
//			}
//	}//for
////		System.out.println("입력한 문자의 길이 : "+str.length());		
		
}
}