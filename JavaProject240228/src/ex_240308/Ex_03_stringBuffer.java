package ex_240308;

public class Ex_03_stringBuffer {

	public static void main(String[] args) {
		
		String str3 = new String("Hello");
		String str4 = new String("Hello");
		String str3ConcatString = str3.concat(" world");
		String str4ConcatString = str4.concat(" world");
		
		System.out.println("str3ConcatString : "+ str3ConcatString);
		System.out.println("str4ConcatString : "+ str4ConcatString);
		System.out.println("str3의 System.identityHashCode : "+System.identityHashCode(str3));
		System.out.println("str4의 System.identityHashCode : "+System.identityHashCode(str4));
		System.out.println("str3ConcatString의 System.identityHashCode : "+System.identityHashCode(str3ConcatString));
		System.out.println("str4ConcatString의 System.identityHashCode : "+System.identityHashCode(str4ConcatString));
		System.out.println();
		
		// 문제점을 개선한 stringBuffer 활용
		// 테스트 : 기존문자열에 붙이는 concat 메서드 이용해서
		// 기존메모리 주소값을 그대로 사용하는지 확인

		StringBuffer str1 = new StringBuffer("Hello");
		System.out.println("str1 append 전 hashcode: "+System.identityHashCode(str1));
		
		str1.append(" world!");
		System.out.println("str1 append 후 hashcode : "+System.identityHashCode(str1));
		System.out.println();
		System.out.println("str1.append() : "+str1);
		
		
		str1.insert(6,"java ");
		// stringBuffer 에 따로 toString이 저장되어있어서 바로 인스턴스변수로 출력가능함
		System.out.println("str1 : "+str1);
		
		str1.replace(6, 11,"python ");
		System.out.println("str1 : "+str1);
		
	}

}
