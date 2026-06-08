package in.softronix;

class Data
{
	int id=101;
	int age=25;
	String name="Siya";
	String des="dev";
	
	void show()
	{
		System.out.println("------Employee Details------");
		System.out.println("Emp id :"+id);
		System.out.println("Emp name:"+name);
		System.out.println("Emp age:"+age);
		System.out.println("Emp Des:"+des);
	}
}

public class Employee {

	public static void main(String[] args) {
		
		Data d=new Data();
		Data d1=new Data();
		d.show();
		d1.show();
		

	}

}
