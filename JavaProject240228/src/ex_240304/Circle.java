package ex_240304;

public class Circle {
	
	private int radius;
	private String name;
	private final static double PI=3.14;
	
	// 멤버가 private여서 현재 getter함수를 이용해서 해당 필드에 값 접근
	public int getRadius() {
		return radius;
	}
	
	// 멤버가 private여서 현재 setter함수를 이용해서 해당 필드에 값 설정
	public void setRadius(int radius) {
		this.radius = radius;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	// 기능 1 : 면적구하기
	public void calcGetArea() {
		System.out.println("원의 넓이는 "+this.radius*this.radius*PI);
	}
	
	// 기능 2 : 전이름, 반지름 출력하기
	public void showInfo() {
		System.out.println("전이름 : "+this.name+", 반지름 : "+this.radius);
	}
	
	// getter/setter >> 지금은 수동으로 만들어 사용하지만
	// 1) 시스템에서 반자동으로 만들어서 사용하는 방법
	// 2) 라이브러리 - lombok 외부로 완전히 분리해서 시스템이 동작하면 자동으로 사용하는 방법
	// 반자동으로 연습했다가 프레임워크 들어가면 그때 라이브러리 설치해서 이용하면된다.
	
	// 클래스의 필드에 접근지정자를 private로 해서 외부에서 접근이 안되는 부분 확인
	// 따로 접근해서 1) 값을 설정하는방법 2) 값을 가지고 오는 방법
	
	
	}


