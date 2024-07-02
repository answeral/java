import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

import p0702.Students;

public class C0702_02 {

	public static void main(String[] args) throws Exception{
		Scanner scan = new Scanner(System.in);
		ArrayList<Students> list = new ArrayList();
		int choice =0;
		String stuNo ="",name = "";
		int kor =0, eng=0, math=0, total=0, rank =0;
		double avg = 0;
		
		
		//abc파일 학생성적 7개를 가지고 와서 출력하기
		FileReader fr = new FileReader("c:/save/abc.txt");
		BufferedReader br = new BufferedReader(fr);

		while(true) {
			try {
			String line = br.readLine();
			if(line==null) break;
			String[] arr = line.split(",");
			stuNo = arr[0];
			name = arr[1];
			kor = Integer.parseInt(arr[2]);
			eng = Integer.parseInt(arr[3]);
			math = Integer.parseInt(arr[4]);
			total = Integer.parseInt(arr[5]);
			avg = Double.parseDouble(arr[6]);
			rank = Integer.parseInt(arr[7]);
			list.add(new Students(stuNo,name,kor,eng,math,total,avg,rank));}
			 catch (NumberFormatException ex){
		            ex.printStackTrace();
		        }
			
		}//while
		
		//list 마지막 번호 가져오기
		list.get(list.size()-1).getStuNo();
		String laststr = list.get(list.size()-1).getStuNo().substring(1);
		Students.count = list.size()+1;
		
		while(true) {
			System.out.println("[ 학생성적 프로그램 ]");
			System.out.printf("현재 입력된 학생수 : %d 명 \n",list.size());
			System.out.println("---------------------");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 성적수정");
			System.out.println("4. 학생삭제");
			System.out.println("5. 학생검색");
			System.out.println("6. 등수처리");
			System.out.println("7. 학생성적정렬");
			System.out.println("0. 프로그램 종료");
			System.out.println("---------------------");
			System.out.println("원하는 번호를 입력하세요.>> ");
			choice = scan.nextInt();
			scan.nextLine(); //enter키 때문
			
			switch(choice) {
			case 1:
				System.out.println("이름을 입력해주세요.>>(x 입력시 종료)");
				name = scan.next();
				if(name.equalsIgnoreCase("x")) {
					System.out.println("입력을 종료합니다.");
				}
				System.out.println("국어점수를 입력해주세요.>>");
				kor = scan.nextInt();
				System.out.println("영어점수를 입력해주세요.>>");
				eng = scan.nextInt();
				System.out.println("수학점수를 입력해주세요.>>");
				math = scan.nextInt();
				list.add(new Students(name,kor,eng,math));
				
				break;
				
				
			case 2:
				for(int i=0; i<list.size(); i++) {
					Students s = list.get(i);
					System.out.printf("%s,%s,%d,%d,%d,%d,%.2f,%d \n",s.getStuNo(),s.getName(),s.getKor(),s.getEng(),s.getMath(),s.getTotal(),s.getAvg(),s.getRank());;
				}
				break;
			
			
			}//switch
		}

	}//main

}//class
