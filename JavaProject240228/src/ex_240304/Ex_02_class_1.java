package ex_240304;


public class Ex_02_class_1 {

	public static void main(String[] args) {
		// 클래스 사용 문법 : 클래스명 레퍼런스변수명 = new 클래스명 ();
		// new 뒤에 오는 클래스명() : '생성자'라고 부르며 해당 인스턴스를 초기화시 사용한다.
		// 지금은 디폴트 생성자로 만들고, 매개변수를 이용해서 생성자를 만들 계획.
		// 오버로딩, this도 간단히 언급하겠습니다
		
		Animal ani1 = new Animal();   // 공장에서 제품을 찍어내듯이 만들기 >> 인스턴스 라고 부른다.
		Animal ani2 = new Animal();   // 각각의 인스턴스들은 다르다고 본다(프로그래밍에서)
		Animal ani3 = new Animal();   // 각각의 인스턴스들을 가리키는 메모리 위치 주소가 다르다.
		
		
		// 객체 사용법 > 닷연산자를 이용해서 (수납도구에서 꺼내듯이 사용하면 된다)
		// 접근지정자를 private로 선언하면 외부에서 접근이 안된다
		// setter/getter 소개후 다시 접근지정자를 private > public으로 바꾸거나 생략(기본=default)
		ani1.name = "ani1";
		ani1.age = 10 ;
		ani1.introduceMethod();
		ani1.soundMethod();
		
		ani2.name = "ani2";
		ani2.age = 7 ;
		ani2.introduceMethod();
		ani2.soundMethod();
		
		
		Animal ani4 = new Animal("ani4", 10);
		ani4.introduceMethod();
		ani4.soundMethod();
		
		Animal ani5 = new Animal("강아지", 14, "멍멍");
		ani5.introduceMethod();
		ani5.soundMethod();
		
		//
		String[] likeFoodList = {"고기","생선","사료"};
		Animal ani6 = new Animal("고양이", 5, "야옹",likeFoodList );
		ani6.introduceMethod();
		ani6.soundMethod();
		// 메서드에 인자값을 굳이 넣을 필요가 없다.
		// 해당클래스의 멤버로 좋아하는 음식 리스트를 받아 해당 속성에 저장한다.
		// 본인이 받아서 저장해놓은걸 사용하면되므로 this로 대체한다.
		
//		ani6.likeFoodList(likeFoodList);
		ani6.likeFoodList();
		
		// 불만사항
		// 1) class 내부에 또다른 클래스가 있는것 
		// -> 현재 같은 패키지 내부로 분리했음.(Animal)
		
		// 2) 해당 인스턴스 생성시 매번 인스턴스에 닷연산자 사용후 재할당하는부분 >>한번에 하기?
		// -> 예) 선언시 기본값을 미리 할당하고 생성하기
		// -> Animal ani3 = new Animal("ani3",10);
		
		// 3) 해당 기능들이 각각의 동물의 이름이나, 나이를 각각 출력하는 방법?
		
		
		

		
		
	}
}
