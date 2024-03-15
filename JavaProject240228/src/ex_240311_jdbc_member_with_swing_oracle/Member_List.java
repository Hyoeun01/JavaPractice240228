package ex_240311_jdbc_member_with_swing_oracle;

import java.awt.BorderLayout;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
 
 
public class Member_List extends JFrame implements MouseListener,ActionListener{
   
	// 동기화를 지원해주는 컬렉션의 리스트
    Vector v;  
    Vector cols;
    // 테이블 기능을 지원하는 인스턴스
    DefaultTableModel model;
    // 표형식
    JTable jTable;
    // 스크롤
    JScrollPane pane;
    // 패널 - 창에 추가로 붙이는 공간
    JPanel pbtn;
    // 버튼
    JButton btnInsert;
       
   // 생성자
    public Member_List(){
    	// JFrame의 제목을 설정하는 생성자
        super("회원관리 프로그램  v0.1.1");
        //v=getMemberList();
        //MemberDAO
        // 데이터 베이스에 접근 및 기본 crud기능 있음
        MemberDAO dao = new MemberDAO();
        // db내용 조회한 결과 받아두기
        v = dao.getMemberList();
        
        System.out.println("v="+v);
        // 각 열의 정보 의미
        cols = getColumn();
       
        //public DefaultTableModel()
        //public DefaultTableModel(int rowCount, int columnCount)
        //public DefaultTableModel(Vector columnNames, int rowCount)
        //public DefaultTableModel(Object[] columnNames, int rowCount)
        //public DefaultTableModel(Vector data,Vector columnNames)
        //public DefaultTableModel(Object[][] data,Object[] columnNames)
       
        model = new DefaultTableModel(v, cols);
       
        //JTable()
        //JTable(int numRows, int numColumns)
        //JTable(Object[][] rowData, Object[] columnNames)
        //JTable(TableModel dm)
        //JTable(TableModel dm, TableColumnModel cm)
        //JTable(TableModel dm, TableColumnModel cm, ListSelectionModel sm)
        //JTable(Vector rowData, Vector columnNames)
       
        //jTable = new JTable(v,cols);
        // 자바에서 지원해주는 표 형식
        jTable = new JTable(model);
        // 스크롤기능 추가
        pane = new JScrollPane(jTable);
        add(pane);
       
        pbtn = new JPanel();
        btnInsert = new JButton("회원가입");
        pbtn.add(btnInsert);
        add(pbtn,BorderLayout.NORTH);
       
       
        jTable.addMouseListener(this); //리스너 등록
        btnInsert.addActionListener(this); //회원가입버튼 리스너 등록
       
        setSize(600,200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//end 생성자
   
   
    //JTable의 컬럼
    public Vector getColumn(){
        Vector col = new Vector();
        col.add("아이디");
        col.add("비밀번호");
        col.add("이름");
        col.add("전화");
        col.add("주소");
        col.add("생일");
        col.add("직업");
        col.add("성별");
        col.add("이메일");
        col.add("자기소개");
       
        return col;
    }//getColumn
   
   
    //Jtable 내용 갱신 메서드
    public void jTableRefresh(){
       
        MemberDAO dao = new MemberDAO();
        DefaultTableModel model= new DefaultTableModel(dao.getMemberList(), getColumn());
        jTable.setModel(model);    
       
    }
   
    public static void main(String[] args) {
        new Member_List();
    }//main
    @Override
    public void mouseClicked(MouseEvent e) {
        // mouseClicked 만 사용
        int r = jTable.getSelectedRow();
        String id = (String) jTable.getValueAt(r, 0);
        //System.out.println("id="+id);
        MemberProc mem = new MemberProc(id,this); //아이디를 인자로 수정창 생성
               
    }
    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
       
    }
    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
       
    }
    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
       
    }
    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
       
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        //버튼을 클릭하면
        if(e.getSource() == btnInsert ){
            new MemberProc(this);
           
            /*테스트*/
            //dao = new MemberDAO();           
            //dao.userSelectAll(model);
            //model.fireTableDataChanged();
            //jTable.updateUI();           
            //jTable.requestFocusInWindow();
           
        }
       
    }
   
}
