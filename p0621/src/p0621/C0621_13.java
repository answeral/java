package p0621;

public class C0621_13 {

	public static void main(String[] args) {
		int a = 0;
		float b = 1.0f;
		double c = 2.0;
		String str = "안녕하세요.";
		char ch = 'A';
		//각각 다른 타입이지만, 이름은 같음 : 오버로딩- 이름은 같지만  타입은 다름
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(str);
		System.out.println(ch);
	}
	
//	int add(int a, int b) {retrun a+b;}
	
//	int add(int x, int y) {return a+b;}// 불가
	
	
	//매개변수의 개수, 타입,순서가 다르면 오버로딩 - 전혀 다른 메소드임
//	int add(int a, int b) {return a+b};
//	long add(int a, long b) {return a+b};
//	
	

}
