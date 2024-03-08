package ex_240308;

public class Ex_01_wrapper {

	public static void main(String[] args) {
		// Wrapper 클래스 : 기본형을 참조형으로 변환해주는 클래스
		// OOP(Object Oriented Programming)
		// 상속 >> 재사용
		Integer i1 = Integer.valueOf(100); // 반환타입이 Integer이므로 Integer로 받아야한다
		// i1. >> Integer, Object 모두 확인가능
		// i2. >> Object만 확인가능 - Integer 확인x
		Object i2 = Integer.valueOf(100); 
		
		System.out.println("i1 : "+i1);
		// >> 참조형을 출력해보니 해당 기본형의 변수값(100)이 그대로 나옴
		// 참조형 > 기본형으로 자동으로 언박싱함
		
		// 문자열 (참조형) > wrapper(참조형)
		Integer i3 = Integer.valueOf("1000");
		System.out.println("i3 : "+i3);
		
		// 실수 > 통계시 평점을 낼때 라거나 정확도, 일치도 평가시 소수점으로 낼때
		
		// 큰데서 작은데로갈때 보통 강제로 적어준다 >> 다운캐스팅
		// 3.14의 기본형은 double이고 > 작은집인 float로 다운캐스팅함
		Float float1 = Float.valueOf((float)3.14);
		System.out.println("float1 : "+float1);
		
		// 주요 메서드 중에서 많이 사용되는 parseInt 정도만 확인한다
		Integer i4 = Integer.valueOf(100);
		int num = i4.parseInt("1000");
		String num2 = "10000";
		int num3 = Integer.parseInt(num2);
		System.out.println("num3 : "+num3);
	}

}
