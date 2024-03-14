package ex_240314.jdbctest;

public class Ex_01_jdbc_test_1 {

	public static void main(String[] args) {
		// 준비
		// 1) 본인자리에 오라클 디비 서버 설치 유무
		// 2) sql developer 설치 확인
		// 3) 연결할 아이디:system, pw: oracle 
		
		// jdbc 드라이버 > 프로젝트에 적용방법
		// 4) ojdbc8_g.jar 파일을 이클립스 패키지에 복사 (240311_jbct 복사)
		// 5) 자바 프로젝트 우클릭 > build path > 마지막 메뉴 선택
		// 6) 3번째 탭 라이브러리즈 > classpath > add jar 선택
		// 7) 해당 자바프로젝트 > 패키지 > ojdbe8_g.jar 선택해서 저장
		
		
		/*
		 * CREATE TABLE TEST_JAVA( 
		 * id varchar2(20) NOT NULL, --아이디 // 없는게 정상, primary key 에 포함. 
		 * pwd varchar2(30) NOT NULL, --비밀번호 
		 * name varchar2(30) NOT NULL, -- 이름
		 * CONSTRAINT pk_member_java PRIMARY KEY(id) -- 기본키 지정 );
		 * 
		 * SELECT * FROM TEST_JAVA;
		 */
	}

}
