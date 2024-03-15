package ex_240315;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Ex_01_socket_singlechat_server {
	
		// 서버에서 소켓을 이용해서 특정 포트번호로 개방할 예정
		// 1인 2역으로 서버도되고 클라이언트 역할도 할 예정
		
	public static void main(String[] args) throws IOException {
		
		// 연결을 위한 로직
		
		// 데이터를 전달하기 위해서는 file의 IO이 필요하다
		// 기반 스트림, 보조스트림이 필요
		
		// 문자를 읽기 위한 도구
		BufferedReader inBufferedReader = null;
		// 문자를 쓰기 위한 도구
		BufferedWriter outBufferedWriter = null;
		
		// 서버 소켓 클래스 인스턴스 필요. 연결을 위한 도구
		ServerSocket listener = null;
		// 소켓을 이용. 통신을 위한 도구
		Socket socket = null;
		
		// UI 대신 스캐너 클래스 이용해서 콘솔로 작업하기
		Scanner scanner = new Scanner(System.in);
		
		// 파일의 입출력이거나 통신연결 등은 반드시 예외처리가 필요하다
		try {
			// 서버는 통신 대기를 하기 위한 작업
			listener = new ServerSocket(999);
			System.out.println("연결을 기다리는 중...");
			
			// 연결하기 위해서는 socket의 accept 메소드 이용하기
			// 클라이언트와 서버가 socket 이라는 인스턴스를 이용해서 통신 예정
			socket = listener.accept();
			
			// 데이터를 주고받는 로직
			
			// 파일의 IO 이용. 데코레이터 패턴으로 보조스트림이 기반스트림을 감싸는 작업을 한다
			// BufferedReader : 문자로 읽기 , 보조스트림
			// InputStreamReader : 문자로 읽기 , 보조스트림
			// socket.getInputStream() :바이트로 읽기 , 기반스트림
			
			// 소켓이 데이터를 읽기위한 용도
			inBufferedReader = new BufferedReader(new InputStreamReader( socket.getInputStream()));
			
			// 출력용 
			outBufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			// 서버와 클라이언트가 연결이 되었다면 
			// 반복문으로 계속 데이터를 받기위한 준비를 한다 (무한반복)
			
			while(true) {
				
				// 데이터 읽기작업. inBufferedReader 이용 . 한줄씩 읽기(readLine)
				// 상대방으로부터 전달받은 메세지를 처리하는 로직
				String message = inBufferedReader.readLine();
				if(message.equals("exit")) {
					System.out.println("채팅을 종료합니다.");
					break;
				} 
				System.out.println(" 클라이언트 : "+ message);
				System.out.println("메세지 입력 >> ");
				
				// 스캐너로 내가 입력한 메세지를 받을 변수 선언 > 메세지를 보내기 위한 로직
				String sendMessage = scanner.nextLine();
				// 출력용 도구로, 내가 쓴 메세지 담기
				outBufferedWriter.write(sendMessage+"\n");
				// 인스턴스에 남아있는 메세지 전부 보내기
				outBufferedWriter.flush();
				
				
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			// 자원 반납
			scanner.close();
			socket.close();
			listener.close();
			
			}
		
	}
}
