package ex_240306;

import javax.management.remote.SubjectDelegationPermission;

import ex_240304.Idol;

public class Ex_01_class_boygroup_inheritance1 extends Idol{
	
	// 상속 기본 문법 자식클래스 extends 부모클래스
	// 부모클래스를 초기화 하고 사용해야한다.
		
	public Ex_01_class_boygroup_inheritance1(String groupName, String[] groupMembers, String[] groupAlbum) {
		super(groupName, groupMembers, groupAlbum);
		
	}
	
	

} 
