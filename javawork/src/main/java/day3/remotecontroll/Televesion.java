package day3.remotecontroll;

public class Televesion implements RemoteControl {
	private int volume;

	@Override
	public void turnOn() {
		System.out.println("TV를 켠다");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끈다");
	}

	@Override
	public void setVolume(int volume) {
		if (volume > MAX_VOLUME) {
			this.volume = MAX_VOLUME;
		} else if (volume < MIN_VOLUME) {
			this.volume = MIN_VOLUME;
		} else {
			this.volume = volume;

		}
		System.out.println(volume);
	}
}
