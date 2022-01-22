package Pages;
import Calculation.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.*;
import javax.swing.event.TableModelEvent;
import javax.swing.table.DefaultTableModel;

public abstract class ParentGui {
		public JFrame jf; 
		public Connection Conn;
		public ResultSet rs;
		public PreparedStatement pst,pst1;
		public String[] row=new String[5];
		public JPanel p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12,p13;
		public JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16;
	    public JTextField tf1,tf2,tf3,tf4,tf5,tf6,tf7;
	    public JPasswordField psd;
	    public TableModelEvent dd;
	    public int month;
	    public DefaultTableModel model;
		public JTable table;
	    public  GridBagConstraints constraint;
	    public JButton b1,b2,b3,b4,b5,b6,b7,b8;
	    public Container c;
	    public JComboBox cb1,cb2;
	    public JTextArea ta1;
}
