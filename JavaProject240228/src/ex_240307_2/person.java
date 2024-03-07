package ex_240307_2;

public class person {
	public String name;
	public int age;
	
	public person() {
		// TODO Auto-generated constructor stub
	}
	person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// toString 정의하면 해당인스턴스를 출력시 재정의한 문자열이 온다
	// 주의 >> 모든클래스는 object 상속받음
	// toString을 그대로 사용하지않는다
	// 왜? 실제로 데이터를 비교하지, 객체의 메모리위치 주소값을 비교하지않는다

	// 재정의하면 부모에서 toString(), 자식에도 toString()이 있다. >> 자식이 우선이된다
	
	public String toString() {
		
		return "제이름은 "+this.name+", 나이는 "+this.age+"입니다" ;
	}
	
	// equals 재정의해서 확인해보기 >> 이름이 같으면 같다
	public boolean equals(Object obj) {

		// 담을때 모델 타입을 정해서 담아두면 꺼낼때 편하다
		if (obj instanceof person) {
			person p = (person) obj;
			if (p.name.equals(name)) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		person person1 = new person("사람1",20);
		person person2 = new person("사람2",20);
		
		person person3 = new person("사람",20);
		person person4 = new person("사람",20);
		
		
		
		System.out.println("person1 : "+person1.hashCode());
		System.out.println("person2 : "+person2.hashCode());
		
		System.out.println("person1 : "+person1.toString());
		System.out.println("person2 : "+person2.toString());
		System.out.println("============================================");
		// 실제 데이터를 이용해서 작업을함
		// 비즈니스 로직 > 해당 데이터로 작업을 하지
		// 메모리 위치의 주솟값이 같은지의 여부가 중요하지가않다
		// 왜? > 메모리 관리를 가비지 컬렉터가 자동으로 하기때문에
		
		System.out.println("person1. equals(person2) : " +person1. equals(person2));
		System.out.println("person3. equals(person4) : " +person3. equals(person4));

	}

}
