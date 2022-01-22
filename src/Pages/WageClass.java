package Pages;
import Calculation.*;
public class WageClass {
	private static int wage;
	private static int eid;
	private static int month;
	public static void setWage(int _wage){wage = _wage;}
	public static int getWage(){return wage;}
	public static void setEid(int _eid){eid = _eid;}
	public static int getEid(){return eid;}
	public static void setMonth(int _dd){month = _dd+1;}
	public static int getMonth(){return month;}

}
