package ex_240304;

public class Ex_05_class_4_Circle {

	public static void main(String[] args) {
		// 클래스 사용 : 생성자 호출
		// 클래스명 레퍼런스 변수 = new 생성자();
		// 클래스명() = 디폴트생성자 ;
		
		Circle koreanPizza = new Circle();
		
		// 클래스 필드의 접근 지정자가 public 일때는 .name이나 .radius에 접근할 수 있었지만
		// 접근 지정자가 private 이므로 접근이 불가능하다
		// 어떻게할건데 ? >> 접근이 가능한 매개체(getter/setter) 만들기
		
		koreanPizza.setName("김치전");
		koreanPizza.setRadius(15);
		
		koreanPizza.showInfo();
		koreanPizza.calcGetArea();

	}

}
