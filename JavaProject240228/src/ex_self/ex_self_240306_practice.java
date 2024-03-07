package ex_self;

class A {
	public void go() {
		come();
	}

	public void come() {
		come();
		System.out.println("A:come?");
	}
}

class B extends A {
	public void go() {
		super.come();
	}

	public void come() {
		System.out.println("B:come!");
	}
}

public class ex_self_240306_practice {

	public static void main(String[] args) {

		A a = new A();
		a.come();
	}

}
