package in.softronix;

class Std extends Thread
{

	public void run()
	{
		
		System.out.println("in start "+Thread.currentThread().getName());
		while(true) 
		{
			System.out.println("in run "+Thread.currentThread().getName());
		}
	}
}

public class DaemanThread {

	public static void main(String[] args) 
	{
		Std s=new Std();
		
		Thread t1=new Thread(s);
//		Thread t2=new Thread(s);
//		Thread t3=new Thread(s);
//		
		t1.setDaemon(true);//deamons thread used to stop the process until the main process is run 
		
		t1.start();
		
		for (int i = 0; i < 10; i++) 
		{
			System.out.println(" in main"+Thread.currentThread().getName());
		}

	}

}
