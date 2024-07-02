package p0628;

public class Card {
	
	enum Kind{SPADE,CLOVER,HEART,DIAMOND}//{}안의 향태로만 받겠다
	
//	spade, SPADE,Spade로 입력을 할 수 있는데 SPADE로만 입력을 받겠다
	
	private int number;
	private Kind kind;
	
	Card(){}
	Card(int number,Kind kind){
		this.number = number;
		this.kind = kind;
		
	}
	
	public int getNumber() {
		return number;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public String getKiind() {
		return Kind;
	}
	
	public void setKind(Kind kind) {
		this.kind =kind;
	}
	
	public String toString() {
		return String.format("%d, %s",number,kind);
	}
	
}
