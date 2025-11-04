package day3.shape;

public class Triangle extends Shape {
	//필드
	private String color; //면색상
	//생성자
	public Triangle () {}
	//getter/setter
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	};
	//method
	@Override
	public void draw() {
		System.out.println("삼각형을그리다");
	}
	
}
