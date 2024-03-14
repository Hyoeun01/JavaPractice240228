package ex_240314;

import java.io.File;
import java.nio.channels.FileLock;

public class Ex_05_FileIO_file_method {
	
	// 해당 디렉토리의 정보를 조회하려면 반드시 해당폴더의 경로를 알아야 함
	// 앞에서는 절대경로를 문자열로 계속 전달했고,
	// 이제는 File 클래스에 경로를 담아서 매개변수에 정의할것.
	// 그러면 궁금한 폴더 경로의 File 인스턴스만 전달하면 해당 File 인스턴스로 정보를 조회할 수 있다.
	
	// 활용 > 프로필 이미지 등 처리할때 File클래스 이용해서
	// 해당폴더 및 파일등을 임시로 생성 등 활용
	// 현재 개발연습중이니 로컬(윈도우)  > 리눅스 경로에서 동일하게 적용하면된다.
	
	public static void listDirectory(File dir) {
		
		System.out.println("입력된 dir의 정보 조회 메서드=======================");
		System.out.println("File dir의 인스턴스 기능중 getPath() >> "+dir.getPath());
		
		// listFiles() : 본인 폴더 및 하위 폴더 등의 정보를 File타입의 배열로 리턴
	File[] subFiles = dir.listFiles();
	
	// 하위 정보를 바로 사용할수 없으니 한번더 file타입의 기능을 이용해서 필요한 정보만 출력하기
	for ( int i = 0 ; i < subFiles.length ; i++ ) {
		File file = subFiles[i]; // 각각이 File 타입 
		// 마지막 수정시간
		long t = file.lastModified();
		// 파일명, 파일크기, 파일을 마지막으로 수정한시간 출력하기
		System.out.println("파일명 : "+file.getName());
		System.out.println("파일크기 : "+file.length());
		// 포맷 출력형태로 하기
		System.out.printf("파일의 수정시간 : %tb %td %ta %tT\n", t, t, t, t);
		
	}
		
	}

	public static void main(String[] args) {
		// File 클래스의 기본 메서드 확인용
		// 파일 생성, 폴더 생성, 파일의 메타 정보등 확인가능.
		// 직접적인 입출력기능은 없다.
		
		File f1 = new File("c:\\windows\\system.ini");
		File f2 = new File("c:\\temp_240314");
		
		// 출력 테스트 
		listDirectory(f2);
		
		// 출력시 오류가 나면 오류코드 읽기 요령 
		// 현재는 자바라서 파일이 몇개 없지만,
		// 나중에 프레임워크에서 서버단에서 오류가 발생을하면
		// 내가 사용한 파일 외에 시스템에서 제공하는 기본 파일이 있다.
		// 오류코드가 보이면 먼저 내가 작업한 파일이 있는지 여부를 확인
		
		System.out.println("==================================");
		
		// 파일인지 디렉터리인지 유무 확인, 디렉토리 생성 확인
		if (f1.isFile()) {
			System.out.println("파일입니다");
		} else {
			System.out.println("폴더입니다");
		}
		
		System.out.println("==================================");
		// exist() : 존재 유무 확인, mkdir() : 폴더 생성
		File f3 = new File("c:\\temp_240314");
		if(f3.isDirectory()) {
			if(f3.exists()) {
				File f4 = new File("c:\\temp_240314\\TestFolder");
				f4.mkdir();
				// 만들고나서 삭제하기
				// f4.delete();
				// renameTo(); 이름변경
				f4.renameTo(new File("c:\\temp_240314\\TestFolder2"));
				
			}
		}

	}

}
