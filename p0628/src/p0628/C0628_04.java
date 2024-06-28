package p0628;

import java.util.Scanner;

public class C0628_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("찾고자 하는 문자열을 입력하세요.>>");
		String search =  scan.nextLine();
		
		String str = "abcdeakabcdefgaabcabcabcarerifjdjlcckdkssudzmffodhvkxmfk";
		System.out.println("해당문자열 \n"+str);
		int count = 0;
		while(true) {
			int num = 0;
			num = str.indexOf(search);
			if(num == -1) {
				break;//해당하는 문자열을 찾지 못했을때 -1,프로그램종료
			}else {
				count++;
				str = str.substring(num+1);//(num+2):연속된 2개문자를 찾을 수 있음.
			}
			
		}//while
		System.out.printf("%s 찾는 문자열 개수 : %d ",search,count);
		
		
		
		
//		System.out.println(str.indexOf("a"));//0
//		String str2 = str.substring(1);
//		System.out.println(str.substring(1));
//		System.out.println("str2 : "+str2.indexOf("a"));//4
//		String str3 = str2.substring(5);
//		System.out.println("str3 : "+str3.indexOf("a"));//1
//		String str4 = str3.substring(2);
//		System.out.println(str4);
//		System.out.println("str4 : "+str4.indexOf("a")); //6
//		String str5 = str4.substring(7);
//		System.out.println(str5.indexOf("a"));//-1
		
		
		
		
		
	}

}
