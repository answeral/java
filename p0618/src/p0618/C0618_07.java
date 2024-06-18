package p0618;

import java.util.Arrays;
import java.util.Scanner;

public class C0618_07 {

	public static void main(String[] args) {
		//로또 번호 45개 중 6개
				//45개의 ball배열 생성
				//1-45까지 숫자를 입력
				//myArr배열을 만들어서, 1-45까지 6개의 숫자를 입력받아 출력
				int[] ball = new int[45];
				for (int i=0; i<ball.length; i++) {
					ball[i] = i+1;
				}
				//랜덤으로 섞기
				int no =0;//랜덤번호
				int t_value = 0;//값을 저장
				
				for (int i=0; i<300; i++) {
					no = (int)(Math.random()*45);//0-44
					t_value = ball[0];
					ball[0] = ball[no];
					ball[no]= t_value;
					
				}
				
				//로또번호입력
				Scanner scan = new Scanner(System.in);
				int[] myArr = new int[6];
				for (int i =0; i<myArr.length; i++) {
					System.out.printf("%d번째 숫자를 입력하세요.>>", i+1);
					myArr[i] = scan.nextInt();
				}
				
				for (int i=0; i<myArr.length; i++) {
					System.out.print(myArr[i]+ " " );
				}
				System.out.println();
				
				//로또 번호 출력
				System.out.printf("로또 번호 : ");
				for (int i=0; i<6; i++) {
					System.out.print(ball[i]+" ");
				}
				System.out.println();
				
				
				
//				System.out.println(Arrays.toString(ball));
//				//10개짜리 배열을 생성하고 숫자를 입력받아, 3,4번째 숫자만 출력하기
//				int[] num = new int[10];
//				for (int i=0; i<10; i++ ) {
//					System.out.println("숫자를 입력하세요.>>");
//					num[i] = scan.nextInt();
//					
//				}//for
//				System.out.printf("3,4번째 입력한 숫자 %d,%d",num[2],num[3]);

	}

}
