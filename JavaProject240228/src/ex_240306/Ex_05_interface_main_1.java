package ex_240306;

import ex_240228.Test1;

public class Ex_05_interface_main_1 {

	public static void main(String[] args) {
		// 인터페이스를 구현한 자식클래스 사용
		// 자식클래스타입 레퍼런스변수명 = new 자식클래스타입();
	
		Ex_05_interface_subclass_1 test1 = new Ex_05_interface_subclass_1();
		test1.introduceInfo();
		test1.showInfo();
		System.out.println("test1.MAX : "+test1.MAX);
		
		//private 메서드 호출 > 외부에서는 불가능하니
		// 해당 인터페이스의 메서드안에 private 메서드를 호출하는것을 넣기
		
		
		// 다형성 , 업캐스팅, 다운캐스팅
		// 문법 : 상속에서 업캐스팅하는것과 동일하다
		// >> 자식클래스가 구현한 인터페이스로 받는타입으로 사용이 가능하다.
		// 인터페이스명 레퍼런스변수명 = new 자식클래스타입();
		
		Ex_05_interface test2 = new Ex_05_interface_subclass_1();
		
		
	}

}
