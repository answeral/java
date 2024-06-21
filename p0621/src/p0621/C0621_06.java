package p0621;

import java.util.Arrays;

public class C0621_06 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		
		System.out.println(Arrays.toString(arr));
		int[] arr2 = null; //현재 주소값만 생성
		System.out.println(Arrays.toString(arr2));
		arr2 = arr; //주소값만 복사
		System.out.println(Arrays.toString(arr2));
		
		System.out.println("-------------------------------");
		
		arr2[0] = 1000;
		
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr));
		
		
	}

}
