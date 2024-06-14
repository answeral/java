package p0614;

public class C0614_02 {

	public static void main(String[] args) {
		int score=10;
//		int score;//변수는 초기화 없이 사용 할 수 없음
		System.out.println(score);
		
		//문자형
		char c = 'a';
//		char ch2 = 'abc'; //불가
		char ch3 = 'a';
		char ch4 ='b';
		char ch5 = 'c';

		// 기본형 타입 이외 모든 참조형 타입은 new텬산자를 사용해야 함.
		String str = new String("abc"); // "" 사용
		System.out.println(str);
		
		String str2 = "abcde";
		String str3 = "10000";
		System.out.println(str3);

		int max = 10;
		max = 30;
		System.out.println(max);
		
		final int MIN = 20; // 값을 변경 할 수 없어서 대문자로 씀
//		min = 10; // final 상수는 값을 변경할 수 없음
		System.out.println(MIN);
		
		
	}//main
}//class
