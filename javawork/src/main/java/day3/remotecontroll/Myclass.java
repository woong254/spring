package day3.remotecontroll;

public class Myclass {
	
	RemoteControl rc;

	public Myclass(RemoteControl rc) {
		this.rc = rc;
	}
	
	void methodA() {
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
	}
	
	void methodB() {
		rc.turnOn();
		rc.setVolume(3);
	}
}
