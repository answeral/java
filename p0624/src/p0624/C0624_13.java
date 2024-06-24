package p0624;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class C0624_13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Stu_score[] sc = new Stu_score[10];
		String[] title = {"학번","이름","국어","영어","수학","합계","평균","등수"};
		int s_count = 0;//입력된 학생수
		
		while(true) {
			System.out.println(" [ 학생성적 프로그램 ] ");
			System.out.println("-------------------------");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적수정");
			System.out.println("3. 학생검색");
			System.out.println("4. 학생검색");
			System.out.println("5. 학생검색");
			System.out.println("0. 프로그램 종료");
			System.out.println("-------------------------");
			System.out.println("원하는 번호를 입력하세요.>>");
			int choice = scan.nextInt();
			
			switch(choice) {
			case 1:
				while(true) {//학생성적입력
					while(true) {
						System.out.println("[ 학생 성적 입력]");
						Date date = new Date();
						SimpleDateFormat sdf = new SimpleDateFormat();
						String stuNo = "S"+sdf.format(date)+String.format("03d",s_count+1);
						//객체 선언
						sc[s_count] = new Stu_score();
						//학변저장 
						sc[s_count].stuNo = stuNo;
					}
				}
				break;
				
			case 2:
				break;
				
			case 3:
				break;
				
			case 4:
				break;
				
			case 5:
				break;
			}
			
		}
	}//main

}//class
