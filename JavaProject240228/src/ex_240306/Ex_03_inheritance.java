package ex_240306;

// 부모 클래스 와 클래스 정의

// 클래스 구조도 C -> B -> A2

class A2 {
	// 모든 클래스는 묵시적으로 Object 클래스를 상속받고있다.
	public A2(int x) {
		System.out.println("생성자 A2입니다");
	}
	
	// 두번째 방법: 디폴트 생성자를 만드는 방법
	public A2() {
		
	}
}

class B extends A2 {
	
	public B(int x) {
		// 첫번째 방법 : 부모클래스의 생성자에 타입을 맞춘다  = 깔맞춤
		super(x);
		x= 0;
		
		System.out.println("생성자 B입니다");
	}
	public B() {
		
	}
	public void showInfo() {
		System.out.println("showInfo() B클래스 메서드 호출 : " );
	}
}

class C extends B {
	public C() {
		super(); // 생략이 되어있고, 묵시적이다 : 자식의 생성자 호출전에 반드시 부모의 생성자가 호출되는것 === 약속
		System.out.println("생성자 C입니다");
	}
	
	// 부모클래스의 메서드 오버라이딩 함.
	//  애너테이션 > 시스템에게 메세지 전달
	// 내가 부모메서드를 재정의 했다고 알려주는 것 >> 혹시라도 컴파일러 체크시 문제가 생기면 알려달라고
	
	@Override
	public void showInfo() { // 가상메서드 라고한다.
		System.out.println("showInfo() C클래스 메서드 호출 : " );
	}
}

public class Ex_03_inheritance {

	public static void main(String[] args) {
		
		// 클래스 사용
		C c = new C();
		System.out.println("부모클래스 먼저 생성자 호출 확인");
		
		// 디버깅
		// 1) 라인번호 앞 더블클릭 > 브레이크포인트 지정
		// 예시로 C c = new C();
		// 2) F11 누르면 perspective 변경이됨
		// step into는 메서드, 생성자 호출시 안으로 들어가기 > F5
		// step over 는 변수나 메소드를 단순히 넘길 때(skip) > F6
		
		
		
		// instanceof 연산자 예제. C -> B -> A2
		// 큰집 = 작은집 > 다형성 - 업캐스팅
		
		// 문제점 : test 1,2,3의 원래객체를 알기어렵다.
		A2 test1 = new A2();
		A2 test2 = new B();
		A2 test3 = new C();
		
		boolean result1 = (test2 instanceof B) ? true : false;
		System.out.println(" test2 instanceof B : "+ result1);
		
		boolean result2 = (test2 instanceof A2) ? true : false;
		System.out.println(" test2 instanceof A2 : "+ result2);
		
		boolean result3 = (test2 instanceof C) ? true : false;
		System.out.println(" test2 instanceof C : "+ result3);
		
		// 오버라이딩
		// 부모클래스의 메서드를 자식클래스에서 재정의해서 사용하는 것
		// 이름이 똑같아서 시스템 입장에서는 이 기능이 부모것인지 자식것인지 모름
		// 자식의 재정의한 메서드를 사용한다.
		
		// B, C클래스에 모두 showInfo 메서드가 있다
		// C는 부모클래스의 메서드를 재정의했음
		
		System.out.println("==============오버라이딩");
		// 원래 자기 타입으로 인스턴스 생성 작은집 = 작은집
		B testB=new B();
		testB.showInfo();
		
		// 부모타입으로 인스턴스 생성 (다형성) 큰집 = 작은집
		B testC = new C();
		testC.showInfo();
		
		// 자식클래스가 부모클래스를 오버라이딩하면 자식클래스가 우선순위가된다.
		
	}

}
