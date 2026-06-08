


package in.softronix;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Wish implements Callable
{

	@Override
	public synchronized Object call() throws Exception {
		
		for (int i = 0;i<=10; i++) 
		{
			System.out.println("in call"+Thread.currentThread().getName());
		}
		return "Welcome";
	}
}

public class Calleable_Interface {

	public static void main(String[] args)
	{
		Wish w=new Wish();
	    ExecutorService pool = Executors.newFixedThreadPool(10);
	    
	      
	    for (int i = 0;i<=4; i++) 
		{
			pool.submit(w);
		}
	    
	    pool.shutdown();

	}

}
