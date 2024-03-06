package ex_240306;


public class Ex_06_interface_main_2 {

	public static void main(String[] args) {
		// 인터페이스를 구현한 자식클래스 사용
		// 자식클래스타입 레퍼런스변수명 = new 자식클래스타입();
	
		Ex_06_interface_subclass_2 test3 = new Ex_06_interface_subclass_2();
		test3.showMenuLunch();
		test3.showMenuDrink();
		test3.showMenuSnack();
	}

}
