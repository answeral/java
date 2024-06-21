package p0621;

public class C0621_08 {

	public static void main(String[] args) {
		Data d = new Data(); //객체선언 , d:참조형변수, 주소값을 가지고 있음
		d.x = 10;
		System.out.println("d.x :"+d.x);
		System.out.println("-------------------");
		
		
		change(d); //d : 참조형 변수
		
		System.out.println("change호출 후 d.x"+d.x );
		
		for(int i=0; i<5; i++) {
			
		}
		for(int i=0; i<5; i++) {
			
		}
	}
	
	static void change(Data d2) {//같은형으로 받아야함 int x -> Data d / 주소값복사/ 지역변수 개념
		d2.x = 1000;
		System.out.println("change x(d2) :"+d2.x);
	}

}