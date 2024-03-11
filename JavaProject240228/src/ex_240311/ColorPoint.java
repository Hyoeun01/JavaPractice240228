package ex_240311;

class Point{
	
	private int x, y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	
	protected void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
}

public class ColorPoint extends Point {

	private String color;
	private int i, j;

	public ColorPoint(int x, int y) { // 부모필드의 Point 초기화
		super(x, y);
		this.i = x; // ColorPoint 클래스의 멤버 변수인 i와 j를 초기화
		this.j = y; // ColorPoint 클래스의 추가적인 필드를 초기화
	}

	public ColorPoint(int i, int j, String color) { // 매개변수가 3개인 생성자
		this(i, j);
		this.color = color;
	}

	public void colorpoint(String color) { // 색을 변경하는 생성자 설정
		this.color = color;
	}
	
	public void show() {
		System.out.println(color + "색으로 (" + getX() + "," + getY() + ")");
	}
	
	
	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(5,5,"YELLOW");
		cp.move(10, 20); // setPoint
		cp.colorpoint("GREEN"); // setColor
		cp.show();
	}


}
