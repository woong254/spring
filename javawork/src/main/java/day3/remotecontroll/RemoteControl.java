package day3.remotecontroll;

/*
 * 인터페이스 = 상수 + 추상메서드 
 */

public interface RemoteControl {
	
	//상수(final)
	public static final int MAX_VOLUME= 10;
	// 아래선언이 위처럼 생략되어 있음
	int MIN_VOLUME= 0;
	
	//추상메서드 abstract 생략가능
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
}
