package ex_practice;



public class Ex_chapter03_No_bonus {

	public static void main(String[] args) {
		// Bonus. 3*4의 2차원 배열을 만들고 이곳에 0~9 범위의 정수를 랜덤하게 저장한 후 2차원 배열과 합을 출력하는 프로그램

		int intArray[][];
		intArray = new int[3][4];
		int sum = 0;
		
		for(int i = 0; i<3; i++) {
			for( int j = 0; j<4 ; j++) {
				intArray[i][j]= (int)(Math.random()*10); 
				 System.out.print(intArray[i][j] + " ");
			}
			System.out.println();	
	}
		for ( int i = 0; i<3; i++) {
			for (int j = 0; j<4 ; j++) {
				sum = sum + intArray[i][j];
			}
		}
			System.out.println("합계 : "+sum);
		
}
}
