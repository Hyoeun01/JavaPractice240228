package ex_practice;

import java.util.Scanner;

public class Ex_chapter03_from_upAndDown {
	
	// 숨은 번호를 만드는 게임. 컴퓨터가 0에서 99까지의 임의의 수를 선택하고, 사용자가 수를 맞추는게임
	// 컴퓨터가 가진 수가 사용자가 입력한 수보다 높다면 "더 높은수를 입력하세요" 출력, 낮다면 "더 낮은수를 입력하세요" 출력한다.
	// 더 높게가 나온경우 (사용자가 입력한수 - 99 중에서 선택하세요) 를 출력하고 더 낮게가 나온경우 (0 - 사용자가 입력한수 ~~) 를 출력한다.
	// 컴퓨터가 가진수를 맞추면 "맞았습니다. <br> 다시하시겠습니까? (y/n을 입력하세요)" 를 출력한다.
	// y를 입력시 다시 프로그램을 출력하고 , n을 입력하면 프로그램을 종료합니다 를 출력한다.

	public static void main(String[] args) {
		
		// 컴퓨터가 숨길 수를 임의로 선택하기 위해 random()이용하기
		// 다시하시겠습니까 에 대한 답으로 사용자가 y/n을 입력하고, 입력받은 문자열과 비교하기위해서는
		// if(scanner.next().equals("n"){// 종료하도록 작성} 이용하기
		Scanner scanner = new Scanner(System.in);
		
		int x = (int)(Math.random()*100);
		
		System.out.println("Up&Down 게임입니다. 숫자를 맞춰보세요");
		

		int n = scanner.nextInt();
		
		int max = 99;
		int min = 0;
		
		System.out.println(min+"-"+max);
		
		
		if( n == x ) {
			System.out.println("맞았습니다.");
			System.out.println("다시 하시겠습니까? y/n");
			String response = scanner.next();
			if(response.equals('y')) {
				
			}else if(response.equals('n')) {
				System.out.println("프로그램을 종료합니다");
			}else {
				System.out.println("y/n 중에서 선택하세요");
			}
			
		}
		else if(n > x) {
			System.out.println("더 낮게!");
			max = n;
			System.out.println(min+"-"+max);
			
		} else {
			System.out.println("더 높게!");
			min = n;
			System.out.println(min+"-"+max);
		}
		
		
		
		
		
		

	}
	

}
