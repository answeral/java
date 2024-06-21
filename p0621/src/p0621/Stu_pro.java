package p0621;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Stu_pro {
	static Scanner scan = new Scanner(System.in);
	//화면부분
	int screen() {
		System.out.println("[ 학생성적 프로그램 ]");
		System.out.println("---------------------");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 성적수정");
		System.out.println("4. 학생검색");
		System.out.println("5. 등수처리");
		System.out.println("0. 프로그램 종료");
		System.out.println("---------------------");
		System.out.println("원하는 번호를 입력하세요.>> ");
		int choice = scan.nextInt();
		scan.nextLine(); //enter키 때문
		return choice;
	}//int 화면부분

	//학생성적입력
	void stu_input() {
		while(true) { 
			System.out.println("[ 학생 성적입력 ]");
//			"학번","이름","국어","영어","수학","합계","평균","등수"
			Date date = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yy");
			String stuNo1 = "S"+ sdf.format(date) + String.format("%03d", s_count+1);
			// 학번저장
			stuNo[s_count] = stuNo1;
			System.out.println("학생번호 : "+stuNo1);
			// 이름저장
			System.out.println("이름을 입력하세요.>>(0.이전화면 이동) ");
			name[s_count] = scan.nextLine();
			
			if(name[s_count].equals("0")) {
				System.out.println("이전 화면으로 이동합니다.!!");
				System.out.println();
				break;
			}
			
			// 국어,영어,수학 점수 저장
			for(int i=0;i<3;i++) {
				System.out.printf("%s 점수를 입력하세요.>>",title[i+2]);
				score[s_count][i] = scan.nextInt();
				scan.nextLine();
			}
			
			// 합계 저장
			score[s_count][3] = score[s_count][0]+score[s_count][1]+score[s_count][2];
			// 평균 저장
			avg[s_count] = score[s_count][3]/3.0;
			
			// 입력완료
			System.out.printf("%s 학생성적이 저장되었습니다.\n",name[s_count]);
			System.out.println();
			
			s_count++;
		}
	}
	
	
}
