package ex_240308;

public class Ex_02_string {

	public static void main(String[] args) {
		// String : 참조형. 클래스 >> 수정이 불가능하므로 계속 새로 생성하므로 메모리 소모가 심하다.
		// 관련 메서드 확인
		
		// 선언방식에 따라서 리터럴 테이블에 저장해서 공유(재사용)하거나
		// 1) String str1 = "HELLO";
		// 2) String str2 = new String("hello") ; 힙 메모리 공간 어딘가에 계속 새롭게 만든다
		
		String str1 = "HELLO";
		String str2 = "HELLO";
		System.out.println("str1의 System.identityHashCode : "+System.identityHashCode(str1));
		System.out.println("str2의 System.identityHashCode : "+System.identityHashCode(str2));
		System.out.println();
		
		String str3 = new String("Hi");
		String str4 = new String("Hi");
		System.out.println("str3의 System.identityHashCode : "+System.identityHashCode(str3));
		System.out.println("str4의 System.identityHashCode : "+System.identityHashCode(str4));

		Object objStr3 = str3;
		Object objStr4 = str4;
		System.out.println("objStr3의 System.identityHashCode : "+System.identityHashCode(objStr3));
		System.out.println("objStr4의 System.identityHashCode : "+System.identityHashCode(objStr4));
		
		// concat 함수 > 문자열이 변경이 안되는부분 확인
		
		String str3ConcatString = str3.concat(" world");
		String str4ConcatString = str4.concat(" world");
		System.out.println("str3ConcatString의 System.identityHashCode : "+System.identityHashCode(str3ConcatString));
		System.out.println("str4ConcatString의 System.identityHashCode : "+System.identityHashCode(str4ConcatString));
		
		// test 
		String str5 = new String("hello");
		String str6 = new String("hello");
		System.out.println("str5의 System.identityhashcode : "+System.identityHashCode(str5));
		System.out.println("str6의 System.identityhashcode : "+System.identityHashCode(str6));
		
	}

}
