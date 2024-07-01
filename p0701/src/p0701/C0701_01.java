package p0701;

public class C0701_01 {

	public static void main(String[] args) {
		//컬렉션 프레임웍
		//Collection은 객체배열, List 순서ㅇ 중복ㅇ, Set 순서x중복x, Map존재 순서x 키:중복x 값:중복ㅇ
		//순서가 없어서 for문 사용 불가능 ->iterator사용
		
		Card c = new Card();
		c.setPassword("1111");
//		c.number = 15;
		c.setNumber(12);
		System.out.println(c.getNumber());
		System.out.println(c.getPassword("admin"));
		
		
		
		
		                                                                        
		
		
		
	}

}
