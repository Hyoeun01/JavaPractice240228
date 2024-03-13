package ex_240311;


public class StudentScore {

	public static void main(String[] args) {

		int[][] score = { { 80, 60, 70 }, { 90, 95, 80 }, { 75, 80, 100 }, { 80, 70, 95 }, { 100, 65, 80 } };

		System.out.println("학생번호   국어  영어   수학   총점   평균");
		System.out.println("===========================================");

		for (int i = 0; i < score.length; i++) {
			
			int sum = 0;
			System.out.print((i + 1) + "번 학생: ");
			
			for (int j = 0; j < score[i].length; j++) {
				
				sum = sum + score[i][j];
				
				if(score[i][j] != 100) { //줄맞춤
				System.out.print("  "+score[i][j] + "   ");
				
				} else {
					System.out.print(" "+score[i][j] + "   ");
					}
			}
			Double avg = sum / 3.0; 

			System.out.println(" "+ sum + "   " + Math.floor(avg));
			
			
		}
	}

}
