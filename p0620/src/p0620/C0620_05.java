package p0620;

public class C0620_05 {

	public static void main(String[] args) {
		String stuNo = "S0001";
		String name ="홍길동";
		int kor= 100;
		int eng = 100;
		int math = 99;
		int total = kor+eng+math;
		double avg = total/3.0;
		int rank=0;
//		(stuNo,name,kor,eng,math,total,avg,rank)
//		(stuNo2,name2,kor2,eng2,math2,total2,avg2,rank2)
		
		
		
		//객체 선언
		Stu_score s1 = new Stu_score(); //변수 8개가 만들어짐
		s1.stuNo = "S0001";
		s1.name = "홍길동";
		s1.kor=100;
		s1.eng=100;
		s1.math=99;
		s1.total = s1.kor+s1.eng+s1.math;
		s1.avg = s1.total/3.0;
		s1.rank=0;
//		(s1,s2);		
		
		
		
		
	}

}
