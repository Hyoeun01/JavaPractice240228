package ex_240313;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

// 화면 ui담당 클래스 ------3
class MyLabel extends JFrame{
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
	
	// 그림을 그려주는 기능 부분
	// paintComponent 메서드 > 매개변수 : Graphics 타입의 레퍼런스 정의
	// 분홍색 바의 수치가 증가하면 수치에 맞게끔 상태바가 그림을 그려주는 역할.
	
	public void paintComponent(Graphics g) {
		// 그림을 그릴때 부모의 기능을 재정의해서 사용예정
	super.paintComponents(g);
	// 그리려는 막대의 색 설정
	g.setColor(Color.magenta);
	
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
	public void consume() {
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
public class Ex_05_wait_notify {

	public static void main(String[] args) {
		

	}

}
