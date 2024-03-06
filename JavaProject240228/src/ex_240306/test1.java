package ex_240306;

public interface test1 extends test2, test3 {
	// class A extends B
	
	String menu_snack = "포카칩";
	void showMenuSnack();

	// test1 인터페이스에 여러가지 기능을 다 넣어버리면
	// 유지보수가 어려워진다 
	
	// 뒤에가면 프레임워크 배울때 결합도 - 느슨한 결합을 해서 유지 및 개발함

	// 상속으로 기능을 묶을 수 있다고 해서 전부 다 묶으면 안된다요

	// 프레임워크 > MVC간 연결관계를 강하게 하기보단 느슨하게 하는것이 낫다
	// JSP, 모델2 MVC를 생각할때 다시 마주하게 될것이다
	// 보통의 프로젝트들: 템플릿 등은 느슨하게 설계가 되어있다.
	
}
