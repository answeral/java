package p0624;

public class C0624_11 {

	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car();
		Car c3 = new Car();
		Car c4 = new Car("pink");
		Car cc = new Car("blue","auto",5);
		Car car = new Car("red","auto",4);
		Car c = new Car("gray","auto",5);
		
		System.out.println("serial_no c1 :"+c1.serial_no);
		System.out.println("serial_no :"+c.serial_no);
		System.out.println("serial_no c4:"+c4.serial_no);

	}

}
