package p0619;

import java.util.Scanner;

public class C0619_04 {

	public static void main(String[] args) {
		// Quiz
		//5,5 배열 생성1,1,1,1,1,나머지 0으로 채워서 랜덤으로 섞어 출력
		// 번호 넣기
		
		int[][] arr = new int[5][5];
		int i = 0;
		arr[0][0]=1;
		arr[0][1]=1;
		arr[0][2]=1;
		arr[0][3]=1;
		arr[0][4]=1;
		
		// 1.번호 맞추기 화면
		String[][] lotto = new String[5][5];
		for (i=0;i<5;i++) {
			for (int j=0; j<5; j++) {
				lotto[i][j] = "★";
				
			}
			
		}//1
		//--------------------------------------------
		while(true) {
			// 2.번호 섞기
			int n = 0;
			int n2 =0;
			int t_value = 0;
			
			for(i=0; i<300; i++) {
				n = (int)(Math.random()*5);
				n2 = (int)(Math.random()*5);
				t_value = arr[0][0];
				arr[0][0] = arr[n][n2];
				arr[n][n2] = t_value;
			}//2
			
			
			
			//3.번호 맞추기 화면
			System.out.println("                 [ 좌표 ] ");
			System.out.println("|\t0\t1\t2\t3\t4\t");
			System.out.println("------------");
			for (i=0; i<5; i++) {
				System.out.print(i+"\t");
				for(int j=0; j<5; j++) {
					System.out.print(lotto[i][j]+"\t");;
				}
				System.out.println();
			}//3
			
			// 4. 좌표입력
			
			
			Scanner scan = new Scanner(System.in);
			System.out.println("------------------");
			System.out.println("가로 좌표를 입력하세요.>>");
			int x = scan.nextInt();
			System.out.println("세로 좌표를 입력하세요.>>");
			int y = scan.nextInt();
			
			//입력 받은 좌표값이 확인이 된 좌표이면 안내메세지 출력
			//다시 입력하게끔 
			
			//5이상 입력시 안내
			if(((x<0 ||x>4)|| (y<0 || y>4))) {
				System.out.println("잘못된 좌표입니다. 다시입력해주세요.");
				continue;
			}
			
			//타입 String
			if(lotto[x][y].equals("꽝") || lotto[x][y].equals("당첨")) {
				System.out.println("확인된 좌표입니다. 다시입력해주세요.");
				continue;
			}
			
			
			
			// 5. arr배열에서 x.y의 값을 비교
			//1이면 당첨, 0이면 꽝이 출력되도록 하려고 함.
			
			if(arr[x][y] == 1) {
				lotto[x][y] = "당첨";
			}else {
				lotto[x][y]= "꽝";
			}
			
			
			
			
			
			
		}//while
		
		
		
		
		
		
		
		
		

	}
	}

