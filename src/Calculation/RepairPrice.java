package Calculation;
import Pages.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import Pages.DBconnect;
import Pages.Home;
import Pages.ParentGui;
import net.proteanit.sql.DbUtils;

public class RepairPrice  extends ParentGui{ 

	
	public RepairPrice()
	{
		
		
		functionalty();
	}
	public void functionalty()
	{
		
		
		Conn=DBconnect.dbConnector();
		jf=new JFrame("Repair Prices list");
	b1=new JButton("Load all");
	b2=new JButton("Search");
	
	b3=new JButton("Back");
	b4=new JButton("Reset");
	String[] selection={"Product_name","Wages"};
	JComboBox select=new JComboBox(selection);
	tf1=new JTextField();
	 table=new JTable();
		//Object columns[]= {"Product name","Quantity","Unit cost price","Unit sale price"};
		model =(DefaultTableModel)table.getModel();
		//model.setColumnIdentifiers(columns);
		table.setModel(model);
		table.setBackground(Color.WHITE);
		table.setForeground(Color.BLACK);
		Font font=new Font("",1,12);
		table.setFont(font);
		table.setRowHeight(1,80);
		tf1.setPreferredSize(new Dimension(150, 35));
		select.setPreferredSize(new Dimension(150, 35));
		b1.setPreferredSize(new Dimension(100, 35));
		
		b2.setPreferredSize(new Dimension(100, 35));
		b3.setPreferredSize(new Dimension(100, 35));
		b4.setPreferredSize(new Dimension(100, 35));
		JScrollPane sp=new JScrollPane(table);
		sp.setPreferredSize(new Dimension (600, 500) ); 
		jf.setContentPane(new JLabel(new ImageIcon("D:\\Academics\\4th Semister\\\bject Oriented programming\\Lab Area\\Programs java\\Workshop\\images\\images.jpg")));
		c=jf.getContentPane();
		
		
		p1=new JPanel();
		
		p2=new JPanel();
		p3=new JPanel();
		p4=new JPanel();
		p5=new JPanel();
		p1.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		p2.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		p3.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		p4.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		p5.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		c.setLayout(new BorderLayout());
		c.add(p1,BorderLayout.NORTH);
		p1.add(select);
		p1.add(tf1);
		p1.add(b2);
		p1.add(b1);
		
		c.add(p2,BorderLayout.CENTER);
		p2.add(sp);
		c.add(p3,BorderLayout.WEST);
		c.add(p4,BorderLayout.EAST);
		
		c.add(p5,BorderLayout.SOUTH);
		
		p5.add(b3);
		p5.add(b4);
tf1.addKeyListener(new KeyAdapter(){

			

			public void keyReleased(KeyEvent arg0) {
				
				String user=tf1.getText();
				//int chk=Integer.parseInt(tf1.getText());
				if (user.equals("-"))
				{b1.setEnabled(false);
					JOptionPane.showMessageDialog(null, "wrong parameter"+"  -  ");
					tf1.setText("");
				}
				else{
					b1.setEnabled(true);
				}
			}
			
			
		});
b1.addActionListener(new  ActionListener(){

	@Override
	public void actionPerformed(ActionEvent arg0) {
	try{
		//String query="select Quantity,Unit_Cost_Price,Unit_Sale_Price from SpareParts where Product_name=?";
		String query="select * from Wages ";
		PreparedStatement pst=Conn.prepareStatement(query);
		//pst.setString(1, tf1.getText());
		ResultSet rs=pst.executeQuery();
		table.setModel(DbUtils.resultSetToTableModel(rs));
		
	}
	catch (SQLException e){
		JOptionPane.showMessageDialog(null, e);
	}
	}
	
	
});
b2.addActionListener(new  ActionListener(){

	@Override
	public void actionPerformed(ActionEvent arg0) {
	try{  
		
		String tt=(String)select.getSelectedItem();
		String query="select * from Wages where "+tt+"=?";
		//String query="select * from SpareParts ";
		PreparedStatement pst=Conn.prepareStatement(query);
		pst.setString(1, tf1.getText());
		ResultSet rs=pst.executeQuery();
		table.setModel(DbUtils.resultSetToTableModel(rs));
		if (rs==null)
			{
			JOptionPane.showMessageDialog(null, "No data is available");
			
		}
	}
	catch (Exception e){
		JOptionPane.showMessageDialog(null, e);
	} 
	}
	
	
});
		
b3.addActionListener(new  ActionListener(){

	@Override
	public void actionPerformed(ActionEvent arg0) {
	 new Home();
	 b3.setEnabled(false);
	 jf.setVisible(false);
	}
	
	
});
b4.addActionListener(new  ActionListener(){

	@Override
	public void actionPerformed(ActionEvent arg0) {
	tf1.setText("");
	}
	
	
});
		jf.setVisible(true);
		jf.setSize(700,650);
		jf.setLocation(380,10);
		//table.setRowHeight(30);
	}


}
