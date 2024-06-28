package p0628;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class C0628_08 {
	
	public static void main(String[] args) {
	Process p =new Process() ;
		//list,list2값을 모두 출력하시오
	HashMap<String, Object> map = p.read_con();
	Object obj = map.get("list");
	ArrayList list = (ArrayList) obj;
	for(int i=0; i<list.size();i++) {
		System.out.println(list.get(i));
	}
	
	Object obj2 = map.get("list2");
	ArrayList list2 = (ArrayList) obj2;
	for(int i=0; i<list2.size();i++) {
		System.out.println(list2.get(i));
	}
	Object obj3 = map.get("set");
	HashSet set = (HashSet)obj3;
	Iterator it = set.iterator();
	while(it.hasNext()) { // 현재 객체가 있는지 확인
		System.out.println(it.next());
}
	
	
	
	

		//Map:순서X, 키 중복X, 값 중복O
//		HashMap map = new HashMap();
//		map.put("aaa",1111);
//		map.put("bbb",1234);
//		map.put("ccc",1111);
//		map.put("ddd",1234);
//		
//		
//		String str = "bbb";
//		//map에는 iterator()가 없음.
//		if(map.containsKey(str)) {
//			System.out.println("동일한 데이터가 있습니다.");
//		}else {
//			System.out.println("일치하는 데이터가 없습니다.");
//		}
//		
//		Iterator it3 = map.entrySet().Interator();
//		while (it3.hasNext()){
//			System.out.println();
//		}
		
		//Set - 순서X,중복X

//		HashSet set = new HashSet();
////		set.add("abc"); //기본형 주소0과 주소1은 같은 주소
////		set.add("abc");// 기본형 같은 타입이라 하나만 존재,주소1
//		set.add(new Person("홍길동",1)); //주소2과
//		set.add(new Person("유관순",2)); //주소3가 서로 다른 주소임
//		set.add(new Person("이순신",3)); 
//		set.add(new Person("강감찬",4)); 
//		set.add(new Person("김구",5)); 
//		
//		System.out.println(set);//전부 출력 [홍길동:1, 유관순:2, 김구:5, 강감찬:4, 이순신:3]
//		
//		//set은 순서가 없기 떄문에 읽어오기 위해서는 iterator 사용
//		//iterator() 1회용임. 2번 출력하려면 다시 선언해야함
//		Iterator it = set.iterator();
//		while(it.hasNext()) { // 현재 객체가 있는지 확인
//			Person p = (Person)it.next(); //객체 1개 가져오기
//			System.out.println(p.name);
//		}
//		
//		it = set.iterator(); //두번 찍고 싶으면 두 번 선언해야함
//		while(it.hasNext()) { // 현재 객체가 있는지 확인
//			Person p = (Person)it.next(); //객체 1개 가져오기
//			System.out.println(p.name);
//		}
//		
//		ArrayList list = new ArrayList();
//		list.add("1");
//		list.add("2");
//		list.add("3");
//		list.add("4");
//		list.add("5");
//		
//		Iterator it2 = list.iterator();
//		while(it2.hasNext()) {
//			Object o =it2.next();//객체 1개 가져오기
//			System.out.println(o);
//		}
		
		
		
		
//		HashSet set = new HashSet();
//		set.add(new Card(1,"SPADE"));
//		set.add(new Card(2,"DIAMOND"));
//		set.add(new Card(3,"HEART"));
//		set.add(new Card(4,"CLOVER"));
//		set.add(new Card(1,"SPADE"));
//		set.add(new Card(6,"SPADE"));
//		
//		System.out.println(set);
//		
//		
//		
//		
		//		HashSet set = new HashSet();
//		set.add("1");
//		set.add("2");
//		set.add("1");
//		set.add("3");
//		set.add("1");
//		set.add("1");
//		set.add("1");
//		set.add("4");
		
		
		
		
		
		
		//object는 객체만 담을 수 있음. 1- int :자동형변환
//		Object[] objArr = {"1",new Integer(1),"2","2","3","3","4","4","4"}; //1,1,2,3,4
//		Set set = new HashSet();
//		
//		for(int i=0; i<objArr.length; i++) {
//			set.add(objArr[i]);
//		}
//		System.out.println(set);
	}//main

}//class






//1개 파일에 class 2개,- 2개 중에 하나만 public이 붙을 수 있음.Class이름이 붙어있는 거에 파일이름이 같아야함
class Person{
	String name;
	int age;
	
	Person(){}
	Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return name+":"+age;
	}
}//class
