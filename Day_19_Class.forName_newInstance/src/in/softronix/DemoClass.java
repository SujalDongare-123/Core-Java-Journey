package in.softronix;
class Test
{
	static 
	{
		System.out.println(" Byte code is loaded");
	}
	
public Test() {
	System.out.println("Object Creating.....");
}
}

public class DemoClass {


	public static void main(String[] args) throws Exception 
	{
		
		Class c= Class.forName("in.softronix.Test");
		
		 Object n=  c.newInstance();
		

	}

}
