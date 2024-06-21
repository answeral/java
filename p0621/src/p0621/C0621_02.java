package p0621;

public class C0621_02 {

	public static void main(String[] args) {
		// Heart, 2 c2 = Spade,4
		
		Card c1 = new Card();
		c1.kind  ="Heart";
		c1.number = 2;

		System.out.printf("모양:%s, 숫자:%d \n",c1.kind, c1.number);
		System.out.printf("넓이:%s, 높이:%d \n",c1.width, c1.height);
		
		// 클래스변수 
		//c1.width = 50; 참조변수명.변수명으로 변경가능하나, 클래스명.변수명으로 사용하기
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;
		
		System.out.printf("모양:%s, 숫자:%d \n",c2.kind, c2.number);
		System.out.printf("넓이:%s, 높이:%d \n",c2.width, c2.height);

		Card.width = 50;
		Card.height = 80;
		System.out.printf("넓이:%s, 높이:%d \n",c1.width, c1.height);
		System.out.printf("넓이:%s, 높이:%d \n",c2.width, c2.height);
		
		
		
		
		
		
		
		
	}//

}
