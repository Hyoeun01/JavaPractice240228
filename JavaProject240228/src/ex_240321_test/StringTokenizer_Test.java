package ex_240321_test;

import java.util.Scanner;
import java.util.StringTokenizer;

/* 
 * Scanner를 이용하여 한 라인을 읽고,
 *  ,(콤마)로 분리된 어절이 몇 개인지 출력을 반복하는 프로그램을 작성하시오.
 *  “exit”이 입력되면 종료한다.
 */

public class StringTokenizer_Test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
		System.out.println("어절 개수를 출력할 라인을 입력하세요: ,(콤마)로 구분 >>");
		
		String input = scanner.nextLine();
		
		if ( input.equals("exit")) {
			System.out.println("프로그램을 종료합니다.");
			break;
		}
		
		StringTokenizer token = new StringTokenizer(input,",");
		
		int count = token.countTokens();
		System.out.println("어절 개수는 "+count);
		System.out.println();
		

	} scanner.close();

}

}