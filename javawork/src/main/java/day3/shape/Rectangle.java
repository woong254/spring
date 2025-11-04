package day3.shape;

public class Rectangle extends Shape {
	//필드
	private String color; //면색상
	//생성자
	public Rectangle () {}
	//getter/setter
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	//method
	@Override
	public void draw() {
		System.out.println("사각형을그리다");
	}
}
