package ex_240307;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
	// 	Util util = new Util();
		
		//
		Sports swimming = new Swimming("수영", 8, "10분이내", "부산 사직 아시아드");
		swimming.showInfo();
		swimming.showPlace();
		
		/*
		 * Season summer = Season.Summer; 
		 * swimming.setSeason(summer);
		 * System.out.println("수영 개막 시즌 : "+swimming.getSeason());
		 */
		
		Util.showSeason(swimming, 2);
		
		//시간설정
		// date타입>문자열타입 변환
		/*
		 * LocalDate currentDate = LocalDate.now(); 
		 * String createTime =currentDate.toString(); 
		 * swimming.setCreateTime(createTime);
		 * System.out.println("수영 등록시간 : "+ swimming.getCreateTime());
		 */
		
		Util.showDate();
		
		// 인터페이스에서 정의한 추상메서드 사용
//		
//		void showInOutPlace(int checkInOUtPlace);
//		void showUseItems(String [] items);
//		void showTeamNameOrMembers(String [] TeamOrMember);
		
		// 다형성으로 부모타입으로 받아서, 현재 보이는 메서드는 부모만 보인다.
		// 다운캐스팅
		Swimming swimming2 = (Swimming)swimming;
		swimming2.showInOutPlace(1);
		
		String [] members = {"효은1","효은2","효은3","효은4"}; 
		swimming2.showTeamNameOrMembers(members);
		
		String [] items = {"수경","수영복","수모","오리발"};
		swimming2.showUseItems(items);
		
		System.out.println("======================");
		
		
		// baseball 인스턴스 만들기
		Sports baseball = new Baseball("야구", 9, "약 3시간", "사직야구장");
		baseball.showInfo();
		baseball.showPlace();
		Util.showSeason(baseball, 1);
		Util.showDate();
		
		Baseball baseball2 = (Baseball)baseball;
		baseball2.showInOutPlace(2);
		
		String [] baseballMembers = {"효은1","효은2","효은3","효은4","효은5"}; 
		baseball2.showTeamNameOrMembers(baseballMembers);
		
		String [] baseballItems = {"배트","글러브","헬멧","무릎보호구"};
		baseball2.showUseItems(baseballItems);
		
		System.out.println("======================");
		
	}

}
