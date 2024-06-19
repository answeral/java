package p0619;

import java.util.Scanner;

public class C0619_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 로또 프로그램 구현
		// 1-45개 배열 랜덤으로 섞어, 그 가운데 6개를 가져오면 로또번호
		// 입력한 입력번호 6개
		// 당첨번호개수 담는 배열, 카운트변수
		// 모든 배열 출력
		
//		System.out.println(ball); //주소값 출력
//		ball[0] =1;
//		System.out.println(ball[0]);//1출력
		
		// 1.ball 배열 1-45까지 번호입력
		int[] ball = new int[45]; //0-44까지 주소
		for(int i=0; i<45;i++) {
			ball[i]=i+1; //1-45
		}//1
		
		// 2. ball배열 섞기
		int no = 0; // 0번째 배열과 바꿀 배열번호
		int t_value = 0; //임시적으로 저장하는 공간
		
		for (int i=0; i<300; i++) {
			no = (int)(Math.random()*45);//0-44까지 번호
			t_value = ball[0];
			ball[0] = ball[no]; // 랜덤값을 0번째방에 입력
			ball[no] = t_value;
		}//2
		
		// 3.my_ball입력 -6개
		// 번호 입력
		int[] my_ball = new int[6];
		for (int i=0; i<6; i++) {
			System.out.printf("%d번째 로또 번호를 입력해주세요.>> ",i+1);
			my_ball[i] = scan.nextInt();
			
		}//3
		System.out.println("[로또번호 당첨 현황]");
		System.out.println("-------------------------");
		
		//4. myball출력
		System.out.print("입력한 번호 : ");
		for(int i=0; i<6;i++) {
			System.out.printf("%4d ",my_ball[i]);
		}//4
		System.out.println();
		
		// 5. ball배열 출력
		System.out.print("로또번호 :");
		for(int i=0; i<6;i++) {
			System.out.printf("%4d ",ball[i]);
		}//5
		System.out.println();
		
		//6. 맞은 개수  //7.당첨 번호 출력
		int[] lotto = new int[6];
		int count = 0;
		for(int i=0;i<6;i++) {
			for(int j =0; j<6; j++) {
				if(my_ball[i] == ball[j]) {
					lotto[count] = ball[j];
					count++;
					break;
			}
			}
		
		}//6
		System.out.println("맞은 개수 : "+count+"개");
 		for(int i=0; i<count; i++) {
 			System.out.println("당첨번호 : "+lotto[i]);
 		}
		
		if (count==0) {
			System.out.println("맞은 번호가 없습니다");
		}
		System.out.println();
		
		
		
		
		
		
		
		
		

		
	}//main

}//class
