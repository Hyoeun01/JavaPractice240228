package ex_240314.testBoard;

import java.sql.SQLException;

public class test_Board1_main {

	public static void main(String[] args) {
		
		try {
			
			/*
			 * test_Board1_DAO.select();
			 * 
			 * test_Board1_DAO.insert("abc1", "효은1", "내용1", "2024-03-13 17:15");
			 * test_Board1_DAO.insert("abc2", "효은2", "내용2", "2024-03-14 17:15");
			 * test_Board1_DAO.insert("abc3", "효은3", "내용3", "2024-03-15 17:15");
			 * test_Board1_DAO.insert("abc4", "효은4", "내용4", "2024-03-16 17:15");
			 * test_Board1_DAO.insert("abc5", "효은5", "내용5", "2024-03-17 17:15");
			 */
			
			
			/*
			 * test_Board1_DAO.insert("abc6", "효은6", "내용6", "2024-03-18 17:39");
			 * test_Board1_DAO.select();
			 */
			/*
			 * test_Board1_DAO.delete("abc6"); 
			 * test_Board1_DAO.select();
			 */
			test_Board1_DAO.update("효은51", "내용은 이걸로 수정", "2024-03-17 17:40", "abc5");
			test_Board1_DAO.select();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
