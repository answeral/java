package p0628;

public class C0628_05 {

	public static void main(String[] args) {

		// [ String ]
		String str = "123";
		str = str+"12";
		System.out.println(str);
		
		
		// [ StringBuffer ]
//		StringBuffer sb = "123"; //에러
		StringBuffer sb = new StringBuffer("123");
//		sb = sb+"12"; //error
		sb.append("12");//"123"+"12"
		System.out.println(sb);
		
		int a = 10;
		int b = 5;
		int c = 100;
		
		Math.max(a, b);//2개만 가능
		Math.max(Math.max(a, b),c);
		System.out.println(Math.max(Math.max(a, b),c));
		
		
		//컬렉션 인터페이스
		//add(), isEmpty(), remove(), int size()
		
		

	}

}
