package ex_240313;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

// 화면 ui담당 클래스 ------3
// 막대만 그리는 클래스 이므로 실제 전체창은 메인에서 그린다
class MyLabel extends JLabel{
	// jframe : 자바버전의 화면그리는 도구 모음집
	// 막대의 수치를 수치를 담을 변수 : 전체가 100
	// 해당 막대의 수치가 커질수록, 분홍색(마젠타색)으로 채울예정
	private int barSize = 0;
	//최대 막대의 크기 : 100
	private int maxBarSize;
	
	// 생성자
	MyLabel(int maxBarSize){
		this.maxBarSize = maxBarSize;
	}
	// getter 만들어서 private 접근
	
	// 그림을 그려주는 기능 부분
	// paintComponent 메서드 > 매개변수 : Graphics 타입의 레퍼런스 정의
	// 분홍색 바의 수치가 증가하면 수치에 맞게끔 상태바가 그림을 그려주는 역할.
	// repaint 호출시 이 아래가 호출된다
	public void paintComponent(Graphics g) {
		// 그림을 그릴때 부모의 기능을 재정의해서 사용예정
	super.paintComponent(g);
	// 그리려는 막대의 색 설정
	g.setColor(Color.MAGENTA);
	
	// 막대의 전체사이즈의 1/100 만큼씩 그리는 수치
	int width = (int)(((double)this.getWidth())/maxBarSize*barSize);
		//분홍색 막대 그래프가 없으면
	if(width == 0) 
		return; 
		// 첫번째 매개변수 x의 위치, 두번째는 y의 위치, 3번째는 막대의 가로길이, 4번째는 막대의 세로길이
		g.fillRect(0, 0, width, this.getHeight());
	}
	
	//동기화
	// 1단계 >> 키 입력 받으면 분홍색막대 증가기능
	// 2단계 >> 키 입력 없으면 분홍색막대 감소기능
	// 두가지가 섞이면 내가 원하는 기능이 구현이안됨
	// (버튼을 눌렀는데 막대가 감소한다거나)
	
	// getter 만들어서 private 접근. 막대바 사이즈 가져오기
	public int getBarSize() {
		return barSize;
	}

	// 키 입력시 분홍색 막대 채우는 기능
	synchronized void fill() {
		// 처음이거나 가만히있을경우
		if (barSize == maxBarSize) {
			try {
				// 해당 스레드를 잠시대기함
				// notify 메서드가 호출이되면 다시 스레드가 동작을 함
				wait();
			} catch (Exception e) {
				return;
				}
		}
		// 그려주는 역할.
		barSize++;
		repaint(); // 분홍색 막대를 그리기
		notify(); // wait로 대기중인 메소드를 깨워서 동작시키기
	}
	synchronized public void consume() {
		if(barSize==0) {
			try {
				//키 입력이 없으면 기다리기
				wait();
			} catch (Exception e) { return; }
		}
		barSize --;
		repaint();
		notify(); // 깨운다 == 다시 그림을 그린다
		// 분홍색으로 1씩 그리거나, 1씩 감소해서 그리거나
	}

}


// 스레드 담당 클래스 ------2
class ConsumerThread extends Thread {
	// 막대 그림을 그려주는 인스턴스
	private MyLabel barLabel;
	
	ConsumerThread(MyLabel barLabel){
		// 스레드 담당 클래스에 막대 인스턴스 넘겨주기
		this.barLabel=barLabel;
	}
	
	@Override
	public void run() {
		super.run();
		while(true) {
			try {
				// 0.2초씩 대기
				sleep(200);
				// 키 입력이 없을시 0.2초마다 막대감소
				barLabel.consume();
			} catch (InterruptedException e) {
				// e.printStackTrace();
				return;
			}
		}
	}
}

// 실행용 클래스 ----1
// 부모의 윈도우창 의미
// MyLabel 클래스 > 막대의 그림만 의미
// MyLabel을 윈도우창에 붙일 예정
public class Ex_05_wait_notify extends JFrame {
	
	// 사용할 막대 인스턴스 생성하기 // 최대크기는 임의로 100으로 설정
	private MyLabel bar = new MyLabel(100);

	// 실행할 클래스에서 생성자 호출
	Ex_05_wait_notify(){
		setTitle("분홍색 막대 채우기_wait_notify");
		//창닫기 기능
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 패널요소 배치(정렬방법)
		// 틀린거 수정1
		Container container = getContentPane();
		// 요소의 정렬기능이 없음
		// 단순히 막대바 하나만 있으면 되기때문에
		container.setLayout(null);
		// 기본 막대의 배경색 : 오렌지
		bar.setBackground(Color.orange);
		// jlabel의 기본이 투명도가있어서, 메서드 호출해서 지정
		bar.setOpaque(true);
		//창으로부터 가로 20, 세로 50만큼 떨어짐
		bar.setLocation(20,50);
		// 바의 크기
		bar.setSize(300, 20);
		
		// 창에 막대 붙이기 작업
		container.add(bar);
		
		// 추가작업해보기 : barsize의 수치를 표현하는 패널 붙이기 작업
		JLabel barSizeLabel = new JLabel("바크기 : "+bar.getBarSize());
		
		// 이벤트 핸들러 추가
		// 키 입력시 채우는 기능 넣기
		// new keyadapter : 익명클래스. 이름이 없고, 주로 1회용으로 사용. 
		container.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				super.keyPressed(e);
				// 키입력으로 분홍색 막대를 1씩 채우는역할
				bar.fill();
			}
		});
		setSize(350, 200);
		setVisible(true);
		
		// 부모 창에서의 옵션. 포커스
		// 요소의 집중 > 입력란에 커서가 깜박이는 것처럼 해당 요소를 가리키고 있다.
		container.setFocusable(true);
		container.requestFocus(); // 막대가 그려질때마다 해당 창을 봐달라는 뜻
		
		// 스레드 동작시키기
		ConsumerThread thread = new ConsumerThread(bar);
		// 스레드 호출
		thread.start();
		
	}
	
	public static void main(String[] args) {
		// 메인 클래스의 기본 생성자 호출을 바로함
		// 원래는 인스턴스명에 담아서 호출해야하지만
		// >> Ex_05_wait_notify test = new Ex_05_wait_notify();
		new Ex_05_wait_notify();

	}

}
