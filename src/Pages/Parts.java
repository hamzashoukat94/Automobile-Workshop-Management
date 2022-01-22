package Pages;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Calculation.RepairPrice;
import Calculation.*;
public class Parts  extends ParentGui{
	 
	
	Parts()
	{
		functionality();
		jf.setVisible(true);
		// To adjust frame width automatically according to screen
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	    jf.setSize(screenSize.width, screenSize.height);
	}
	public void functionality()
	{
		Conn=DBconnect.dbConnector();

		jf=new JFrame(" Spare Parts Management");
		l1= new JLabel("Automobile Workshop Management System");
		l2=new JLabel(new ImageIcon("D:\\Academics\\4th Semister\\Object Oriented programming\\Lab Area\\Programs java\\Workshop\\images\\images.jpg"));
		l3=new JLabel("   Home");
		l4=new JLabel("   Add new Employee                 ");
		l5=new JLabel("   Add new Customer");
		l6=new JLabel("   Billing Generate");
		l7=new JLabel("Spare Parts Mangement! ");
		 l8=new JLabel("Product Name  ");
		 l9=new JLabel("     Quantity    ");
		 l10=new JLabel("Unit Cost price");
		l12=new JLabel("   Stock list");
		l13=new JLabel("   Employees Details");
		l14=new JLabel("   Repair Price list");
		 l11=new JLabel("Unit sale Price");
		 
		
		 
		 b1=new JButton("Add");
		 
		 b2=new JButton("Reset");
		 b3=new JButton("Back");
		 
		
		 tf1=new JTextField();
		 tf2=new JTextField();
		 tf3=new JTextField();
		 tf4=new JTextField();
		
		 
		p1=new JPanel();
		p2=new JPanel();
		p3=new JPanel();
		p4=new JPanel();
		p5=new JPanel();
		p6=new JPanel();
		p7=new JPanel();
		p8=new JPanel();
		p9=new JPanel();
		p10=new JPanel();
		p11=new JPanel();
		
		Font fontL=new Font("Serif",9,48);
		Font fontM=new Font("Serif",5,30);
		Font fontS=new Font("Serif",2,18);
		Font fontSs=new Font("Serif",9,20);
		Font fonts=new Font("Serif",2,16);
		
		l1.setFont(fontL);
		l3.setFont(fontSs);
		l4.setFont(fontSs);
		l5.setFont(fontSs);
		l6.setFont(fontSs);
		l12.setFont(fontSs);
		l13.setFont(fontSs);
		l14.setFont(fontSs);
		l7.setFont(fontM);
		l8.setFont(fontS);
		l9.setFont(fontS);
		l10.setFont(fontS);
		l11.setFont(fontS);
		
		b1.setPreferredSize(new Dimension(100, 40));
		b2.setPreferredSize(new Dimension(100, 35));
		b3.setPreferredSize(new Dimension(100, 35));
		tf1.setPreferredSize(new Dimension(350, 35));
		tf2.setPreferredSize(new Dimension(350, 35));
		tf3.setPreferredSize(new Dimension(350, 35));
		tf4.setPreferredSize(new Dimension(350, 35));
		
		l1.setForeground(Color.BLUE);
		l7.setForeground(Color.BLACK);
		//p1.setBackground(Color.LIGHT_GRAY);
		//p2.setBackground(Color.LIGHT_GRAY);
		
		c=jf.getContentPane();
		c.setLayout(new BorderLayout());
		p1.setLayout(new GridBagLayout());
		constraint =new GridBagConstraints();
		p2.setLayout(new GridLayout(10, 1, 2, 0));
		constraint =new GridBagConstraints();
		constraint.insets=new Insets(20,20,0,20);
		p3.setLayout(new GridLayout(8,1));
		constraint =new GridBagConstraints();
		constraint.insets=new Insets(20,20,0,20);
		p6.setLayout(new GridBagLayout());
		constraint =new GridBagConstraints();
		constraint.insets=new Insets(20,20,0,20);
		p7.setLayout(new GridBagLayout());
		constraint =new GridBagConstraints();
		constraint.insets=new Insets(20,20,0,20);
		p8.setLayout(new GridBagLayout());
		constraint =new GridBagConstraints();
		constraint.insets=new Insets(20,20,0,20);
		p9.setLayout(new GridBagLayout());
		constraint =new GridBagConstraints();
		constraint.insets=new Insets(20,20,0,20);
		p10.setLayout(new GridBagLayout());
		constraint =new GridBagConstraints();
		constraint.insets=new Insets(20,20,0,20);
		p11.setLayout(new GridBagLayout());
		constraint =new GridBagConstraints();
		constraint.insets=new Insets(20,20,0,20);
		
		
		//p3.setLayout(new GridBagLayout());
		//constraint =new GridBagConstraints();
		//constraint.insets=new Insets(20,20,0,20);
		p1.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		p2.setBorder(BorderFactory.createLineBorder(Color.BLUE));
			
		
		//p3.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		c.add(p1,BorderLayout.NORTH);
		constraint.gridx=0;
		constraint.gridy=0;
		p1.add(l2,constraint);
		constraint.gridx=1;
		constraint.gridy=0;
		p1.add(l1,constraint);
		c.add(p2,BorderLayout.WEST);
		p2.add(l3);
		p2.add(l4);
		p2.add(l5);
		p2.add(l6);
		p2.add(l12);
		p2.add(l13);
		p2.add(l14);
		c.add(p3,BorderLayout.CENTER);
		constraint.gridx=0;
		constraint.gridy=0;
		p6.add(l7,constraint);
		

		constraint.gridx=0;
		constraint.gridy=1;
		p7.add(l8,constraint);
		constraint.gridx=1;
		constraint.gridy=1;
		p7.add(tf1,constraint);
		constraint.gridx=0;
		constraint.gridy=2;
		p8.add(l9,constraint);
		constraint.gridx=1;
		constraint.gridy=2;
		p8.add(tf2,constraint);
		constraint.gridx=0;
		constraint.gridy=3;
		p9.add(l10,constraint);
		constraint.gridx=1;
		constraint.gridy=3;
		p9.add(tf3,constraint);
		constraint.gridx=0;
		constraint.gridy=4;
		p10.add(l11,constraint);
		constraint.gridx=1;
		constraint.gridy=4;
		p10.add(tf4,constraint);
		
		constraint.gridx=10;
		constraint.gridy=5;
		p11.add(b3,constraint);
		constraint.gridx=15;
		constraint.gridy=5;
		p11.add(b2,constraint);
		
		constraint.gridx=20;
		constraint.gridy=5;
		p11.add(b1,constraint);
		


		
		
		p3.add(p6);
		p3.add(p7);
		p3.add(p8);
		p3.add(p9);
		p3.add(p10);
		p3.add(p11);
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
tf2.addKeyListener(new KeyAdapter(){

			

			public void keyReleased(KeyEvent arg0) {
				
				String user=tf2.getText();
				//int chk=Integer.parseInt(tf1.getText());
				if (user.equals("-"))
				{
					 b1.setEnabled(false);
					JOptionPane.showMessageDialog(null, "wrong parameter"+"  -  ");
					tf2.setText("");
				}
				else
				{
					b1.setEnabled(true);
				}
			}
			
			
		});
tf3.addKeyListener(new KeyAdapter(){

	

	public void keyReleased(KeyEvent arg0) {
	
		String user=tf3.getText();
		//int chk=Integer.parseInt(tf1.getText());
		if (user.equals("-"))
		{ b1.setEnabled(false);
			JOptionPane.showMessageDialog(null, "wrong parameter"+"  -  ");
			tf1.setText("");
		}
		else
		{
			b1.setEnabled(true);
		}
	}
	
	
});
tf4.addKeyListener(new KeyAdapter(){

	

	public void keyReleased(KeyEvent arg0) {
	
		String user=tf4.getText();
		//int chk=Integer.parseInt(tf1.getText());
		if (user.equals("-"))
		{b1.setEnabled(false);
			JOptionPane.showMessageDialog(null, "wrong parameter"+"  -  ");
			tf1.setText("");
		}
		else
		{
			b1.setEnabled(true);
		}
	}
	
	
});
		b1.addActionListener( new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				new DataEntry();
				
				
				try{
					
		            String sql="insert into SpareParts (Product_name,Quantity,Unit_Cost_Price,Unit_Sale_Price) values(?,?,?,?)";
		             pst = Conn.prepareStatement(sql);
		            pst.setString(1,tf1.getText());
		             pst.setString(2,tf2.getText());
		            pst.setString(3,tf3.getText());
		             pst.setString(4,tf4.getText());
		           
		           pst.execute();
		               JOptionPane.showMessageDialog(null,"Spare Parts Added Succesfully");
		               
		}
				 catch(SQLException e)
				{
		            JOptionPane.showMessageDialog(null,"Product name should be different");
		        }
		        catch(Exception e){
		            JOptionPane.showMessageDialog(null, e);
		        }
				
			}
			
		});
		b2.addActionListener( new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				tf1.setText("");
				tf2.setText("");
				tf3.setText("");
				tf4.setText("");
			
				
				
			}
			
		});
		b3.addActionListener( new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				new Home();
			jf.setVisible(false);
				
				
			}
			
		});
		l3.addMouseListener( new MouseAdapter(){

		
			public void mouseClicked(MouseEvent arg0) {
				new Home();
				jf.setVisible(false);
			}


			
			
		});
		l4.addMouseListener( new MouseAdapter(){

		
			public void mouseClicked(MouseEvent arg0) {
				new EmployeeReg();
				jf.setVisible(false);
			}


			
			
		});
		l5.addMouseListener( new MouseAdapter(){

		
			public void mouseClicked(MouseEvent arg0) {

				new CustomerReg();
				jf.setVisible(false);
			}	
		});
		l6.addMouseListener( new MouseAdapter(){

		
			public void mouseClicked(MouseEvent arg0) {
				
				new Billing();
				jf.setVisible(false);
			}
		});
		l12.addMouseListener( new MouseAdapter(){

			
			public void mouseClicked(MouseEvent arg0) {
				
				new Stocks();
				jf.setVisible(false);
			}
		});
l13.addMouseListener( new MouseAdapter(){

			
			public void mouseClicked(MouseEvent arg0) {
				
				new Mechanics();
				jf.setVisible(false);
			}
		});
l14.addMouseListener( new MouseAdapter(){

	
	public void mouseClicked(MouseEvent arg0) {
		
		new RepairPrice();
		jf.setVisible(false);
	}
});
	
	}

}
