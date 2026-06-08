package in.softronix;

public class DemoBuffer {

	public static void main(String[] args) 
	
	{
		StringBuffer sb=new StringBuffer("Softronix");
		
		StringBuffer sb2=new StringBuffer("Softronix");
		
		System.out.println(sb);
		
		System.out.println();
		
		
		StringBuffer app = sb.append(" IT Solution ");
		
		System.out.println("After using append method it shows String buffer is muttable ");
		System.out.println();
		System.out.println(sb);
		
		
		
		

	}

}
