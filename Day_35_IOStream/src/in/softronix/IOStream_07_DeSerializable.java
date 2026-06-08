package in.softronix;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

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

public class IOStream_07_DeSerializable {

	public static void main(String[] args) throws Exception 
	{
	Employee e=new Employee(101, "Sujal", 5000);
		
		FileInputStream fis=new FileInputStream("D:/IOS_file/Serializable.txt");
		
		ObjectInputStream oi=new ObjectInputStream(fis); 
		
Employee  ob = (Employee) oi.readObject();
		
		//ob.getdata();
		
		System.out.println("id :"+ob.id);
		System.out.println("sal :"+ob.sal);
		System.out.println("name :"+ob.name);
		
		
		oi.close();
		fis.close();
		
		
		

	}

}
