package p0617;

public class C0617_09 {

	public static void main(String[] args) {
		// 문자열은 선언 방법 2가지
		String str = "안녕";
		String str2 = "안녕2";
		String str3 = new String("안녕");
		int num = 5;
		int num2 = 5;
		// 기본타입 - boolean, char, byte, short, int, long , float, double
		// 기본 타입을 제외한 모든 것들은  equals 메소드 사용해야 함.
		// 비교연산자를 통해서 확인 가능
		if (num==num2) {
			System.out.println("같은 숫자입니다");
		}else {
			System.out.println("다른 숫자입니다");
		}
		System.out.println("-------------------------------------");
		//str1, str3 는 다른 문자
		System.out.println("str:"+str);
		System.out.println("str3:"+str3);
		System.out.println("-------------------------------------");
		//문자열, 참조변수 비교는 == 비교가 안됨. equals 메소드 사용해야 함.
		if (str.equals(str3)) {
			System.out.println("같은 문자입니다");
		}else {
			System.out.println("다른 문자입니다");
		}
		System.out.println("-------------------------------------");
		if (str3 == "안녕") {
			System.out.println("같은문자 입니다.");
		}else {
			System.out.println("다른 문자 입니다");
		}
		
		
		
	}//main
}//class
