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
			int c ;
			while ((c=in.read()) != -1) {
				System.out.println((char)c);
			}
			in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
