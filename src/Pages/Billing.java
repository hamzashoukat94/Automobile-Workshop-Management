package Pages;

import Calculation.*;
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
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.TableModelEvent;
import javax.swing.table.DefaultTableModel;

import com.toedter.calendar.JDateChooser;

import Calculation.EmployeeSalary;
import Calculation.Income;
import Calculation.RepairPrice;
import Calculation.TotalIncome;
import net.proteanit.sql.DbUtils;
import java.util.*
;
public class Billing extends ParentGui {
	private static final String STOP    = "0"; 
	private static final String VALID   = "Valid  number";
	private static final String INVALID = "Not a valid  number";
	private static final String VALID_PHONE_PATTERN = "[0-9]{3}-[0-9]{3}-[0-9]{4}";
	private static final String VALID_ADDRESS="[0-9]{2}-[0-9]{2}-[0-9]{4}";
	
private static final String VALID_CAR="[a-z]{3}-[0-9]{3}";

	private static final String VALID_CAR1= "[A-Z]{3}-[0-9]{3}";
	private static final String VALID_CAR2= "[a-z]{3}-[0-9]{4}";
	private static final String VALID_CAR3= "[A-Z]{3}-[0-9]{4}";

	private static final String VALID_ID0="[0-9]{1}";
	private static final String VALID_ID= "[0-9]{2}";
	private static final String VALID_ID1= "[0-9]{3}";
	private static String wage;
	public static  double salary=0;
	public static  double income=0;
	public String id=null;
	public ResultSet rs;
	public ResultSet rs1;
	public ResultSet rs2;
	public PreparedStatement pst1;
	public PreparedStatement pst2;
	public PreparedStatement pst3;
	public int eid=0;
	public int Cost=0;
	public 	 int wg=0;
	public	 int sale=0;
	public Double profitM=0.0;
	public Double profitS=0.0;
	 public  String mazdoori=null;
	
	Billing()
	{    
		
		 functionality();	
	}
	public void functionality()
	{
		Conn=DBconnect.dbConnector();
		jf=new JFrame(" Billing ");
		l1= new JLabel("Automobile Workshop Management System");
		l2=new JLabel(new ImageIcon("D:\\Academics\\4th Semister\\Object Oriented programming\\Lab Area\\Programs java\\Workshop\\images\\images.jpg"));
		l3=new JLabel("   Home");
		l4=new JLabel("   Add new Employee                  ");
		l5=new JLabel("   Add new Customer");
		l6=new JLabel("   Billing Generate");
		l13=new JLabel("  Stock list");
		l14=new JLabel("  Employees Details");
		l15=new JLabel("  Repair Price list");
		l7=new JLabel("Car Registration #");
		l8=new JLabel("                     Mechanic Id          ");
		l9=new JLabel("                     Mechanic Wages    ");
		l10=new JLabel("                         Spare Parts          ");
		l11=new JLabel("Bill Generartion");
		l12=new JLabel("Date                     ");
		
		b1=new JButton("Add");
		b2=new JButton("Reset");
		b3=new JButton("Generate");
		 tf1=new JTextField();
		 tf2=new JTextField();
		 tf3=new JTextField();
		 tf4=new JTextField();
		 tf1.setToolTipText("  e.g XYZ-123");
		 tf2.setToolTipText(" must be a number e.g 1");
		 tf3.setToolTipText(" Spare parts name which is set by mechanic e.g Wheel");
		 tf4.setToolTipText("  Spare parts name e.g wheel,Oil bottle");
		 b1.setToolTipText("add to bill");
		 b2.setToolTipText("clear text fields");
		 b1.setToolTipText(" bill generate");
		 
		 JDateChooser dt=new JDateChooser();
		
		 Font fontL=new Font("Serif",9,48);
			Font fontM=new Font("Serif",5,30);  
			Font fontS=new Font("Serif",2,18);
			Font fontSs=new Font("Serif",9,20);
			Font fonts=new Font("Serif",2,16);
			 table=new JTable();
			Object columns[]= {"Spare Parts Name","Mechanic Wage","Unit Price","Total Price"};
			model =(DefaultTableModel)table.getModel();
			model.setColumnIdentifiers(columns);
			table.setModel(model);
			table.setBackground(Color.WHITE);
			table.setForeground(Color.BLACK);
			Font font=new Font("",1,12);
			table.setFont(fontSs);
			table.setRowHeight(1,80);
			//table.setRowHeight(30);
		
		
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
		 b1.setPreferredSize(new Dimension(80, 30));
		 b2.setPreferredSize(new Dimension(80, 30));
		 b3.setPreferredSize(new Dimension(100, 30));
		 dt.setPreferredSize(new Dimension(350, 30));
		 tf1.setPreferredSize(new Dimension(350, 30));
			tf2.setPreferredSize(new Dimension(350, 30));
			tf3.setPreferredSize(new Dimension(350, 30));
			tf4.setPreferredSize(new Dimension(350, 30));
		
		l1.setFont(fontL);
		l3.setFont(fontSs);
		l4.setFont(fontSs);
		l5.setFont(fontSs);
		l6.setFont(fontSs);
		l7.setFont(fontS);
		l8.setFont(fontS);
		l9.setFont(fontS);
		l10.setFont(fontS);
		l11.setFont(fontM);
		l12.setFont(fontS);
		l13.setFont(fontSs);
		l14.setFont(fontSs);
		l15.setFont(fontSs);
		l1.setForeground(Color.BLUE);
		l7.setForeground(Color.BLACK);
		//p1.setBackground(Color.WHITE);
		//p2.setBackground(Color.LIGHT_GRAY);
		
		c=jf.getContentPane();
		c.setLayout(new BorderLayout());
		p1.setLayout(new GridBagLayout());
		constraint =new GridBagConstraints();
		p2.setLayout(new GridLayout(10, 4, 2, 0));
		constraint =new GridBagConstraints();
		constraint.insets=new Insets(20,20,0,20);
		p3.setLayout(new GridLayout(10,1));
		constraint =new GridBagConstraints();
		constraint.insets=new Insets(20,20,0,20);
		p6.setLayout(new GridBagLayout());
		p7.setLayout(new GridBagLayout());
		p8.setLayout(new GridBagLayout());
		p9.setLayout(new GridBagLayout());
		p10.setLayout(new GridBagLayout());
		p11.setLayout(new GridBagLayout());
		p12.setLayout(new GridBagLayout());
		
		
		
		
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
		p2.add(l13);
		p2.add(l14);
		p2.add(l15);
		c.add(p3,BorderLayout.CENTER);
		constraint.gridx=0;
		constraint.gridy=0;
		p6.add(l11,constraint);
		constraint.gridx=0;
		constraint.gridy=1;
		p7.add(l12,constraint);
		constraint.gridx=1;
		constraint.gridy=1;
		p7.add(dt,constraint);
		
		constraint.gridx=0;
		constraint.gridy=2;
		p8.add(l7,constraint);
		constraint.gridx=1;
		constraint.gridy=2;
		p8.add(tf1,constraint);
		
		constraint.gridx=0;
		constraint.gridy=3;
		p9.add(l8,constraint);
		constraint.gridx=1;
		constraint.gridy=3;
		p9.add(tf2,constraint);
		constraint.gridx=5;
		constraint.gridy=3;
		p9.add(b1,constraint);
		constraint.gridx=0;
		constraint.gridy=4;
		p10.add(l9,constraint);
		constraint.gridx=1;
		constraint.gridy=4;
		p10.add(tf3,constraint);
		constraint.gridx=8;
		constraint.gridy=4;
		p10.add(b2,constraint);
		constraint.gridx=0;
		constraint.gridy=5;
		p11.add(l10,constraint);
		
		constraint.gridx=1;
		constraint.gridy=5;
		p11.add(tf4,constraint);
		
		constraint.gridx=5;
		constraint.gridy=5;
		p11.add(b3,constraint);
		
		JScrollPane sp=new JScrollPane(table);
		sp.setPreferredSize(new Dimension (1500, 700) ); // to set table size
       
		
		p3.add(p6);
		p3.add(p7);
		p3.add(p8);
		p3.add(p9);
		p3.add(p10);
		p3.add(p11);
		 p3.add(sp);
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
				  if (tf1.getText().matches(VALID_CAR)|| tf1.getText().matches(VALID_CAR1) || tf1.getText().matches(VALID_CAR2)|| tf1.getText().matches(VALID_CAR3))
					  { //JOptionPane.showMessageDialog(null ,VALID);
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
					  if (tf2.getText().matches(VALID_ID)|| tf2.getText().matches(VALID_ID1) || tf2.getText().matches(VALID_ID0)){ //JOptionPane.showMessageDialog(null ,VALID);
			          // pst.execute();
					 
			         //  JOptionPane.showMessageDialog(null,"Account Created Succesfully");
			           } else { JOptionPane.showMessageDialog(null ,"Invalid Mechanic Id ");
			           tf2.setText("");}
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
					{ JOptionPane.showMessageDialog(null ,"Not a Valid  Mechanic Wages");
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
					{
						 b1.setEnabled(false);
						JOptionPane.showMessageDialog(null, "wrong parameter"+"  -  ");
						tf4.setText("");
					}
					else
					{
						b1.setEnabled(true);
					}
					if (tf4.getText().matches(VALID_ID)|| tf4.getText().matches(VALID_ID1) || tf4.getText().matches(VALID_ID0))
					{ JOptionPane.showMessageDialog(null ,"Not a valid  Spare parts Name");
			        // pst.execute();
					 tf4.setText("");
			       //  JOptionPane.showMessageDialog(null,"Account Created Succesfully");
			         } else { //JOptionPane.showMessageDialog(null ,"Valid Name");
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
		l13.addMouseListener(  new MouseAdapter(){

			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				new Stocks();
				jf.setVisible(false);
				
				
			}

		});
		l14.addMouseListener(  new MouseAdapter(){

			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				new Mechanics();
				jf.setVisible(false);
				
				
			}

		});
		l15.addMouseListener(  new MouseAdapter(){

			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				new RepairPrice();
				jf.setVisible(false);
				
				
			}

		});
		b1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				//Object[] row=new Object[5];
				
				
				String Wages ="Wages";
				String sl="Unit_Sale_price";
			String cst="Unit_Cost_Price";
					
					String query="select  *  from Wages where Product_name=?";
					String query1="select Unit_Sale_price from SpareParts where Product_name=?";
					String query2="select Unit_Cost_Price from SpareParts where Product_name=?";
					
					try {
						pst1 = Conn.prepareStatement(query);
						pst2=Conn.prepareStatement(query1);
					pst3=Conn.prepareStatement(query2);
						pst1.setString(1, tf3.getText());
						 if (tf3.getText().length()>8)
			             {
			            	 throw new Exception("Number should not be greter than 8numbers");
			             }
						pst2.setString(1, tf4.getText());
						pst3.setString(1, tf4.getText());
						rs=pst1.executeQuery();
					 rs1=pst2.executeQuery();
						 rs2=pst3.executeQuery();
						if(rs.next() && rs1.next() && rs2.next())
						{
							
						row[0]=tf4.getText();
					
						row[1]=rs.getString("Wages");
						row[2]=rs1.getString("Unit_Sale_price");
					
						int mazdoori=Integer.parseInt(rs.getString("Wages"));
						int price=Integer.parseInt(rs1.getString("Unit_Sale_price"));
						int sum=mazdoori+price;
						 String total=Integer.toString(sum);
						java.util.Date date= dt.getDate();
						 month=date.getMonth();
						
					//	System.out.println(month);
						  row[3]=total;
						model.addRow(row);
						
						 eid=Integer.parseInt(tf2.getText());
						/* rs.close();
						 rs1.close();
						 rs2.close();	
						 pst1.close();
						 pst2.close();
						 pst3.close();
						 */
						wg=rs.getInt(Wages)+wg;
						
						
						sale=rs1.getInt(sl)+sale;
						
						Cost=rs2.getInt(cst)+Cost;
						
					//System.out.println(salary);
						//System.out.println(income);
						}
						else
						{
							JOptionPane.showMessageDialog(null, "No data is available or there is no stock");
							
						}
						
						 rs.close();
						 rs1.close();
						 rs2.close();	
						 pst1.close();
						 pst2.close();
						 pst3.close();
						 
					} catch (Exception e) {
						// TODO Auto-generated catch block
						JOptionPane.showMessageDialog(null, " there is no stock");
						
				
						e.printStackTrace();
					}
					finally
					{
						
							 try {
								rs.close();
								rs1.close();
								 rs2.close();	
								 pst1.close();
								 pst2.close();
								 pst3.close();
							} catch (SQLException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							 
						
					}
						//catch (Exception e) {
							// TODO Auto-generated catch block
						//	JOptionPane.showMessageDialog(null, " there is no stock");
						//	
					
							//e.printStackTrace();
						//}
						
					//}
				
				
			}});
		b2.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				
				tf1.setText("");
				tf2.setText("");
				tf3.setText("");
				tf4.setText("");
				
			}});
		b3.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				
				tf1.setText("");
				tf2.setText("");
				tf3.setText("");
				tf4.setText("");
				table.setModel(new DefaultTableModel(null,new String[]{"Spare Parts Name","Mechanic Wage","Unit Price","Total Price"}));
				/*
				salary=(double) ((wg*80)/100)+salary;
				
				profitM=(double) ((wg*20)/100)+profitM;*/
				 profitS=(double) (sale-Cost);
				//	income=profitM+profitS;
					WageClass.setWage(wg);
					WageClass.setEid(eid);
					WageClass.setMonth(month);
					Income.setIncome(profitS);
					
					EmployeeSalary es=new EmployeeSalary ();
					TotalIncome ti=new TotalIncome();
					try {
						es.calculateSalary();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					try {
						ti.calculateIncome();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				
			}});
		
		
jf.setVisible(true);
		// To adjust frame width automatically according to screen
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	    jf.setSize(screenSize.width, screenSize.height);
	}

	
}