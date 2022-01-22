package Pages;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.*;
import Calculation.*;
public class Start extends ParentGui {
	Start ()
	{
		functionality();
		
	}
	
	
	public void functionality()
	{ 
		
		jf=new JFrame("Login");
		l1= new JLabel("Automobile Workshop Management System");
		l2=new JLabel(new ImageIcon("D:\\Academics\\4th Semister\\Object Oriented programming\\Lab Area\\Programs java\\Workshop\\images\\images.jpg"));
		l3=new JLabel("User Name");
		l4=new JLabel("Password");
		l5=new JLabel("Login!");
		tf1=new JTextField();
		psd=new JPasswordField();
		b1=new JButton("Login",new ImageIcon("D:\\Academics\\4th Semister\\Object Oriented programming\\images.jpg"));
		p1=new JPanel();
		p2=new JPanel();
		p3=new JPanel();
		p4=new JPanel();
		p5=new JPanel();
		
		Font fontL=new Font("Serif",2,48);
		Font fontM=new Font("Serif",5,30);
		Font fontS=new Font("Serif",2,18);
		Font fonts=new Font("Serif",2,16);
		l1.setFont(fontL);
		l2.setFont(fonts);
		l3.setFont(fontS);
		l4.setFont(fontS);
		l5.setFont(fontM);
		b1.setFont(fontS);
		l1.setForeground(Color.BLUE);
		b1.setBackground(Color.WHITE);
b1.setForeground(Color.BLUE);
		b1.setToolTipText("to open application");
		tf1.setToolTipText("must be Alphabet");
		psd.setToolTipText("must be Alphabet");
		tf1.setPreferredSize(new Dimension(400, 35));
		psd.setPreferredSize(new Dimension(400, 35));
		b1.setPreferredSize(new Dimension(120, 35));
		c=jf.getContentPane();
		c.setLayout(new BorderLayout());
		p1.setLayout(new GridBagLayout());
		constraint =new GridBagConstraints();
		p3.setLayout(new GridBagLayout());
		constraint =new GridBagConstraints();
		constraint.insets=new Insets(20,20,0,20);
		p1.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		//p2.setBorder(BorderFactory.createLineBorder(Color.BLUE));
			
		
		p3.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		p3.setBackground(Color.white);
		c.add(p1,BorderLayout.NORTH);
		constraint.gridx=0;
		constraint.gridy=0;
		p1.add(l2,constraint);
		constraint.gridx=1;
		constraint.gridy=0;
		p1.add(l1,constraint);
		c.add(p3,BorderLayout.CENTER);
		constraint.gridx=0;
		constraint.gridy=0;
		p3.add(l5,constraint);
		constraint.gridx=0;
		constraint.gridy=1;
		p3.add(l3,constraint);
		constraint.gridx=0;
		constraint.gridy=2;
		p3.add(l4,constraint);
		constraint.gridx=1;
		constraint.gridy=1;
		p3.add(tf1,constraint);
		constraint.gridx=1;
		constraint.gridy=2;
		p3.add(psd,constraint);
		constraint.gridx=3;
		constraint.gridy=3;
		p3.add(b1,constraint);
		
		tf1.addKeyListener(new KeyAdapter(){

			

			public void keyReleased(KeyEvent arg0) {
				
				String user=tf1.getText();
				//int chk=Integer.parseInt(tf1.getText());
				if (user.equals("-"))
				{b1.setEnabled(false);
					JOptionPane.showMessageDialog(null, "wrong parameter");
					tf1.setText("");
				}else
				{
					b1.setEnabled(true);
				}
			}
			
			
		});
psd.addKeyListener(new KeyAdapter(){

			

			public void keyReleased(KeyEvent arg0) {
				
				String user=psd.getText();
				//int chk=Integer.parseInt(tf1.getText());
				if (user.equals("-"))
				{ b1.setEnabled(false);
					JOptionPane.showMessageDialog(null, "wrong parameter");
					psd.setText("");
				}
				else 
				{
					b1.setEnabled(true);
				}
			}
			
			
		});
		
		
		b1.addActionListener(new StartHandler());
		jf.setVisible(true);
		
		// To adjust frame width automatically according to screen
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	    jf.setSize(screenSize.width, screenSize.height);
	}
public static void main(String args[]) //throws Exception
{
	new Start();
}
	
	
	

class StartHandler implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent ae) {
		
		String name=tf1.getText();
		
		String p=psd.getText();
		if(name.equals("hamza") || name.equals("Hamza") && p.equals("hamza") )
		{
			
			new Home();
			jf.setVisible(false);
		}
		else
		{
			
			JOptionPane.showMessageDialog(null,"your username and password is incorrect!");
		}
		
	}
	
	
	
	
}
}
