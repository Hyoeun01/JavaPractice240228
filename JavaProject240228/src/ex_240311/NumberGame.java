package ex_240311;

import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("=== 숫자맞추기 게임을 시작합니다. ===");
		int x = (int) (Math.random() * 3 + 1);

		System.out.println("컴퓨터가 숫자를 생각했습니다.");

		if (x % 2 == 0) {
			
			System.out.println("힌트는 짝수입니다.");
			
		} else {
			
			System.out.println("힌트는 홀수입니다.");
			
		}
		
		System.out.print("1~100 사이의 값을 입력 >>");
		
		int n = scanner.nextInt();
		int count = 1;
		
		while (n != x) {
			
			  if (n > x) { 
				  System.out.println("더 작은 수입니다."); 
			  } else { 
				  System.out.println("더 큰 수입니다."); 
			  }
			  
			  System.out.print("1~100 사이의 값을 입력 >>");
			  n = scanner.nextInt();
			  count++;
		}
		
		System.out.println(count+"회 만에 맞췄습니다.");
		System.out.println("=== 게임을 종료합니다. ===");
		
		scanner.close();
	}

}
