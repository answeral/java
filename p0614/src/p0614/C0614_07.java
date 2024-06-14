package p0614;

public class C0614_07 {

	public static void main(String[] args) {
		
		// printf의 출력
		// 소수점 제한 출력 가능, 8진수, 16진수 출력 가능
		System.out.println(10.0/3); // 3.3333333333333335 15째자리까지는 3, 16부터 지맘대로
		System.out.println(10.0f/3); //3.3333333
		System.out.printf("%.2f \n", 10.0/3); //3.33 줄 단락을 입력해야함.
		int x = 0x1a; // 16진수 표현 - 1a : 1*16 + a*16 = 16 + 10 = 26
		System.out.println("x :"+x); //26
		System.out.printf("%X \n",x); //1A , printf : 16진수 출력 가능
		
		long a = 10L;
		System.out.printf("%d \n",a);
		
		int b = 20;
		System.out.printf("%d \n",b);
		
		int age = 14;
		int year = 2014;
		System.out.printf("나이 : %d세, 년도: %d년 \n",age,year);
		System.out.println("나이 :"+ age+"세  ,년도 : "+year+"년");
		
		System.out.printf("[%05d] \n",10);
		System.out.printf("[%5d] \n",10);

	}

}
