package ex_240306;

class A {
	// 멤버, 인스턴스변수
	public int number;
	
	// 클래스변수. 전역으로 사용됨
	static int commonNumber;
	
	
	// 매개변수가 1개인 생성자
	public A(int num) {
		this.number = num;
	}
	
	// 메서드
	public void showNumber() {
		System.out.println("A클래스 number : "+ this.number);
	}
	
	// 전역변수 변경하는 메서드
	
	public void changeStaticValue() {
		commonNumber++;
	}
}

public class Ex_02_static_1 {

	public static void main(String[] args) {
		
		A a1 = new A(100); // 각각 가리키는 레퍼런스 참조값(메모리 위치 주소값)이 달라서
		a1.showNumber();
		A a2 = new A(200); // 두개는 다른 인스턴스이다
		a2.showNumber();
		
		System.out.println("================================");
		
		// a1 인스턴스에서 전역변수에 접근해서 '값을 변경해보기'
		// 주의사항 : 인스턴스로 해당 클래스 변수에 접근이 가능하지만 권장하지 않는다.
		// 컴파일러에서 경고를 표시함.
		// 원래는 해당클래스명.전역변수로 접근 (예 : A.commonNumber)
		a1.commonNumber = 1000;
		
		// a1 인스턴스에서 메서드 이용해서 전역변수를 변경하는 기능 이용해보기
		
	}

}
