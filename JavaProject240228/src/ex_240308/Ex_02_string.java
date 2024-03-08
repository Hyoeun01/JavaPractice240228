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
		System.out.println("str1의 HashCode : "+str1.hashCode());
		System.out.println("str2의 HashCode : "+str2.hashCode());
		System.out.println("str1의 System.identityHashCode : "+System.identityHashCode(str1));
		System.out.println("str2의 System.identityHashCode : "+System.identityHashCode(str2));
		System.out.println();
		
		String str3 = new String("Hi");
		String str4 = new String("Hi");
		System.out.println("str3의 System.identityHashCode : "+System.identityHashCode(str3));
		System.out.println("str4의 System.identityHashCode : "+System.identityHashCode(str4));
		System.out.println();
		// System.identityHashCode -> 메모리 위치 주소값을 확인 하는 용도로 사용하는 메서드.
		Object objStr3 = str3;
		Object objStr4 = str4;
		System.out.println("objStr3의 System.identityHashCode : "+System.identityHashCode(objStr3));
		System.out.println("objStr4의 System.identityHashCode : "+System.identityHashCode(objStr4));
		System.out.println();
		// concat 함수 > 문자열이 변경이 안되는부분 확인
		
		String str3ConcatString = str3.concat(" world");
		String str4ConcatString = str4.concat(" world");
		System.out.println("str3ConcatString : "+ str3ConcatString);
		System.out.println("str4ConcatString : "+ str4ConcatString);
		System.out.println("str3ConcatString의 System.identityHashCode : "+System.identityHashCode(str3ConcatString));
		System.out.println("str4ConcatString의 System.identityHashCode : "+System.identityHashCode(str4ConcatString));
		System.out.println();
		// test 
		String str5 = new String("hello");
		String str6 = new String("hello");
		System.out.println("str5의 System.identityhashcode : "+System.identityHashCode(str5));
		System.out.println("str6의 System.identityhashcode : "+System.identityHashCode(str6));
		System.out.println();
		// equals 문자열 비교하기 : 정수 비교하듯이 == 를 사용하면 안된다
		String str7 = new String("hello1");
		String str8 = new String("hello2");
		String str9 = new String("hello1");
		System.out.println("str7.equals(str8) 비교 : "+str7.equals(str8));
		System.out.println("str7.equals(str9) 비교 : "+str7.equals(str9));
		System.out.println();
		
		// charAt(int index) : 해당 인덱스에 있는 문자값 리턴
		String str10 = "HELLO" ;
		String str11 = "HOUSE" ;
		char char1 = str10.charAt(3);
		System.out.println("char1 : "+char1);
		System.out.println("str10.charAt(3): "+str10.charAt(3));
		System.out.println("HELLO.charAt(3) : "+"HELLO".charAt(3));
		
		// codePointAt(int index) : 해당 인덱스에 있는 문자열의 유니코드 값 반환
		System.out.println("str10.codePointAt(3): "+str10.codePointAt(3));
		System.out.println();
		
		// comeparedTo(String anotherString) : 두 스트링을 사전적순서로 비교해서 같으면 0, 
		// 현재스트링이 비교스트링보다 먼저나오면 음수, 나중에나오면 양수 출력
		
		// HELLO 와 HOUSE 비교  - HELLO < HOUSE
		System.out.println("str10.compareTo(str11) : "+str10.compareTo(str11));
		System.out.println("str11.compareTo(str10) : "+str11.compareTo(str10));
		System.out.println("str10.compareTo(str10) : "+str10.compareTo(str10));
		System.out.println();
		
		// contains > 찾기기능을 구현할때 이용하는 메서드
		// boolean contains(CharSequence s) : s에 지정된 문자들을 포함하고있으면 리턴
		System.out.println("str10.contains(\"H\") : "+str10.contains("H"));
		System.out.println("str10.contains(\"HL\") : "+str10.contains("HL"));
		System.out.println("str10.contains(\"Hello\") : "+str10.contains("Hello"));
		System.out.println("str10.contains(\"HELL\") : "+str10.contains("HELL"));
		System.out.println("str10.contains(\"HELOL\") : "+str10.contains("HELOL"));
		System.out.println("str10.contains(\"HELLO\") : "+str10.contains("HELLO"));
		System.out.println();
		
		// 검색기능 만들기 > 임시 더미 db
		// apple 검색하기
		System.out.println("apple 검색하기 : "+searchFruit("apple"));
		System.out.println("banana 검색하기 : "+searchFruit("banaan"));
		
		// length : 문자열의 길이 리턴
		System.out.println("Hello의 length : "+"Hello".length());
		
		// replace(charsequence target, charsequence replacement) : targer을 replacement로 변경
		System.out.println("str10.replace(\"HELLO\", \"PILLOW\") : "+str10.replace("HELLO", "PILLOW"));
		
		// String[] split(String regex): 정규regex에 일치하는 부분을 중심으로 문자열 분리하기
		String str12 = "H,E,L,L,O";
		String [] resultArray1 = str10.split("");
		String [] resultArray2 = str12.split(",");
		showArray(resultArray1);
		showArray(resultArray2);
		System.out.println();
		
		// String subString(int beginIndex) :beginIndex부터 시작되는 문자열을 반환
		// String subString(int beginIndex, int lastIndex) : begin~last미만 까지의 문자열 반환
		str10.substring(2);
		System.out.println("str10.substring(2) : "+str10.substring(2));
		System.out.println("str10.substring(1,3) : "+str10.substring(1,3));
		
		// String trim() : 문자열 앞뒤의 공백을 제거함
		String str13 = "   HELLO   ";
		System.out.println("str13.length: "+str13.length());
		System.out.println("str13 : "+str13);
		System.out.println("str13.trim().length() : "+str13.trim().length());
		System.out.println("str13.trim() : "+str13.trim());	
		
		// trim() 응용
		// 1) 검색시 복붙할때 공백이 섞여있음
		// 대소문자 상관없이 검색
		// 2) 입력된 파일의 확장자를 기준으로 파일의 종류(이미지,영상,텍스트 등) 분리
		// abc.jpg, def.jpeg, ghi.png, jkl.mp3 등  >> 확장자분리
		
	}
	
	// 배열의 요소를 출력하는 메서드
	public static void showArray(String[] array) {
		System.out.println("배열을 출력하는 기능 호출함");
		for(String string : array) {
			System.out.println(string);
			
		}
	}
	
	// 검색하는 메서드 만들기 > 생자바
	// 실무 > 화면에 검색키워드를 전달하면 (front)
	// 메서드에 입력값 키워드를 데이터베이스로 전달(back)
	// DB 에서 select LIKE절로 검색 - true / false 반환 (server)
	// 해당내용을 다시 화면으로 전달
	
	public static String searchFruit(String search) {
		// 원래 검색기능을 이용시 해당디비에 접근해서 해당내용이 있는지 유무를확인
		// 성공유무를 체크하는 변수
		int resultCheck = 0;
		String resultSuccesString ="";
		String resultFailString ="";
		String [] fruitArray = {"apple", "banana", "grape"};
		for(int i = 0 ; i < fruitArray.length; i++) {
			if(search.contains(fruitArray[i])) {
				resultSuccesString = fruitArray[i];
				resultCheck = 1;
			} else {
				resultFailString = "검색된 키워드가 존재하지 않습니다.";
			}
		}
		if(resultCheck == 1) {
			return resultSuccesString;
		} else {
			return resultFailString;
		}
		
	}
	
}
