package ex_240304;

public class Ex_07_class_6_callbyvalue {

	public static void main(String[] args) {
		
		// callByValue : 원본값을 복사했기 때문에 지역변수는 소멸
		
		// 메서드 안의 변수는 지역변수여서 메서드가 끝나면 소멸한다
		int n = 10 ;
		Circle circle = new Circle(n);
		circle.increase(n);
		
		System.out.println("변수 n의 변화가 없는 부분 확인하기 : "+n);
		
		Circle c1 = new Circle(5);
		// c1이라는 인스턴스의 멤버에서 radius = 5로 할당되어있음
		// c1이 바라보는 메모리 주소의 값을 예)0x100라고하면
		System.out.println("c1의 radius 값 :  "+ c1.getRadius());
		
		// 메서드에 인잣값을 레퍼런스타입으로 전달을하면
		increase2(c1);
		System.out.println("increase2의 메서드 호출후 값 확인하기. c1의 radius 값 :  "+ c1.getRadius());
	
		// call by ref
		int a[] = {1,2,3,4,5};
		
		increase3(a);
		
		for(int num :a ) {
			System.out.println("배열 a의 요소 출력하기. "+num);
		}
	
	}
	
	// callByReference : 참조형 ( 얕은복사 )
	public static void increase2(Circle c100) {
		// Circle c100 = c1
		// c100도 0x100을 가리킨다
		// 0x100에 위치한 값을 변경하면 c1도 영향을 받는다.
		c100.setRadius(200);
	}
	
	public static void increase3(int [] array) {
		for(int i = 0; i<array.length; i++) {
			array[i]++;
		}
	
	}


}
