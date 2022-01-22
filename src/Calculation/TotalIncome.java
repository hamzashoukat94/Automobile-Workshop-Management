package Calculation;
import Pages.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Pages.DBconnect;
import Pages.WageClass;

public class TotalIncome {
	private static final String Jan = null;
	private static final String Feb = null;
	private static final String March = null;
	private static final String April = null;
	private static final String May = null;
	private static final String June = null;
	private static final String July = null;
	private static final String August = null;
	private static final String Sep = null;
	private static final String October = null;
	private static final String November = null;
	private static final String December = null;
	
	public  int income;
	double ww;
	private  static int value;
	private  static int tincome;
	Connection Conn9;
	PreparedStatement pst9,pst;
	 ResultSet rs;
		
		
		public static String convertMonth(){
			value=WageClass.getMonth();
			if(value==0)
			{
				return Jan;
			}
			if(value==1)
			{
				return Feb;
			}
			if(value==2)
			{
				return March;
			}
			if (value==3)
			{
				return April;
			}
			if(value==4)
			{
				return May;
				
			}
			if(value==5)
			{
				return June;
				
			}
			if(value==6)
			{
				return July;
				
			}
			if(value==7)
			{
				return August;
				
			}
			if(value==8)
			{
				return Sep;
				
			}
			if(value==9)
			{
				return October;
				
			}
			if(value==10)
			{
				return November;
				
			}
			else if(value==11)
			{	
				return December;
		}
			return null;	
			
			
		
		}
	public Double calculateIncome() throws SQLException{
		Conn9=DBconnect.dbConnector();
		ww= WageClass.getWage()*30/100;
	
		income	= (int) (Income.getIncome()+ww);
	

	try{
	String query="select  Income from Income where Month =?";
	pst9=Conn9.prepareStatement(query);
	
	pst9.setString(1, convertMonth());
	rs=pst9.executeQuery();
	if(rs.next() )
	{
	 tincome =rs.getInt("Income");
	}
		}
		
		 catch(Exception e)
		{
          e.printStackTrace();
			 
			JOptionPane.showMessageDialog(null, e.getMessage());
       }
		
	finally{
	pst9.close();
	rs.close();}
	try{
		
		int fincome=income+tincome;
		String outcome=Integer.toString(fincome);
		System.out.println(outcome);
		System.out.println(tincome);
		
	String sql="update  Income set Income = '"+outcome+"',Month='"+convertMonth()+ "'where Month='"+convertMonth()+"'";
	pst=Conn9.prepareStatement(sql);
	//pst.setInt(1, eid);
	//pst.setInt(2, fpay);
	pst.execute();
	pst.close();
	JOptionPane.showMessageDialog(null,"Income update Succesfully");
		}
		catch(Exception e)
		{JOptionPane.showMessageDialog(null, e.getMessage());
			
		}

		
		/*try{
			
			String query="insert into Income (Month,Income) values(?,?)";
			pst9=Conn9.prepareStatement(query);
			
			pst9.setString(1,month);
			pst9.setDouble(2,income);
			
			
			
		pst9.execute();
		JOptionPane.showMessageDialog(null,"Income update Succesfully");
		 
		pst9.close();
				}
				 catch(Exception e)
				{
		           e.printStackTrace();
					 
					JOptionPane.showMessageDialog(null, e.getMessage());
		        }*/
			return (double) income;
			}
	
	
	
			
}
