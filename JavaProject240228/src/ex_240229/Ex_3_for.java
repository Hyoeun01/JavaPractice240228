package ex_240229;

import java.util.Scanner;

public class Ex_3_for {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("자연수를 입력하세요 : ");
		int number =scanner.nextInt();
		int result = sumN(number);
		System.out.println("입력한 수 까지의 합은 "+result+"입니다.");
	}
	
	//1부터 입력한 수까지 모두 더하는 프로그램 만들기
	
	public static int sumN(int number) {
		
		//초깃값, 합의 값 할당
		int i, sum = 0;
		
		for (i=0 ; i<=number ; i++) {
			sum+=i ;
		}
		
		return sum;
		
	}

}
