package Pages;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

import Calculation.CompanyIncome;
import Calculation.RepairPrice;
import Calculation.Salaries;

public class Home extends ParentGui {

	
	public Home()
	{
		functionality();
	}
public void functionality()
{
	jf=new JFrame("Home");
	l1= new JLabel("Automobile Workshop Management System");
	l2=new JLabel(new ImageIcon("D:\\Academics\\4th Semister\\Object Oriented programming\\Lab Area\\Programs java\\Workshop\\images\\images.jpg"));
	l3=new JLabel("   Home");
	l4=new JLabel("   Add new Employee                 ");
	l5=new JLabel("   Add new Customer");
	l6=new JLabel("   Billing Generate");
	l7=new JLabel("   Stock list");
	l8=new JLabel("   Employees Details");
	l9=new JLabel("   Repair Price list");
	b1=new JButton("Salaries");
	b2=new JButton("Income");
	b3=new JButton("Spare Parts Mangement");
	b4=new JButton("Wages Management");
	p1=new JPanel();
	p2=new JPanel();
	p3=new JPanel();
	p4=new JPanel();
	p5=new JPanel();
	Font fontL=new Font("Serif",9,48);
	Font fontM=new Font("Serif",5,30);
	Font fontS=new Font("Serif",2,18);
	Font fontSs=new Font("Serif",9,20);
	Font fonts=new Font("Serif",2,16);
	b1.setPreferredSize(new Dimension(150, 40));
	b2.setPreferredSize(new Dimension(150, 40));
	b3.setPreferredSize(new Dimension(150, 40));
	b4.setPreferredSize(new Dimension(150, 40));
	l1.setFont(fontL);
	l3.setFont(fontSs);
	l4.setFont(fontSs);
	l5.setFont(fontSs);
	l6.setFont(fontSs);
	l7.setFont(fontSs);
	l8.setFont(fontSs);
	l9.setFont(fontSs);
	l1.setForeground(Color.BLUE);
	//p1.setBackground(Color.LIGHT_GRAY);
	//p2.setBackground(Color.LIGHT_GRAY);
	
	c=jf.getContentPane();
	c.setLayout(new BorderLayout());
	p1.setLayout(new GridBagLayout());
	constraint =new GridBagConstraints();
	p2.setLayout(new GridLayout(10, 1, 2, 0));
	constraint =new GridBagConstraints();
	constraint.insets=new Insets(20,20,0,20);
	p3.setLayout(new GridLayout(10,2));

	//p3.setLayout(new GridBagLayout());
	//constraint =new GridBagConstraints();
	//constraint.insets=new Insets(20,20,0,20);
	p1.setBorder(BorderFactory.createLineBorder(Color.BLUE));
	p2.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		
	
//	p3.setBorder(BorderFactory.createLineBorder(Color.BLUE));
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
	p2.add(l7);
	p2.add(l8);
	p2.add(l9);
	c.add(p3,BorderLayout.CENTER);

	p3.add(b1);
	
	p3.add(b2);
	
	p3.add(b3);
	
	p3.add(b4);


	
	
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
	l7.addMouseListener( new MouseAdapter(){

		
		public void mouseClicked(MouseEvent arg0) {
			
			new Stocks();
			jf.setVisible(false);
		}
	});
	l8.addMouseListener( new MouseAdapter(){

		
		public void mouseClicked(MouseEvent arg0) {
			
			new Mechanics();
			jf.setVisible(false);
		}
	});
l9.addMouseListener( new MouseAdapter(){

		
		public void mouseClicked(MouseEvent arg0) {
			
			new RepairPrice();
			jf.setVisible(false);
		}
	});
	b1.addActionListener( new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent arg0) {
			new Salaries();
			jf.setVisible(false);
		}
		
	});

		
	b2.addActionListener( new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent arg0) {
			new CompanyIncome();
			jf.setVisible(false);
		}
		
	});
	b3.addActionListener( new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent arg0) {
			new Parts();
			jf.setVisible(false);
		}
		
	});

	b4.addActionListener( new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent arg0) {
			new Wages();
			jf.setVisible(false);
		}
		
	});
	
jf.setVisible(true);
jf.setTitle("Home");

	// To adjust frame width automatically according to screen
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    jf.setSize(screenSize.width, screenSize.height);

}
	
}
