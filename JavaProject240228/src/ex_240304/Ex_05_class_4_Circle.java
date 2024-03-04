package ex_240304;

import java.util.Iterator;

public class Ex_05_class_4_Circle {

	public static void main(String[] args) {
		// 클래스 사용 : 생성자 호출
		// 클래스명 레퍼런스 변수 = new 생성자();
		// 클래스명() = 디폴트생성자 ;
		
		Circle koreanPizza = new Circle();
		
		// 클래스 필드의 접근 지정자가 public 일때는 .name이나 .radius에 접근할 수 있었지만
		// 접근 지정자가 private 이므로 접근이 불가능하다
		// 어떻게할건데 ? >> 접근이 가능한 매개체(getter/setter) 만들기
		
		// setter 이용해서 값설정
		
		koreanPizza.setName("부추전");
		koreanPizza.setRadius(15);
		
		//메서드를 이용해서 정보 접근
		
		koreanPizza.showInfo();
		koreanPizza.calcGetArea();
		
		// getter 이용해서 정보접근
		System.out.println("getter로 접근하기 name: "+koreanPizza.getName());
		System.out.println("getter로 접근하기 radius: "+koreanPizza.getRadius());
		
		Circle kimchiPizza = new Circle(10, "김치전");
		kimchiPizza.showInfo();
		kimchiPizza.calcGetArea();
		
		
		Circle potatoPizza = new Circle(20, "감자전", 15000);
		potatoPizza.showInfo();
		potatoPizza.calcGetArea();
		System.out.println("=====================");
		
		// 배열에 담을 타입을 레퍼런스형으로 변경 << 실제 작업에 사용
		Circle[] koreanPizzas = new Circle[5];
		
		koreanPizzas[0] = koreanPizza;
		koreanPizzas[1] = kimchiPizza;
		koreanPizzas[2] = potatoPizza;
		koreanPizzas[3] = new Circle(12, "육전", 20000);
		koreanPizzas[4] = new Circle(14, "호박전", 13000);
		
		// 배열의 선언과 초기화를 같이하기
		
		Circle[] koreanPizzas2 = {koreanPizza, kimchiPizza, potatoPizza, new Circle(12, "육전", 20000), new Circle(14, "호박전", 13000)};
		
		// 반복문을 이용해서 배열에 담은 circle 타입의 레퍼런스에 각각 접근해서
		// showInfo() 호출해보기
		
		//for-each : for(담을 변수 타입 변수명 : 컬렉션(배열))
		for(Circle koreanFood:koreanPizzas) {
			koreanFood.showInfo();
		}
		
		System.out.println("=====================");
		
		for (Circle koreanFood:koreanPizzas2) {
			koreanFood.showInfo();
		}
		

	}

}
