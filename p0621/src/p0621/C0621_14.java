package p0621;

import java.util.Scanner;

public class C0621_14 {

	public static void main(String[] args) {
		
				//변수선언부분
				Scanner scan = new Scanner(System.in);
				Stu_process sp = new Stu_process();
				String[] title = {"학번","이름","국어","영어","수학","합계","평균","등수"};
				Stu_score[] sc = new Stu_score[10]; //배열선언
				int s_count = 0; //입력된 학생수
				
				while(true) {
					//화면부분
					int choice = sp.screen();
					
					switch(choice) {
					case 1: //학생입력한 수는 리턴으로 받아야 함.
						//학생성적 입력 부분 -Stu_score[] sc,int s_count s_count
						s_count = sp.stu_input(sc,s_count);
							break;
					
					case 2:
						//학생성적출력 부분 - Stu_score[] sc,int s_count,String[] title
						sp.stu_output(sc,s_count,title);
						break;
					
					}//switch:1
				}//while:1
			
	}//main

}//class
