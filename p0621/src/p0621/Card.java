package p0621;

public class Card {
	
	//기본생성자
	Card(){}
	//매개변수가 있는 생성자
	Card(String kind, int number){
		this.kind = kind;
		this.number = number;
		
	}
	
	// 인스턴스 변수 
	String kind; 
	int number;
	
	// 클래스 변수 
	static int width=100;
	static int height=250;
	
	
	
	
	

}
