package p0628;

public class Card {
	
//	enum Kind{SPADE,CLOVER,HEART,DIAMOND}
	
	
	private int number;
	private String kind;
	
	Card(){}
	Card(int number,String kind){
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
		return kind;
	}
	
	public void setKind(String kind) {
		this.kind =kind;
	}
	
	public String toString() {
		return String.format("%d, %s",number,kind);
	}
	
}
