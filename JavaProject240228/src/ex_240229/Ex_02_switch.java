package ex_240229;


import java.security.PublicKey;
import java.util.Scanner;
import java.util.function.BiConsumer;

public class Ex_02_switch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("날씨에 따른 메뉴 선택하기");
		System.out.println("1.맑음 2.흐림 3.비 4.아무것도 아님 숫자를 선택해주세요");
		
		int pickNumber = scanner.nextInt();
		String resultPickMenuString = pickLunchMenuWeather(pickNumber);
		System.out.println("오늘 점심은 "+resultPickMenuString+"입니다.");
		
		
		//날씨에따라 메뉴를 정해주는 프로그램 만들기
		
	}
	
	public static String pickLunchMenuWeather(int number) {
		
		switch (number) {
		case 1: 
			String menuString1 = "햄버거";
			return menuString1;
			
		case 2: 
			String menuString2="김밥&라면";
			return menuString2;
			
			
		case 3: 
			String menuString3="쌀국수";
			return menuString3;
			
		
		default:
			String menuString4="떡볶이";
			return menuString4;
			
		}
		
		// 메뉴를 여러개주고 4번을 선택했을때 랜덤으로 골라주는 프로그램도 작성할 수 있겠죠
		
	}
	
	
	
}