package ex_240311_test;

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

	public ColorPoint(int x, int y) { 
		super(x, y);
		this.i = x; 
		this.j = y; 
	}

	public ColorPoint(int i, int j, String color) { 
		this(i, j);
		this.color = color;
	}

	public void colorpoint(String color) { 
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
