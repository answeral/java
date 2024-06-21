package p0621;

public class C0621_11 {

	int a =0; //인스턴스 변수 
	static int b= 0; //클래스 변수 
	
	//클래스 메소드 - 클래스변수만 사용가능
	public static void main(String[] args) {
		//인스턴스 변수는 사용이 안됨.
		//a=0; // 인스턴스 변수이므로 사용불가능
		b=10;  //클래스 변수이므로 사용가능
		int c = 300;
		
	}//main
	
	//인스턴스 메소드 - 인스턴스 변수, 클래스변수 모두 사용가능
	void add() {
		a = 100;   //인스턴스 변수 사용가능
		b = 2000;  //클래스 변수 사용가능
		int c = 0; // 지역변수 사용가능
	}
	
	
	
}//class
