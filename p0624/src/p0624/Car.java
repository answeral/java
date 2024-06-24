package p0624;

public class Car {
	static int count =0; 
	String serial_no;//클래스 변수
	String color; //인스턴스 변수
	String gearType;
	int door;
	
	// 초기화 블럭 : 생성자를 호출 하기 전에 먼저 실행
	{
		count+=1;
		this.serial_no = "HD"+String.format("%04d",count);
		
	}
	
	//오버로딩
	Car(){}//기본생성자
	Car(String color){
		this.color=color;
		
		}
	
	
//	Car(String c){}
	
	Car(String color, String gearType, int door){
		serial_no += 1;
		//this : 참조변수를 가리킴
		this.color = color;
		this.gearType= gearType;
		this.door =door;
		
	}
	
	
	
}
