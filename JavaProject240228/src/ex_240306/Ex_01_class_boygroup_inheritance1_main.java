package ex_240306;

import ex_240304.Idol;

public class Ex_01_class_boygroup_inheritance1_main {

	public static void main(String[] args) {
		// 부모 클래스: idol, 상속받은 자식클래스: Ex_01_class_boygroup_inheritance1
		// 사용할때는 클래스명과 이름이 동일한 생성자로 초기화를 한다.
		// 기본 문법 : 클래스명 레퍼런스 변수명 = new 클래스명();
		// 클래스명() 을 생성자라고 부르며 해당 인스턴스화를 초기화해서 사용하기위함.
		
		//매개변수가 3개인 생성자 포맷 :(String groupName, String[] groupMembers, String[] groupAlbum)
		
		// 배열의 정의
		// 기본 문법
		// 타입 []배열이름 = new 타입[크기];
		// 방법 1) 
		// String[] boygroup = new String[3];
		// 방법 2)
		// String[] boygroup = {"문자열 요소 1", "문자열 요소2", "문자열 요소3"}
		
		String[] boygroup = {"멤버1", "멤버2","멤버3"};
		String[] groupAlbum = {"앨범1","앨범2","앨범3"};
		
		Ex_01_class_boygroup_inheritance1 boygroup1 
		= new Ex_01_class_boygroup_inheritance1("연습생 그룹1", boygroup, groupAlbum); 
		
		boygroup1.introduceMembers();
		boygroup1.introduceAlbum();
		
		// 부모클래스명 참조형변수 = new 자식클래스명();
		// 참조형변수.[  접근가능한 메서드는 부모꺼만  ]
		
		// 작은집 >>> 큰집(업캐스팅)
		/*
		 * Idol test1 = new Ex_01_class_boygroup_inheritance1(null, groupAlbum,groupAlbum); 
		 * test1.
		 */
		
		// 해당 인스턴스에서 부모메서드만 보인다면, 자식의 메서스도 이용하려면 어떻게해야할까
		// 다운캐스팅 >> 자식클래스명 레퍼런스명 = 캐스팅연산자 (자식클래스명 ) 부모클래스의 인스턴스;
		/*
		 * Idol test2 = new Ex_01_class_boygroup_inheritance1(null, groupAlbum,groupAlbum); 
		 * Ex_01_class_boygroup_inheritance1 test21 =
		 * (Ex_01_class_boygroup_inheritance1) test21;
		 */
		
	}
	
	// 접근지정자
	// public : 어느곳에서든 접근이 가능한 접근지정자
	// private : 해당 클래스 내부에서만 보이는 접근지정자. 다른 위치에서는 보이지 않는다
	// >> 접근해서 값을 설정하거나 가져올때는 setter/getter 를 사용해야한다
	// default : 같은 패키지 내부에서는 다 사용할 수 있는 접근지정자
	// protected : 상속을 받은 자식클래스에서만 사용 가능한 접근지정자
	
	// call by value, call by reference
	// value> 메서드에서 인자값으로 전달시 복사해서 사용하고, 지역변수에서 이용후 소멸함
	// reference > 참조형으로(레퍼런스, 인스턴스) 메서드에 전달하면, 해당 메모리 위치 주솟값을 재사용하고,
	// 메서드를 사용후, 소멸하지않는다

}
