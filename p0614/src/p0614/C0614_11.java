package p0614;

public class C0614_11 {

	public static void main(String[] args) {
		byte a = 1;
		int n = 10;
//		byte c =(byte)( a + n);
		int c = a+n;
		System.out.println(c);
		
		char ch = 'A'; //65 아스키 코드, a = 97 ; 32차이
		char ch2 ='B'; //66
		System.out.println(ch+ch2);
		System.out.println((char)(ch+32)); //97
	
		byte by = 10;
		byte by2 = 20;
		byte by3 = (byte)(by+by2);
		System.out.println(by3);
		
		int num = 1000000;
		int num2 = 2000000;
		long total = (long)num*num2; //* = 2조 , int는 21억까지
		System.out.println("long :"+total);
		
		
		long num3 = 1000000L;
		long num4 = num * num3;
		System.out.println(num4);
		
		int num5 = 1000000;
		System.out.println(num/num5*1000000);
		System.out.println(num*num5/1000000);
		
		char c1 = 'a';
//		char c2 = c1 +1; //에러
		char c2 = (char)(c1+1);
		System.out.println(c2); //b
		
		char c3 = c1++;
		System.out.println(c3); //a
		System.out.println(c1); //b
		
		int i = 'B' -'A'; //A:65 , B:66 C:67 , ... , a:97, b:98, c:99,...
		System.out.println(i); // 1
		
		// 문자 숫자는 - 문자숫자 '0'을 빼면 숫자 값이 나옴
		int j = '2' - '0'; //0:48, 1:49 2:50
		System.out.println(j);
		
		int k = '8' - '0';
		System.out.println(k);
		
	}

}
