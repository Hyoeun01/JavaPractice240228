package ex_240306;

public class Ex_04_abstract_ extends Idol_abstract {
	
	// 일반클래스는 상속을 받고나서 재정의할 의무성이 없지만
	// 추상클래스는 상속을 받고나면 재정의한 메서드를 반드시 구현 해야한다.
	// 재정의를 구현하지 않으면 컴파일러 오류가 난다.
	
	// 선임개발자가 클래스설계 > 주니어개발자들이 혹시라도 반드시 구현해야하는 메서드를 정의하지않는경우
	// 추상클래스나 인터페이스등을 이용해서 재정의를 안하면 강제로 컴파일러오류가 발생한다
	// 중요한 메서드는 이런식으로 재정의를 한다
	
	// 클래스 설계의 유연성을 위해 반드시 자식클래스에서 재정의를 한다면 굳이 부모클래스에서 구현 할 필요가 없다.
	// 추상클래스로 선언만 하고 자식 클래스에서 재정의해서 사용하면 된다
	
	public Ex_04_abstract_(String groupName, String[] groupMembers, String[] groupAlbum) {
		super(groupName, groupMembers, groupAlbum);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void introduceActivityArea() {
		
	}

}
