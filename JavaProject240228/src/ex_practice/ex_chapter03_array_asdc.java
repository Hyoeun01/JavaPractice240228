package ex_practice;


import java.util.Arrays;
import java.util.Scanner;

public class ex_chapter03_array_asdc {

	// 정수를 10개 입력받아 배열에 저장하고 증가순으로 정렬하여 출력하는 프로그램 작성
	
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
		while(true) {
			
			System.out.println("정수 10개 입력:");
	        
	        int[] arrayAsdc = new int[10];

	        for (int i = 0; i < arrayAsdc.length; i++) {
	           
	            arrayAsdc[i] = scanner.nextInt();
	        }

	        Arrays.sort(arrayAsdc);

	        for (int num : arrayAsdc) {
	            System.out.print(num + " ");
	        }
	        System.out.println();
			
			}
	}

}
