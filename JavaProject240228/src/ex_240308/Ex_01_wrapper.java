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
		
		// static으로 선언된 메서드는 가급적 접근을 클래스명으로 하도록 합시다
		// 인스턴스로 접근이 가능하지만 권장하지는 않음
		// static은 클래스가 로드될 때 부터 있는 메모리 위치 주소값이고(참조형)
		// 인스턴스는 생성시 할당되는 메모리 위치 주소값(참조형)이다
		Integer i4 = Integer.valueOf(100);
		int num = i4.parseInt("1000");
		String num2 = "10000";
		int num3 = Integer.parseInt(num2);
		System.out.println("num3 : "+num3);
		
		// 참조형 > 기본형으로 메서드이용하기
		Integer num4 = Integer.valueOf(5000);
		int num5 = num4.intValue();
		// 자동언박싱
		System.out.println("num4 : "+num4);
		//wrapper 클래스 메서드 이용해서 참조형 > 기본형으로 변경
		System.out.println("num5 : "+num5);
		
		// 배열로 Interger들 담아보기
		Integer[] arrayInteger = {i1,num4,i3};
		// 반복자 패턴 (iterable한 것들)
		for(Integer x : arrayInteger) {
			System.out.println("자동 형변환으로 x출력하기 : " +x);
		}
		
		// 화면에서 데이터가 넘어온다 ( 프론트엔드 포인트)
		// > 백엔드에서 임시 메모리 데이터를 담아둔다
		// > 콘솔로 대신출력 (서버가 없기때문에)
		// > 데이터 베이스 서버에 전달한다
		
	}

}
