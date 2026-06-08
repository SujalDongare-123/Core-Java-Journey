//if we want to check the daemon theads come from 

package in.softronix;

class Stdd extends Thread
{

	public void run()
	{
		
		System.out.println("in start "+Thread.currentThread().getName());
		while(true) 
		{
			if(Thread.currentThread().isDaemon())
			{
				System.out.println("in daemon method "+Thread.currentThread().getName());
			}
			else
			{
				System.out.println("in daemon method "+Thread.currentThread().getName());
			}
		}
	}
}

public class DaemanThread01 {

	public static void main(String[] args) 
	{
		Stdd s=new Stdd();
		
		Thread t1=new Thread(s);
		Thread t2=new Thread(s);
		Thread t3=new Thread(s);
		
		t1.setDaemon(true);//deamons thread used to stop the process until the main process is run
		
		t1.setName("thread t1");
		t2.setName("Thread t2");
		
		t1.start();
		t2.start();
		
		for (int i = 0; i < 10; i++) 
		{
			System.out.println(" in main"+Thread.currentThread().getName());
		}

	}

}
