package ex_240229;

import java.util.Scanner;

public class Ex_04_nested_For {

	public static void main(String[] args) {
		

		//입력받은 수 까지의 구구단 출력하기. (1~9중 숫자 입력하나 정하기)
		
		
		while (true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println(" 입력한 수 까지의 구구단 출력하기 ");
			System.out.println(" 숫자를 입력하세요 , 0입력시 종료 ");
			
			int number = scanner.nextInt();
			
			
			//조건문 분기
			if (number >= 1 && number <=9) {
				//입력 받은 수로 구구단 출력하기
				gugudan(number);
			}
			else if(number == 0) {
				System.out.println("프로그램을 종료합니다.");
				
				//사용안하는 메모리는 꼭 반납할것.
				scanner.close();
				break;
			}
			else {
				System.out.println("0에서 9사이의 값을 입력하세요");
			}
			

			
		}

	}

	// 입력한 수 까지의 구구단 출력하기
	// 중첩for문 활용
	
	public static void gugudan(int number) {
		
		for (int i=1 ; i <= number ; i++) {
			for(int j=1 ; j < 10 ; j++) {
				System.out.print(i + "*" + j+"="+i*j);
				System.out.print('\t');
			}
			
			System.out.println(); // 한단 끝나면 줄 넘김
		}

		
		
	}

		

	}

	

