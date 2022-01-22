package Pages;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Date;
import java.sql.SQLException;

import javax.swing.*;

import com.toedter.calendar.JDateChooser;

import Calculation.RepairPrice;



public class EmployeeReg  extends ParentGui{
	 JDateChooser dt;
		private static final String STOP    = "0"; 
		private static final String VALID   = "Valid  number";
		private static final String INVALID = "Not a valid  number";
		private static final String VALID_PHONE_PATTERN = "[0-9]{3}-[0-9]{3}-[0-9]{4}";
		private static final String VALID_DATE="[0-9]{2}-[0-9]{2}-[0-9]{4}";
		private static final String VALID_DATE1="[0-9]{1}-[0-9]{1}-[0-9]{4}";
		private static final String VALID_DATE2="[0-9]{1}-[0-9]{2}-[0-9]{4}";
		private static final String VALID_DATE3="[0-9]{2}-[0-9]{1}-[0-9]{4}";
private static final String VALID_ID0="[0-9]{1}";
		private static final String VALID_ID= "[0-9]{2}";
		private static final String VALID_ID1= "[0-9]{3}";
		
	EmployeeReg()
	{
		 functionality();
	}
	
	
public void functionality()
{ Conn=DBconnect.dbConnector();
jf=new JFrame("Employee Registrations");
l1= new JLabel("Automobile Workshop Management System");
l2=new JLabel(new ImageIcon("D:\\Academics\\4th Semister\\Object Oriented programming\\Lab Area\\Programs java\\Workshop\\images\\images.jpg"));
l3=new JLabel("   Home");
l4=new JLabel("   Add new Employee                 ");
l5=new JLabel("   Add new Customer");
l6=new JLabel("   Billing Generate");
l14=new JLabel("  Stock list");
l15=new JLabel("  Employees Details");
l16=new JLabel("  Repair Price list");
l7=new JLabel("Mechanic Registration! ");
 l8=new JLabel("Mechanic Id #   ");
 l9=new JLabel("First Name      ");
 l10=new JLabel("Last Name      ");

 l11=new JLabel("Date of Joining");
 l12=new JLabel("Address        ");


 
 l13=new JLabel("Contact #      ");


 
 b1=new JButton("Register");
 b2=new JButton("Reset");
 dt=new JDateChooser();
 tf1=new JTextField();
 tf2=new JTextField();
 tf3=new JTextField();
 tf4=new JTextField();
 tf5=new JTextField();
 tf6=new JTextField();
	tf1.setToolTipText(" Must be  a number e.g 1");
	tf2.setToolTipText(" e.g hamza");
	tf3.setToolTipText(" e.g shoukat");
	tf4.setToolTipText("  DD-MM-YYYY  e.g 12-8-2017");
	tf5.setToolTipText(" e.g H#,street #,colony ,city");
	tf6.setToolTipText("  phone number e.g 3XX-XXX-XXXX");
	b1.setToolTipText("register and create account");
	b2.setToolTipText(" to clear text field");
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
p12=new JPanel();
p13=new JPanel();

Font fontL=new Font("Serif",9,48);
Font fontM=new Font("Serif",5,30);
Font fontS=new Font("Serif",2,18);
Font fontSs=new Font("Serif",9,20);
Font fonts=new Font("Serif",2,16);

b1.setPreferredSize(new Dimension(100, 35));
b2.setPreferredSize(new Dimension(100, 35));
 dt.setPreferredSize(new Dimension(350, 35));
 tf1.setPreferredSize(new Dimension(350, 35));
	tf2.setPreferredSize(new Dimension(350, 35));
	tf3.setPreferredSize(new Dimension(350, 35));
	tf4.setPreferredSize(new Dimension(350, 35));
	tf5.setPreferredSize(new Dimension(350, 35));
	tf6.setPreferredSize(new Dimension(350, 35));

l1.setFont(fontL);
l3.setFont(fontSs);
l4.setFont(fontSs);
l5.setFont(fontSs);
l6.setFont(fontSs);
l7.setFont(fontM);
l8.setFont(fontS);
l9.setFont(fontS);
l10.setFont(fontS);
l11.setFont(fontS);
l12.setFont(fontS);
l13.setFont(fontS);
l14.setFont(fontSs);
l15.setFont(fontSs);
l16.setFont(fontSs);
l1.setForeground(Color.BLUE);
l7.setForeground(Color.BLACK);
b1.setPreferredSize(new Dimension(150, 40));
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
p12.setLayout(new GridBagLayout());
constraint =new GridBagConstraints();
constraint.insets=new Insets(20,20,0,20);
p13.setLayout(new GridBagLayout());
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
p2.add(l14);
p2.add(l15);
p2.add(l16);
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

constraint.gridx=0;
constraint.gridy=5;
p11.add(l13,constraint);
constraint.gridx=1;
constraint.gridy=5;
p11.add(tf6,constraint);
constraint.gridx=30;
constraint.gridy=6;
p12.add(b2,constraint);
constraint.gridx=50;
constraint.gridy=6;
p12.add(b1,constraint);
p3.add(p6);
p3.add(p7);
p3.add(p8);
p3.add(p9);
p3.add(p10);
p3.add(p11);
p3.add(p12);
p3.add(p13);

b2.addActionListener(new ActionListener(){

	@Override
	public void actionPerformed(ActionEvent e) {
		tf1.setText("");
		tf2.setText("");
		tf3.setText("");
		tf4.setText("");
		tf6.setText("");
		
	}
	
});
tf1.addMouseListener(new MouseAdapter(){

	

	public void mouseExited(MouseEvent arg0) {
	
		String user=tf1.getText();
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
		  if (tf1.getText().matches(VALID_ID)|| tf1.getText().matches(VALID_ID1) || tf1.getText().matches(VALID_ID0)){ //JOptionPane.showMessageDialog(null ,VALID);
          // pst.execute();
		 
         //  JOptionPane.showMessageDialog(null,"Account Created Succesfully");
           } else { JOptionPane.showMessageDialog(null ,INVALID);
           tf1.setText("");}
	}
	
	
});
tf2.addMouseListener(new MouseAdapter(){

	

	public void mouseExited(MouseEvent arg0) {
		
		String user=tf2.getText();
		//int chk=Integer.parseInt(tf1.getText());
		if (user.equals("-"))
		{b1.setEnabled(false);
			JOptionPane.showMessageDialog(null, "wrong parameter"+"  -  ");
			tf2.setText("");
		}
		else
		{
			b1.setEnabled(true);
		}
		if (tf2.getText().matches(VALID_ID)|| tf2.getText().matches(VALID_ID1) || tf2.getText().matches(VALID_ID0))
		{ JOptionPane.showMessageDialog(null ,"Not a valid First Name");
        // pst.execute();
		 tf2.setText("");
       //  JOptionPane.showMessageDialog(null,"Account Created Succesfully");
         } else { //JOptionPane.showMessageDialog(null ,"Valid Name");
        }
	}
	
	
});
tf3.addMouseListener(new MouseAdapter(){

	

	public void mouseExited(MouseEvent arg0) {
		
		String user=tf3.getText();
		//int chk=Integer.parseInt(tf1.getText());
		if (user.equals("-"))
		{
			 b1.setEnabled(false);
			JOptionPane.showMessageDialog(null, "wrong parameter"+"  -  ");
			tf3.setText("");
		}
		else
		{
			b1.setEnabled(true);
		}
		if (tf3.getText().matches(VALID_ID)|| tf3.getText().matches(VALID_ID1) || tf3.getText().matches(VALID_ID0))
		{ JOptionPane.showMessageDialog(null ,"Not a valid  Last Name");
        // pst.execute();
		 tf3.setText("");
       //  JOptionPane.showMessageDialog(null,"Account Created Succesfully");
         } else { //JOptionPane.showMessageDialog(null ,"Valid Name");
        }
	}
	
	
});
tf4.addMouseListener(new MouseAdapter(){

	

	public void mouseExited(MouseEvent arg0) {
		
		String user=tf4.getText();
		//int chk=Integer.parseInt(tf1.getText());
		if (user.equals("-"))
		{ b1.setEnabled(false);
			JOptionPane.showMessageDialog(null, "wrong parameter"+"  -  ");
			tf4.setText("");
		}
		else
		{
			b1.setEnabled(true);
		}
		if (tf4.getText().matches(VALID_DATE)||tf4.getText().matches(VALID_DATE1)||tf4.getText().matches(VALID_DATE2)||tf4.getText().matches(VALID_DATE3))
		{// JOptionPane.showMessageDialog(null ," valid date");
        // pst.execute();
		  
       //  JOptionPane.showMessageDialog(null,"Account Created Succesfully");
         } else { JOptionPane.showMessageDialog(null ," Not  a Valid Date");
         tf4.setText("");}
	}
	
	
});
tf6.addMouseListener(new MouseAdapter(){

	
	public void mouseExited(MouseEvent arg0) {
		
		String user=tf6.getText();
		//int chk=Integer.parseInt(tf1.getText());
		if (user.equals("-"))
		{b1.setEnabled(false);

			JOptionPane.showMessageDialog(null, "wrong parameter"+"  -  ");
			tf6.setText("");
		}
		else

	{
			b1.setEnabled(true);
	}
		 if (tf6.getText().matches(VALID_PHONE_PATTERN)) { //JOptionPane.showMessageDialog(null ,VALID);
        
         
         } else { JOptionPane.showMessageDialog(null ,INVALID);
         tf6.setText("");}
		}
	
	
});

b1.addActionListener( new ActionListener(){

	@Override
	public void actionPerformed(ActionEvent ae) {

		try{
			
            String sql="insert into Employees (Mechanic_id,F_name,L_name,Date_of_Joining,Contact) values(?,?,?,?,?)";
             pst = Conn.prepareStatement(sql);
            pst.setString(1,tf1.getText());
          
             pst.setString(2,tf2.getText());
            pst.setString(3,tf3.getText());
             pst.setString(4,tf4.getText());
             pst.setString(5, tf6.getText());
            
            // if(tf1.getText().matches(null)||tf2.getText().matches(null)||tf3.getText().matches(null)||tf4.getText().matches(null)||tf6.getText().matches(null))
//{ JOptionPane.showMessageDialog(null,"Please fill all fields");
	//}
//else {
	pst.execute();
	pst.close();
	String sql2="insert into Salary (Mechanic_id,Salary)values(?,?)";
	pst1=Conn.prepareStatement(sql2);
	pst1.setString(1, tf1.getText());
	pst1.setInt(2, 0);
	pst1.execute();
	 JOptionPane.showMessageDialog(null,"Account created Successfully");
	
//}
               pst.close();
			}
        catch(SQLException e)
		{
            JOptionPane.showMessageDialog(null,"Contact and mechanic id should be different");
        }
		catch(Exception e)
		{

            JOptionPane.showMessageDialog(null,e);	
		}
	}
	
});
l3.addMouseListener( new MouseAdapter(){

	@Override
	public void mouseClicked(MouseEvent arg0) {
		
		new Home();
		jf.setVisible(false);
		
		
	}

});
l4.addMouseListener( new   MouseAdapter(){

	@Override
	public void mouseClicked(MouseEvent arg0) {
		
		
		new EmployeeReg();
		jf.setVisible(false);
		
	}

});
l5.addMouseListener( new MouseAdapter(){

	@Override
	public void mouseClicked(MouseEvent arg0) {
		
		new CustomerReg();
		jf.setVisible(false);
		
		
	}

});
l6.addMouseListener(  new MouseAdapter(){

	@Override
	public void mouseClicked(MouseEvent arg0) {
		
		new Billing();
		jf.setVisible(false);
		
		
	}

});
l14.addMouseListener(  new MouseAdapter(){

	@Override
	public void mouseClicked(MouseEvent arg0) {
		
		new Stocks();
		jf.setVisible(false);
		
		
	}

});
l15.addMouseListener(  new MouseAdapter(){

	@Override
	public void mouseClicked(MouseEvent arg0) {
		
		new Mechanics();
		jf.setVisible(false);
		
		
	}

});
l16.addMouseListener(  new MouseAdapter(){

	@Override
	public void mouseClicked(MouseEvent arg0) {
		
		new RepairPrice();
		jf.setVisible(false);
		
		
	}

});


jf.setVisible(true);
// To adjust frame width automatically according to screen
Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
jf.setSize(screenSize.width, screenSize.height);

	}
	
	

}
