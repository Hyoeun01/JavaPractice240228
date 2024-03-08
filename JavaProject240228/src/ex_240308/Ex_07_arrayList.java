package ex_240308;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex_07_arrayList {

	public static void main(String[] args) {
		
		// ArrayList > List > Collection
		// Vector와 동일하게 List와 Collection 기능 다 상속받음
		// 크기는 가변, 순서가 있고, 중복가능
		// Vector와 다른점 >> 스레드의 동기화 기능을 지원하지않음
		// 추가 삭제 검색 등 유연하게 여러요서들을 처리가 가능하다
		
		// 타입은 무조건 참조형으로 작성할것
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("방어회");
		arrayList.add("테라");
		arrayList.add("라면");
		
		for (String str:arrayList) {
			System.out.println("arrayList의 요소 값 : "+str);
		}
		System.out.println();
		// 삭제
		arrayList.remove(2);
		for (String str:arrayList) {
			System.out.println("arrayList의 요소 값 : "+str);
		}
		// 검색
		System.out.println("라면 있나요? "+arrayList.contains("라면"));
		
		arrayList.add("연어회");
		arrayList.add("좋은데이");
		arrayList.add("나베");
		for (String str:arrayList) {
			System.out.println("arrayList의 요소 값 : "+str);
		}
		System.out.println();
		
		// 현재 arrayList로 Iterator 인터페이스 타입으로 변환 후
		// 모든 요소를 확인 후 조회하는 간단한 기능 구현
		// Iterator 인터페이스를 상속받은 컬렉션들은 
		// 해당 인스턴스에 기능으로 iterator()메소드를 모두 가지고 있고, 이걸 호출하면됩니다
		
		// ArrayList에 있는 모든 요소가 it1인스턴스에 다 들어가있다
		// 비유하자면 테이블에 1,2,3 순서대로 기록이 되어있다.
		// 우리는 순서대로 기록된 테이블 차례차례 순차검색이 가능하다.
		
		//순서 1 > arrayList 인스턴스에 포함된 iterator()호출
		Iterator<String> it1 = arrayList.iterator();
		
		// hasNest =  해당 테이블의 1번 라인부터해서 존재유무를 true/false로 리턴
		//순서 2 > 존재 유무 확인
		while (it1.hasNext()) {
			// next(); 해당값을 가지고 오는 역할
			// 순서3 > 값을 가져오기
			String string = it1.next();
			System.out.println("iterator를 이용한 출력 : "+string);
		}
		
	}

}
