package p0621;

public class C0621_12 {

	public static void main(String[] args) {
		System.out.println(MyMath2.add(200L, 100L));
		
		int a = 0;
//		int a = 0; //같은 이름 사용할 수 없음
		
		MyMath2 mm = new MyMath2();
		mm.a = 10;
		mm.b = 20;
		
		System.out.println(mm.add());
		
		
		

	}

}
