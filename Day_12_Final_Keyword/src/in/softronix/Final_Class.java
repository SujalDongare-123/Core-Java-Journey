package in.softronix;

final class Student1
{
	final int id=101;
	float sal=50000;
	String name="sujal";
	
	
	public void data() 
	{
		//id=102;// variable can`t be modified 
		sal=9000;
		System.out.println("id :"+id);
		System.out.println("sal:"+sal);
		System.out.println("sal:"+this.sal);
		System.out.println("name:"+name);
	}
	
}

class Teacher1 extends Student1{  // if we put final keyword to the class then inheritance is not allowed
	
	public void show() 
	{
		data();
	}
}

public class Final_Class {

	public static void main(String[] args) {
		Teacher1 t=new Teacher1();
		
		

	}

}
