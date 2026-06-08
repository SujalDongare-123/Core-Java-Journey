package in.softronix.primitive;

//implicit typecasting or Widnning Typecasting
class Implicit
{
	int age=22; //var decration 
	
	long age2=age;
	
	public void show() 
	{
		System.out.println(age2);
	}
	
	
}

//Explicit TypeCasting  Or Narrowing typecasting
class Explicit
{
	double sal=50000.345;
	int salary=(int) sal;
	
}

public class PrimitiveTypeCasting {

	public static void main(String[] args) {
		
		
		Implicit i=new Implicit();
		i.show();
		
		Explicit em=new Explicit();
		System.out.println(em.salary);
	
		

	}

}
