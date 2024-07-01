package p0628;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

import p0628.Card.Kind;

public class C0628_10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("성별을 입력하세요.>>");
		String str = scan.next();
		
		ArrayList<Card> list = new ArrayList<Card>();
		
		//SPADE, CLOVER,HEART, DIAMOND로만 입력을 받음 enum
		list.add(new Card(1,Kind.CLOVER));
		list.add(new Card(1,Kind.DIAMOND));
		list.add(new Card(3,Kind.SPADE));
		list.add(new Card(7,Kind.SPADE));
		list.add(new Card(5,Kind.CLOVER));
		list.add(new Card(2,Kind.DIAMOND));
		
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
