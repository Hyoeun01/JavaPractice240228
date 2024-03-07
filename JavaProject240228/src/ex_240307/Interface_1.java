package ex_240307;

public interface Interface_1 {

	
	// 인터페이스 설계 1)상수 2) 추상메서드
	// 반드시 이 기능은 구현해야한다 >>
	// 플레이 장소를 알려주는 기능 ( 실내/실외 )
	// 사용하는 운동아이템을 알려주는 기능 
	// 팀명/팀원을 알려주는 기능
	
	void showInOutPlace(int checkInOUtPlace);
	void showUseItems(String [] items);
	void showTeamNameOrMembers(String [] TeamOrMember);
	
}
