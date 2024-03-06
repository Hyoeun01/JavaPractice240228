package ex_240306;

// 자식클래스에서 구현
public class Ex_05_interface_subclass_1 implements Ex_05_interface {

	// 강제로 제정의 해줘야함
	@Override
	public void showInfo() {
		System.out.println("인터페이스를 구현한 하위클래스에서 showInfo 호출");
	}
	
	// 인터페이스 구현하는 기본문법 
	// 클래스명 implements 인터페이스1, 인터페이스2, 인터페이스3,...
}
