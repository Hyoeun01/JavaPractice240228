package ex_240313;

import java.time.LocalDate;
import java.time.LocalTime;

class TimerThread extends Thread{
	
	int num = 0;
	
	@Override
	public void run() {
		
		while(true) {
			System.out.println("스레드 기본 출력 테스트 num : "+num);
			num++;
			try {
				// 스레드가 1000ms만큼 기다렸다가 동작함
				sleep(1000);
			}
			catch (Exception e) {
				System.out.println("error : "+e.getMessage());
				
			}
			
		}
		
	}
	
}

class DateTimer extends Thread{
	
	// 컴파일러한테 내가 부모의 run메서드를 재정의했으니 잘 체크해달라고 알려주는것 
	@Override
	public void run() {
		
		super.run();
		while(true) {
			
			// 시간
			LocalTime currentTime = LocalTime.now();
			// 날짜
			LocalDate currentDate = LocalDate.now();
		
		
		try {
			System.out.println("현재 날짜/시간 : "+currentDate+" "+currentTime);
			// 스레드가 1000ms만큼 기다렸다가 동작함
			sleep(1000);
		}
		catch (Exception e) {
			System.out.println("error : "+e.getMessage());
			
		}
		
		}
	}
}
public class Ex_01_thread_class {

	public static void main(String[] args) {
		
		// 자바 스레드 기초
		// 멀티 스레딩 방식으로 작업함.
		// JVM 위의 응용프로그램 안에서 스레드1,2,3, ... 식으로 구성된다.
		// 실제 웹, 모바일 작업시 해당 프레임워크(스프링)에 내재된 기능 또는 외부API(기능)에 탑재가 되어있다.
		// 처음에는 주로 이용하는 편으로, API가 아니라 우리가 서비스 기능을 만들어야 할 때 이용한다.
		
		// 정의, 사용하는 방법을 알아봅시다.
		
		// 클래스 이용해서 상속 받아서 구현해보기
		
		// 예 ) class Person extends Thread
		// run 메서드 재정의해서 동시에 작업할 내용을 작성
		// 스레드를 상속받은 클래스의 인스턴스에서 start메서드를 호출하면 run 메서드가 동작을 하면서 그때 스레드 시작을 한다.
		
		// 순서 1. 스레드 클래스의 인스턴스 생성하기
		TimerThread tt = new TimerThread();
		
		// 순서 2. 만든 스레드를 상속받은 클래스의 인스턴스에서 start메서드 호출
		tt.start();
		// run메서드 동작
		
		// 두번재 스레드 동작하기
		DateTimer dt = new DateTimer();
		dt.start();

	}

}
