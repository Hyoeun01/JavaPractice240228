package ex_240313;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.management.loading.PrivateClassLoader;
import javax.swing.JFrame;

/*
조금전에는 
첫번째는 스레드 상속 또는 구현한 클래스
두번째는 해당클래스를 실행하는 클래스

이번에는 두개를 합쳐서 해봅시다 >> 실행하는 클래스에서 runnable인터페이스도 구현하고, jframe도 상속받기.*/

public class Ex_03_thread_runnable_event extends JFrame implements Runnable {
	
	// 인터페이스 구현해서 스레드 동작하려면 인터페이스 구현한 클래스의 인스턴스를
	// Thread 생성자에 인자값으로 사용해야한다.
	// 그래서 ,Thread 타입의 레퍼런스 필요함
	
	// 스레드 동작을 위한 인스턴스
	private Thread th;
	
	// JFrame 상속받아서, 자바에서 제공해주는 swing패키지 안에있는 ui요소 사용예정
	
	// 생성자를 이용해서 창을 그리기 준비.
	Ex_03_thread_runnable_event(){
		// 창 제목 설정
		setTitle("클릭시 창이 진동하는 것처럼 보이게하기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 창 닫기 버튼 생성, 클릭시 종료하게
		setSize(400, 400);
		// 부모창의 왼쪽 위의 모서리를 화면으로부터 왼쪽에서 300px, 위쪽에서 300px떨어지게 설정
		setLocation(300, 300);
		
		// 화면 표시하기
		setVisible(true);
		
		// 이벤트 핸들러 추가하기  >> 특정의 인터페이스를 구현한 익명클래스를 인자값으로 이용함
		// 자바에서 이벤트 핸들러같이 1회용으로 사용되는 클래스를 말함.
		// 익명클래스는 람다식이라고 해서 화살표함수로 변경해서 사용한다.
		
		// 해당 캔버스에서 창을하나 붙이고 어딘가 클릭할시 이벤트 처리를 하기위한 리스너구성.
		// 리스너 : 액션(클릭, 입력 등)이 있는지를 감시중(듣고있어요)
		getContentPane().addMouseListener(
				// MouseAdapter 클래스는 마우스 클릭, 드래그, 더블클릭, 클릭해제(마우스를 눌렀다가 뗀순간)
				// 메서드를 가지고있는 클래스 
				new MouseAdapter() {
					// 그중에서 클릭시에 수행하기위해 mousePressed 수행.
					// MouseEvent 는 클릭을 의미
		public void mousePressed(MouseEvent e) {
			// 클릭을 하면, 스레드가 살아있다면 interrupt를 호출, 죽었다면 return
			if(!th.isAlive())  return; 
			th.interrupt(); }; 
			
		}
				);
		
		th = new Thread(this);
		th.start();
		
	}
	
	
	public static void main(String[] args) {
	
		Ex_03_thread_runnable_event test = new Ex_03_thread_runnable_event();
	}

	@Override
	public void run() {
		// 진동구현하기
		// 특정시간마다 진동하기
		Random random = new Random();
		while (true) {
			try {
				Thread.sleep(30);
			} catch (Exception e) {
				return;
			}
			// getX() :부모클래스에서 제공해주는 해당창의 x좌표 가져오기
			
			//random.nextInt()%5 = 0,1,2,3,4 중 1개
			int x = getX()+ random.nextInt()%5 ; //새로운 x의 위치
			int y = getY()+ random.nextInt()%5 ;
			
			// 창의 위치를 0.03초마다 변경하기 >> 진동하는것 처럼 보인다
			setLocation(x, y);
		}
		
	}

}
