package p0624;

public class C0624_08 {

	public static void main(String[] args) {
		
		Stu_score stu; //->한 공간만 생성
		Stu_score s =  new Stu_score();//객체선언
		System.out.println("합계 :"+s.total);
		System.out.println("평균 : "+s.avg);
		
		Stu_score s2 =  new Stu_score();//기본생성자를 선언해야 사용 가능, 생성자가 하나라도 있으면 기본생성자 만들어야함 
		s.kor = 100;
		s.eng = 100;
		s.math = 99;
		System.out.println("s.kor : "+s.kor);
		
		
		
		
		
//		println_boolean();
//		println_char();
		
		int a =10;
//		int a = 100; 이름이 같아서 불가능
		
		//5! = 5*4*3*2*1 //재귀호출
		int result = 1;
		for(int i=5;i>0;i--) {
			result *= i;
		}
		
		
		C0624_08 c = new C0624_08(); 
		c.change();
		
		System.out.println(result);
		//메소드 내에서 메서드 선언 X
//		 void add() {} ->X
		add(); //객체선언 없이 클래스명.메소드명, 같은 클래스 내에서는 클래스명 생략가능 C0624_08.add(); 
	}
	static void add() {}
	
	//오버로딩 : 이름은 같지만 매개변수 타입, 개수가 다름, 리턴타입은 성립조건이 아님
	void change() {
		System.out.println(0);
	}//인스턴스 메서드 - 객체선언 후, 참조변수명.메서드명
	
	void change(int a) {
		System.out.println(a);
	}//이름이 같아서 불가능이지만 매개변수 개수, 타입이 다르다면 오버로딩으로 가능
	void change(int a, int b) {
		System.out.println(a+b);
	}//이름이 같아서 불가능이지만 매개변수 개수, 타입이 다르다면 오버로딩으로 가능
	
	
}
