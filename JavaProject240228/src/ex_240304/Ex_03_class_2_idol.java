package ex_240304;

import java.util.Scanner;

public class Ex_03_class_2_idol {

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
		
		//new idol(이름, 멤버, 앨범)
		Idol idol = new Idol(groupNameString, groupMembers, groupAlbums);
		idol.introduceMembers();
		idol.introduceAlbum();
		

	}

}
