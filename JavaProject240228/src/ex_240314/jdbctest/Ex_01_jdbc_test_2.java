package ex_240314.jdbctest;

import java.sql.*;

import ex_240306.Ex_02_static_1;

public class Ex_01_jdbc_test_2 {
	
	// JDBC 연결을 위한 인스턴스 준비
	// 드라이버, 유저명, 패스워드
	// 반복이 되는 설정코드. >> 처음에만 타이핑하고 그이후로는 복사붙여넣기 하면 됨
	
	// 반복되는 작업입니다
	
	// 만약 db로 mysql을 사용한다면 , 각 제조사가 변경시 마다 바꾸면되고, 아니면 고정
	
	private final static String DRIVER = "oracle.jdbc.driver.OracleDriver";
	private final static String URL = "jdbc:oracle:thin:@localhost:1231:XE";
	private final static String USER_ID = "system";
	private final static String USER_PW = "oracle";
	
	
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		// 인스턴스들도 전부 고정
		// 연결하기 위한 인스턴스
		Connection con = null;
		
		// 쿼리를 전달하기 위한 인스턴스
		PreparedStatement pstmt = null;
		
		// 조회를 한다면 조회한 결과를 담을 테이블 resultset  : 조회시에만 필요하다
		// insert, update, delete 시에는 안쓴다
		ResultSet rs = null;
		
		// select를 조회하기 위한 순서
		// 순서 1 . 고정
		// 드라이버를 메모리에 올려야함(로드) > 입출력이기 때문에
		// 해당 패키지를 읽기 위해서는 반드시 try-catch를 해야한다
		try {
			Class.forName(DRIVER);
			
			// 순서2 . 고정
			// 선언한 connection 타입의 con을 초기화 하기
	
				con = DriverManager.getConnection(URL, USER_ID, USER_PW);
				
				// 순서3 . 값 변경 - select , insert , update, delete
				// 조회연습중 >> 조회하는 sql전달 명령어 준비
				String query  = "SELECT ID, PWD, NAME FROM TEST_JAVA";
				
				// 순서4 
				// 해당 쿼리를 전달하는 pstmt( PreparedStatement ) 초기화하기
				pstmt = con.prepareStatement(query);
				
				// 순서 5
				// DB에서 조회된 결과를 테이블에 담아둔다
				// 테이블 역할을 하는 rs(resultset) 초기화하기
				// 메모리 상에 조회된 데이터가 있음. >> 바로 볼수 없으니 보기 편하게 재가공한다.
				// 재가공 = 콘솔.스윙UI. HTML 
				rs = pstmt.executeQuery();
				
				// 순서 6
				// 반복문으로 데이터를 조회해보기
				// rs.next = 기준이 0행부터 시작해서 다음행인 1행이 있는지 확인 / 없으면 종료
				while(rs.next()) {
					String user_id =  rs.getString("ID");
					String user_pw =  rs.getString("PWD");
					String user_name =  rs.getString("NAME");
					System.out.println("ID:"+user_id+" PW:"+user_pw+" NAME:"+user_name);
					
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				// 순서 7
				// 반납 >> 사용의 역순으로 하면된다.
				// con -> pstmt -> rs
				
				rs.close();
				pstmt.close();
				con.close();
			}
		
		
		

	}

}
