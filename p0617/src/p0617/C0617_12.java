package p0617;

import java.util.Scanner;

public class C0617_12 {

	public static void main(String[] args) {
		// 점수를 입력받아, 90점이상 A,B,C,D,F를 출력할 수 있게 구현
		//90~92 A- 97~100 A+ 93-96 A
		//80-82 B- 87-100 B+ 83-86 B
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력해주세요.>>");
		int input = scan.nextInt();
		String score = "";
		
		if (input>=90) {
			score = "A";
			if(input>=97) {score = score+"+";}
			else if (input<=92) score = score+"-";}
		else if (input>=80) {
				score = "B";
			if(input>=87) {score = score+"+";}
			else if (input<=92) score = score+"-";}
			
		else if (input>=70) {
			score = "C";
			if(input>=77) {score = score+"+";}
			else if (input<=72) score = score+"-";
			}
		else if (input>=60) {
			score = "D";
			if(input>=67) {score = score+"+";}
			else if (input<=62) score = score+"-";
		}else {
			score ="F";
		}
		System.out.println("점수 : "+score);
	}

}
