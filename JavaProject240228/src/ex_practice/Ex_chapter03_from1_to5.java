package ex_practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex_chapter03_from1_to5 {
	
	// 1. 영문소문자를 하나 입력받고 그 문자보다 알파벳 순위가 낮은 모든 문자를 출력하는 프로그램을 작성 : 2중 중첩 반복문
	//		string s = scanner.next();
	//      char c = s.charAt(0);
	
	// 2. 정수를 10개 입력받아 배열에 저장한후 배열을 검색한후 3의 배수만 골라 출력하는 프로그램 작성 : 배열과 반복문

	// 3. 정수를 입력받아 짝수이면 "짝", 홀수이면 "홀"을 출력하는 프로그램 작성 : 자바의 예외처리 연습
	//		사용자가 정수를 입력하지 않는 경우에는 프로그램을 종료(수를 입력하지 않아 프로그램을 종료합니다 << 출력)
	// try-catch-finally
	
	// 4. '일월화수목금토' 로 초기화된 문자배열 day를 선언하고 , 사용자로부터 정수를 입력받아 7(배열day의 크기) 로 나눈 나머지를 인덱스로 하여
	//	  배열 day에 저장된 문자를 출력하고, 음수가 입력되면 프로그램을 종료. 정수가 입력되지 않으면 '경고! 수를 입력하지 않았습니다.' 출력
	// : while 반복문과 자바의 예외처리 연습
	
	// 5. 정수를 10개 입력받아 배열에 저장하고 증가순으로 정렬하여 출력하는 프로그램 작성 : 배열과 for 반복문
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean continueFlag = true;

		while (true) {
			System.out.println("1~5중에서 선택하세요. 0 입력시 종료>>");
			int number = scanner.nextInt();

			if (number == 0) {
				continueFlag = false;
				break;
			} else if (number < 0 || number > 5) {
				System.out.println("0부터 5 사이의 숫자만 입력하세요.");
				continue;
			}

			switch (number) {
			case 1:
				System.out.println("알파벳 문자 하나를 입력하세요 >> ");
				char input = scanner.next().charAt(0);

		        if (Character.isLowerCase(input)) {
		            System.out.println("결과:");

		            for (char c = 'a'; c <= input; c++) {
		                for (char d = c; d <= input; d++) {
		                    System.out.print(d);
		                }
		                System.out.println();
		            }
		        } else {
		            System.out.println("영문 소문자를 입력해야 합니다.");
		        }	        
				System.out.println();
			break;
			
			case 2:
				
				System.out.println("정수를 10개 입력하세요");
				
				int array[] = new int[10];
				for( int i = 0; i <array.length; i++) {
					array[i]= scanner.nextInt();
					
					if(array[i]%3 ==0) {
						System.out.print(array[i]+" ");
					}
					
				}
				System.out.println();System.out.println();
			break;
			
			case 3:
				
				System.out.println("정수를 입력하세요 >> ");

				try {
					int n = scanner.nextInt();

					if (n % 2 == 0) {
						System.out.println("짝수");
					} else if (n % 2 != 0) {
						System.out.println("홀수");
					}

				} catch (InputMismatchException e) {
					System.out.println("정수가 아니므로 다시 입력하세요.");
					System.out.println();
					scanner.next();
					continue;
				}
				System.out.println();
			break;
				
			
			case 4:
				
				String day[] = {"일","월","화","수","목","금","토"};
				System.out.println("정수를 입력하세요 >> ");
				
				try {
				int n = scanner.nextInt();
				
				if (n<0) {
					System.out.println("0보다 큰수를 입력하세요");
				} else {
					System.out.println(day[ n % 7 ]);
				}
				
				} catch (InputMismatchException e) {
					System.out.println("정수가 아니므로 다시 입력하세요.");
					System.out.println();
					scanner.next();
					continue;
				}
				System.out.println();
			break;
			
			case 5:
				
				int arrayAsdc[] = new int[10];
				System.out.println("정수를 10개 입력하세요 >> ");

		        for (int i = 0; i < arrayAsdc.length; i++) {
		            
		            arrayAsdc[i] = scanner.nextInt();
		        }

		        
		        for (int i = 0; i < arrayAsdc.length - 1; i++) {
		            for (int j = 0; j < arrayAsdc.length - i - 1; j++) {
		                if (arrayAsdc[j] > arrayAsdc[j + 1]) {
		                   
		                    int temp = arrayAsdc[j];
		                    arrayAsdc[j] = arrayAsdc[j + 1];
		                    arrayAsdc[j + 1] = temp;
		                }
		            }
		        }

		        for (int num : arrayAsdc) {
		            System.out.print(num + " ");
		        }
		        System.out.println(); System.out.println();

			break;

	}

}
	}
}
