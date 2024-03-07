package ex_240307;

public class SubSports extends Sports implements Interface_1{
	
	// 추가할 멤버 : 시즌정보, 실내외 선택, 사용장비, 멤버
	private String seasonInfoString;
	private String inOrOut;
	private String [] items;
	private String [] members;

	public SubSports(String sportsName, int sportsMemberCount, 
			String sportsPlayTime, String sportsPlace,
			String seasonInfoString, String inOrOut,
			String [] items,  String [] members) {
		super(sportsName, sportsMemberCount, sportsPlayTime, sportsPlace);
		// TODO Auto-generated constructor stub
	}
	
	// 한번에 모든 값 출력하는 메서드 만들기
	
	public  void showAllInfo() {
		System.out.println("==============정보확인용==============");
		System.out.println("종목이름 : "+super.getSportsName()+", 인원수 : "+super.getSportsMemberCount()
		+", 경기시간 : "+super.getSportsPlayTime()+", 경기장소 : "+super.getSportsPlace()+
		",시즌정보 : "+ this.seasonInfoString+",실내외정보 : "+this.inOrOut);
	
		
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
			
			System.out.print(item+" ");
		}
		System.out.println();
		
	}

	@Override
	public void showTeamNameOrMembers(String[] TeamOrMember) {
		System.out.print("팀명(팀원)소개 : ");
		for(String teamOrMember : TeamOrMember) {
			
			System.out.print(teamOrMember+" ");
		}
		System.out.println();
		
	}


}
