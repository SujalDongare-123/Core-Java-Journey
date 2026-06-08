//single  level inheritance 
package in.soft.single;

class Student//parent class; superclass ;base class 
	{
	
	public void exam()
		{
			System.out.println("my test done ");
		}
	
	public void tt()
		{
			System.out.println("time table announced succesfully ");
		}
		
	}

class Teacher extends Student  // child class ; subclass ; derived class 
{
	public void result()
	{
		System.out.println("result declared ...");
	}
}

public class Single {

	public static void main(String[] args) {
		
		Teacher t=new Teacher();
		t.tt();
		t.exam();
		t.result();
		

	}

}
