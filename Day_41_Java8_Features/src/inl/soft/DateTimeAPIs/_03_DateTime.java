package inl.soft.DateTimeAPIs;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class _03_DateTime {

	public static void main(String[] args) 
	{
		Date d=new Date();
		System.out.println(d);
		
		LocalDate l=LocalDate.now();
		System.out.println(l);
		
		LocalDate plusDays = l.plusDays(2);
		System.out.println(plusDays);
		
		LocalDate plusMonths = l.plusMonths(2);
		System.out.println(plusMonths);
		
		LocalDate plusYears = l.plusYears(5);
		System.out.println(plusYears);
		
		
		boolean leapYear = l.isLeapYear();
		System.out.println(leapYear);
		
		LocalTime t=LocalTime.now();
		System.out.println(t);
		
		LocalTime plusHours = t.plusHours(2);
		System.out.println(plusHours);

	}

}
