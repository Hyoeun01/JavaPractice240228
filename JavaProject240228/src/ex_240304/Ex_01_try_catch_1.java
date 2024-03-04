package ex_240304;

import java.util.Scanner;

public class Ex_01_try_catch_1 {

	public static void main(String[] args) {
		/*
		 * try-catch 연습장 
		 * 비정상적인 종료를 막기위해서 미리 예외처리를 한다 알고 대비를 해서, 예측하지 못한 비정상적인 종료를 막는다 
		 * 만약 예외처리를 하지 않으면, 해당 프로그램이 정상종료가 아닌 비정상 종료가 되어서, 동작을 정상 수행을 할 수 없게 된다.
		 *
		 * 예) 파일 입출력, 네트워크 통신을 통해서 데이터를 못받아올 때 등
		 * 파일입출력, 네트워크 통신(소켓) >> 컴파일러가 의무적으로 예외처리 요구함
		 * 
		 * 예외 처리 형식도 디테일하게 조정할 수 있지만, 그 디테일한 예외처리를 포함한 범위가 넓은 예외를 처리하는 경우도 있음.
		 */ 
		
		/* 
		 * 예외처리 1) 배열의 범위를 벗어나는 인덱스에 접근
		 *  2) 0으로 나누는경우
		 *  3) 콘솔상에서 정수형에 문자열을 입력하는 경우
		 *  잘 발생하지 않는상황이지만 연습삼아 해보기
		 *  
		 */

		Scanner scanner = new Scanner(System.in);
		int x ,y;
		System.out.println("나뉨수를 입력하세요 >>");
		x=scanner.nextInt();
		System.out.println("나눌수를 입력하세요 >>");
		y=scanner.nextInt();
		
		//try-catch-finally없이 써서 비정상적인 종료 발생
		//0입력시 java.lang.ArithmeticException
		
//		System.out.println("예외 발생 시키기 : x/y(0) = "+x/y);
		
		try {
			System.out.println("예외 발생 시키기 : x/y(0) = "+x/y);
		}
		
		// 1. 디테일한 예외처리
		// 2. 포괄적 예외처리
//		catch (ArithmeticException e) {
//			System.out.println("0으로 나눌 수 없습니다!");
//	
			
	catch (Exception e) {
		System.out.println("0으로 나눌 수 없습니다!");
		//getMessage():오류의 원인을 출력해주는 메소드
		System.out.println("오류의 원인 : "+e.getMessage());
		
		
} finally {
			//예외발생 여부 상관없이 무조건 실행
			// 보통 해당 인스턴스 반납시 사용함
			// 스캐너 인스턴스 닫을때 사용
			System.out.println("예외처리 후 finally 실행");
			scanner.close();
			}
		
		
	}

}
