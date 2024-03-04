package ex_240304;

import java.util.Scanner;

public class Ex_04_class_3_idol2_ {

	public static void main(String[] args) {
		// 아이돌 클래스 사용하기
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("그룹 이름을 입력하세요>> ");
		String groupNameString = scanner.next();
		System.out.println("그룹은 몇명인가요? >> ");
		int groupMemberNumber = scanner.nextInt();
		
		System.out.println("그룹멤버를 입력해주세요.(공백으로 구분해서 넣기)>>");
		String[] groupMembers = new String[groupMemberNumber];
		for ( int i=0; i<groupMembers.length; i++ ) {
			groupMembers[i]= scanner.next(); 
		}
		
		System.out.println("대표앨범 3개만 입력해주세요.(공백으로 구분해서 넣기)>>");
		String[] groupAlbums = new String[3];
		for ( int i=0; i<groupAlbums.length; i++ ) {
			groupAlbums[i]= scanner.next(); 
		}
		
		System.out.println("주요활동지역 3개만 입력해주세요.(공백으로 구분해서 넣기)>>");
		String[] areaActivity = new String[3];
		for ( int i=0; i<areaActivity.length; i++ ) {
			areaActivity[i]= scanner.next(); 
		}
		
		//new idol(이름, 멤버, 앨범)
		/*
		 * Idol idol = new Idol(groupNameString, groupMembers, groupAlbums);
		 * idol.introduceMembers(); 
		 * idol.introduceAlbum();
		 */
		
		//블랙핑크 만들고 아이돌클래스 상속받음
		
		/*
		 * blackPink blackPink = new blackPink(groupNameString, groupMembers,
		 * groupAlbums, areaActivity); blackPink.introduceMembers();
		 * blackPink.introduceAlbum(); blackPink.infoActivityArea();
		 */
		
		// 다형성 확인하기
		// 부모 타입으로 받아도 (작은집 > 큰집 이므로 )문제가 없다.
		
		// blackPInk는 아이돌이면서 블랙핑크이다
		// 타입이 부모 >> 이 인스턴스를 실행을 하면 레퍼런스는 부모를 바라본다. >> 부모의 기능만 구현이 됩니다.
		
		// 본인의 자식클래스를 사용하고싶다면, 다운캐스팅을 해야한다.
		// 부모클래스 -> 자식클래스 (다운캐스팅)
		Idol blackPink = new blackPink(groupNameString, groupMembers, groupAlbums, areaActivity);
		blackPink.introduceMembers();
		blackPink.introduceAlbum();
		
		// 자식클래스에서 기능을 하나 더 추가했지만 사용할 수가 없다.
		// 자식클래스에서 정의한 메소드를 볼수가 없다. (콘솔 실행해보면 알 수 있음)
		
		// 다형성을 이용해서 사용하지만 실제로는 부모것만 사용할 수 있음.
		
		// 부모타입을 다시 자식타입으로 변경을 해서 원래 자식에서 만들었던 활동지역기능을 사용해보기
		blackPink blackPink2 = (blackPink)blackPink;
		blackPink2.infoActivityArea();
		
		// 다형성을 굳이 사용하는이유? >> 재정의를 할때, 유연한 작업을 위함.
		// 상속에서 모든 클래스들의 최고 부모클래스는 Object 인데,
		// 암묵적으로 다 상속을 받고있음.
		// 부모-자식간 타입 변환을 용이하게 해서 유지보수가 편해진다.
		
		scanner.close();
		
	}

}
