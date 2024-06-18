package p0618;

import java.util.Arrays;
import java.util.Scanner;

public class C0618_08 {

	public static void main(String[] args) {
		// 로또번호 생성, 섞기, 6개의 숫자 출력
		// 1-45 ->6개 뽑아야함.
		int[] lotto = new int[45];
		for (int i=0; i<lotto.length; i++) {
			lotto[i] = i+1;
		}//lotto 번호 생성
		
		int no = 0;//랜덤번호 1-44
		int t_value =0;//임시저장
		
		for (int i=0; i<300; i++) {
			no = (int)(Math.random()*45); //0-44
			t_value = lotto[0];
			lotto[0]= lotto[no];//
			lotto[no] = t_value;
			
		}//lotto랜덤섞기
		
		//
		//5.로또 번호 출력
		
		for (int i=0; i<6; i++) {
			System.out.print("당첨번호"+lotto[i]+" ");
			
		}//6개 숫자 출력
		
		//
		
		Scanner scan = new Scanner(System.in);
		int[] myArr = new int[6];
		int num = 0;
		int n = 0;
		while(n<6){
			System.out.printf("%d번째 숫자를 입력하세요.>>",n+1);
			num= scan.nextInt();
			if(num<1 || num>45) {
				System.out.println("1-45까지의 숫자만 입력하세요.");
				continue;
			}
			myArr[n] = num;
			n++;
		}
		System.out.println("입력한 번호:"+Arrays.toString(myArr));

		//6. 로또 번호와 일치하는 번호
		int count = 0;
		int[] corr = new int[6];
		for (int i=0;i<6; i++) {
			for (int j=0; j<6; j++) {
				if(myArr[i]==lotto[j]) {
					corr[count] = lotto[j];
					count++;
					break;
				}//if
			}//for j
		}//for i
		
		System.out.println("로또 당첨개수 : "+count);
		
	 //당첨된 번호가 출력되도록 구현
		System.out.println("당첨된 번호 :");
		for(int i=0;i<count;i++) {
			System.out.println(corr[i]+" ");
			if (count ==0) {
				System.out.println("당첨번호 없음");
			}
		}
		//당첨금액 : 6개-100억 5개 1억 4개 1백만원 3개 만원
		switch(count) {
		case 6: System.out.println("6개 당첨 : 100억"); break;
		case 5: System.out.println("5개 당첨 : 1억");break;
		case 4: System.out.println("4개 당첨 : 1백만원");break;
		case 3: System.out.println("3개 당첨 : 1만원");break;
		default:System.out.println("당첨 금액 없음"); break;
		}
		
		
	}//main

}//class
