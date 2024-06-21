package p0621;

public class Cal {
	int add(int a, int b) { //인스턴스변수
		int result = a+b;
		
		int num = minus(10,5);
		System.out.println("minus:"+num);
		return result;
		
		//메소드 선언은 안됨
		// int add2(int k, int m){}
	}
	int minus(int a, int b) {
		return a-b;
	}
}
