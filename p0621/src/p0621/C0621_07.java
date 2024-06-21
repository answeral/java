package p0621;

public class C0621_07 {

	public static void main(String[] args) {
		Data d = new Data(); //객체선언
		d.x = 10;
		System.out.println("d.x :"+d.x);
		System.out.println("-------------------");
		
		
		change(d.x); //클래스 메소드 - 객체선언없이 클래스명.메소드명
		
		System.out.println("change호출 후 d.x"+d.x );
		
	}
	
	static void change(int x) {//int x :지역변수 - 메소드 벗어나면 없어짐
		x = 1000;
		System.out.println("change x :"+x);
	}

}
