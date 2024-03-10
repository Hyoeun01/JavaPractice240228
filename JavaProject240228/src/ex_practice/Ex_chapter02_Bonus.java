package ex_practice;

import java.util.Scanner;

public class Ex_chapter02_Bonus {
	
	// 사칙연산을 입력받아 실행해주는 프로그램 작성. 연산자는 + - * / 4가지로 한다.
	// 피연산자는 모두 실수이며, 피연산자와 연산자는 빈칸으로 분리하여 입력하는 것으로 한다
	// 식을 입력하세요 >> 
	// 연산결과 : 
	// 나누는 수가 0이면 '0으로 나눌수 없습니다' 출력 
	// 다른 기호를 입력하면 '연산 기호가 잘못되었습니다' 출력
	// 무한루프로 돌게 하고 esc 입력시 종료하기
	

	public static void main(String[] args) {
		while(true) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("실행할 기능을 입력하세요");
		System.out.println("1.계산기 2.종료 >>");
		
		int num = scanner.nextInt();
		
		if (num == 2) {
			System.out.println("프로그램을 종료합니다.");
			scanner.close();
		} else if (num == 1) {
		
			System.out.println("식을 입력하세요 (숫자 기호 숫자 순으로 입력.)>> ");
		
		double op1 = scanner.nextDouble();
		String operator = scanner.next() ; // 연산자 스트링 입력 
		double op2 = scanner.nextDouble();
		double result = 0;
			
		switch (operator) {
		case "+" : result = op1 + op2; break;
		case "-" : result = op1 - op2; break;
		case "*" : result = op1 * op2; break;
		case "/" : 
			if(op2 == 0) {
				System.out.println("0으로 나눌수 없습니다");
			} 
			result = op1 / op2 ;
			break;
			
		default :  System.out.println("연산 기호가 잘못되었습니다.");
		}
		
		System.out.println("연산결과 : "+result);
		System.out.println();
		
	} else { System.out.println("1, 2중에서 입력하세요"); System.out.println();}

}
}
}
