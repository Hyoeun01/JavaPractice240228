package ex_240321_miniProject.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import ex_240321_miniProject.shaved_ice.*;

public class Shaved_ice_DAO {

	private String driver = "oracle.jdbc.driver.OracleDriver" ;
	private String url = "jdbc:oracle:thin:@localhost:1521:xe" ;
	private String username = "system" ;
	private String password = "oracle" ;
	private Connection conn = null ;
	
	
	public Shaved_ice_DAO() {
		try {
			Class.forName(driver) ;			
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 발견되지 않습니다(jar 파일 누락)"); 
			e.printStackTrace();		
		}
	}

	private Connection getConnection() {
		try {
			conn = DriverManager.getConnection(url, username, password) ;
		} catch (SQLException e) {
			System.out.println("커넥션 생성 오류");
			e.printStackTrace();
		}
		return conn ;
	}


	private void closeConnection() {
		try {
			if(conn != null) {conn.close(); }
		} catch (Exception e2) {
			e2.printStackTrace(); 
		}		
	}

	public int shaved_iceAdd(Shaved_ice ice){//서버에 판매정보 저장
		int result =-1;
		
		PreparedStatement pstmt =null;
		ResultSet rs = null;
		String sql = "insert into shaved_ice(shaved_icename,shaved_icesize,cmilk,rbean,price,takeout)values(?,?,?,?,?,?)";
	
		try {
								
			conn = getConnection();
			pstmt= conn.prepareStatement(sql);
			pstmt.setString(1, ice.getName());
			pstmt.setString(2, ice.getSize());
			pstmt.setString(3, ice.getCmilk());
			pstmt.setString(4, ice.getRbean());
			pstmt.setInt(5, ice.getPrice());
			pstmt.setString(6, ice.getTakeout());
			
			result = pstmt.executeUpdate();
			conn.setAutoCommit(false);
			conn.commit();	
		} catch (SQLException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
			try {
				conn.rollback(); 
			} catch (Exception e2) {
				e2.printStackTrace();  
			}
		}finally{
			try {
				if(rs != null) {rs.close(); }
				if(pstmt != null) {pstmt.close(); }
				closeConnection() ;
			} catch (Exception e2) {
				e2.printStackTrace(); 
			}
		}
		
		return result;
	}//shaved_icdAdd
	
	
	public int stockorder(Stock stock){// 이건재고 데이터 업데이트
		int result =0;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "update stock set milk=?, cmilk=?, rbean=?, bean=?, berry=?, mango=?, green=?, choco=?" ;
		
		try {
			conn = getConnection() ;
			conn.setAutoCommit(false);

			pstmt = conn.prepareStatement(sql); 
						
			pstmt.setInt(1, stock.getMilk());
			pstmt.setInt(2, stock.getCmilk());
			pstmt.setInt(3, stock.getRbean());
			pstmt.setInt(4, stock.getBean());
			pstmt.setInt(5, stock.getBerry());
			pstmt.setInt(6, stock.getMango());
			pstmt.setInt(7, stock.getGreen());
			pstmt.setInt(8, stock.getChoco());
								
			result = pstmt.executeUpdate() ;
			conn.commit();
									
		}catch (SQLException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
			try {
				conn.rollback(); 
			} catch (Exception e2) {
				e2.printStackTrace();  
			}
		}finally{
			try {
				if(rs != null) {rs.close(); }
				if(pstmt != null) {pstmt.close(); }
				closeConnection() ;
			} catch (Exception e2) {
				e2.printStackTrace(); 
			}
		}
		
		
		return result;
	}//coffeestock
	
	
	
	
	
	
	public  Vector<Shaved_ice> Getsellcount(){// 오늘 판매된 음료
		PreparedStatement pstmt = null ;
		ResultSet rs = null ;
		String sql = "select shaved_icename , count(*)  from shaved_ice group by shaved_icename  order by count(*) desc" ;
		Vector<Shaved_ice> lists = new Vector<Shaved_ice>();
		try {
			conn = getConnection() ;
			pstmt = conn.prepareStatement(sql) ; 
			
			rs = pstmt.executeQuery() ;
			
			while(rs.next()){
				Shaved_ice shaved_ice = new Shaved_ice() ;
				shaved_ice.setName(rs.getString("coffeename"));
				shaved_ice.setPrice( rs.getInt("count(*)") ); 
				
				lists.add( shaved_ice ) ;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}finally{
			try {
				if(rs != null) {rs.close(); }
				if(pstmt != null) {pstmt.close(); }
				closeConnection() ;
			} catch (Exception e2) {
				e2.printStackTrace(); 
			}
		}
		return lists;
	}//Getsellcount
	
	
	public Stock getstock(){//서버에서 재고데이터 가져오기
		PreparedStatement pstmt = null ;
		ResultSet rs = null ;
		String sql = "select * from stock" ;		
		Stock stock=null;
		try {
			conn = getConnection() ;
			pstmt = conn.prepareStatement(sql) ; 
			
			rs = pstmt.executeQuery() ;
			
			while(rs.next()){
				stock = new Stock() ;
				
				stock.setMilk(rs.getInt("milk"));
				stock.setCmilk(rs.getInt("cmilk"));
				stock.setRbean(rs.getInt("rbean"));
				stock.setBean(rs.getInt("bean"));
				stock.setBerry(rs.getInt("berry"));
				stock.setMango(rs.getInt("mango"));
				stock.setGreen(rs.getInt("green"));
				stock.setChoco(rs.getInt("choco"));
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}finally{
			try {
				if(rs != null) {rs.close(); }
				if(pstmt != null) {pstmt.close(); }
				closeConnection() ;
			} catch (Exception e2) {
				e2.printStackTrace(); 
			}
		}
		return stock ;
	}//getstock
	
	
	/*
	public void stockorder(){ //재고주문
		
		
		
	}//stockorder
	
	*/
	public Vector<Shaved_ice> GetAllSellList() {//db에서 데이터를 받아서 벡터로 반환하는 메소드
		//모든 상품 목록들을 리턴한다.
		PreparedStatement pstmt = null ;
		ResultSet rs = null ;
		String sql = "select * from coffee" ;
		Vector<Shaved_ice> lists = new Vector<Shaved_ice>();
		try {
			conn = getConnection() ;
			pstmt = conn.prepareStatement(sql) ; 
			
			rs = pstmt.executeQuery() ;
			
			while(rs.next()){
				Shaved_ice shaved_ice = new Shaved_ice() ;
				shaved_ice.setName(rs.getString("shaved_icename"));
				shaved_ice.setSize(rs.getString("shaved_icesize"));
				shaved_ice.setCmilk(rs.getString("cmilk"));
				shaved_ice.setRbean(rs.getString("rbean"));
				shaved_ice.setPrice(rs.getInt("price"));
				shaved_ice.setTakeout(rs.getString("takeout"));
				
				lists.add( shaved_ice ) ;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}finally{
			try {
				if(rs != null) {rs.close(); }
				if(pstmt != null) {pstmt.close(); }
				closeConnection() ;
			} catch (Exception e2) {
				e2.printStackTrace(); 
			}
		}
		return lists ;
	}//GetAllSellList
		
	
	
	public Object[][] makeArr(Vector<Shaved_ice> lists){//벡터를 받아서 전체를 2차원 배열로 만들어주는 메소드
		
		Object [][] shaved_icearr = new Object [lists.size()][6]; 
								
			for(int i=0; i<lists.size();i++){
			
				shaved_icearr[i][0]=lists.get(i).getName();
				shaved_icearr[i][1]=lists.get(i).getSize();
				shaved_icearr[i][2]=lists.get(i).getCmilk();
				shaved_icearr[i][3]=lists.get(i).getRbean();
				shaved_icearr[i][4]=lists.get(i).getPrice();
				shaved_icearr[i][5]=lists.get(i).getTakeout();
			
			}	
		
		return shaved_icearr;
		
	}//makeArr
	
	
	
	public Object[][] makelistArr(Vector<Shaved_ice> lists){//벡터를 받아서 판대량을 2차원 배열로 만들어주는 메소드
		
		Object [][] shaved_icearr = new Object [lists.size()][2]; 
				
				
			for(int i=0; i<lists.size();i++){
				shaved_icearr[i][0]=lists.get(i).getName();
				shaved_icearr[i][1]=lists.get(i).getPrice();
			}	
		
			
		return shaved_icearr;
		
	}//makeArr

	
	public Object[][] makestocklistArr(Stock lists){//스탁을 받아서 오브젝트로 만들어줌
		
		Object [][] shaved_icearr = new Object [1][8]; 
				
		shaved_icearr[0][0]=lists.getMilk();
		shaved_icearr[0][1]=lists.getCmilk();
		shaved_icearr[0][2]=lists.getRbean();
		shaved_icearr[0][3]=lists.getBean();
		shaved_icearr[0][4]=lists.getBerry();
		shaved_icearr[0][5]=lists.getMango();
		shaved_icearr[0][6]=lists.getGreen();
		shaved_icearr[0][7]=lists.getChoco();
			
		return shaved_icearr;
		
	}//makestocklistArr
	
	
	
	
}