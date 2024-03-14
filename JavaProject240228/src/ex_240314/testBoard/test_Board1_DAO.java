package ex_240314.testBoard;

import java.sql.*;

public class test_Board1_DAO {

	private final static String DRIVER = "oracle.jdbc.driver.OracleDriver";
	private final static String URL = "jdbc:oracle:thin:@localhost:1521:XE";
	private final static String USER_ID = "system";
	private final static String USER_PW = "oracle";
	
	static Connection con = null;
	static PreparedStatement pstmt = null;
	static ResultSet rs = null;
	
	
	public static void select() throws ClassNotFoundException, SQLException {
		try {
			Class.forName(DRIVER);
			con = DriverManager.getConnection(URL, USER_ID, USER_PW);
			
			String query = "SELECT id,name,content,datetime FROM test_board";
			
			pstmt = con.prepareStatement(query);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				String user_id = rs.getString("id");
				String user_name = rs.getString("name");
				String content = rs.getString("content");
				String datetime = rs.getString("datetime");
				System.out.println("id: "+user_id+", name : "+user_name+
						", content: "+content+", datetime: "+datetime);
			}
			
		}	catch (SQLException e) {		
				e.printStackTrace();
			} finally { rs.close(); pstmt.close(); con.close();}	
	}
	
	public static void insert(String id, String name, String content, String datetime) throws SQLException  {
		try {
			Class.forName(DRIVER);
			con = DriverManager.getConnection(URL, USER_ID, USER_PW);
			
			String query = "INSERT INTO TEST_BOARD (id,name,content,datetime)"+"VALUES(?,?,?,?)";
			
			pstmt = con.prepareStatement(query);
			
			pstmt.setString(1, id);
			pstmt.setString(2, name);
			pstmt.setString(3, content);
			pstmt.setString(4, datetime);
			
			int resultNum = pstmt.executeUpdate();
			System.out.println("레코드가 " + resultNum + "개 저장되었습니다.");

			
		} catch (Exception e) {
			e.printStackTrace();
		} finally { pstmt.close(); con.close(); }	}
	
	public static void delete(String id) throws SQLException  {
		try {
			Class.forName(DRIVER);
			con = DriverManager.getConnection(URL, USER_ID, USER_PW);
			
			String query = "DELETE FROM TEST_BOARD WHERE ID = ?";
			
			pstmt = con.prepareStatement(query);
			
			pstmt.setString(1, id);

			
			int resultNum = pstmt.executeUpdate();
			System.out.println("레코드가 " + resultNum + "개 삭제되었습니다.");			
		} catch (Exception e) {
			e.printStackTrace();
		} finally { pstmt.close(); con.close(); }	}
	
	public static void update(String name, String content, String datetime, String id) throws SQLException  {
		try {
			Class.forName(DRIVER);
			con = DriverManager.getConnection(URL, USER_ID, USER_PW);
			
			String query = "UPDATE TEST_BOARD SET NAME = ?, CONTENT = ? , DATETIME = ? WHERE ID = ?";
			
			pstmt = con.prepareStatement(query);
			
			pstmt.setString(1, name);
			pstmt.setString(2, content);
			pstmt.setString(3, datetime);
			pstmt.setString(4, id);

			
			int resultNum = pstmt.executeUpdate();
			System.out.println("레코드가 " + resultNum + "개 수정되었습니다.");			
		} catch (Exception e) {
			e.printStackTrace();
		} finally { pstmt.close(); con.close(); }	}
	
	
	
	
}
