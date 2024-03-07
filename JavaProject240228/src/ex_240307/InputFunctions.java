package ex_240307;

import java.util.Scanner;

public class InputFunctions {
	
	// 1. 스포츠 등록하는 기능
	public static void enrollSports() {
		
		//콘솔로 입력받는 기능
		Scanner scanner = new Scanner(System.in);
		System.out.println("종목이름을 입력하세요 (예 : 야구) >> ");
		String sportsName = scanner.next();
		
		System.out.println("인원수를 입력하세요(숫자만 입력) >> ");
		int sportsNumber = scanner.nextInt();
		
		System.out.println("플레이시간을 입력하세요(예 : 1시간 30분) >> ");
		String sportsPlayTime = scanner.next();
		
		System.out.println("운동장소를 입력하세요 >> ");
		String sportsPlayPlace = scanner.next();
		
		System.out.println("개막시즌을 선택하세요 (봄:1, 여름:2, 가을:3, 겨울:4) >> ");
		int sportsStartSeason = scanner.nextInt();
		
		System.out.println("실내/실외를 선택하세요 (실내:1, 실외:2) >> ");
		int sportsInOrOut = scanner.nextInt();
		
		System.out.println("대표멤버를 3명만 입력하세요(공백을 기준으로 나란히 작성) >> ");
		String [] members = new String[3];
		for (int i=0; i<members.length ; i++) {
			members[i] = scanner.next();  
		}
		
		System.out.println("대표장비를 3개만 입력하세요(공백을 기준으로 나란히 작성) >> ");
		String [] items = new String[3];
		for (int i=0; i<items.length ; i++) {
			items[i] = scanner.next();  
		}
		
		// 콘솔에서 입력 받은 데이터를 우리가 만든 클래스에 적용하기
	}
	
	
	// 2. 스포츠를 검색해서 출력하는 기능

}
