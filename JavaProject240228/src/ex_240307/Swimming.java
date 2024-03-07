package ex_240307;

public class Swimming extends Sports implements Interface_1 {

	public Swimming(String sportsName, int sportsMemberCount, String sportsPlayTime, String sportsPlace) {
		super(sportsName, sportsMemberCount, sportsPlayTime, sportsPlace);
		
		
	}

	@Override
	public void showInOutPlace(int checkInOUtPlace) {
		if (checkInOUtPlace == 1) {
			System.out.println("실내스포츠입니다.");
		} else {
			System.out.println("실외스포츠입니다.");
		}
		
	}

	@Override
	public void showUseItems(String[] items) {
		System.out.print("사용장비 : ");
		for(String item : items) {
			
			System.out.print(", "+item);
		}
		
	}

	@Override
	public void showTeamNameOrMembers(String[] TeamOrMember) {
		System.out.print("팀명(팀원)소개 : ");
		for(String teamOrMember : TeamOrMember) {
			
			System.out.print(", "+teamOrMember);
		}
		
		
	}

	
}
