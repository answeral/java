package p0624;

import java.util.Arrays;

public class C0624_07 {
	// 참조형 매개변수 :return을 안받아도 됨
	// 기본형 매개변수 : return을 받아야함
	public static void main(String[] args) {
		int a =10;
		int b = 5;
		int[] arr = new int[4]; 
		
	
		Element c = new Element();
		c.allCal(a,b,arr); //참조변수로 넘김 arr:배여루
		
		
		System.out.println("더하기 : "+arr[0]);
		System.out.println("빼기: "+arr[1]);
		System.out.println("곱하기 : "+arr[2]);
		System.out.println("나누기 : "+arr[3]);
		
		//Element의 메소드를 활용해서
		//a,b의 사칙연산 결과값을 출력하시오.
		//cal(a,b);
		
		
		//더하기:15
		//빼기:5
		//곱하기:50
		//나누기:2
	}

}
