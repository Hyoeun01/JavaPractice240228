package ex_240308;

import java.util.Vector;

class Book {
	private String name;
	private String author;
	
	public Book(String name, String author) {
		this.name = name;
		this.author = author;
	}
	
	public void showInfo() {
		System.out.println("책 이름은 "+this.name+", 저자는 "+this.author);
	}
	
}
public class Ex_06_collection_vector {

	public static void main(String[] args) {
	
		// 벡터의 부모요소 > 리스트 > 컬렉션
		// 리스트, 컬렉션의 기능을 모두 상속받았고
		// 크기가 가변이어서 추가, 삭제, 검색 등 자유롭게 사용할 수 있다
		
		// 선언 했고, 크기를 따로 지정할 필요가 없다! >> 성능이 좋은 계란판이다
		Vector<String> v1 = new Vector<String>();
		System.out.println("v1의 용량 확인 : "+v1.capacity());
		
		// 제너릭 : <> 연산자, 이미 html 태그를 사용할때 사용한 연산자 기호이다
		// <T>,<String>,<Integer>등 타입지정이가능하고,
		// 담을 때 해당타입만 담게되어서 꺼낼때 편하다
		// 주의사항 : 기본형은 불가능하다!
		
		// 추가하기 >> 순서가생기고, 중복이 가능하다.
		v1.add("사과");
		v1.add("바나나");
		v1.add("멜론");
		v1.add("오렌지");
		v1.add("참외");
		
		
		// 해당 요소의 값 하나만 출력해보기
		v1.get(3);
		System.out.println("v1[3]출력 :"+v1.get(3));
		System.out.println();
		
		//출력해보기
		for(String str1 :v1) {
			System.out.println("v1벡터 출력 : "+str1);
		}
		System.out.println();
		
		// 삭제해보기 
		// 추가가 많이됐을경우 지울때 index를 확인해야해서 번거롭다	
		v1.remove(1);
		for(String str1 :v1) {
			System.out.println("v1벡터 출력 : "+str1);
		}
		System.out.println();
		// 반복문으로 추가하기
		for (int i = 0; i<4; i++) {
			v1.add("과일"+(i+1));
		}
		for(String str1 :v1) {
			System.out.println("v1벡터 출력 : "+str1);
		}
		System.out.println();
		
		// boolean addAll(Collection<? extends e> c); 컬렉션 시 모든 요소를 벡터의 맨뒤에 추가하는 기능
		Vector<String> v2 = new Vector<String>();
		v2.add("광어회");
		v2.add("진로");
		v2.add("매운탕");
		
		// 한번에 통째로 넣기
		v1.addAll(v2);
		for(String str1 :v1) {
			System.out.println("v1벡터 출력 : "+str1);
		}
		
		// boolean contains(Object o) ; 벡터가 지정된 객체o를 포함하고있으면 true를 리턴
		boolean isHotSpicySoup = v1.contains("매운탕");
		System.out.println("매운탕 있나요 : "+isHotSpicySoup);
		
		// true 이면 yes출력 or false이면 no 출력하게
		
		// int indexOf(Object o) : o와같은 첫번쨰 요소의 인덱스 리턴. 없으면 -1리턴
		int hotSpicysoupIndex = v1.indexOf("매운탕");
		System.out.println("매운탕의 인덱스번호 : "+hotSpicysoupIndex);
		
		// 길이 :size
		System.out.println("v1의 사이즈 : "+v1.size());
		
		//object[] toArray(); 벡터의 모든 요소를 포함하는 배열 리턴
		Object[] v1Array = v1.toArray();
		// 벡터의타입 : string, toArray()는 반환타입이 object
		System.out.println("벡터를 배열로 변환후 출력 확인해보기");
		for(Object obj : v1Array) {
			String str = (String)obj;
			System.out.println("v1Array 출력 : "+str);
		}
		System.out.println();
		
		System.out.println("v1의 용량 확인 : "+v1.capacity());
		
		Vector<Book> v3 = new Vector<Book>();
		v3.add(new Book("책1", "작가1"));
		v3.add(new Book("책2", "작가2"));
		v3.add(new Book("책3", "작가3"));

		// 출력. 
		System.out.println("Book 요소의 내용 다 출력 :");
		for (Book book : v3) {
			book.showInfo();
		}
		
	}

}
