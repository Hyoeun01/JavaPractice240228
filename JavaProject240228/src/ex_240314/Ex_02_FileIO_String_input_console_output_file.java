package ex_240314;

import java.io.FileWriter;
import java.io.InputStreamReader;

public class Ex_02_FileIO_String_input_console_output_file {

	public static void main(String[] args) {
	
		// 문자를 읽을때 사용하는 도구
		// system.in : 표준입력. 키보드로 입력된 내용을 1차로 저장하는 공간 ( 바이트로 읽기 )
		// InputStreamReader : 문자로 한번 더 읽어서, inputStreamReader 인스턴스에 담는다.
		// >> 메모리 임시공간[inputStreamReader]에 저장함
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		
		// 출력 > file에 출력하기(파일쓰기)
		// 쓰기를 위한 도구가 필요- 선언만
		FileWriter fileWriter = null;
		
		// inputStreamReader에서 문자를 읽어서, 유니코드 정수값으로 담아둘 임시변수
		int c;
		try {
			// 출력 대상 경로 지정 필요
			fileWriter = new FileWriter("c:\\temp\\test_240314.txt");
			
			// while 반복문으로 메모리에 저장된 문자들을 계속 읽기 
			while ((c = inputStreamReader.read()) != -1) {
				// 파일에 쓰기작업
				fileWriter.write(c);
				
			}
			// 작업이 끝나면 꼭 반납하기
		 inputStreamReader.close();
		 fileWriter.close();
		 
		} catch (Exception e) {
			System.out.println("입출력 오류가 발생했습니다.");
			e.printStackTrace();
			
		}
		

	}

}
