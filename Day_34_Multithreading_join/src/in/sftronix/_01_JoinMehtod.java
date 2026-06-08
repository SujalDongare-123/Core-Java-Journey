package in.sftronix;

class Emp extends Thread
{
	
	public void run()
	{
	for(int i=0;i<10;i++)
		{
		 	System.out.println(Thread.currentThread().getName());
		}
	}
}

public class _01_JoinMehtod 
{

	public static void main(String[] args) throws InterruptedException 
	{
		Emp e1=new Emp();
		
		Thread t1=new Thread(e1);
		Thread t2=new Thread(e1);
		Thread t3=new Thread(e1);
		Thread t4=new Thread(e1);
		
		
		t1.setName("t1");
		t2.setName("t2");
		t3.setName("t3");
		t4.setName("t4");
		
		t1.start();
		t1.join();
		
		t2.start();
		t2.join();
		
		t3.start();
		t3.join();
		
		t4.start();
		
		
		
		
		
		
		
	

	}

}
