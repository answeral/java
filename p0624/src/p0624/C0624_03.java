package p0624;

public class C0624_03 {

	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("d.x :"+d.x);
		
		change (d);
		
		System.out.println("d.x2 :"+d.x);
		
//		for(int i=0; i<10;i++) { // i는 서로 다름- 지역변수
//			
//		}
//		
//		for(int i=0;i<20;i++) { // i는 서로 다름 - 지역변수
//			
//		}

	}
	
	static void change(Data d) { //d는 서로 다름- 지역변수		
		d.x = 1000;
		System.out.println("change d.x :"+ d.x);
	}

}
