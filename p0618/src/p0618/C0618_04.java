package p0618;

public class C0618_04 {

	public static void main(String[] args) {
		//while, for 반복문에는 이름을 부여힐 수 있다; 반복문만 가능
		loop1 : for(int i=2; i<=9; i++) {
			System.out.printf("[ %d 단 ]\n",i);
			
			loop2 : for (int j=1; j<=9;j++) {
				System.out.printf("%d*%d=%d \n ",i,j,i*j);
				if (i == 4 && j==4) 
					continue loop1;
			}//loop2
			
		}//loop1

	}//main

}//class
