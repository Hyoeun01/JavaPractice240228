package ex_240304;

// 클래스 정의
class Animal {
	// 하나의 클래스에는 각각 한개씩 사용한다
	// 지금은 예시로 클래스 안에 또다른 클래스 보여주기용도
	// 파일을 분리한다
	
	// 클래스 : 공장, 설계도면 >> 제품 : '인스턴스'라고 부른다
	
	// 구성 1) 멤버(변수) 2)메서드(기능)
	
	// 멤버
	// private 사용시 외부접근이 불가능하니 setter/getter로 접근할 수 있게 한다.
	// 현재는 public으로 변경한다.
	
	/*
	 * private String name ; private int age ;
	 */
	
	public String name ; public int age ;
	
	// 메서드 : 1)소개하는 기능 2)소리 기능
	public void introduceMethod() {
		System.out.println("안녕하세요! 현재는 더미로 작업중, 곧 동적으로 할 예정");
	}
	
	public void soundMethod() {
		System.out.println("현재는 더미로 소리를 냅니다. 곧 동적으로 할 예정");
	}
}

public class Ex_02_class_1 {

	public static void main(String[] args) {
		// 클래스 사용 문법 : 클래스명 레퍼런스변수명 = new 클래스명 ();
		// new 뒤에 오는 클래스명() : '생성자'라고 부르며 해당 인스턴스를 초기화시 사용한다.
		// 지금은 디폴트 생성자로 만들고, 매개변수를 이용해서 생성자를 만들 계획.
		// 오버로딩, this도 간단히 언급하겠습니다
		
		Animal ani1 = new Animal();   // 공장에서 제품을 찍어내듯이 만들기 >> 인스턴스 라고 부른다.
		Animal ani2 = new Animal();   // 각각의 인스턴스들은 다르다고 본다(프로그래밍에서)
		Animal ani3 = new Animal();   // 각각의 인스턴스들을 가리키는 메모리 위치 주소가 다르다.
		
		
		// 객체 사용법 > 닷연산자를 이용해서 (수납도구에서 꺼내듯이 사용하면 된다)
		// 접근지정자를 private로 선언하면 외부에서 접근이 안된다
		// setter/getter 소개후 다시 접근지정자를 private > public으로 바꾸거나 생략(기본=default)
		ani1.name = "ani1";
		ani1.age = 10 ;
		ani1.introduceMethod();
		ani1.soundMethod();
		
		ani2.name = "ani2";
		ani2.age = 7 ;
		ani2.introduceMethod();
		ani2.soundMethod();
		
		// 불만사항
		// 1) class 내부에 또다른 클래스가 있는것
		// 2) 해당 인스턴스 생성시 매번 인스턴스에 닷연산자 사용후 재할당하는부분 >>한번에 하기?
		// 3) 해당 기능들이 각각의 동물의 이름이나, 나이를 각각 출력하는 방법?
		
		
	}
}
