package ex_240229;

import java.util.Scanner;

public class Ex_08_array3_self {

	public static void main(String[] args) {
		
		// 양수 5개를 입력받아 배열에 저장하고 제일 큰 수와 작은 수, 합계, 평균을 출력하는 프로그램
		// 함수를 만들어서 매개변수에 배열 타입으로 받아서 출력
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("1에서 100사이의 양수를 5개 입력하세요 : ");
		
		// 배열선언하기
		int intArray[] = new int[5];
		
		// 나중에 출력하기 위한 준비
		int min = 101;
	    int max = 0;
	    int sum = 0;
		
		for (int i = 0 ; i < intArray.length ; i++ ) {
			
			//배열에 입력된 양수 5개 값 설정
			intArray[i]= scanner.nextInt(); 
			
			//최댓값 구하기
			if(intArray[i]>max) {
				max = intArray[i];
			} else if (intArray[i]<min) {
				min = intArray[i];
			}
			
			sum += intArray[i];
			
		}
		
		System.out.println("최댓값 : "+max);
		System.out.println("최솟값 : "+min);
		System.out.println("합계 : "+sum);
		System.out.println("평균 : "+sum/intArray.length);

	}
	
	

}