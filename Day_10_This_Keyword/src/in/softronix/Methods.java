package in.softronix;

class A{
	
	int id;
	String name;
	String loc;
	int age;
	
	public void show(int id,String name, String loc, int age)
	{
		this.check();  //current class method call suing this keyword 
		System.out.println("+++++++++++++++++++++");
		this.id=id;
		this.name=name;
		this.loc=loc;
		this.age=age;
		
		System.out.println("id:"+id);
		System.out.println("name:"+name);
		System.out.println("loc:"+loc);
		System.out.println("age:"+age);
		
		System.out.println("+++++++++++++++++++++");
		
		this.check();
		
		
	}
	
	public void check() 
	{
		System.out.println("id:"+id);
		System.out.println("name:"+name);
		System.out.println("loc:"+loc);
		System.out.println("age:"+age);
	}
}

public class Methods {

	public static void main(String[] args) {
		
		A a=new A();
		a.show(101," sujal", "nagpur", 21);
		

	}

}
