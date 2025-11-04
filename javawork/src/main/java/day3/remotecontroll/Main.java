package day3.remotecontroll;

public class Main {
	public static void main(String[] args) {
		Myclass myClass = new Myclass(new Audio());
		myClass.methodB();
		
		myClass = new Myclass(new Televesion());
		myClass.methodB();
	}
}
