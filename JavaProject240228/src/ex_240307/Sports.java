package ex_240307;

public class Sports {
	
	// 주제
	// Sport : 부모
	
	// 공통멤버 변수 3개 1) 이름 2) 인원수 3) 플레이 시간 4) 운동 장소
	 
	private String sportsName;
	private int sportsMemberCount;
	private String sportsPlayTime;
	private String sportsPlace;
	
	// setter 대신에 매개변수가 4개인 생성자를 만들어서 정보를 받는다
	
	public Sports(String sportsName, int sportsMemberCount, String sportsPlayTime, String sportsPlace) {
		this.sportsName = sportsName;
		this.sportsMemberCount = sportsMemberCount;
		this.sportsPlayTime = sportsPlayTime;
		this.sportsPlace = sportsPlace;
	}
	
	
	// getter구성
	
	public String getSportsName() {
		return sportsName;
	}

	public int getSportsMemberCount() {
		return sportsMemberCount;
	}

	public String getSportsPlayTime() {
		return sportsPlayTime;
	}

	public String getSportsPlace() {
		return sportsPlace;
	}

	
	
	// 공통기능
	public void showInfo() {
		System.out.print("스포츠이름 : "+this.sportsName);
		System.out.print(", 인원수 : "+this.sportsMemberCount);
		System.out.print(", 플레이시간 : "+this.sportsPlayTime);
	}
	
	public void showPlace() {
		System.out.println("운동장소는 "+this.sportsPlace);
	}
	
	// 1) 이름, 인원수, 플레이시간 알려주는 기능
	// 2) 운동장소를 알려주는 기능 
	// 3) 시즌별 개막일 ( 봄, 여름, 가을, 겨울 ) >> Enum로 문자열로 만들기 (상수처럼)
	

	// Swimming : 자식
	// Baseball : 자식2
	
	
}
