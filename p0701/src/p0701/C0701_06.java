package p0701;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class C0701_06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Students> list = new ArrayList<Students>();
		
		//입력
		System.out.println("이름을 입력하세요.");
		String name = scan.next();
		System.out.println("국어점수를 입력하세요.>>");
		int kor = scan.nextInt();
		System.out.println("영어점수를 입력하세요.>>");
		int eng = scan.nextInt();
		System.out.println("수학점수를 입력하세요.>>");
		int math = scan.nextInt();
		
		list.add(new Students(name, kor, eng, math));
		
		// 1.txt에 내용을 파일에 저장하시오.
		String str = ""+list.get(0);
		try {
			FileWriter fw = new FileWriter("c:/save/1.txt",true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(str);
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("list 학생성적이 저장되었습니다");
		
//		
//		for(int i=0; i<list.size(); i++) {
//			Students s = list.get(i);
////			System.out.println(s.getName()+","+s.getTotal()+","+s.getAvg());
//			System.out.println(s);
//		}
//		
		
		
		
		
		
		// 출력
//		ArrayList<Students> list = new ArrayList<Students>();
//		list.add(new Students("홍길동",100,100,100));
//		list.add(new Students("유관순",70,70,70));
//		list.add(new Students("이순신",60,90,90));
//		
//		//이름, 합계, 평균 모두 출력
//		
//		for(int i=0; i<list.size(); i++) {
//			Students s = list.get(i);
//			System.out.println(s.getName()+","+s.getTotal()+","+s.getAvg());
//		}
		
	}

	private static Object list(String name, int kor, int eng, int math) {
		// TODO Auto-generated method stub
		return null;
	}

}
