package p0619;

import java.util.Scanner;

public class C0619_09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 학생성적 입력 구현 3명
		//학번 S, 이름S, 성적 - 국I,영I,수I,합계D , 평균D, 등수I
		String[] stuNo = new String[3];
		String[] name = new String[3];
		int[][] score = new int[3][4];
		double[] avg = new double[3];
		int[] rank = new int[3];
		String[] title = {"학번","이름","국어","영어","수학"};
		
		//학번, 이름, 성적 입력받기
		while(true) {
			System.out.println("[학생성적 프로그램]");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 성적수정");
			System.out.println("0. 프로그램 종료");
			System.out.println("----------------");
			System.out.println("원하는 번호를 입력하세요.>>");
			
			int choice = scan.nextInt();
			scan.nextLine();
			int s_count =0;
			
			switch(choice) {
			case 1:
				System.out.println("[ 성적입력 ]");
				System.out.println("학번을 입력해주세요.>>");
				stuNo[s_count] = scan.nextLine();
				System.out.println("이름을 입력해주세요.>>");
				name[s_count] = scan.nextLine();
				
				for(int i=0; i<3;i++) {
					System.out.printf("%s점수를 입력해주세요.>>",title[i+2]);
					score[s_count][i] = scan.nextInt();}
					
					//total,avg
					score[s_count][3] = score[s_count][0]+score[s_count][1]+score[s_count][2];
					avg[s_count] = score[s_count][3]/3.0;
				
				System.out.printf("학번 : %s \n",stuNo[s_count]);
				System.out.printf("이름 : %s \n",name[s_count]);
				System.out.println("위 학생의 성적이 입력되었습니다");
				s_count++;
				break;
			case 2:
				System.out.println("                     [ 성적출력 ]");
				// 학생입력한 데이터출력
				for(int i=0;i<title.length;i++) {
					System.out.print(title[i]+"\t");
				}
				System.out.println();
				System.out.println("-----------------------------------------------------------");
				for(int i=0;i<s_count;i++) {
					System.out.print(stuNo[i]+"\t");
					System.out.print(name[i]+"\t");
					System.out.printf("%d\t%d\t%d\t",score[i][0],score[i][1],score[i][2]);
					System.out.printf("%d\t%.2f\t",score[i][3],avg[i]);
					System.out.printf("%d\n",rank[i]);
				}
				System.out.println();
				break;
			
				
			case 3:
				System.out.println("                     [ 성적수정 ]");
				System.out.println("-------------------------------");
				// 학생 찾기
				System.out.println("성적 수정할 학생의 이름을 입력해주세요.>>");
				String search = scan.nextLine();
				
				int temp_no = -1; //학생의 위치값, 없는 경우 -1 
				for(int i=0; i<s_count; i++) {
					if (name[i].equals(search)) {
						temp_no =i;
						System.out.printf("%s학생이 검색되었습니다.",search);
						break;
						
					}
				}
					if (temp_no ==-1) {
						System.out.printf("%s학생이 존재하지 않습니다. 다시 확인해주세요.",search);
						// 수정할 성적 고르기
					}else {
						// 학생검색 후 진행
						System.out.printf("          [ %s 성적수정 ] \n",search);
						System.out.println("---------------------------------");
						System.out.println("1.국어점수 수정");
						System.out.println("2.영어점수 수정");
						System.out.println("3.수학점수 수정");
						System.out.println("-----------------------");
						System.out.println("원하는 번호를 입력하세요.>> ");
						
						switch(choice) {
						case 1:
							System.out.println("수정할 국어점수를 입력해주세요.>>");
							
							System.out.println("현재국어점수 "+score[s_count][0]);
							System.out.println("변경국어점수 "+title[choice+1]);
							score[temp_no][choice-1]= scan.nextInt();
							
							break;
						case 2:
							System.out.println("수정할 영어점수를 입력해주세요.>>");
						
						
						}
						
						
						
					}
				// 수정 입력 후 합계 고치기
			}//switch
			
		}
		
		
		

	}//main

}//class
