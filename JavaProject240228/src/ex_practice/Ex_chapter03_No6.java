package ex_practice;

import java.util.Scanner;

public class Ex_chapter03_No6 {

	public static void main(String[] args) {
		
		// 6. 영어와 한글의 짝을 이루는 2개의 배열을 만들고, 
		// 사용자로 부터 영어 단어를 입력받아 한글을 출력하는 프로그램 작성 : 배열과 반복문
		// exit를 입력하면 프로그램을 종료
		
		Scanner scanner = new Scanner(System.in); 
		
		 while (true) {
			 
		String eng[] = {"student","love","java","happy","future"};
		String kor[] = {"학생", "사랑", "자바", "행복한","미래"};
		
		
	            System.out.println("영어 단어를 입력하세요>> ");
	            String input = scanner.nextLine();

	            if (input.equals("exit")) {
	                System.out.println("프로그램을 종료합니다.");
	                break;
	            }

	            boolean found = false;
	            
	            for (int i = 0; i < eng.length; i++) {
	                if (input.equals(eng[i])) {
	                    found = true;
	                    System.out.println(kor[i]);
	                    break;
	                }
	            }

	            if (!found) {
	                System.out.println("그런 영어단어가 없습니다.");
	            }
	        }
		
		

	}

}
