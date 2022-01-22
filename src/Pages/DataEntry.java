package Pages;
import Calculation.*;
import javax.swing.JOptionPane;

public class DataEntry extends Parts {

	DataEntry()
	{
		entry();
	}
	
	
	public void entry()
	{
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
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
	}
}
