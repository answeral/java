package p0701;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Inputstream {

	public static void main(String[] args)  {//FileNotFoundException
		// 입출력 : 입력과 출력, 두 대상 간의 데이터를 주고 받는 것
		// 스트림 : 데이터를 입촐력하는데 사용되는 연결통로 : 각각 1개씩 필요 -> 총 2개 필요 (입출력시)
		//Inputstream, Outputstream : 1바이트씩 읽고 출력
		
		
		//기본적인 InputStream형태 : 파일을 읽어들일때 
		//하나씩 읽어들임
		try {
			FileInputStream fis = new FileInputStream("c:/save/aaa.txt");
			int read = 0;
				while(((read = fis.read()) != -1)) { //fis.read()파일의 데이터를 읽어어옴. read -1이면 종료
				System.out.println((char)(read));//read가 int여서 char을 해야 문자로 나옴
				}
			}catch (Exception e) {e.printStackTrace();}
		
//		try {
//			FileInputStream fis = new FileInputStream("c:/save/aaa.txt");
//			int read = 0;
//			try{
//				while(((read = fis.read()) != -1)) { //fis.read()파일의 데이터를 읽어어옴. read -1이면 종료
//					System.out.println((char)(read));//read가 int여서 char을 해야 문자로 나옴
//				}
//			} catch (IOException e) {e.printStackTrace();	}
//			
//		}catch (FileNotFoundException e) {e.printStackTrace();}
		
		//한 번에 받아들임
//		byte[]b = new byte[1024]; //1024바이트씩 읽어옴
//		try {
//			FileInputStream fis = new FileInputStream("c:/save/aaa.txt");
//			fis.read(b); // 파일 읽어오기
//			System.out.println(new String(b));
//			
//			
//			
//		} catch (Exception e) {e.printStackTrace();}//예외처리
		

	}

}
