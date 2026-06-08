package inl.soft.DateTimeAPIs;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class _02_DateTime {

	public static void main(String[] args) throws Exception
	{
		Date d=new Date();
		System.out.println(d);
		
//****************		convert  Date to String **********************
		SimpleDateFormat sf=new SimpleDateFormat("dd/MMMM/yyyy");
		String f = sf.format(d); // for convert date to String we use the format method 
		System.out.println(f);
		
//***************		convert String to Date     ***************** 
		Date date = sf.parse(f); // to use this we first Throw the Exception 
		System.out.println(date);  // for convert  String to date  we use the Parse method 
		
//		Output :- Fri Mar 27 00:00:00 IST 2026 
//		Time is 00:00:00 because we convert this 27/March/2026 and it does not contain the time 
		

		
//****************************************************************************************
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MMMM/YYYY");
		Date date2 = sdf.parse("1/March/2026");
		System.out.println(date2);
	}

}
