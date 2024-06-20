package p0620;

public class TV {
	
	//변수
	String color;
	boolean power;
	int channel;
	int volume;
	
	//메소드
	void power() {
		power = !power;
	}
	void channelUp() {channel++;}
	void channelDown() {channel--;}
	
	

}
