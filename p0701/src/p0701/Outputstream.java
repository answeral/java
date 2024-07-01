package p0701;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Outputstream {

	public static void main(String[] args) throws Exception {//try-catch사용x 대신 error시 다운

		
			FileOutputStream fos = new FileOutputStream("c:/save/abc.txt");
			String str = "S0001,홍길동,100,100,100,300,100.0,0\r\n";//\r : 제일 끝에와서 \n:엔터키를 쳐라
			str += "S0002,유관순,99,99,99,297,99.0,0\r\n";
			byte[] bytes = str.getBytes(); //1바이트씩 쪼개서 배열에 담음 ex)25바이트면 1바이트씩 25개
			for(byte b : bytes) { //단순for문
				fos.write(b);
			}
			
		//try - catch
//		try {// 1byte씩 저장
//			FileOutputStream fos = new FileOutputStream("c:/save/abc.txt");
//			String str = "S0001,홍길동,100,100,100,300,100.0,0\r\n";//\r : 제일 끝에와서 \n:엔터키를 쳐라
//			str += "S0002,유관순,99,99,99,297,99.0,0\r\n";
//			byte[] bytes = str.getBytes(); //1바이트씩 쪼개서 배열에 담음 ex)25바이트면 1바이트씩 25개
//			for(byte b : bytes) { //단순for문
//				fos.write(b);
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		
		System.out.println("파일에 글이 저장되었습니다.");
//		for(int i=0;i<bytes.length;i++) {
//			fos.write(bytes[i]);
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//폴더생성, 파일 생성
		
		//		String str = "c:/save1";
//		File folder = new File(str);//새로운 폴더 만들기~~
//		File file = new File(str+"/13.txt");//새로운 파일 만들기~~
//		try {
//			if(!(folder.exists())) {
//				System.out.println("폴더를 생성했습니다.");
//				folder.mkdirs(); //폴더 생성
//			}
//			file.createNewFile();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}//파일저장
//		
//		System.out.println("파일이 생성되었습니다.");
//		
		
	}//main

}//class
