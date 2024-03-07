package ex_240307;

import java.time.LocalDate;

public class Util {

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
