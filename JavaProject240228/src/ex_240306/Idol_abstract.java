package ex_240306;

// 추상 클래스로 변경하기
// 추상클래스란 : 추상메소드를 하나라도 가지고있는 클래스
// abstract 라는것은 > 대략적인, 아웃라인, 개요 같은것 >> 반댓말 : 구체적
// 추상메서드 : 메서드의 선언만하고 몸통(구현체)은없는 메서드.
// abstract public void introduceAlbum();

//idol클래스 만들고, 해당 클래스 속성에는 그룹명, 그룹인원, 그룹원 이름.
	// 기능 
	// 1) 그룹이름소개 
	// 2) 인원 소개  >> 배열의 크기로 대체
	// 3) 그룹원 이름 소개
	// 4) 앨범이름 소개
// 추상메서드 추가
    // 5) 활동지역 소개

// 기존클래스가 추상클래스로 변경된다.
 	
abstract public class Idol_abstract {
	
	public String groupName;
	public String[] groupMembers;
	public String[] groupAlbum;
	

	public Idol_abstract(String groupName, String[] groupMembers, String[] groupAlbum) {
		
		this.groupName = groupName;
		this.groupMembers = groupMembers;
		this.groupAlbum = groupAlbum;
		
		System.out.println("안녕하세요, "+groupName+"입니다!");
		
	}
	
	public void introduceMembers() {
		for(String member :  this.groupMembers) {
			System.out.println("멤버 "+member+"입니다.");
		}
		
	}

	public void introduceAlbum() {
		for(String album :  this.groupAlbum) {
			System.out.println(" 부모메서드 기능 : 앨범이름은 "+album+"입니다.");
		}
			
	}
	
	abstract public void introduceActivityArea();
	
}
