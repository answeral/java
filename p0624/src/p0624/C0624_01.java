package p0624;

public class C0624_01 {

	public static void main(String[] args) {
		//객체선언 후 참조변수명.변수명
		Data d = new Data();
		d.x = 10;
		System.out.println("d.x : "+d.x);
		
		
		change(d.x);//d.x는 10->change 메서드로 가서 x = 1000 ->프린트값:1000
		System.out.println("d.x 2 :"+d.x);
		

	}//main
	
	static void change(int x) { //기본형 매개변수 - 값만 전달 ex)10이라는 값만 전달
		x = 1000;
		System.out.println("change x:"+x);
	}//void change

}//class
