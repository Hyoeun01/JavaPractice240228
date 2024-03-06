package ex_240306;

import ex_240228.Test1;

public class Ex_07_interface_main_3 {

	public static void main(String[] args) {
		
		String groupName = "아이돌1";
		String[] groupMember = {"멤버1","멤버2"};
		String[] groupAlbum = {"봄","여름","가을","겨울"};
		
		Ex_07_interface_subclass_3 idol1 = new Ex_07_interface_subclass_3(groupName, groupMember, groupAlbum);
		idol1.introduceMembers();
		idol1.introduceAlbum();
		idol1.introduceActivityArea();
		idol1.song();
		idol1.doSign();
		idol1.dance();
		
	}

}
