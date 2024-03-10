package ex_practice;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollPaneUI;


public class ex_2_10 {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("1~99사이의 자연수를 입력하세요>>");
		int n = scanner.nextInt();
		
		int first = n/10;
		int second = n%10;

		if(n<10) {
			if(second%3 == 0) {
				System.out.println("박수짝");
			}else {
				System.out.println("박수없음");
			}
			
		}
		else {
			if(first%3==0 && second%3==0 && second !=0) {
				System.out.println("박수짝짝");
			}
			else if(first % 3 != 0 && second % 3 == 0 && second !=0) {
				System.out.println("박수짝");
			}
			else if(first % 3 == 0 && second % 3 != 0 && second !=0) {
				System.out.println("박수짝");
			}
			else if(first % 3 == 0 && second == 0) {
				System.out.println("박수짝");
			}
			else {
				System.out.println("박수없음");
			}
		}
	}

}
