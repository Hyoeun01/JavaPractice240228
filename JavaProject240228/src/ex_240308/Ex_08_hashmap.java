package ex_240308;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Ex_08_hashmap {

	public static void main(String[] args) {
		
		// hashmap은 키와 값의 구조형태로 이루어진 컬렉션
		// 요소로는 참조형을 가지고있다
		// 가변크기이고 추가, 수정, 삭제, 검색등이 자유롭다
		
		// 문법 
		HashMap<String, String> hashmap = new HashMap<String, String>();
		
		// 추가하기
		hashmap.put("apple","사과");
		hashmap.put("banana","바나나");
		hashmap.put("grape","포도");
		
		// 출력하기
		System.out.println("hashmap[\"apple\"]  :"+hashmap.get("apple"));
		
		// 반복문으로 변경하기 > iterator 이용
		// 맵이 가지고있는 모든 키를 조회
		// 집합이라는 컬렉션에 키들을 다 모아두기
		Set<String> keys = hashmap.keySet();
		
		// 반복이 가능하게 만들어서 순차 조회하기
		Iterator<String> it1 = keys.iterator();
		// 
		while(it1.hasNext())
		{
			// 모든 키 조회
			String keyString = it1.next();
			// 해당 키를 이용해서 밸류 조회
			String value = hashmap.get(keyString);
			System.out.println("key: "+keyString+", value : "+value);
		}
		System.out.println();
		
		// 제거하기
		hashmap.remove("apple");
		
		Set<String> keys2 = hashmap.keySet();
		Iterator<String> it2 = keys.iterator();
		 
		while(it2.hasNext())
		{
			
			String keyString = it2.next();
			
			String value = hashmap.get(keyString);
			System.out.println("key: "+keyString+", value : "+value);
		}
		
		// 검색하기
		System.out.println("키에대한 banana의 존재유무 :"+hashmap.containsKey("banana"));
		
		// 값으로 검색
		System.out.println("값에대한 바나나의 존재유무: "+hashmap.containsValue("바나나"));
	}

}
