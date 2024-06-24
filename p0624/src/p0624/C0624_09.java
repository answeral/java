package p0624;

public class C0624_09 {

	public static void main(String[] args) {
		
		//객체 선언 후 white, auto, 4
		//기본생성자
		Car c = new Car();
		c.color = "white";
		c.gearType = "auto";
		c.door = 4;

		//매개변수가 있는 생성자
		Car c3 = new Car("white","auto",4);
		System.out.println("c.color : "+c.color);
//		System.out.println("c.color : "+c.color); this륿 붙이지 않으면 null;
		//객체선언 후 red, auto, 5
		Car c1 = new Car();
		c1.color = "red";
		c1.gearType = "auto";
		c1.door = 5;
				
		Car cc = new Car("Red","auto",5);

		//객체 선언 후 blue, auto, 3
		Car c2 = new Car();
		c2.color = "blue";
		c2.gearType = "auto";
		c2.door  = 3;
		
		Car ccc =  new Car("blue","auto",3);
		
		
		
		
//		Data d = new Data();
//		Data2 d2 = new Data2(); //에러->에러없음 : 기본생성자 만듦
//		Data2 d3 = new Data2(10);//에러발생하지않음
		
		

	}

}
