package ex_self;

class SuperObject{
	public void paint() { draw();}
	public void draw() {
		draw();
		System.out.println("Super Object");
	}
}

class SubObject extends SuperObject {
	public void paint() { super.draw(); }
	public void draw() { System.out.println("Sub Object");}
	
}

public class ex_self_240306_overriding {

	public static void main(String[] args) {
		SuperObject b = new SubObject();
		b.paint();
	}

}
