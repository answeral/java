package p0614;

public class C0614_05 {

	public static void main(String[] args) {
		//정수의 오버플로우
		byte b= 127;
//		byte b2 = 128; //에러 표시해줌
		b = (byte) (b+1); //-128
//		b = (byte) (b+10);
		System.out.println(b); //오버 플로우 발생
		int num = 2147483647;
		num = num +1;
		System.out.println(num); // -2147483648
		
		//문자열 타입 변경
//		char ch = 'A';
////		char ch2 = 'AA'; // 2개 이상 문자 안 됨.
//		char ch3 = ' ';//사이 띄우기 가능
////		char ch4 = null; // null 안됨.
//		
//		String str = "AA";
//		String str2 = "";
//		String str3 = null;
//		
//		String s1 = "A"+"B";
//		System.out.println(s1); //AB
//		System.out.println(""+7+7);// 문자열 + 어떤 타입 = 문자열타입으로 변경
//		System.out.println(7+7+7+""+7); //217 - 문자열타입
//		
		
		
		
	}

}
