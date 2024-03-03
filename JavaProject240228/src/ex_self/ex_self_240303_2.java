package ex_self;

import java.util.Scanner;

public class ex_self_240303_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("학생수를 입력해주세요.>>");
		int studentNumber = scanner.nextInt();

		int[][] studentsScore = makeSubjectRandomScore(studentNumber);
		showSumAndAvg(studentsScore);
	}

	// 점수, 점수의 합계와 평균 출력하는 프로그램
	public static void showSumAndAvg(int score[][]) {

		for (int i = 0; i < score.length; i++) {
			int sum = 0;
			for (int j = 0; j < score[i].length; j++) {
				sum += score[i][j];
				System.out.print(score[i][j] + "점, ");
			}

			System.out.println((i + 1) + "번 학생의 총점 : " + sum + ", 평균 : " + sum / 3);
		}
	}

	// 점수를 랜덤으로 만드는 프로그램
	public static int[][] makeSubjectRandomScore(int studentNumber) {

		int[][] sampleScore = new int[studentNumber][3];

		for (int i = 0; i < sampleScore.length; i++) {
			for (int j = 0; j < sampleScore[i].length; j++) {
				boolean isCheckedScore = false;
				int score = 0;

				while (true) {

					score = (int) (Math.random() * 100 + 1);
					if (score >= 60) {
						break;
					}
				}

				if (score >= 60) {
					sampleScore[i][j] = score;
				}

			}
		}
		return sampleScore;
	}
}