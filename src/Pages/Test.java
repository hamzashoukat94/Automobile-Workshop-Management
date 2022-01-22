import javax.swing.JFrame;

public class Test {
	public Test()
	{
		
		functionality();
		
	}

	void functionality()
	{
		JFrame jf=new JFrame("test");
		jf.setVisible(true);
		jf.setLayout(null);
		jf.setSize(500,500);
		
		
	}
	public static void main(String args[])
	{
		new Test();
		
	}
}
