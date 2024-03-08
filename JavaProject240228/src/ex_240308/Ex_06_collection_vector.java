package ex_240308;

import java.util.Vector;

import javax.swing.plaf.basic.BasicScrollPaneUI.VSBChangeListener;

public class Ex_06_collection_vector {

	public static void main(String[] args) {
	
		// 벡터의 부모요소 > 리스트 > 컬렉션
		// 리스트, 컬렉션의 기능을 모두 상속받았고
		// 크기가 가변이어서 추가, 삭제, 검색 등 자유롭게 사용할 수 있다
		
		// 선언 했고, 크기를 따로 지정할 필요가 없다! >> 성능이 좋은 계란판이다
		Vector<String> v1 = new Vector<String>();
		
		// 추가하기
		v1.add("사과");
		v1.add("바나나");
		v1.add("멜론");
		v1.add("오렌지");
		v1.add("참외");
		
		//출력해보기
		for(String str1 :v1) {
			System.out.println("v1벡터 출력 : "+str1);
		}
		System.out.println();
		
		// 삭제해보기 
		v1.remove(1);
		for(String str1 :v1) {
			System.out.println("v1벡터 출력 : "+str1);
		}
		System.out.println();
		// 반복문으로 추가하기
		for (int i = 0; i<10; i++) {
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
		
		// int indexOf(Object o) : o와같은 첫번쨰 요소의 인덱스 리턴. 없으면 -1리턴
		int hotSpicysoupIndex = v1.indexOf("매운탕");
		System.out.println("매운탕의 인덱스번호 : "+hotSpicysoupIndex);
		
		// 길이 :size
		System.out.println("v1의 사이즈 : "+v1.size());
		
	}

}
