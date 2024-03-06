package ex_240304;

//idol클래스 만들고, 해당 클래스 속성에는 그룹명, 그룹인원, 그룹원 이름.
	// 기능 
	// 1) 그룹이름소개 
	// 2) 인원 소개  >> 배열의 크기로 대체
	// 3) 그룹원 이름 소개
	// 4) 앨범이름 소개
	

//인스턴스 - BTS, 블랙핑크

public class Idol {
	
	public String groupName;
	// public int groupNumber; >> 아래 배열의 크기로 알수있다.
	public String[] groupMembers;
	public String[] groupAlbum;
	
	// 매개변수가 3개인 생성자를 만들면 된다.
	// 디폴트생성자를 만들필요가 있?을?까요? > 안만들어도 될듯 . 3개짜리 생성자만 만들면된다
	
	public Idol(String groupName, String[] groupMembers, String[] groupAlbum) {
		// 생성자 호출시 넘겨받은 매개변수를 원래의 인스턴스값으로 저장했다.
		this.groupName = groupName;
		this.groupMembers = groupMembers;
		this.groupAlbum = groupAlbum;
		
		// 인스턴스 생성시 바로 인사하기.
		System.out.println("안녕하세요, "+groupName+"입니다!");
		
	}
	// 인스턴스 메서드.
	// 기존에 앞에서 사용했던 static을 이용해 만들었던 클래스 메서드와 비교되는 부분.
	// 이 메서드는 인스턴스를 만들고 나서 사용이 가능하다.
	
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
	
	// 오버로드란 : 생성자 메서드에서 매개변수의 정의부분에서 타입이 다른것
	// 이름은 동일하지만 매개변수의 정의를 다르게 하는것.
	// 오버로드의 예 : 이름은 동일하지만 매개변수 정의가 다르다.
	/*
	 * public Animal() { }
	 * 
	 * public Animal(String name, int age) { 
	 * this.name = name; 
	 * this.age = age ; 
	 * }
	 * 
	 * 
	 * public Animal(String name, int age, String soundType) { 
	 * this.name = name;
	 * this.age = age ; 
	 * this.soundType = soundType;
	 * }
	 * 
	 * 
	 * public Animal(String name, int age, String soundType, String[] likeFoods) {
	 * this.name = name; 
	 * this.age = age ; 
	 * this.soundType = soundType;
	 * this.favoriteFood = likeFoods; 
	 * }
	 */
}
