package ex_240229;

import java.util.Scanner;

public class Ex_05_continue {

	public static void main(String[] args) {

		while (true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("숫자를 선택하세요");
			System.out.println("1번: 양수만 더하는 프로그램 , 0번: 종료시 누르기 >>");
			int number = scanner.nextInt();

			// 조건문 분기
			if (number == 0) {
				System.out.println("프로그램을 종료합니다.");
				// 사용 안하는 메모리는 반납을 꼭 해주기.
				scanner.close();
				break;
			} else {
			// number == 1 인경우, 양수만 5개 더하는 프로그램.
				continueAddEx();

			}
			
		}

	}

	// 숫자는 연속해서 5개 입력해주세요 
	// continue 활용
	
	// 디버깅, 자바, 자바스크립트, 파이썬, 플러터 등
	// 다른 프로그래밍 언어를 공부할 때 , 코드를 분석한다.
	// 방법 1)줄번호 더블클릭 2)중단점의 시작/끝 설정
	// 실행 ) f11 디버깅모드 > perspective 모드에서 
	// 진행방식 : step into(f5)-함수안에 들어가거나 실행 
	// step over(f6)- 함수안에 들어가지않고 실행만하고 건너뛰기
	
	public static void continueAddEx() {
		Scanner scanner = new Scanner(System.in);
		// 숫자는 연속해서 5개 입력해주세요
		System.out.println("숫자는 연속해서 5개 입력해주세요 >>");
		int sum = 0;
		for(int i = 0 ; i < 5; i++) {
			int n = scanner.nextInt();
			if(n<=0) continue;
			else sum += n;
		}
		System.out.println("합은 : " + sum);

	}

}
