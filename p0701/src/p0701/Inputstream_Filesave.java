package p0701;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Inputstream_Filesave {

	public static void main(String[] args) {
		File f = new File("c:/save1");
		if(!f.exists()) f.mkdir();
		
		try {
			FileInputStream fis = new FileInputStream("c:/save/n.jpg.crdownload");
			FileOutputStream fos = new FileOutputStream("c:/save1/n2.jpg");
			while(true) {
				int read = fis.read();
				if(read==-1) break;
				fos.write(read);
			
			}
			fis.close();
			fos.close();
			
		} catch (FileNotFoundException e) {e.printStackTrace();
		System.out.println("이미지 파일이 복사되었습니다.");
		}
		

	}

}
