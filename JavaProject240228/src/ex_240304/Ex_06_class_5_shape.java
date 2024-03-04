package ex_240304;

import ex_self.Shape_other;

public class Ex_06_class_5_shape {

	public static void main(String[] args) {
		
		// 자식클래스에서 부모클래스의 접근지정자가 protected 이면 보이는것 확인
		Triangle tri1 = new Triangle();
		int protectedValue = tri1.edgePoint;
		
		// 자식클래스가 아닌. 상속을 받지않은 해당 protected가 보이지않음
		retangle rec1 = new retangle();
		// rec1은 edgepoint를 사용할수 없다
		
		// 다른 패키지에 있는 파일 불러오기 : ctrl+shift+o (자동 import)
		// 인텔리제이 관련 아이디를 쓰면 옵션에서 자동 임포트 됨
		/*
		 * Shape_other shape_other = new Shape_other(); 
		 * shape_other.
		 */
		
		// 다른패키지에 있는 디폴트 접근지정자는 안보인다
		
	}
	
}

