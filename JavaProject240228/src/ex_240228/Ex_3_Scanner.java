package ex_240228;

//특정 기능을 가져와서 사용시 반드시 import 해야함
//다른 패키지(폴더)에있는 기능을 이용시에는 반드시 사용해야함
import java.util.Scanner;

class Ex_3_Scanner {

	public static void main(String[] args) {
		//이름을 입력받아서 출력하는 프로그램
		
		System.out.println("이름과 나이를 작성해주세요.> (예) 신효은 31: >>");
		
		// 클래스명 : 참조형 변수명 = new 클래스명();
		// System: import 없이도 사용할 수 있는 내장 기능
		Scanner scanner = new Scanner(System.in);
		
		//하나의 문자열을 읽을 때 사용하는 메서드 next()
		String nameString = scanner.next();
		
		// 나이를 입력 후 받을 변수를
		int age = scanner.nextInt();
		System.out.println("입력한 이름은 : "+nameString);
		System.out.println("입력한 나이는 : "+age);
		
		
	}

}
