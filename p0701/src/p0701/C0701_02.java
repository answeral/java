package p0701;

import java.util.ArrayList;

public class C0701_02 {

	public static void main(String[] args) {
		
		
		ArrayList list = new ArrayList();
		
		list.add(new Card(1,"CLOVER"));
		list.add(new Card(10,"HEART"));
		list.add(new Card(2,"SPADE"));
//		list.add(2); error
//		list.add(new Students("홍길동",100,100,100)); error
		
		for(int i=0; i<list.size(); i++) {
			//(Object)(list.get(i))
//			Card c = (Card)(list.get(i)); //형변환
			System.out.println(list.get(i));//주소값
//			System.out.println(list.get(i).getkind()+","+list.get(i).getname());
			
		}
		

	}
	
	

}
