package p0621;

public class C0621_16 {

	public static void main(String[] args) {
		// 1-10,J,Q,K 13장 * 무늬 4개 = 52장 카드
		
		//무늬 : CLOVER,DIAMOND, SPADE, HEART
		//숫자 : 1,2,3,4,5,6,7,8,9,10,J,Q,K
		
		String[] kind = {"CLOVER","DIAMOND","SPADE", "HEART"};
		String[] number = {"0","1","2","3","4","5","6","7","8","9","10","J","Q","K"};
		
		Card[] c = new Card[52]; //52개의 카드 만들어짐
		c[0] = new Card( "CLOVER",1); //객체선언을 해야 공간이 만들어짐
		c[1] = new Card( "CLOVER",2); //객체선언을 해야 공간이 만들어짐
//		c[0].kind = "CLOVER"; // 데이터를 입력
//		c[0].number = 1;      // 데이터를 입력
		
		
		//(int)(i/13)
		for(int i=0;i<c.length;i++) {
			c[i] = new Card(kind[i/13] ,(i%13)+1);
//			c[i].kind =kind[i/13] ;
//			c[i].number =(i%13)+1;
		}
		
		for(int i=0;i<c.length;i++) {
			System.out.printf("무늬 : %s,숫자 : %s \n",c[i].kind,number[c[i].number]);
			
//			if(c[i].number==11)
//				System.out.printf("무늬 : %s,숫자 : %s \n",c[i].kind,"J");
//			else if(c[i].number==12)
//				System.out.printf("무늬 : %s,숫자 : %s \n",c[i].kind,"Q");
//			else if(c[i].number==13)
//				System.out.printf("무늬 : %s,숫자 : %s \n",c[i].kind,"K");
//			else
//				System.out.printf("무늬 : %s,숫자 : %d \n",c[i].kind,c[i].number);
		}

	}//main

}
