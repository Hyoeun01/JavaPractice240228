package ex_240321_miniProject.defaultPackage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JRadioButton;

import ex_240318_miniProject.bean.Coffee;
import ex_240318_miniProject.dao.coffeedao;
import ex_240318_miniProject.default_package.InventoryUI;
import ex_240318_miniProject.default_package.SellListUI;
import ex_240321_miniProject.dao.Shaved_ice_DAO;
import ex_240321_miniProject.shaved_ice.Shaved_ice;
import ex_240321_miniProject.shaved_ice.Stock;
import oracle.net.aso.f;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.Vector;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.ButtonGroup;

public class MainUI {
	Vector<Shaved_ice> list =new Vector<Shaved_ice>();
	Shaved_ice shaved_ice = null; 
	Stock stock =null;
	Shaved_ice_DAO dao = null;
	JLabel lblNewLabel_1;
	String menu="";
	int count=0;
	boolean flag_size=false;//한번이라도 클릭하면 true
	boolean flag_inout=false;
	boolean flag_cmilk=false;
	boolean flag_rbean=false;
	private JFrame frame = new JFrame();

	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();
	private final ButtonGroup buttonGroup_3 = new ButtonGroup();
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainUI window = new MainUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}
	public MainUI() {
		initialize();	
	}
	
	public void initialize() {
		shaved_ice = new Shaved_ice();
		dao = new Shaved_ice_DAO();
		stock = new Stock();
		stock = dao.getstock();	//서버에서 재고 데이터 넣어주기	
		System.out.println(stock); // 재고 데이터 확인

		frame = new JFrame();
	
		frame.setTitle("빙수 POS 프로그램");
		
		frame.setBounds(100, 100, 800, 750);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(153,204,204));
		panel.setBounds(0, 0, 784, 400);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("팥빙수");
		btnNewButton .setBackground(new Color(173,209,188));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				count++;
				if(count > 1){
					stock.setRbean(stock.getRbean()+1);
					stock.setMilk(stock.getMilk()+1);
					stock.setCmilk(stock.getCmilk()+1);
				}
				stock.setRbean(stock.getRbean()-1);
				stock.setMilk(stock.getMilk()-1);
				stock.setCmilk(stock.getCmilk()-1);
				showlabel("팥빙수",8000);
				
			}
		});
		btnNewButton.setBounds(50, 70, 150, 90);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("인절미빙수");
		btnNewButton_1 .setBackground(new Color(196,222,207));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				if(count > 1){
					stock.setBean(stock.getBean()+1);
					stock.setRbean(stock.getRbean()+1);
					stock.setMilk(stock.getMilk()+1);
					
				}
				
				stock.setBean(stock.getBean()-1);
				stock.setRbean(stock.getRbean()-1);
				stock.setMilk(stock.getMilk()-1);
				showlabel("인절미빙수",8000);
			}
		});
		btnNewButton_1.setBounds(300, 70, 150, 90);
		
	
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("딸기빙수");
		btnNewButton_2 .setBackground(new Color(173,209,188));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				if(count > 1){
					stock.setBerry(stock.getBerry()+1);
					stock.setMilk(stock.getMilk()+1);
					stock.setCmilk(stock.getCmilk()+1);
				}
				stock.setBerry(stock.getBerry()-1);
				stock.setMilk(stock.getMilk()-1);
				stock.setCmilk(stock.getCmilk()-1);
				showlabel("딸기빙수",8500);
			}
		});
		btnNewButton_2.setBounds(550, 70, 150, 90);
		panel.add(btnNewButton_2);
		
		JButton button = new JButton("망고빙수");
		button  .setBackground(new Color(176,196,222));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				if(count > 1){
					stock.setMango(stock.getMango()+1);
					stock.setMilk(stock.getMilk()+1);
					stock.setCmilk(stock.getCmilk()+1);
				}
				stock.setMango(stock.getMango()-1);
				stock.setMilk(stock.getMilk()-1);
				stock.setCmilk(stock.getCmilk()-1);
				showlabel("망고빙수",8500);
			}
		});
		button.setBounds(50, 200, 150, 90);
		panel.add(button);
		
		JButton button_1 = new JButton("녹차빙수");
		button_1 .setBackground(new Color(187,204,226));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				if(count > 1){
					stock.setGreen(stock.getGreen()+1);
					stock.setMilk(stock.getMilk()+1);
					stock.setCmilk(stock.getCmilk()+1);
					stock.setRbean(stock.getRbean()+1);
				}
				stock.setGreen(stock.getGreen()-1);
				stock.setMilk(stock.getMilk()-1);
				stock.setCmilk(stock.getCmilk()-1);
				stock.setRbean(stock.getRbean()-1);
				showlabel("녹차빙수",8500);
			}
		});
		button_1.setBounds(300, 200, 150, 90);
		panel.add(button_1);
		
		JButton button_2 = new JButton("초코빙수");
		button_2  .setBackground(new Color(176,196,222));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				if(count > 1){
					stock.setChoco(stock.getChoco()+1);
					stock.setMilk(stock.getMilk()+1);
					stock.setCmilk(stock.getCmilk()+1);
					stock.setRbean(stock.getRbean()+1);
				}
				stock.setChoco(stock.getChoco()-1);
				stock.setMilk(stock.getMilk()-1);
				stock.setCmilk(stock.getCmilk()-1);
				stock.setRbean(stock.getRbean()-1);
				showlabel("초코빙수",8500);
			}
		});
		button_2.setBounds(550, 200, 150, 90);
		panel.add(button_2);
		// 버튼
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(219,236,233));
		panel_1.setBounds(0, 396, 784, 115);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("  연유추가");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				clickCmilk(shaved_ice.getCmilk(),"연유추가",flag_cmilk);
				shaved_ice.setCmilk("연유");
				showlabel(shaved_ice.getName(),shaved_ice.getPrice());
				flag_cmilk = true;
				
			}
		});
		rdbtnNewRadioButton.setBounds(145, 32, 100, 26);
		panel_1.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNoCmilk = new JRadioButton("  연유추가X");
		buttonGroup.add(rdbtnNoCmilk);
		rdbtnNoCmilk.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				clickCmilk(shaved_ice.getCmilk(),"연유추가X",flag_cmilk);
				shaved_ice.setCmilk("연유추가X");
				showlabel(shaved_ice.getName(),shaved_ice.getPrice());
				flag_cmilk = true;
			}
		});
		rdbtnNoCmilk.setBounds(250, 32, 100, 26);
		panel_1.add(rdbtnNoCmilk);
		
		JRadioButton rdbtnRbean = new JRadioButton("  팥추가");
		buttonGroup_1.add(rdbtnRbean);
		rdbtnRbean.addActionListener(new ActionListener() {
				
			public void actionPerformed(ActionEvent e) {
									
				clickRbean(shaved_ice.getRbean(),"팥추가",flag_rbean);
				shaved_ice.setRbean("팥추가");
				showlabel(shaved_ice.getName(),shaved_ice.getPrice());
				flag_rbean=true;
				
			}
		});
		rdbtnRbean.setBounds(470, 32, 100, 26);
		panel_1.add(rdbtnRbean);
		
		JRadioButton rdbtnNoRbean = new JRadioButton("  팥추가X");
		buttonGroup_1.add(rdbtnNoRbean);
		rdbtnNoRbean.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
			clickRbean(shaved_ice.getRbean(),"팥추가X",flag_rbean);
			shaved_ice.setRbean("팥추가X");
			showlabel(shaved_ice.getName(),shaved_ice.getPrice());
			flag_rbean=true;
			
				
			}
		});
		rdbtnNoRbean.setBounds(575, 32, 100, 26);
		panel_1.add(rdbtnNoRbean);
		
	
		JRadioButton rdbtnNormal = new JRadioButton("  보통");
		buttonGroup_2.add(rdbtnNormal);
		rdbtnNormal.addActionListener(new ActionListener() {
				
			public void actionPerformed(ActionEvent e) {
									
				clicksize(shaved_ice.getSize(),"보통",flag_size);
				shaved_ice.setSize("보통");
				showlabel(shaved_ice.getName(),shaved_ice.getPrice());
				flag_size=true;
				
			}
		});
		
		rdbtnNormal.setBounds(145, 73, 100, 26);
		panel_1.add(rdbtnNormal);
		
		JRadioButton rdbtnBig = new JRadioButton("  많이");
		buttonGroup_2.add(rdbtnBig);
		rdbtnBig.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
					
			clicksize(shaved_ice.getSize(),"많이",flag_size);
			shaved_ice.setSize("많이");
			showlabel(shaved_ice.getName(),shaved_ice.getPrice());
			flag_size=true;
				
			}
		});
		
		rdbtnBig.setBounds(250, 73, 100, 26);
		panel_1.add(rdbtnBig);
		
		
		JRadioButton rdbtnHall = new JRadioButton("  매장");
		buttonGroup_3.add(rdbtnHall);
		rdbtnHall.addActionListener(new ActionListener() {
				
			public void actionPerformed(ActionEvent e) {
									
				clickInOut(shaved_ice.getTakeout(),"매장",flag_inout);
				shaved_ice.setTakeout("매장");
				showlabel(shaved_ice.getName(),shaved_ice.getPrice());
				flag_inout=true;
				
			}
		});
		rdbtnHall.setBounds(470, 73, 100, 26);
		panel_1.add(rdbtnHall);
		
		JRadioButton rdbtnTakeout = new JRadioButton("  포장");
		buttonGroup_3.add(rdbtnTakeout);
		rdbtnTakeout.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
			clickInOut(shaved_ice.getTakeout(),"포장",flag_inout);
			shaved_ice.setTakeout("포장");
			showlabel(shaved_ice.getName(),shaved_ice.getPrice());
			flag_inout=true;
			
				
			}
		});
		rdbtnTakeout.setBounds(575, 73, 100, 26);
		panel_1.add(rdbtnTakeout);
		
		
		
		JLabel lblNewLabel = new JLabel("연유추가");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 15));
		lblNewLabel.setBounds(59, 35, 99, 18);
		panel_1.add(lblNewLabel);
		
		JLabel label = new JLabel("팥추가");
		label.setFont(new Font("Dialog", Font.BOLD, 15));
		label.setBounds(373, 35, 99, 18);
		panel_1.add(label);
		
		JLabel label_1 = new JLabel("사이즈");
		label_1.setFont(new Font("Dialog", Font.BOLD, 15));
		label_1.setBounds(59, 76, 99, 18);
		panel_1.add(label_1);
		
		JLabel label_2 = new JLabel("포장");
		label_2.setFont(new Font("Dialog", Font.BOLD, 15));
		label_2.setBounds(373, 76, 99, 18);
		panel_1.add(label_2);
		
		

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(153,204,204));
		panel_2.setBounds(0, 512, 784, 217);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		lblNewLabel_1 = new JLabel();
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_1.setText("빙수");
		
		lblNewLabel_1.setBounds(81, 40, 618, 26);
		panel_2.add(lblNewLabel_1);
		//스트링에 문자열을 넣고 액션이 나올마다 스트링에 값을 넣어주고 마지막으로 값을 넣어준다.
		lblNewLabel_1.setText(menu);
	
		JButton btnNewButton_3 = new JButton("결제");//결제 누르면 서버로 입력
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count=0;
				
				if(checkOrder() == 0){
					checkOrder();
										
					dao.shaved_iceAdd(shaved_ice);//판매정보 데이터에 저장
					System.out.println(shaved_ice);
					//재고줄어들게
					dao.stockorder(stock);//재고 서버에 저장
					System.out.println(stock);
					buttonGroup.clearSelection();
					buttonGroup_1.clearSelection();
					buttonGroup_2.clearSelection();
					buttonGroup_3.clearSelection();
					
					lblNewLabel_1.setText("");
					JOptionPane.showMessageDialog(null, "결제 되었습니다");
					//재고가 자동관리 메소드
					shaved_ice.setName(null);
					shaved_ice.setSize(null);
					shaved_ice.setCmilk(null);
					shaved_ice.setRbean(null);
					shaved_ice.setPrice(0);
					shaved_ice.setTakeout(null);
					flag_size=false;
					flag_cmilk=false;
					flag_rbean=false;
					flag_inout=false;
				}else{
					buttonGroup.clearSelection();
					buttonGroup_1.clearSelection();
					buttonGroup_2.clearSelection();
					buttonGroup_3.clearSelection();
					
					lblNewLabel_1.setText("");
					shaved_ice.setName(null);
					shaved_ice.setSize(null);
					shaved_ice.setCmilk(null);
					shaved_ice.setRbean(null);
					shaved_ice.setPrice(0);
					shaved_ice.setTakeout(null);
					JOptionPane.showMessageDialog(null, "재료가 떨어졌습니다.재료를 주문하세요.");
					flag_size=false;
					flag_cmilk=false;
					flag_rbean=false;
					flag_inout=false;
				}
			
			}
		});
		btnNewButton_3.setBounds(598, 121, 123, 38);
		panel_2.add(btnNewButton_3);
		
		JButton button_4 = new JButton("선택취소");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count=0;
				flag_size=false;
				flag_cmilk=false;
				flag_rbean=false;
				flag_inout=false;
				shaved_ice.setName(null);
				shaved_ice.setSize(null);
				shaved_ice.setCmilk(null);
				shaved_ice.setRbean(null);
				shaved_ice.setPrice(0);
				shaved_ice.setTakeout(null);
				lblNewLabel_1.setText("");
				// 버튼 초기화
				buttonGroup.clearSelection();
				buttonGroup_1.clearSelection();
				buttonGroup_2.clearSelection(); 
				buttonGroup_3.clearSelection();
				
				System.out.println(shaved_ice);
				JOptionPane.showMessageDialog(null, "선택취소되었습니다.");
				
			}
		});
		button_4.setBounds(431, 121, 123, 38);
		panel_2.add(button_4);
		

		JButton button_5 = new JButton("판매보기");//판매확인
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new SellListUI();
				System.out.println(dao.GetAllSellList());								
				
			}
		});
		button_5.setBounds(57, 121, 123, 38);
		panel_2.add(button_5);
		
		JButton btnNewButton_6 = new JButton("재고관리");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new InventoryUI();
				
			}
		});
		btnNewButton_6.setBounds(192, 121, 123, 38);
		panel_2.add(btnNewButton_6);
		
	}
	
public void showlabel(String name, int price){//판매 데이터 입력
		
		shaved_ice.setName(name);
		shaved_ice.setPrice(price);
				
		if(shaved_ice.getName() != null && shaved_ice.getPrice() != 0 ){
			menu = shaved_ice.getName()+ " / " + shaved_ice.getPrice();
			
			
			if(shaved_ice.getCmilk() != null){
				menu = menu+ " / " +shaved_ice.getCmilk();
			}
			
			if(shaved_ice.getRbean() != null){
				menu = menu+ " / " +shaved_ice.getRbean();
			}
			
			if(shaved_ice.getSize() != null){
				menu = menu+ " / " +shaved_ice.getSize();
			}
			
			if(shaved_ice.getTakeout() != null){
				menu = menu+ " / " +shaved_ice.getTakeout();
			}
			
		}		
		lblNewLabel_1.setText(menu);
		
		
		
	}//showlabel

public int checkOrder(){
	int result=0;
	if(	stock.getMilk() == -1 || 
		stock.getCmilk() == -1 || 
		stock.getRbean() == -1 ||
		stock.getBean() == -1 ||
		stock.getBerry() == -1 ||
		stock.getMango() == -1 ||
		stock.getGreen() == -1 ||
		stock.getChoco() == -1
	){
		result=-1;	
	}	
		return result;
}//checkOrder

public void clicksize(String befor_size,String size,boolean flag_size){// 사이즈관련된 클릭정보관리 메소드
	
	if(flag_size){
		//두번째 이상
		switch (size) {
		
		case "보통":
			switch (befor_size) {
			case "보통":
				
				break;
			case "많이":
				shaved_ice.setPrice(shaved_ice.getPrice()-2000);
				break;
			
			default:
				break;
			}				
			break;
			
		case "많이":
			switch (befor_size) {
			case "보통":
				shaved_ice.setPrice(shaved_ice.getPrice()+2000);
				break;
			case "많이":
				
				break;
			
			default:
				break;
			}
			break;
			
		default:
			break;
		}
		
	}else{
		//처음누를
		switch (size) {
		
		case "보통":
			
			break;
		case "많이":
			shaved_ice.setPrice(shaved_ice.getPrice()+2000);
			break;
		
		default:
			break;
		}
		
	}
	
}//clicksize

public void clickRbean(String befor_rbean,String rbean,boolean flag_rbean){//팥추가 관리
	if(flag_rbean){
		//두번이상
		switch (rbean) {
		case "팥추가":
			switch (befor_rbean) {
			case "팥추가":
				
				break;
			case "팥추가X":
				shaved_ice.setPrice(shaved_ice.getPrice()+500);
				break;		
			default:
				break;
			}
			break;
			
		case "팥추가X":
			switch (befor_rbean) {
			case "팥추가":
				shaved_ice.setPrice(shaved_ice.getPrice()-500);
				break;
			case "팥추가X":
				break;		
			default:
				break;
			}
			break;		
		default:
			break;
		}
	}else {
		//한번누를때
		switch (rbean) {
		case "팥추가":
			shaved_ice.setPrice(shaved_ice.getPrice()+500);
			break;
		case "팥추가X":
			break;		
		default:
			break;
		}
	}	
}//clickRbean

public void clickCmilk(String befor_cmilk,String cmilk,boolean flag_cmilk){//연유추가 관리
	if(flag_cmilk){
		//두번이상
		switch (cmilk) {
		case "연유추가":
			switch (befor_cmilk) {
			case "연유추가":
				
				break;
			case "연유추가X":
				shaved_ice.setPrice(shaved_ice.getPrice()+500);
				break;		
			default:
				break;
			}
			break;
			
		case "연유추가X":
			switch (befor_cmilk) {
			case "연유추가":
				shaved_ice.setPrice(shaved_ice.getPrice()-500);
				break;
			case "연유추가X":
				break;		
			default:
				break;
			}
			break;		
		default:
			break;
		}
	}else {
		//한번누를때
		switch (cmilk) {
		case "연유추가":
			shaved_ice.setPrice(shaved_ice.getPrice()+500);
			break;
		case "연유추가X":
			break;		
		default:
			break;
		}
	}	
}//clickCmilk

public void clickInOut(String befor_InOut,String inOut,boolean flag_inout){// 포장관련된 클릭정보관리 메소드
	
	if(flag_inout){
		//두번째 이상
		switch (inOut) {
		
		case "매장":
			switch (befor_InOut) {
			case "매장":
				
				break;
			case "포장":
				shaved_ice.setPrice(shaved_ice.getPrice()+1000);
				break;
			
			default:
				break;
			}				
			break;
			
		case "포장":
			switch (befor_InOut) {
			case "매장":
				shaved_ice.setPrice(shaved_ice.getPrice()-1000);
				break;
			case "포장":
				
				break;
			
			default:
				break;
			}
			break;
			
		}
		
	}else{
		//처음누를
		switch (inOut) {
		
		case "매장":
			
			break;
		case "포장":
			shaved_ice.setPrice(shaved_ice.getPrice()-1000);
			break;
		default:
			break;
		}
		
	}
	
}//clickInOut

}
