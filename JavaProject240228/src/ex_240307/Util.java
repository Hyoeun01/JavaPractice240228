package ex_240307;

import java.time.LocalDate;

//확인용
// sportsArray 라는 배열에 담긴 인스턴스의 값 조회하는 메서드


public class Util {
	// 입력 숫자에 따른 계절 이름 출력하는 메서드
	public static String pickSeason(int number) {
		if(number == 1) {
			return "봄";
		}else if(number==2) {
			return "여름";
		}else if(number==3) {
			return "가을";
		}else if(number==4) {
			return "겨울";
		} else {
			System.out.println("1에서 4사이의 수를 선택하세요");
			return "사계절";
		}
	}

	// 현재 날짜 등록해주는 기능
	public static void showDate() {
		
	LocalDate currentDate = LocalDate.now();
	String createTime = currentDate.toString();
	System.out.println("등록시간 : "+ createTime);
	
	}
	
	public static String showReturnDate() {
		
		LocalDate currentDate = LocalDate.now();
		String createTime = currentDate.toString();
		return createTime;
		
		}
		
	
	public static void showSeason(Sports sports, int season) {
		switch (season) {
		case 1: {
			Season spring = Season.Spring;
			sports.setSeason(spring);
			break;
		}
		case 2: {
			Season summer = Season.Summer;
			sports.setSeason(summer);
			break;
		}
		case 3: {
			Season fall = Season.Fall;
			sports.setSeason(fall);
			break;
		}
		case 4: {
			Season winter = Season.Winter;
			sports.setSeason(winter);
			break;
		}
		default:
			System.out.println("1에서 4사이의 수를 선택하세요");
			break;
		}
		
		
		System.out.println("개막 시즌 : "+sports.getSeason());
	}
}
