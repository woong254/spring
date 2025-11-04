package day3.shape;

public class  Line extends Shape {
	//필드
	private int style;
	//생성자  생성자는 상속 X
	public Line () {
	}
	public Line (int sx, int sy, int ex, int ey, int style) {
		super(sx,sy,ex,ey);
		this.style = style;
	}
	public Line (int sx, int sy, int ex, int ey) {
		super(sx,sy,ex,ey);
	}
	//getter/setter
	public int getStyle() {
		return style;
	}
	public void setStyle(int style) {
		this.style = style;
	}
	@Override
	public void draw() {
		System.out.println("선을그리다");
	}
	//method
	
}
