package ex_self;

import java.util.Scanner;

public class ex_self_240308_ver1 {

		// 로또 생성프로그램
		// 랜덤한 정수 6개를 출력
	
	   // 중복을 삭제하는 기능이 필요
	
		public static void main(String[] args) {
			while (true) {
				Scanner scanner = new Scanner(System.in);
				System.out.println("양수 6개를 자동생성하는 프로그램");
				System.out.println("1번: 프로그램 실행 , 0번: 종료 >>");
				int number = scanner.nextInt();

				// 조건문 분기
				if (number == 0) {
					System.out.println("프로그램을 종료합니다.");
					scanner.close();
					break;
				} else {
					
					int array[] = new int[6];
					showAggregation(array);
				}

			}

		}

		public static void showAggregation(int[] intArray) {
			
			int max = 0;
			int min = 0;

			for (int i = 0; i < intArray.length; i++) {
				// 자동으로 1이상 46미만의 랜덤한 숫자 넣기로 변경. 
				intArray[i] = (int)(Math.random()*45 +1);
				min = intArray[0];
				

				if (intArray[i] > max) {
					max = intArray[i];
				}
				
				else if (intArray[i] < min) {
					min = intArray[i]; 
				}

			
				

			}
			// 배열에서 정렬 기능이 없어서 패스 함.
			// 최소값, 배열을 정렬 후,(오름차순으로 정렬하고, 첫번째 요소가 가장 작은 요소가 됨.)
			System.out.print("이번주 당첨번호는 ");
			
			for(int i = 0 ; i < intArray.length; i++) {
				System.out.print(intArray[i]+" ");
			}
		 System.out.println();
		 System.out.println();
		}

	}