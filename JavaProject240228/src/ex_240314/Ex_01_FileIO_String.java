package ex_240314;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex_01_FileIO_String {

	public static void main(String[] args) {
		
		// 문자를 읽을때 사용하는 도구. 선언만했음
		FileReader in  = null;
		
		// try-catch는 필수다 >> 없이 읽으려고 하면 컴파일러 예외에 잡히고, 빠른수정 하면된다
		
		try {
			// 파일을 읽는 도구. 읽은 내용을 메모리에 담아둠.
			
			in = new FileReader("c:\\windows\\system.ini");
			int c; 
			try {
				// in.read() : 문자를 유니코드 정수로 반환함
				// 내용이 있으면 반환되는 정수값이 음이 아니다.
				// 계속 읽어서 출력하다가 읽을 내용이 없으면 -1을 반환해서 반복이 종료된다.
				while((c = in.read()) != -1) {
					System.out.print((char)c);
				}
				
				// 반드시 사용후 반납해야한다. (해당 인스턴스가 힙 메모리 위치 어딘가에 저장되어있음 = 계속 사용중)
				in.close();
				// 가비지 컬렉터가 알아서 수거해간다.
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}


		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}