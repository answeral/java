package p0624;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Stu_score {
	//생성자 
	//생성자 이름 = 클래스 이름, 생성자는 리턴값이 없다(void를 사용하지 않음)
	
	{	//초기화 블럭 - 가장 먼제 실행
		count ++;
		Date d = new Date();
		SimpleDateFormat sdf =  new SimpleDateFormat("yy");
		//S20240001,S20240002
		this.stuNo = "S"+sdf.format(d)+String.format("%03d", count);
		
	}
	
	
	
	//기본생성자 : 정의가 되어있지 않으면 기본생성자가 만들어짐
	Stu_score(){}
	
	//매개변수 생성자
	Stu_score(String name, int kor, int eng, int math){
		this.name = name;
		this.kor = kor;
		this.eng =eng;
		this.math = math;
		this.total = kor+eng+math;
		this.avg = total/3.0;
	}
	
	static int count;//클래스 변수 -모든 객체가 공용으로 사용
	String stuNo;
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	int rank;
	
	
}
