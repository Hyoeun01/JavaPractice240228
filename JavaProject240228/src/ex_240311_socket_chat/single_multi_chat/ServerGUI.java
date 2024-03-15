package ex_240311_socket_chat.single_multi_chat;


import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ServerGUI extends JFrame implements ActionListener {
	
	// 서버든 클라이언트든 기본적인 텍스트 입력창. 채팅 보여주는 목록창
	// 이벤트 핸들러 ActionListener
	
	// 직렬화 객체 > 중간 데이터 타입으로 변경
	// 시리얼 라이즈드 > 해당 객체를 특정 중간 데이터로 변환해서 전달하고 중간 데이터를 누가 받아서 객체로 역 직렬화를 한다
	// 직렬화를 할 때 변경사항에 대해서 체크하는 아이디 : serialVersionUID
	// serialVersionUID가 변경되면 변경유무를 확인할 수 있다.
	// 보통 모바일에서 해당 앱 버전이 1.0.0 인데 업데이트를 하면 버전의 수치를 변경해서 1.0.1로 저장한다
	// 커밋 번호와 비슷하다. >> 버전 관리를 하는 식별 번호이다
	
	private static final long serialVersionUID = 1L;
	
	// html의 input이랑 비슷. text필드 (다수 입력이 가능한- 멀티라인)
	//채팅 목록 화면 
	private JTextArea jta = new JTextArea(40, 25);
	
	// 채팅의 입력 화면
	private JTextField jtf = new JTextField(25);
	
	// 백그라운드에서 실행에 필요한 인스턴스 도구
	// 서버에서 실행을 하면, 내부에 server라는 인스턴스가 있으므로 우리가 서버의 기능을 이용할 수 있다.
	private ServerBackground server = new ServerBackground();
	
	// JTextArea 스크롤 패널 붙이기 
//	JTextArea txtLog = new JTextArea();
//	JScrollPane scrollPane = new JScrollPane(jta, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
//			JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
	
	
//	contentPane.add(scrollPane);
//	출처: https://unikys.tistory.com/211 [All-round programmer:티스토리]

	// 디폴트생성자. 서버 클래스 인스턴스 생성시 반드시 실행이 되는 부분
	public ServerGUI() throws IOException {
		// 현재 , 보더 레이아웃  > 배치관리자 : 요소 정렬을 어떻게 할지 >> 동 서 남 북 센터 정렬
		// 플로우 레이아웃으로 변경해서, 확인 해보기. 
		
		// 프레임이라는 창에 요소를 붙이는 도구
		Container container = getContentPane();
		
		// 요소의 위치를 순서대로 나열한다
		// 배치관리자를 특정 지정을 안하면 기본은 보더레이아웃이다
		
		// 배치 관리자를 선정한다
		container.setLayout(new FlowLayout());  // flex랑 비슷하다
		// 요소의 위치를 지정
		// FlowLayout()
		container.add(jta);
		container.add(jtf);
		container.add(new JScrollPane(jta));
		
		
//		add(jta, BorderLayout.CENTER);	
//		add(scrollPane, BorderLayout.EAST);
//		add(jtf, BorderLayout.SOUTH);
		
		// 이벤트 핸들러 
		// this = serverGUI
		// 현재 클래스가 addActionListener 인터페이스를 구현하고 있어서, 추상메소드를 이용해서 사용가능.
		// 구현한 인터페이스에 정의된 메서드 명 : actionPerformed;
		jtf.addActionListener(this);

		// 부모 창을 종료시 설정하는 기능
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// 부모 창을 보이게 하기
		setVisible(true);
		// 부모 창의 경계 : 윈도우즈 창으로부터 x축으로 200 y축으로 100만큼이동하고 창의 길이가 가로400 세로600
		setBounds(200, 100, 400, 600);
		// 창의 제목
		setTitle("서버부분");
		// server: 백그라운드의 인스턴스
		// 해당 인스턴스의 멤버중에 현재 작업하는 클래스 (ServerGUI)를 멤버로 가지고있고
		// setGui 를 통해서 멤버를 업데이트함
		server.setGui(this);
		
		server.setting(); // GUI가 실행될때 서버도 같이 동작하도록..
	}

	public static void main(String[] args) throws IOException {
		// 해당 클래스를 실행하게되면
		// 본인의 디폴트 생성자를 호출하면서 실행된다.
		// 화면도 그리면서, 백그라운드도 동작한다
		// 왜? 현재 클래스에는 본인의 화면을 그리는 업무 외에 서버의 인스턴스도 가지고 있기 때문.
		new ServerGUI();
	}

	// jtf 의 이벤트 핸들러가 동작시 수행하는 메서드 부분
	@Override
	public void actionPerformed(ActionEvent e) {
		// jtf.getText() : 입력창에 입력된 메세지 가져오기
		String msg = "서버 : " + jtf.getText() + "\n";
		// 본인 콘솔에 출력
		System.out.print(msg);
		// 상대방(클라이언트)에게 메세지 전달
		server.sendMessage(msg);
		// 현재 본인(서버)창에 내용을 붙인다
		appendMsg(msg);
		// 메세지 입력 후에는 입력란을 비운다
		jtf.setText("");
		
		// 추후 계획 >> 데이터베이스에 내용을 저장하면 좋지않을까?
		
	}

	public void appendMsg(String msg) {
		// 채팅창에 해당 메세지를 붙이는 기능.
		jta.append(msg);
	}
}