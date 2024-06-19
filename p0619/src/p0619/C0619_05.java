package p0619;

public class C0619_05 {

	public static void main(String[] args) {
		// [5,5] 배열 생성해서 1-25의 숫자를 입력하고, 랜덤으로 섞은 후 출력
		int[][] arr = new int[5][5];
		for(int i=0;i<arr.length;i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = 5*i+(j+1); }
			}//
		
		int n = 0;
		int n2 =0;
		int t_value = 0;
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				n = (int)(Math.random()*5)+1;
				n2 = (int)(Math.random()*5)+1;
				t_value = arr[0][0];
				arr[0][0] = arr[n][n2];
				arr[n][n2]= t_value;
						
			}
		}
		
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				System.out.println(arr[i][j]);}
				
			}
		

		
		
		
		
		
			}//main

		}//class
	
