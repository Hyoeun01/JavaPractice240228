package ex_240306;


public class Ex_07_interface_subclass_3 extends Idol_abstract implements singer {
	
	// 상속과 인터페이스를 동시에 진행하고 
	// 부모클래스를 가져다 사용 하려면 초기화가 되어야하고 추상메서드들을 재정의 해줘야함
	// 컴파일러가 제시해주는 코드템플릿을 이용해서 구현부만 따로 정의하면 된다.
	
	public Ex_07_interface_subclass_3(String groupName, String[] groupMembers, String[] groupAlbum) {
		super(groupName, groupMembers, groupAlbum);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void song() {
		System.out.println("감미로운 목소리로 노래함");
	}

	@Override
	public void doSign() {
		System.out.println("친절히 사인을 잘해줌");
		
	}

	@Override
	public void dance() {
		System.out.println("실력이 수준급 이상임");
	}

	@Override
	public void introduceActivityArea() {
		System.out.println("한국, 중국, 일본뿐만아니라 미국도 진출함");
		
	}



	
}
