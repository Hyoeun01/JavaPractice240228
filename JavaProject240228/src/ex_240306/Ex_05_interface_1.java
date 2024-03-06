package ex_240306;

public interface Ex_05_interface_1 {

	// 인터페이스 = 접점. 특정의 표준이나 규격
	// 예 ) 110v를 220v로 변환하는 '컨버터' , 
	// JDBC > DB회사에서 JDBC인터페이스의 규격에 맞게 클래스를 작성하면 개발자는 인터페이스 규격은 두고 해당 DB의 클래스만 교체해서 사용하면된다
	/*
	 * 특징 1 ) 다중상속이가능하다 
	 * 2) 추상클래스처럼 추상메서드, 상수로 구성이된다 
	 * 3) jdk버전이 올라감에 따라서 기본, private,
	 * static등 메서드 들도 같이 구성이 된다. 
	 * 4) 인터페이스도 추상클래스처럼 실제 사용보다는 설계도로 사용된다 
	 * 5) 규모가 작으면 추상클래스나 인터페이스를 안쓰는 경우도 있지만 유지보수를 생각하면 사용하게된다
	 */
	
	// 구성품
	public static final int MAX = 100; // 상수
	// int MAX = 100; 로만 써도 상관이없다.
	abstract public void showInfo(); // 추상메소드
	// void showInfo(); 로만 써도 된다
	
    public default void introduceInfo() { // 기본메서드
    	System.out.println("기본메서드입니다");
    	introduceHobby(); // private >> 외부에서는 호출할수없으니 기본메서드안에서 호출
    	introduceMember();
    }
    private void introduceHobby() {
    	System.out.println("private 메서드");
    }
    public static void introduceMember() {
    	System.out.println("static 메서드 입니다");
	}

}
