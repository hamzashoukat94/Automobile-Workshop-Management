package Calculation;

import java.text.SimpleDateFormat;
//import java.sql.Date;
import java.util.Date;

public class NN {

	public static void main(String[] args) {
		Date today=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat(" EEEE dd/MMMM/yyyy");
		//SimpleDateFormat sdf1=new SimpleDateFormat("EEEE");
		System.out.print(sdf.format(today));
		//System.out.print("     "+sdf1.format(today));
	}

}
