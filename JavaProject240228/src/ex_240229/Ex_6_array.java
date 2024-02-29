package ex_240229;

public class Ex_6_array {

	public static void main(String[] args) {
		// 배열 ( 계란판 ) : 크기가 고정이고 변경이 불가능하다 
		// 같은 타입의 데이터만 담을 수 있다.
		
		/* 배열 생성 방법
		 * 1) int array[];
		 * array = new int [4]; >> 선언 후 배열 생성 : 초기화를 한다
		 * 2) int [] array = new int[4];
		 * 3) int array[] = {1,2,3}
		 */

		// index[0] 부터 시작하고, 순서가 있다.
		// 선언시 int array[5]; 는 불가능하다.
		
		int array[] = new int[5];
		array[0]=10;
		array[1]=13;
		array[2]=12;
		//array[0]값 출력하기
		System.out.println("array[0] 값은 :"+array[0]);
		
		int array2[] = {1,2,3,4,5};
		//반복문으로 불러오기
		for(int i=0; i<array2.length; i++) {
			System.out.println("array["+i+"]의 값은 "+array2[i]+"입니다.");
		}
		
		//문자열 배열 선언하기
		
		String[] arrayLunchMenu = {"김밥","국밥","초밥","쌀국수","김치찌개","된장찌개"};
		System.out.println("==================점심메뉴==================");
		for(int i=0; i<arrayLunchMenu.length; i++) {
			System.out.println("먹고싶은 메뉴는 "+arrayLunchMenu[i]+"입니다.");
		}
		
	}

}
