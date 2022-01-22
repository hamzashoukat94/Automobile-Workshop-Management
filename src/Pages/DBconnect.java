package Pages;
import Calculation.*;
import java.sql.*;
import javax.swing.*;
public class DBconnect{
	
	
		
		public static Connection dbConnector(){
		try{
		Class.forName("org.sqlite.JDBC");
		Connection conn=DriverManager.getConnection("jdbc:sqlite:D:\\Academics\\4th Semister\\Object Oriented programming\\Lab Area\\programs\\Programs java\\Workshop\\Database\\Mydatabase.sqlite");
		//JOptionPane.showMessageDialog(null,"connection establish successfully");
		return conn;
			}
		catch(ClassNotFoundException |SQLException e){
		JOptionPane.showMessageDialog(null,e);
		return null;
						}
		
	}
	}


