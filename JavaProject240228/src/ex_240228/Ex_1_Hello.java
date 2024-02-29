package ex_240228;

	// class ; 수납도구 1)필드, 2) 메서드를 가지고 있다
public class Ex_1_Hello {
	// ctrl+M >코드창만 활성화

	// public : (접근 지정자) 모든 위치에서 접근 가능
	// static : (전역)클래스 메소드(함수), 매개변수 2개이고, 리턴값도 있다.(리턴의 타입이 존재한다)
	// return의 type:int. sum메소드를 수행 후 결과값을 반환
	// sum : 메소드 명
	// (int a, int b): 매개변수. 변수명은 임의로 작성 가능
	// 이 메소드는 해당 클래스가 로더:클래스를 불러오는 역할
	// 실행 시 해당 static 붙은 메소드, 변수 등은 시스템에 불러와져 있기 때문에
	// 클래스 명으로 바로 사용 가능

	// return >> 결괏값 의미
	// 메소드 정의 부분
	public static int sum(int a, int b) {
		return a + b;
	}

	// void : 리턴값이 없다는 뜻 ( 비어있다 )
	// main : 메소드 명
	// (String[] args) : 매개변수 정의 부분. 타입이 배열로 정의 되어 있음
	// String[] : 배열이고, 타입은 String(문자열)vs char(하나의 문자)
	// main 메소드는 자바의 프로그램의 시작을 의미

	public static void main(String[] args) {

		// 뼈대 코드. 지워도 상관x
		// TODO Auto-generated method stub

		// 변수타입 변수명 = 값;
		/*
		 * 변수타입 종류 
		 * 1.기본형타입: int, char 등 
		 * 2.레퍼런스타입(참조형):기본형을 제외한 나머지 모든 타입 >> 인스턴스
		 * 
		 */
		// 변수 선언과 할당을 동시에 진행

		int i = 20;

		// 변수 선언과 할당을 따로 진행할 수 도 있다
		int i2;
		i2 = 3;

		char a = 'a'; // 문자 하나를 표기시 사용. 기호는 작은따옴표 사용
		String str = "신효은"; // 문자 열 표기시 사용하며, 기본형이 아니다. 기호는 큰 따옴표 사용
		
		// 전역함수이기때문에 함수이름이 기울어져있다
		int resultNum = sum(100, 200);
		
		// 출력 연습
		System.out.println("출력연습 : 단축키 syso ctrl+space enter");
		System.out.println("i 값 : " + i);// 문자열+숫자 : + 연결연산자
		System.out.println("실행 단축키 : ctrl + F11");
		System.out.println("==============================");
		System.out.println("i2 값 : " + i2);
		System.out.println("a 값 : " + a);
		System.out.println("str 값 : " + str);
		System.out.println("resultNum 값 : " + resultNum);
		System.out.println("==============================");
		System.out.print("줄넘김없이 출력1");
		System.out.print(",줄넘김없이 출력2");
		
		
		// 멀티주석 : ctrl + shift + /
		// 해제 : ctrl + shift + \
		// 단축키 1) 자동완성 / 2) 포맷터 > 검색

		// 들여쓰기가 의무는 아니지만 코드의 가독성을 위해서 가급적 들여쓰기 할 것
		
		// 자동정렬 : ctrl + shift + f

	}

}
