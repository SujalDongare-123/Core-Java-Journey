package in.soft.garbage;

class Call
{
	
	int id;
	String name;
	
	
	public Call() 
	{
		System.out.println("Default Constructor ");
	}
	
	public Call(int id, String name) {
		this.id = id;
		this.name = name;
	}
    public void show()
    {
    	System.out.println("id  :" +id);
    	System.out.println("name : "+name);
    	
    }


	@Override
	protected void finalize() throws Throwable
	{

		System.out.println("Destroy object ");
	}
	

}

public class GarbageCollection 
{

	public static void main(String[] args)
	{
		Call c1=new Call(45,"siya");
		Call c2=new Call();
		
	
	
		c1.show();
		c2=null;
		
	
		System.gc();
		System.out.println("After Garbage Collection in main ");

	}

}
