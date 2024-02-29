package ex_240229;

import java.util.Scanner;

public class Ex_03_for {

	public static void main(String[] args) {
		// while은 계속 실행하도록 하고, 특정 조건에서 빠져나올때 사용한다.
		while (true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println(" 입력한 수까지 더하는 프로그램 ");
			System.out.println(" 자연수를 입력하세요 , 0입력시 종료 ");
			
			int number = scanner.nextInt();
			
			
			//조건문 분기
			if (number >= 1 ) {
				int result = sumN(number);
				System.out.println("입력한 수 까지의 합은 " + result + "입니다.");
			}
			else if(number == 0) {
				System.out.println("종료합니다.");
				
				//사용안하는 메모리는 꼭 반납할것.
				scanner.close();
				break;
			}
			else {
				System.out.println("양수를 입력하세요");
			}
			

			
		}

	}

	// 1부터 입력한 수까지 모두 더하는 프로그램 만들기

	public static int sumN(int number) {

		// 초깃값, 합의 값 할당
		int i, sum = 0;

		for (i = 0; i <= number; i++) {
			sum += i;
		}

		return sum;

	}

}
