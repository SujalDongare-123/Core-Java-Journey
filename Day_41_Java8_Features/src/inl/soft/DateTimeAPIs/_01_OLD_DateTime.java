package inl.soft.DateTimeAPIs;

import java.text.SimpleDateFormat;
import java.util.Date;

public class _01_OLD_DateTime {

	public static void main(String[] args) 
	{
		Date d=new Date();
		System.out.println(d);
		
		 SimpleDateFormat df=new SimpleDateFormat("dd/MMMM/yyyy");
//		 SimpleDateFormat df=new SimpleDateFormat("dd/MM/yyyy");
//		 SimpleDateFormat df=new SimpleDateFormat("dd/MMM/yy");
		
		 String  f=df.format(d);
		 System.out.println(f);
		 
		 
//		 US-formate
//		 -----------
		 SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/yyyy");
		 String format=sdf.format(d);
		 System.out.println(format);


		
	}

}
