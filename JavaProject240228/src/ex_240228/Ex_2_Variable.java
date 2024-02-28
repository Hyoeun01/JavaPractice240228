package ex_240228;

class Person {
	public String userName;
	public String userEmail;
	
	public Person( String name, String email ) {
		this.userName = name;
		this.userEmail = email;
		
	}
	

public void doDance() {
	
	System.out.println("춤추기");
}
// 정보를 호출하는 함수

public void showInfo() {
	System.out.println("이름 : "+this.userName+"메일 : "+this.userEmail);
	
}

}
public class Ex_2_Variable {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 변수 사용시 주의사항
		// 특수 문자는 _, $만 사용가능 : 첫 문자로는 사용하지않는다
		// 유니코드, 한글 사용 가능하지만 지양
		// 예약어(키워드)는 변수이름으로 사용할 수 없다
		// 길이 제한은 없지만 의미있게 짓기
		// 숫자로는 시작할 수 없다 예 ) int 12d;
		
		int 학번;
		
		// String class; // 컴파일러 오류 : 문법 검사 . class 는 사용할 수 없다
		
		// int !num; // 특수문자 사용x 
		int _num; 
		
		// 대문자와 소문자를 구분한다.
//		int num2;
//		int Num2;
		
		byte byte1 = 127;
//		byte byte2 = 128;
		
		//자바에서 데이터 타입 - 기본형/레퍼런스형 : 기본형을 제외한 모든 데이터타입(배열, 클래스, 인터페이스)
		//기본형 : byte short int(기본) long  - 정수형
		//float double - 실수형 : 소숫점으로 정밀하게 측정해야하는 데이터. 공학용
		//boolean char
		
		//문자열 + 숫자 = 문자열 이고 +는 연결 연산자를 나타낸다
		
		// 같은 타입이면 여러개를 한번에 선언할 수 있다.
		int i1, i2, i3 ;
		
		//각 진수 표기법
		int num1 = 10;
		System.out.println("num1 : "+num1);
		
		// 이진수 표기법 0b 예)0b1001
		int num2 = 0b1010;
		System.out.println("num2 : "+num2);
		
		// 팔진수 표기법 0 예)012
		int num3 = 012;
		System.out.println("num3 : "+ num3);
		
		// 16진수 표기법 0x 0~9,A,B,C,D,E,F 예 _)0XA
		int num4 = 0XA;
		System.out.println("num4 : "+ num4);
		
		long num5 = 1000000000000L;
		float num6 = 1.2345f;
		double num7 = 1.1234567890123456789012345678901234567890;
		
		// boolean
		boolean isChecked = false;
		
		//레퍼런스타입으로 선언하기
		// 클래스명 참조형 변수이름 = new(키워드) 클래스생성자(매개변수가 2개인 생성자 호출)
		// shePerson: 참조형변수(레퍼런스변수). 클래스에서 인스턴스를 생성
	
		Person shePerson = new Person("신효은", "shyoeun09@gmail.com");
		
		shePerson.doDance();
		shePerson.showInfo();
	}

}
