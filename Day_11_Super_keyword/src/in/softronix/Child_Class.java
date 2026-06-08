package in.softronix;

class Child extends Parent_Class
{
	
	int age=32;
	String name="Dongare";
	String loc="pune";
	
	public void p() {
		
		System.out.println("this is super class means from  parent class");
		
		System.out.println(super.age);
		System.out.println(super.name);
		System.out.println(super.loc);
		
		System.out.println("using this keword variable");
		
		System.out.println(this.age);
		System.out.println(this.name);
		System.out.println(this.loc);
		
		
		System.out.println("I am in Child class ");
	}
	
	public void show() {
		
		this.p();//call child class
		System.out.println("This is going to parent class ");
		super.p();//call parent class method 
	}
}

public class Child_Class {

	public static void main(String[] args) {
		
		Child c=new Child();
		c.show();	
	}

}
