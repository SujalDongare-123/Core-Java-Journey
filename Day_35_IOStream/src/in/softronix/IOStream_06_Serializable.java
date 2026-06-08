package in.softronix;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//Serializable  is a marker interface which is used for Authentification.

class Employee implements Serializable
{
	int id;
	String name;
	int sal;
	
	public Employee(int id, String name, int sal)
	{
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	
	String getdata()
	{
		
		System.out.println("Employee Details /n"+ " id:"+id+ "  name:"+name+ " sal:"+sal);
		return " employee details serialize............";
		
	}	
}

public class IOStream_06_Serializable {

	public static void main(String[] args) throws Exception 
	{
		
		
		//Serialization   :- Convert Object  to  byteStream 
		
		Employee emp=new Employee(101, "sujal", 5000);
		
		FileOutputStream fis=new FileOutputStream("D:/IOS_file/Serializable.txt");
		
		ObjectOutputStream os=new ObjectOutputStream(fis);
		
		os.writeObject(emp);
		os.close();
		fis.close();

	}

}
