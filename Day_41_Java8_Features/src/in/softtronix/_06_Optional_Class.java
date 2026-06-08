package in.softtronix;

import java.util.Scanner;

class User {
	
	public String getdata(int id)
	{
		String name;
		
		if(id==101)
		{
			name= "Sujal";
		}
		else if(id==102)
		{
			name= "sudhir";
		}
		else
		{
		
		name= null;
		}
		
		return name;
		
		
	}
	
}

public class _06_Optional_Class {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id : ");
		
		int id=sc.nextInt();
		
		
		User u=new User();
		String data =u.getdata(id);
		
		System.out.println(data.toUpperCase());
		
		

	}

}
