package p0628;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class C0628_10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("성별을 입력하세요.>>");
		String str = scan.next();
		
		ArrayList<Card> list = new ArrayList<Card>();
		
		list.add(new Card(1,"SPADE"));
		list.add(new Card(1,"DIAMOND"));
		list.add(new Card(3,"Spade"));
		list.add(new Card(7,"spade"));
		list.add(new Card(5,"CLOVER"));
		list.add(new Card(2,"DIamond"));
		
//		list.sort(new Comparator<Card>() {
//
//			@Override //숫자
//			public int compare(Card o1, Card o2) {
////				return o1.number - o2.number;//순차정렬
//				return o2.number - o1.number;//역순정렬
//			}
//			
//		});
		list.sort(new Comparator<Card>() {
			
			@Override //문자열
			public int compare(Card o1, Card o2) {
//				return o1.kind.compareTo(o2.kind);//순차정렬
				return o2.getkind.compareTo(o1.getkind);//역순정렬
			}
			
		});
		for (int i=0; i<list.size();i++) {
			System.out.println(list.get(i).getkind);
		}
		
	}

}
//컬렉션은 객체 배열
