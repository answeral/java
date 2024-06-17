package p0617;

import java.util.Scanner;

public class C0617_14_학생성적폼 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("[ 성적처리 프로그램]");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 성적수정");
		System.out.println("4. 성적삭제");
		System.out.println("5. 학생검색");
		System.out.println("-------------------------");
		System.out.println("원하는 번호를 입력하세요.>>");
		int choice = scan.nextInt();
		
		switch(choice){
		case 1:
			System.out.println("성적입력이 실행됩니다");
			break;
		
		case 2:
			System.out.println("학생성적을 출력합니다");
			break;
			
		case 3:
			System.out.println("성적을 수정합니다.");
			break;
			
		case 4:
			System.out.println("성적을 삭제합니다");
			break;
			
		case 5:
			System.out.println("학생 검색을 합니다");
			break;
			
		default:
			System.out.println("번호를 잘못 입력하셨습니다");
			break;
			
			
			
			
			
		}
		
		
		
		
	}

}
