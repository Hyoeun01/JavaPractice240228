package ex_240311_socket_chat.single_multi_chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
 
import javax.sound.midi.Receiver;
 
public class ServerBackground {
	
	// 클라이언트와 서버연결부분.
	// 연결후 메세지 전달 부분
	// 스레드 > 멀티 채팅을 할 때 스레드 이용해서 동시에 쓰고 받기가 가능하게 구현됨.
 
    private ServerSocket serverSocket; // 서버 소켓
    private Socket socket; // 받아올 소켓 저장
    private ServerGUI gui;
    private String msg;
    /** XXX 03. 사용자들의 정보를 저장하는 맵 */ 
    
    // 키 : 닉네임  >> 채팅방 입장시 사용했던 이름
    // 밸류 : DataOutputStream >> 소켓을 이용해서 상대방이 입력받은 내용을 출력해주는 기능
    // clientMap : 모든 사용자의이름, 해당 이름에 대한 출력을 하는 기능인 인스턴스가 들어있음
    private Map<String, DataOutputStream> clientMap = new HashMap<String, DataOutputStream>();
 
    public void setGui(ServerGUI gui) {
        this.gui = gui;
    }
 
    public static void main(String[] args) {
        ServerBackground serverBackground = new ServerBackground();
        serverBackground.setting();
    }
    //서버가 생성될때 셋팅해주는 함수 
    public void setting() {
        
        try {
        	// 스레드. 작업스케줄 >> 순서에 맞게 동시 실행 가능하게 해주는 역할
            Collections.synchronizedMap(clientMap); //교통정리를 해준다.( clientMap을 네트워크 처리해주는것 ) 
            // 서버가 해당포트로 소켓을 이용해서 통신준비
            serverSocket = new ServerSocket(7777);
 
            while (true) {
                /** XXX 01.서버가 할일 : 방문자를 계속 받아서, 쓰레드 리시버를 계속 생성 */
                
                System.out.println("대기중.....");
                // 소켓이 클라이언트가 요청시 수락하는 기능
                // 수락하면 서버와 클라이언트를 연결한다.
                socket = serverSocket.accept(); // 여기서 클라이언트 받음
                // getInetAddress() : 아이피 의미
                System.out.println(socket.getInetAddress() + "에서 접속했습니다.");
                
                //여기서 새로운 사용자 스레드 클래스를 생성해서 소켓 정보를 넣어줘야한다.
                Receiver receiver = new Receiver(socket);
                receiver.start();
            }
 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    //맵의내용(클라이언트) 저장과 삭제 
    public void addClient(String nick, DataOutputStream out) throws IOException{
        String message=nick + "님이 접속하셨습니다.\n";
        // 모든 유저에게 전달
        sendMessage(message);
        // 메세지를 본인의 채팅화면에 붙임
        gui.appendMsg(message);
        // hashmap에 인스턴스를 등록
        clientMap.put(nick, out);
        
    }
    
    public void removeClient(String nick){
        String message=nick + "님이 나가셨습니다. \n";
        sendMessage(message);
        gui.appendMsg(message);
        clientMap.remove(nick);
    }
    
    // 메세지 내용 전파 = 브로드캐스트
    // 메세지 내용을 받으면,
    // 메세지를 맵에 들어있는 모든 유저들에게 전달한다.
    
    public void sendMessage (String msg){
    	// Iterator : 반복이 가능한 타입. hashmap에서 해당 키에 대한 정보와 값을 모두 받는다
    	// 현재는 키의정보만 받는다
    	// 현재 키에는 닉네임이 들어가있음.
        Iterator<String> iterator = clientMap.keySet().iterator(); //key셋으로 반복자지정
        String key = "";
        
        
        // 모든 키 값을 순회해서 확인
        // 결론. 모든 닉네임에 해당하는 출력 기능 인스턴스를 이용해서 출력 할 예정
        while(iterator.hasNext()){
        	// 맵, 키 : 신효은 , 값 : 출력기능 인스턴스
        	// ... 모든 멤버가 해당 맵안에 다 들어가 있다.
        	
        	// 키 : 신효은 , 키: ... , 키: ... ,
            key = iterator.next();// 반복자에서 하나하나 키를 빼온다.
            try{
            	// 신효은 키에 대한 값을 가지고 온다.
            	// writeUTF > 채팅 메세지 내용 (utf : 한글깨짐방지)
                clientMap.get(key).writeUTF(msg);
            } catch(IOException e){
                e.printStackTrace();
            }
        }
    }
    // ------------------리시버---------------------------
    // 스레드 정의 1) 스레드 클래스를 상속/ 2) 러너블 인터페이스 구현
    class Receiver extends Thread {
        /** XXX 리시버가 할일 : 네트워크 소켓을 받아서 계속듣고 보내는 일. */
    	
    	// 메세지를 전달하는 역할
        private DataInputStream in; // 데이터 입력 스트림
        private DataOutputStream out; // 데이터 아웃풋 스트림
        private String nick;
 
        // 생성자로 Socket타입의 인스턴스를 받고있다.
        // 유저가 1)MAP에 등록되고, 2)thread를 상속받은 클래스를 생성하고, 3)스레드 클래스에 소켓 인스턴스 전달.
        public Receiver(Socket socket) {
            try {
            	// 보조스트림 ( 출력담당 : 기반스트림 )
            	// 출력담당 >> 유저가 입력한 채팅의 내용을 출력하는 기능
                out = new DataOutputStream(socket.getOutputStream());
                // 입력담당 >> 유저가 입력한 채팅의 내용을 입력값으로 받아들이는 기능
                in = new DataInputStream(socket.getInputStream());
                // 실행후 닉네임 입력값을 읽어서 타입을 utf로 한다 ( aski코드로하면 한글이 깨진다 )
                nick = in.readUTF();
                // 닉네임 입력을 받았고, 출력을 담당하는 기능과 같이 해서 맵에 담기
                addClient(nick,out);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
 
        @Override
        public void run() {
 
            try {
            	// in이 null이 아니면 동작한다
            	// in이 null이면 종료한다
            	// in은 자원반납을 하지않는이상 계속 동작함 
            	// 종료시에 자원을 반납함 > in = null이된다
                while (in != null) {
                	// 유저가 입력한 채팅의 내용을 한글 깨짐 방지를위해 중간 데이터 타입인 utf로 
                    msg = in.readUTF();// UTF로 읽어들인다.
                    // 다른 유저들에게 전달
                    sendMessage(msg);
                    // 본인의 창에 붙임
                    gui.appendMsg(msg);
                }
            } catch (Exception e) {
                //사용접속종료시 여기서 에러발생. 
                removeClient(nick);
            }
        }
    }
 
}
