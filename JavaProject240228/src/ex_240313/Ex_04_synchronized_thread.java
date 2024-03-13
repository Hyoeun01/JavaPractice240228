package ex_240313;

import javax.management.loading.PrivateClassLoader;

// 공유 프린터 역할하는 클래스

class SharedPrinter {
	// 문제점 > 공유프린터에 순서없이 각 스레드가 모두 이용해서 발생했음
	// 해결법 > 순서를 지키기위한 synchronized 이용
	// 결론 : 각 스레드가 순서를 지켜서 실행이된다.
	// 화면상에는 영어먼저, 한글이 나중에 출력된다
	synchronized public void print(String text) {
		for (int i = 0; i<text.length(); i++) {
			System.out.print(text.charAt(i));
			System.out.println();
		}
	}
}

public class Ex_04_synchronized_thread extends Thread{

	// 클래스 참조형으로 선언만하기
	private SharedPrinter sharedPrinter;
	// 테스트로 출력할 문자열을 받을 배열 선언
	private String [] text;
	
	// 생성자 정의
	
	Ex_04_synchronized_thread(SharedPrinter sharedPrinter,String [] text){
		this.sharedPrinter = sharedPrinter;
		this.text = text;
	}
	
	// run 메소드 재정의하기
	// 실제로 동시에 작업할 내용적기
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for(int i = 0; i < text.length ; i ++) {
			// 공유프린터 인스턴스를 이용해서 해당메서드로 출력하기
			sharedPrinter.print(text[i]);
		}
	}
	public static void main(String[] args) {
		// 사용하기
		// 
		// 공유 프린터 사용하기 위한 인스턴스
		SharedPrinter sharedPrinter = new SharedPrinter();
		
		// sample data
		String [] engtextStrings = {"abcd","efgh","ijkl","mnop","qrstu","vwxyz"};
		String [] kortextStrings = {"한화","두산","롯데","엘지","삼성","기아"};
		
		// 스레드 인스턴스 생성
		// 매개변수가 2개인 생성자 생성; 1번째 매개변수 : 공유프린터의 인스턴스,
		// 2번째 매개변수 : 출력할 샘플, 문자열 타입의 배열 인스턴스
		Ex_04_synchronized_thread th1 = new Ex_04_synchronized_thread(sharedPrinter,engtextStrings);
		Ex_04_synchronized_thread th2 = new Ex_04_synchronized_thread(sharedPrinter,kortextStrings);
		
		// 정의한 스레드를 start메서드 이용해서 호출하기
		
		// 문제점 제시 : synchronized 유무에 따른 결과 보기
		th1.start(); th2.start();
		
		

	}

}
