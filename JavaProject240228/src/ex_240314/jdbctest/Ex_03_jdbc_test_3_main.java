package ex_240314.jdbctest;

import java.sql.SQLException;

public class Ex_03_jdbc_test_3_main {

	public static void main(String[] args) {
		try {
			// 분리된 조회기능 호출
			Ex_02_jdbc_test_2_DAO.select();
			
			/*
			 * Ex_02_jdbc_test_2_DAO.insert("she3", "2134", "신효은3");
			 * 
			 * Ex_02_jdbc_test_2_DAO.select();
			 */
			
			/*
			 * Ex_02_jdbc_test_2_DAO.delete("she3"); 
			 * Ex_02_jdbc_test_2_DAO.select();
			 */
			
			Ex_02_jdbc_test_2_DAO.update("1234","효은", "she2");
			
			Ex_02_jdbc_test_2_DAO.select();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
