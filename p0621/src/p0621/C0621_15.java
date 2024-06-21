package p0621;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class C0621_15 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Stu_pro sp = new Stu_pro();
		
		//변수선언부분
		final int STU = 10;
		String[] stuNo = new String[STU];//학번
		String[] name = new String[STU]; //이름
		int[][] score = new int[STU][4]; //국어,영어,수학,합계
		double[] avg = new double[STU];  //평균
		int[] rank = new int[STU];       //등수
		String[] title = {"학번","이름","국어","영어","수학","합계","평균","등수"};
		int s_count = 0; //입력된 학생수
		
		//전체화면 출력
		while(true) {
			//화면부분
			switch(choice) {
			case 1:
				int choice = sp.screen();
				break;
				
			case 2:
				System.out.println("[ 학생 성적출력 ]");
				for(int i=0;i<title.length;i++) {
					System.out.printf("%s\t",title[i]);
				}
				System.out.println();
				System.out.println("---------------------------------------------");
				for(int i=0;i<s_count;i++) {
					System.out.printf("%s\t",stuNo[i]); //학번
					System.out.printf("%s\t",name[i]);  //이름
					for(int j=0;j<4;j++) {
						System.out.printf("%d\t",score[i][j]); //국어,영어,수학,합계
					}
					System.out.printf("%.2f\t",avg[i]); //평균
					System.out.printf("%d\t", rank[i]);  //등수
					System.out.println();
				}
				System.out.println();
				break;
				
			case 3:
				System.out.println("[ 성적 수정 ]");
				//학생검색
				System.out.println("찾으시는 학생의 이름을 입력해주세요.>>");
				String t_name =scan.next();
				int temp_no = -1;
				for(int i=0; i<s_count; i++) {
					if(name[i].equals(t_name)) {
					temp_no = i; //학생을 찾음
					}
				}
				if(temp_no == -1) {
					System.out.println("찾는 학생이 없습니다. 다시 입력해주세요.");
				}else {
					// 학생검색 후 진행
					System.out.printf("          [ %s 성적수정 ] \n",t_name);
					System.out.println("---------------------------------");
					System.out.println("1.국어점수 수정");
					System.out.println("2.영어점수 수정");
					System.out.println("3.수학점수 수정");
					System.out.println("-----------------------");
					System.out.println("원하는 번호를 입력하세요.>> ");
					choice = scan.nextInt();
					
					switch(choice) {
					case 1: //국어점수 변경
						System.out.println("[ 국어점수 수정 ]");
						//국어점수 -score[temp_no][0]
						System.out.println("현재 국어점수 :"+score[temp_no][choice-1]);
						System.out.println("----------------------------------");
						System.out.println("변경 국어점수를 입력하세요.>> "+title[choice+1]);
						score[temp_no][choice-1] = scan.nextInt();
						
						//합계,평균변경
						score[temp_no][3] = score[temp_no][0]+score[temp_no][1]+score[temp_no][2];
						avg[temp_no] = score[temp_no][3]/3.0;
						System.out.println("변경된 국어점수 :"+score[temp_no][choice-1]);
						System.out.println();
						break;
					
					case 2://영어점수 변경
						System.out.println("[ 영어점수 수정 ]");
						//국어점수 -score[temp_no][0]
						System.out.println("현재 영어점수 :"+score[temp_no][choice-1]);
						System.out.println("----------------------------------");
						System.out.println("변경 영어점수를 입력하세요.>> "+title[choice+1]);
						score[temp_no][choice-1] = scan.nextInt();
						
						//합계,평균변경
						score[temp_no][3] = score[temp_no][0]+score[temp_no][1]+score[temp_no][2];
						avg[temp_no] = score[temp_no][3]/3.0;
						System.out.println("변경된 영어점수 :"+score[temp_no][choice-1]);
						System.out.println();
						break;
						
					
					case 3://수학점수
						System.out.println("[ 수학점수 수정 ]");
						//국어점수 -score[temp_no][0]
						System.out.println("현재 수학점수 :"+score[temp_no][choice-1]);
						System.out.println("----------------------------------");
						System.out.println("변경 수학점수를 입력하세요.>> "+title[choice+1]);
						score[temp_no][choice-1] = scan.nextInt();
						
						//합계,평균변경
						score[temp_no][3] = score[temp_no][0]+score[temp_no][1]+score[temp_no][2];
						avg[temp_no] = score[temp_no][3]/3.0;
						System.out.println("변경된 수학점수 :"+score[temp_no][choice-1]);
						System.out.println();
						break;
				}//2switch
				}//else
				break; //전쳬 : case 3 
			
			case 4:
				System.out.println("[ 학생검색 ]");
				System.out.println("-----------------------------------------");
				System.out.println("1. 학생이름 검색");
				System.out.println("2. 합계점수 검색");
				System.out.println("3. 평균점수 검색");
				System.out.println("-----------------------------------------");
				System.out.println("원하는 번호를 입력하세요.>>");
				choice = scan.nextInt();
				int cnt = 0; //학생 찾았는지 확인 변수

				switch(choice) {
				
				case 1:
					System.out.println("학생이름을 입력하세요.>>");
					String search = scan.nextLine();
					
					
					for(int i=0;i<title.length;i++) {
						System.out.printf("%s\t",title[i]);
					}
					System.out.println();
					System.out.println("---------------------------------------------");
					
					cnt = 0; //학생 찾았는지 확인 변수
					for(int i=0; i<s_count; i++) {
						if(name[i].contains(search)) {
							System.out.printf("%s\t",stuNo[i]); //학번
							System.out.printf("%s\t",name[i]);  //이름
							for(int j=0;j<4;j++) {
								System.out.printf("%d\t",score[i][j]); //국어,영어,수학,합계
							}
							System.out.printf("%.2f\t",avg[i]); //평균
							System.out.printf("%d\t", rank[i]);  //등수
							System.out.println();
							cnt = 1;
						}
						
					}
					System.out.println();
					
					if(cnt==0) {
						System.out.println("찾는 학생이 없습니다. 다시 입력하세요.!!");
						System.out.println();
					}
					
					break;
				case 2:
					System.out.println("합계점수를 입력하세요.>>");
					int t_score = scan.nextInt();
					scan.nextLine();
					for(int i=0;i<title.length;i++) {
						System.out.printf("%s\t",title[i]);
					}
					System.out.println();
					System.out.println("---------------------------------------------");
					
					cnt = 0; //학생 찾았는지 확인 변수
					for(int i=0; i<s_count; i++) {
						if(score[i][3]>=(t_score)) {
							System.out.printf("%s\t",stuNo[i]); //학번
							System.out.printf("%s\t",name[i]);  //이름
							for(int j=0;j<4;j++) {
								System.out.printf("%d\t",score[i][j]); //국어,영어,수학,합계
							}
							System.out.printf("%.2f\t",avg[i]); //평균
							System.out.printf("%d\t", rank[i]);  //등수
							System.out.println();
							cnt = 1;
						}
						
					}
					System.out.println();
					
					if(cnt==0) {
						System.out.println("찾는 학생이 없습니다. 다시 입력하세요.!!");
						System.out.println();
					}
					break;
				
				case 3:
					System.out.println("평균점수를 입력하세요.>>");
					double t_avg = scan.nextDouble();
					scan.nextLine();
					for(int i=0;i<title.length;i++) {
						System.out.printf("%s\t",title[i]);
					}
					System.out.println();
					System.out.println("---------------------------------------------");
					
					cnt = 0; //학생 찾았는지 확인 변수
					for(int i=0; i<s_count; i++) {
						if(avg[i]>=(t_avg)) {
							System.out.printf("%s\t",stuNo[i]); //학번
							System.out.printf("%s\t",name[i]);  //이름
							for(int j=0;j<4;j++) {
								System.out.printf("%d\t",score[i][j]); //국어,영어,수학,합계
							}
							System.out.printf("%.2f\t",avg[i]); //평균
							System.out.printf("%d\t", rank[i]);  //등수
							System.out.println();
							cnt = 1;
						}
						
					}
					System.out.println();
					
					if(cnt==0) {
						System.out.println("찾는 학생이 없습니다. 다시 입력하세요.!!");
						System.out.println();
					}
					
					break;
				
				
				}//switch
			
				break;
				
			case 5:
				System.out.println("[ 등수처리 ]");
				for(int i=0;i<s_count; i++) {
					int count = 1; //초기화
					for(int j=0; j<s_count; j++) {
						if(score[i][3]<score[j][3]) count++;
					}
					rank[i] = count;
				}
				
				System.out.println("등수처리가 완료되었습니다.!!");
				System.out.println();
				break;
			
			
			
			
			}//switch
			
			
		}//while
	}//main
}//class
}
