package ex_240304;

// 상속예제
// 부모클래스 : Idol , 자식클래스 : blackPink
// 기본문법 : 자식클래스 extends 부모클래스

public class BlackPink extends Idol {
	// 추가할 필드 1) 주 활동지역
	public String[] activityAreas ;
	
	// 주의사항 : 부모로부터 상속을 받아서 재사용 하기 위해서는 반드시! 부모가 초기화 되어야한다.
	// 상속은 단일상속만 가능하고, 인터페이스는 다중구현이 가능하다.
	
	public BlackPink(String groupName, String[] groupMembers, String[] groupAlbum, String[] activityAreas) {
		// this:본인클래스(인스턴스)를 가리키는 예약어
		// super:부모클래스를 가리키는 예약어
		super(groupName, groupMembers, groupAlbum);
		this.activityAreas = activityAreas;
		
	}
	
	// 주요 활동을 하는 지역을 알려주는 기능 추가하기
	
	public void infoActivityArea() {
		for(String activityArea : this.activityAreas) {
			System.out.println("주요 활동 지역은 " + activityArea + " 입니다.");
		}
	}

}
