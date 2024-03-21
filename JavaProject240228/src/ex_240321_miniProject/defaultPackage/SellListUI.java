package ex_240321_miniProject.defaultPackage;

import java.awt.Color;
import java.awt.Container;
import java.awt.Panel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import ex_240321_miniProject.shaved_ice.*;
import ex_240321_miniProject.dao.Shaved_ice_DAO;

import javax.swing.ScrollPaneConstants;

import ex_240318_miniProject.bean.Coffee;
import ex_240318_miniProject.dao.coffeedao;

import javax.swing.JLabel;
import java.awt.Font;

public class SellListUI extends JFrame{
	Container container = getContentPane();
	Panel pal =new Panel();
	 Shaved_ice_DAO dao = null;
	//Vector<String> columnNames = null;
	Vector<Shaved_ice> rowData = null;
	Object columnNames[] = {"이름","사이즈","연유","팥","가격","포장"};
	Object sellNames[] = {"이름","판매개수"};
	JLabel lblNewLabel_1;
	private JTable table;
	private JTable table_1;
	
	
}
