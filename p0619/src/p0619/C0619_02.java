package p0619;

public class C0619_02 {

	public static void main(String[] args) {

		//2차원 배열 입력
		int[][] arr = new int[5][5];
		int i = 0;
		int j = 0;
		for(i=0;i<arr.length;i++) {
			for(j=0; j<arr[i].length; j++) {
				arr[i][j] = 5*i+(j+1); //
			}
		}
		// 2차원 배열 섞기
		
		int n = 0;
		int n2 =0;
		int t_value = 0;
		
		for(i=0; i<300; i++) {
			n = (int)(Math.random()*5);
			n2 = (int)(Math.random()*5);
			t_value = arr[0][0];
			arr[0][0] = arr[n][n2];
			arr[n][n2] = t_value;
		}
		
		
		
		
		//출력
		for(i=0;i<arr.length;i++) {
			for(j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		
//		for (i=0; i<25; i++) {
//			System.out.print(r_num[i]+" ");
//		}
//		for (i=0; i<300; i++) {
//			int rno = (int)(Math.random()*25);//0-44까지 번호
//			t_value = arr[0];
//			arr[0] = arr[no]; // 랜덤값을 0번째방에 입력
//			arr[no] = t_value;
//		}//2
//		for(int i=0; i<5; i++) {
//			for(int j=0; j<5; j++) {
//				arr[i][j]= arr[no]; 
//			}
//		}
//		
//		for(int i=0; i<5; i++) {
//			for(int j=0; j<5; j++) {
//				System.out.print(arr[i][j]+"\t");
//			}
//			System.out.println();
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//		//1-45까지 로또 번호를 생성해서, 랜덤으로 섞은 후 출력
//		//1. 배열생성
//		int[] arr = new int[45];
//		for (int i=0; i<arr.length; i++) {
//			arr[i] = i+1;
//		}
//		// 2. 랜덤으로 섞기
//		//임시저장, 랜덤번호생성, 0번째 배열과 바꿀 공간
//		int temp = 0;
//		int no = 0;
//		
//		for(int i=0; i<300; i++) {
//			no = (int)(Math.random()*45);
//			temp = arr[0];
//			arr[0] = arr[no];
//			arr[no] = temp;
//			
//		}
//		// 출력
//		for (int i=0; i<arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		
	}//main

}//class
