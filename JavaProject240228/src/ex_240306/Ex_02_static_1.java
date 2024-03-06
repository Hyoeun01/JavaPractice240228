package ex_240306;

class A {
	// 멤버, 인스턴스변수
	public int number;
	
	public String name;
	
	// 클래스변수. 전역으로 사용됨
	static int commonNumber;
	
	
	// 매개변수가 2개인 생성자
	public A(int num, String name) {
		this.number = num;
		this.name = name;
	}
	
	// 메서드
	public void showNumber() {
		System.out.println(this.name + " number : " + this.number);
		System.out.println(this.name + " commonNumber : " + this.commonNumber);
	}
	
	// 전역변수 변경하는 메서드
	
	public void changeStaticValue() {
		commonNumber++;
		
	}
}

public class Ex_02_static_1 {

	public static void main(String[] args) {
		
		A a1 = new A(100,"a1"); // 각각 가리키는 레퍼런스 참조값(메모리 위치 주소값)이 달라서
		a1.showNumber();
		A a2 = new A(200,"a2"); // 두개는 다른 인스턴스이다
		a2.showNumber();
		
		System.out.println("================================");
		
		// a1 인스턴스에서 전역변수에 접근해서 '값을 변경해보기'
		// 주의사항 : 인스턴스로 해당 클래스 변수에 접근이 가능하지만 권장하지 않는다.
		// 컴파일러에서 경고를 표시함.
		// 원래는 해당클래스명.전역변수로 접근 (예 : A.commonNumber)
		// a1.commonNumber = 1000;
		A.commonNumber = 1000;
		
		// a1 인스턴스에서 메서드 이용해서 전역변수를 변경하는 기능 이용해보기
		a1.showNumber();
		
		// a1 인스턴스에 있는 전역변수를 변경하는 함수를 호출
		a1.changeStaticValue();
		// 확인
		a1.showNumber();
		
		// a2 인스턴스의 숫자 조회
		a2.showNumber();
		
	}
	
		// 해당 클래스에서 static 으로 선언하면 다른 인스턴스에서 해당 전역변수에 접근시 해당 데이터가 공유된다.
		// a1에서 전역변수를 변경하고
		// 다른 인스턴스인 a2에서 접근하지 전역변수가 변경됨을 확인함.
	
		// 인스턴스 변수로 해당 클래스 변수에 접근이 가능하고, 반대로는 불가능
		// 클래스 변수로는 인스턴스 변수에 접근 불가능 !!
	
		// 인스턴스는 각각의 고유한 독립값이기 때문.
		// 클래스변수는 해당클래스가 로더에의해 로드가 되면 그때 존재하는 변수 , 즉 전역변수
	
	// int a12 = a1.commonNumber;
	// int a23 = A.a1.number; //불가능하다

}
