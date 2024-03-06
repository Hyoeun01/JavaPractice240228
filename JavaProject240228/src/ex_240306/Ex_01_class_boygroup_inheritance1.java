package ex_240306;

import ex_240304.Idol;

public class Ex_01_class_boygroup_inheritance1 extends Idol{
	
	// 상속 기본 문법 자식클래스 extends 부모클래스
	// 부모클래스를 초기화 하고 사용해야한다.
		
	public Ex_01_class_boygroup_inheritance1(String groupName, String[] groupMembers, String[] groupAlbum) {
		super(groupName, groupMembers, groupAlbum);
		
	}
	
	//오버라이딩 테스트

		public void introduceAlbum() {
			for(String albumString : this.groupAlbum) {
				System.out.println(this.groupName+"의 오버라이딩한 앨범은 "+albumString+"입니다");
			}
			
			System.out.println("부모 클래스의 멤버 접근 super.groupname: "+ super.groupName);
			System.out.println("자식클래스에서 부모클래스의 메서드를 정적(수동)으로 호출 :");
			super.introduceAlbum();
		}
	
		
	

} 
