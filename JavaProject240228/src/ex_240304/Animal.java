package ex_240304;

import java.util.Iterator;

public class Animal {
	// 클래스 정의
	
	
		// 하나의 클래스에는 각각 한개씩 사용한다
		// 지금은 예시로 클래스 안에 또다른 클래스 보여주기용도
		// 파일을 분리한다
		
		// 클래스 : 공장, 설계도면 >> 제품 : '인스턴스'라고 부른다
		
		// 구성 1) 멤버(변수) 2)메서드(기능)
		
		// 멤버
		// private 사용시 외부접근이 불가능하니 setter/getter로 접근할 수 있게 한다.
		// 현재는 public으로 변경한다.
		
		/*
		 * private String name ; private int age ;
		 */
		
		public String name ; 
		public int age ;
		public String soundType;
		// 동물이 좋아하는 음식
		public String[] favoriteFood;
		
		// 매개변수가 2개인 생성자가 정의가 되지않았음
		// Animal ani3 = new Animal("ani3",10); 처럼 사용을 할수가 없다.
		// Animal ani3 = new Animal() : 디폴트생성자 (매개변수가 없는 생성자)
		
		// 디폴트 생성자는 생성자가 아무것도 없다면 시스템에서 알아서 만들어준다
		// 하지만 개발자가 다른 생성자를 하나라도 만든다면 시스템에서 만들어 주지 않는다
		// 생성자 정의: 클래스명()
		
		// 매개변수가 2개인 생성자 만들었음 > 디폴트 생성자가 만들어지지 않는다.
		// 디폴트 생성자를 만들기
		
		public Animal() {
						
		}
		

		public Animal(String name, int age) {
			// 생성자 호출시 입력받은 이름, 나이 등을 현재의 인스턴스의 값으로 교체한다.
			// 현재 우리가 어디에 속해있냐면. 해당클래스(Animal)에 속해있다.
			// this를 사용하는데. this는 현재 클래스의 인스턴스를 가리킨다.
			
			this.name = name;
			this.age = age ;
			
		}
		
		
		public Animal(String name, int age, String soundType) {
			
			this.name = name;
			this.age = age ;
			this.soundType = soundType;
			
		}
		
		// 매개변수가 4개인 생성자 만들기
		public Animal(String name, int age, String soundType, String[] likeFoods) {
			
			this.name = name;
			this.age = age ;
			this.soundType = soundType;
			//어렵다
			this.favoriteFood = likeFoods;
		}
		
		
		
		// 메서드 : 1)소개하는 기능 2)소리 기능 
		// 추가 : 좋아하는 음식 출력하는 기능
		public void introduceMethod() {
//			System.out.println("안녕하세요! 현재는 더미로 작업중, 곧 동적으로 할 예정");
			System.out.println("안녕하세요! 제이름은 "+this.name+"이고, 나이는 " +this.age+"입니다.");
		}
		
		public void soundMethod() {
//			System.out.println("현재는 더미로 소리를 냅니다. 곧 동적으로 할 예정");
			System.out.println("제 소리는요 : " +this.soundType);
		}
		
		// 매개변수 String[] likeFoodList 를 this로 변경해보기
		/*
		 * public void likeFoodList(String[] likeFoodList) { for(int i=0;
		 * i<likeFoodList.length ; i++) {
		 * System.out.println("좋아하는 음식 "+(i+1)+"번 :"+likeFoodList[i]); }
		 * 
		 * }
		 */
	

		public void likeFoodList() {
			for(int i = 0 ; i <this.favoriteFood.length; i++ ) {
				System.out.println("좋아하는 음식 : " + (i+1) + " 번: " + this.favoriteFood[i]);
			}
			
		
		}
}



