package ex_240307;

import java.util.Scanner;

// 등록한 스포츠를 담을 배열을 만들면?

// 스포츠 해당 종목들이 각각의 인스턴스.
// Sports라는 타입으로 배열을 선언.
// 이 배열의 요소로 담기
// 담아놓은 배열에서 검색을 하거나 출력

public class InputFunctions {
	
	// 1. 스포츠 등록하는 기능
	
	//해당 등록하는 함수에 입력타입으로 스포츠타입의 레퍼런스변수(인스턴스)
	// 메서드 입력값
	// 들어갈때는 빈 인스턴스인데
	// 메서드 반환값
	// 나올때는 인스턴스에 콘솔에서 입력한 데이터를 적용한 인스턴스가 나온다
	
	public static Sports enrollSports(Sports sports) {
		
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
		String sportsStartSeasonPick = Util.pickSeason(sportsStartSeason);
		
		System.out.println("실내/실외를 입력하세요>> ");
		String sportsInOrOut = scanner.next();
		
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
		
		// 부모 : Sports sports
		// 자식 : Subsports
		//public SubSports(String sportsName, int sportsMemberCount, 
//		String sportsPlayTime, String sportsPlace,
//		String seasonInfoString, String inOrOut,
//		String [] items,  String [] members)

		sports = new SubSports(sportsName, sportsNumber, 
				sportsPlayTime, sportsPlayPlace,sportsStartSeasonPick,sportsInOrOut,members,items);
		
				return sports;
	}
	
	
	// 2. 스포츠를 검색해서 출력하는 기능

}
