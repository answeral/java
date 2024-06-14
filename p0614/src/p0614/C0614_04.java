package p0614; // package 무조건 존재
	
	
public class C0614_04 { //class 무조건 존재
	
	static int num ;  // class 내 변수 (객체변수, instance 변수) : 자동으로 초기화 됨
	
	// 메소드 내에서는 무조건 변수 값을 초기화를 해야함.
	public static void main(String[] args) { //class를 실행시키기 위해서 메소드 무조건 존재
		int score = 0; // 자동으로 초기화가 되지 않음. 그래서 무조건 초기화를 해야 함.
		System.out.println(score); //score를 초기화 해주지 않으면 데러
//		System.out.println(num); // 에러
		System.out.println(num); //0 , static을 붙였을 때 , 클래스 변수는 초기화를 해주지 않아도 됨.
		
		
		
	}//main

}//class
