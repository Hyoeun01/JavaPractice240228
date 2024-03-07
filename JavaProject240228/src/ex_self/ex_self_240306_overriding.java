package ex_self;

class SuperObject{
	public void paint() { draw();}
	public void draw() {
		draw();	// >> System.out.println("Sub Object");        // 3
		System.out.println("Super Object");					   // 5
	}
}

class SubObject extends SuperObject {
	public void paint() { super.draw(); }                      // 2
	public void draw() { System.out.println("Sub Object");}	   // 4
	
}

public class ex_self_240306_overriding {

	public static void main(String[] args) {
		SuperObject b = new SubObject();
		b.paint();                                             // 1
	}

}
