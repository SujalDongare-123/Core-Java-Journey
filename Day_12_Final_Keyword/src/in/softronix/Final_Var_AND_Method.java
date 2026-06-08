package in.softronix;

class Student
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

class Teacher extends Student{
	
	public void show() 
	{
		data();
	}
}

public class Final_Var_AND_Method {

	public static void main(String[] args) {
		
		Teacher t=new Teacher();
		t.show();
	}

}
