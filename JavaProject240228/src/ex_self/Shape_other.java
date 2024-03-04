package ex_self;

public class Shape_other {
	
	private String name;
	//접근 지정자 생략(defalut) : 같은 패키지 내부에서 접근이 가능함
	String color;
	
	// 상속을 받은 자식클래스에서만 접근 가능
	protected int edgePoint;
	public int edgePoint2;

}
