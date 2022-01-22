package Calculation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Pages.DBconnect;
import Pages.WageClass;
import Pages.*;
public class EmployeeSalary {
	
	private int salary;
	private int eid;
	String pay;
	private String month="August";
	int tpay;
	Connection Conn9;
	PreparedStatement pst9,pst;
	 ResultSet rs;
	public int calculateSalary() throws SQLException
	{Conn9=DBconnect.dbConnector();
		
		salary=((WageClass.getWage()*70)/100);
		eid=WageClass.getEid();
		String id=Integer.toString(eid);
		try{
	String query="select  Salary from Salary where Mechanic_id =?";
	pst9=Conn9.prepareStatement(query);
	
	pst9.setString(1, id);
	rs=pst9.executeQuery();
	if(rs.next() )
	{
	  tpay=rs.getInt("Salary");
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
/*	pst9.setInt(1,eid);
	pst9.setInt(2,salary);
	pst9.setString(3,month);
	
	*/
		
		try{
		
	int fpay=salary+tpay;
	String sal=Integer.toString(fpay);
String sql="update  Salary set Salary = '"+sal+		"',Month='"+WageClass.getMonth()+ "'where Mechanic_id='"+id+"'";
pst=Conn9.prepareStatement(sql);
//pst.setInt(1, eid);
//pst.setInt(2, fpay);
pst.execute();
pst.close();
JOptionPane.showMessageDialog(null,"Salary update Succesfully");
	}
	catch(Exception e)
	{JOptionPane.showMessageDialog(null, e.getMessage());
		
	}

	
		return salary;
		}
	

}
