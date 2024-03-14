package ex_240314;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex_06_FileIO_file_byteArray_output {
	
	// 활용 : 원본 이미지를 그대로 사용하지않고 썸네일이나 특정크기에 맞게 압축해서 재사용함

	public static void main(String[] args) {
		// 이미지 복사하기. 바이트로 읽어서 쓸 때 1byte가 아닌 특정 배열크기만큼씩 쓰기
		// 원본 이미지 경로, 출력 대상 경로 필요, File 클래스 이용하기
		File src = new File("c:\\temp_240314\\coding.jpg");
		// 복사한 이미지 파일(여기에 출력예정)
		File dest = new File("c:\\temp_240314\\coding_copy.jpg");

		try {
			// 이미지를 읽으려면 바이트로 읽어야 한다 : 읽기 도구
			FileInputStream fileInputStream = new FileInputStream(src);
			
			// 바이트를 출력하기 위한 도구
			FileOutputStream fileOutputStream = new FileOutputStream(dest);
			
			// 특정 배열 크기 지정  - 100kb 씩
			byte [] buffer = new byte[1024*100];
			
			while (true) {
				// 버퍼의 크기만큼 읽기. n은 실제로 읽은 바이트
				int n = fileInputStream.read(buffer);
				// 출력. 버퍼에 담아서 처음부터 해당크기만큼 쓰기
				fileOutputStream.write(buffer, 0, n);
				
				// 읽은 크기가 해당 버퍼 크기보다 작으면 멈추겠다는 뜻
				if(n < buffer.length)
					break;
			}
			fileInputStream.close();
			fileOutputStream.close();
			System.out.println(src.getPath()+"를 "+dest.getPath()+"로 복사함");
			
		} catch (Exception e) {
			System.out.println("파일 복사 오류");
		}
	}

}
