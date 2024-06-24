package p0624;

import java.util.Arrays;

public class C0624_02 {

	public static void main(String[] args) {
		int[] arr = new int[3];
		arr[0] =1;
		arr[1] =2;
		arr[2] =3;
		System.out.println("arr :"+Arrays.toString(arr));//[1,2,3]
		System.out.println(arr);//[I@4aa8f0b4 : 주소값
		
		int[] arr2 = null;
		arr2 = arr;//주소값만 복사\
		System.out.println("arr2 : "+Arrays.toString(arr2));
		arr2[0] = 1000;
		System.out.println("------------------arr2[0] = 1000;로 바꾼 이후----------------------------------------");
		System.out.println("arr :"+Arrays.toString(arr));//[1,2,3]
		System.out.println("arr2 : "+Arrays.toString(arr2));
		
		
		
		
		
	}

}
