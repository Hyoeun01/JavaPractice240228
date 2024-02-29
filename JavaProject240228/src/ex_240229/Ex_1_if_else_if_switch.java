package ex_240229;

import java.security.PublicKey;
import java.util.Scanner;

public class Ex_1_if_else_if_switch {

	public static void main(String[] args) {

		// 성적을 입력해서 , 총점과 평균을 구하는 함수
		// HTML, CSS, JAVASCRIPT, JAVA 과목에 대한 점수를 입력받아서 반환하기
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("HTML, CSS, JAVASCRIPT, JAVA 과목 점수 입력하기 (예: 80 90 70 60) : ");
		int htmlScore = scanner.nextInt();
		int cssScore = scanner.nextInt();
		int javascriptScore = scanner.nextInt();
		int javaScore = scanner.nextInt();
		
	    String resultString=toAvgTotalScore(htmlScore,cssScore,javascriptScore,javaScore);
	    int resultAvgScore = toAvgScore(htmlScore, cssScore, javascriptScore, javaScore);
	    System.out.println(result);
	    
	    if(resultAvgScore>=90) {
	    	System.out.println("A등급");
	    } else if (resultAvgScore>=80 && resultAvgScore<90){
	    	System.out.println("B등급");
	    	
	    }
	    
	}

	public static String toAvgTotalScore(int html, int css, int javascript, int java) {
		int resultTotalScore = html + css + javascript + java;
		int resultTotalAvg = resultTotalScore / 4;
		String result =	"결과 점수, 총점 : "+resultTotalScore+" 평균 : "+resultTotalAvg+"점 입니다."	;
		return result ;
	}
	
	public static int toAvgScore(int html, int css, int javascript, int java) {
		int resultTotalScore = html + css + javascript + java;
		int resultTotalAvg = resultTotalScore / 4;
		return result ;
	}

}
