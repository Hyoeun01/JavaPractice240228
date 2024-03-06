package ex_240306;

// 부모 클래스 와 클래스 정의

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
}

class C extends B {
	public C() {
		super(); // 생략이 되어있고, 묵시적이다
		System.out.println("생성자 C입니다");
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
	}

}
