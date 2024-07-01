package p0701;

import java.util.ArrayList;
import java.util.HashMap;

public class C0701_03 {

	public static void main(String[] args) {
		//Card list 가져와서 출력
		Process p = new Process();
		ArrayList<Card> clist = p.clistAdd(); //인스턴스 메소드 선언
		for(int i=0; i<clist.size(); i++) {
			System.out.println(clist.get(i));
			System.out.println(clist.get(i).getKind());
		}
		
		
		//Students list 가져와서 출력
		ArrayList<Students> slist = p.slistAdd(); //인스턴스 메소드 선언
		for(int i=0; i<slist.size(); i++) {
			System.out.println(slist.get(i));
//			System.out.println(slist.get(i)); 주소값
		}
		
		
		// 2개 모두 가져와서 출력
		HashMap<String, Object> map = p.listAdd();
		clist = (ArrayList<Card>) map.get("clist"); //형변환
		for(int i=0; i<clist.size(); i++) {
			System.out.println(clist.get(i));
			System.out.println(clist.get(i).getKind());
		}
		
		slist = (ArrayList<Students>) map.get("slist"); //형변환
		for(int i=0; i<clist.size(); i++) {
			System.out.println(slist.get(i));
			System.out.println(slist.get(i).getName());
		}
		
		
			
		
		
		
		

	}

}
