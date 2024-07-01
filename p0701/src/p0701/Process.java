package p0701;

import java.util.ArrayList;
import java.util.HashMap;

public class Process {
	ArrayList<Card> clist = new ArrayList();
	ArrayList<Students> slist = new ArrayList();
	
	public Process() {}
	
	
	public Process(ArrayList<Card> clist, ArrayList<Students> slist) {
		super();
		this.clist = clist;
		this.slist = slist;
	}


	//Card list 보내기
	ArrayList<Card> clistAdd(){//인스턴스메소드
		clist.add(new Card(1,"CLOVER"));
		clist.add(new Card(2,"CLOVER"));
		clist.add(new Card(3,"CLOVER"));
		clist.add(new Card(4,"CLOVER"));
		clist.add(new Card(5,"CLOVER"));
		return clist;
	}//clistAdd
	
	// Students list 보내기
	ArrayList<Students> slistAdd(){//인스턴스메소드
		slist.add(new Students("홍길동",100,100,99));
		slist.add(new Students("유관순",99,99,89));
		slist.add(new Students("이순신",89,89,79));
		slist.add(new Students("김구",79,79,69));
		slist.add(new Students("강감찬",60,60,99));
		return slist;
	}//slitAdd
	
	public ArrayList<Card> getClist() {
		return clist;
	}

	public void setClist(ArrayList<Card> clist) {
		this.clist = clist;
	}

	public ArrayList<Students> getSlist() {
		return slist;
	}

	public void setSlist(ArrayList<Students> slist) {
		this.slist = slist;
	}

	// 2개를 모두 보내기: 2개 보낼 때 map 사용
	//HashMap = key 중복X :value 중복O 넣을 떄는 put(key, value)->읽을 때는 get(key) 
	HashMap<String, Object> listAdd() { //선언되어있는 형태 그대로 받는다
//		Map<String,object> map = new HashMap<String,Object>();//다형성
		
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("clist", clistAdd());
		map.put("slist", slistAdd());
		return map ;
	}
	
	
	
	

}//class
