  package softronix.BlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;

public class BlockingQueue_01 {

	public static void main(String[] args)
	{
		
		BlockingQueue b=new ArrayBlockingQueue(4);
		
		try {
			b.put("siya");//Inserts the specified element into this queue, waiting if necessary for space to become available
			b.put("viya");
			b.put("riya");
			b.put("liya");
		
		
			
			
			b.take();//Retrieves and removes the head of this queue, waiting if necessary until an element becomes available.
		
		
	
			
		} catch (InterruptedException e)
		{
	
			e.printStackTrace();
		}
		
		System.out.println(b);

	}

}
