package in.softtronix;

import java.util.Scanner;

class Userr
{

	public String getdata(int id)
	{
		String name;
		if(id==101)
		{
			name="sujal";
		}
		else if(id==102)
		{
			name="Sudhir";
		}
		
		else
		{
		return null;
		}
		
		return name;
	}
}


public class _07_Optional_Class_Handle_Error {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Id : ");
		
		int id=sc.nextInt();
		
		Userr u=new Userr();
		String data=u.getdata(id);
		
		if(data !=null)
		{
			System.out.println(data.toUpperCase());
		}
		else
		{
			System.out.println("Data not found for this id ");
		}
	}

}
