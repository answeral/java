package p0702;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Scanner;

public class C0702_01 {

	public static void main(String[] args)  throws Exception{
		Scanner scan = new Scanner(System.in);
		String stuNO="",name="";
		int kor=0, eng=0, math=0, total=0,rank=0;
		double avg =0;
		ArrayList<Students> list = new ArrayList<Students>();
//		List<Students> list = new ArrayList<Students>(); 다형성?
		
		FileReader fr = new FileReader("c:/save/abc.txt");
		BufferedReader br = new BufferedReader(fr); //"FileNotFoundException"
		while(true) {
			String line = br.readLine();//"IOException 두 개다 다른 Exception이라서" 
			if(line == null) break; //S0001,홍길동,100,100,100,300,100.0
			String[] arr = line.split(",");
			stuNO = arr[0];
			name = arr[1];
			kor = Integer.parseInt(arr[2]);
			eng = Integer.parseInt(arr[3]);
			math = Integer.parseInt(arr[4]);
			total = Integer.parseInt(arr[5]);
			avg = Double.parseDouble(arr[6]);
			rank = Integer.parseInt(arr[7]);
			list.add(new Students(stuNO, name, kor, eng, math, total, avg, rank));//변수가 8개 인것을 찾아가라
			
			
		}//while
		
		//count
		Students.count = list.size()+1;//5명이 이미 입력 //삭제 시 같은 번호로 입력이 되는 문제가 있음
		
		while(true) {
			// 학생입력부분- 학번은 자동부여 , 입력:이름, 국어, 영어, 수학
			System.out.println("이름을 입력하세요.(x 종료)>>");
			name = scan.next();
			
			// x 또는 X가 입력이 되면, 입력프로그램 종료
			if(name.equalsIgnoreCase("x")) {
				System.out.println("입력화면을 종료합니다.");
				break;}
			
			System.out.println("국어점수를 입력하세요.>>");
			kor = scan.nextInt();
			System.out.println("영어점수를 입력하세요.>>");
			eng = scan.nextInt();
			System.out.println("수학점수를 입력하세요.>>");
			math = scan.nextInt();
			Students s = new Students(); //객체 참조변수 new 생성자
			list.add(new Students(name,kor,eng,math)); //new 생성자 변수가 4개인것을 찾아가라
			
			
		}
		// 파일 저장
		String str ="";
		for(int i =0; i<list.size();i++) {
			Students s1 = list.get(i);
			str += String.format("%s,%s,%d,%d,%d,%d,%.2f,%d \r \n",s1.getStuNo(),s1.getName(),s1.getName(),s1.getKor(),s1.getEng(),s1.getMath(),s1.getTotal(),s1.getAvg(),s1.getRank());
		
		}
		
		try {
			FileWriter fw = new FileWriter("c:/save/abc.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(str);
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("파일에 내용을 저장했습니다.");
		
		
		//list출력하기. 번호,이름,합계 평균 등수
		for(int i =0; i<list.size();i++) {
			Students s1 = list.get(i);
//			System.out.println(s1.getStuNo()+","+s1.getName()+","+s1.getTotal()+","+s1.getAvg()+","+s1.getRank());
			System.out.printf("%s,%s,%d,%.2f,%d \n",s1.getStuNo(),s1.getName(),s1.getTotal(),s1.getAvg(),s1.getRank());
		}
		
		
		
			
		
		
//		try {
//			FileReader fr = new FileReader("c:/save/abc.txt");
//			BufferedReader br = new BufferedReader(fr); //"FileNotFoundException"
//			while(true) {
//				String line = br.readLine();//"IOException 두 개다 다른 Exception이라서" 
//				if(line == null) break; //S0001,홍길동,100,100,100,300,100.0
//				String[] arr = line.split(",");
//				stuNO = arr[0];
//				name = arr[1];
//				kor = Integer.parseInt(arr[2]);
//				eng = Integer.parseInt(arr[3]);
//				math = Integer.parseInt(arr[4]);
//				total = Integer.parseInt(arr[5]);
//				avg = Double.parseDouble(arr[6]);
//				rank = Integer.parseInt(arr[7]);
//				
//				list.add(new Students(stuNO, name, kor, eng, math, total, avg, rank));
//				
//				
//			}//while
//			
//			//list출력하기. 번호,이름,합계 평균 등수
//			for(int i =0; i<list.size();i++) {
//				Students s = list.get(i);
//				System.out.println(s.getStuNo()+","+s.getName()+","+s.getTotal()+","+s.getAvg()+","+s.getRank());
//				System.out.printf("%s,%s,%d,%.2f,%d \n",s.getStuNo(),s.getName(),s.getTotal(),s.getAvg(),s.getRank());
//			}
//			
//			
//		} catch (Exception e) {//FileNotFoundException->"Exception으로" 바꾸지 않으면 tyr-catch문으로 
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		
		
		
		
		
		
	}//main

}//class
