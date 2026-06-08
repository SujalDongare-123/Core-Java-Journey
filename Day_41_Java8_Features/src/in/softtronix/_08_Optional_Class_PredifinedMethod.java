package in.softtronix;

import java.util.Optional;
import java.util.Scanner;

class Usser
{
	public Optional<String> getdata(int id)  // 
	{
		String name;
		
		if(id==101)
		{
			name="Sujal";	
		}
		else if(id==102)
		{
			name="Sudhir";
		}
		else
		{
			name=null;
		}
		return Optional.ofNullable(name); //
	}
}

public class _08_Optional_Class_PredifinedMethod {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter the  Id :");
		int id=sc.nextInt();  // takig input to id 
		
		Usser u=new Usser();
		Optional<String> data=u.getdata(id);   //
		
		if(data.isPresent())
		{
			//String up=data.get().toUpperCase();
			System.out.println(data.get().toUpperCase());
		}
		else
		{  
			System.out.println("Data not found ");
		}
	}

}
