package p0617;

public class C0617_17 {

	public static void main(String[] args) {
		//1-100까지, 랜덤수자 10개 생성해서 10개의 숫자의 합을 출력하시오.
//		System.out.println(num);
		int sum = 0;
		int i = 0;
		for (i=1;i<=10;i++) {
			int num = (int)(Math.random()*100)+1;
			sum += num;
			System.out.printf("%d + ",num);
		}//for
		System.out.println(" = "+sum);
	}

}
