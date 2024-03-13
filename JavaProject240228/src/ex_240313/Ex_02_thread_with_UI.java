package ex_240313;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

// 방법 1.
//스레드를 상속받은 클래스 정의
class TimerThread2 extends Thread {
	
	// JLabel - 자바버전의 화면UI. 빈 도화지 역할
	
	public JLabel timerLabel;
	
	// 매개변수가 1개인 생성자 호출 >> timerLabel ,화면을 인스턴스로 받기 
	
	public TimerThread2(JLabel label){ // label로 받기
		this.timerLabel = label;
	}
	
	@Override
	public void run() {
		super.run();
		int n = 0; // 타이머에 사용될 숫자값.
		
		while (true) {
			// 해당 숫자타입을 문자열 타으로 변환해야함 >> wrapper 이용
			timerLabel.setText(Integer.toString(n));
			n++;
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("외부에서 해당스레드를 interrupt시켜서 예외발생. 종료");
				e.printStackTrace(); // 이유 발생을 빨간색글씨로 알려주세요 (콘솔에 출력됨)
				return ; // >> 메소드가 종료되었으므로 스레드도 종료된다
				// return이 없으면 run메소드를 빠져나오지 못해서 예외가 발생했음에도 실행이된다
			}
		}
	}
}

// 방법 2 > runnable 인터페이스로 스레드만들기

class TimerThread3 implements Runnable {
	
	// JLabel - 자바버전의 화면UI. 빈 도화지 역할
	
	public JLabel timerLabel;
	
	// 매개변수가 1개인 생성자 호출 >> timerLabel ,화면을 인스턴스로 받기 
	
	public TimerThread3(JLabel timerLabel){ // label로 받기
		this.timerLabel = timerLabel;
	}

	@Override
	public void run() {
		
		int n = 0; // 타이머에 사용될 숫자값.
		
		while (true) {
			// 해당 숫자타입을 문자열 타으로 변환해야함 >> wrapper 이용
			timerLabel.setText(Integer.toString(n));
			n++;
			try {
				Thread.sleep(1000); // thread의 정적메소드라서 , 바로 호출.
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
	}
	

}

public class Ex_02_thread_with_UI extends JFrame {
	// 화면을 그리기 위해서 기본 생성자에서 준비단계를 거친다

	Ex_02_thread_with_UI(){
		// window 부모창에 제목 설정
		setTitle("상속받은 스레드 클래스 테스트");
		
		// 창에 엑스박스 누르면 창을 종료한다
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 부모창에 흰 캔버스 설정. 배치를 어떻게 할지도 지정
		Container container = getContentPane();
		
		// FlowLayout > html의 fraction과 비슷함. 순서대로 나열하는 방식
		// 정렬방식 설정
		container.setLayout(new FlowLayout());
		
		// 시간을 표시하는 라벨(패널)을 붙이는 작업하기
		// 순서 > 라벨만들기
		JLabel timerLabel = new JLabel();
		// 옵션지정하기 : 글꼴 모양, 크기 , 기울기 등
		// setFont 메소드 이용 setFont(Font 참조형변수)
		
		// Font font = new Font("Gothic",Font.ITALIC, 100);
		// setFont(font) >> 재사용할 의도가 있을때 사용하는방법
		
		timerLabel.setFont(new Font("Gothic",Font.ITALIC, 100)); // 재사용할 의도가 없음 (일회용으로 생성)
		timerLabel.setBackground(Color.BLUE);
		
		JLabel testLabel = new JLabel("test");
		testLabel.setBackground(Color.CYAN);
		testLabel.setOpaque(true);
		
		JLabel timerLabel2 = new JLabel();
		timerLabel2.setFont(new Font("Gothic",Font.ITALIC, 100));
		
		
		// 해당 라벨을 부모의 캔버스에 붙인다
		container.add(timerLabel);
		container.add(testLabel);
		container.add(new JButton("test2"));
		
		
		container.add(timerLabel2);
		
		
		// 부모 창에 가로 세로 크기 지정하기
		setSize(300, 200);
		// 부모창을 보여줄지 여부 지정하기
		setVisible(true);
		container.setBackground(Color.ORANGE);
		
		// 스레드작업
		TimerThread2 tt2 = new TimerThread2(timerLabel);
		
		tt2.start();
		
		// 방법2의 스레드 호출하기
		TimerThread3 tt3 = new TimerThread3(timerLabel2);
		
		Thread th3 = new Thread(tt3);
		th3.start();
		
		
		System.out.println("tt2.interrupt() 호출");
		tt2.interrupt();
		
	}
	
	public static void main(String[] args) {
		
		// JLabel를 패널이라고하고, 패널을 붙이는 창(프레임)이 필요함.
		// UI기능을 많이 가지고있는 클래스 하나(JFrame)를 상속받을것
		
		Ex_02_thread_with_UI test = new Ex_02_thread_with_UI();

	}
	
	// 화면을 그려주는 정적메서드 생성 하고싶었는데 안됐다
	public static void makeUI() {
		
		
	}

}
