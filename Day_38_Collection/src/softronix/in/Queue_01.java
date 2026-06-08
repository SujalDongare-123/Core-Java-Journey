package softronix.in;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_01 {

	public static void main(String[] args)
	{
		 Queue a= new PriorityQueue();
		 
		 //we also can use the add method but it not follow the sorting order so it is inappropriate 
		 
		 a.add(10);
		 a.add(20);
		 a.add(40);
		 a.add(60);
		 a.add(30);
		 a.add(50);
		 
		 System.out.println(a);
		 
		 
		 Queue a1= new PriorityQueue();
		 
		// System.out.println(a1.element());   //f we access element() method on an empty Queue then element() method will rise an exception like java.util.NoSuchElementException

		 System.out.println(a1.peek());//f we access peek() method on an empty Queue then peek() will return "null“ value. 
		 
		 a1.offer("siya");
		 a1.offer("riya");
		 a1.offer("viya");
		 a1.offer("liya");
		 a1.offer("kiya");
		 
		 System.out.println(a1);
		 
		 System.out.println(a1.peek());//It can be used to return element from Queue.
		 System.out.println(a1.poll());  //It can be used to return and remove head element from Queue.
		 System.out.println(a1.remove());//It can be used to return and remove head element from Queue.
//Note : f we access poll() method on an empty Queue then poll() method will return "null“ value. If we access remove() method on an empty Queue then remove() method will rise an exception like "java.util.NoSuchElementException".
		 System.out.println(a1);
		 
		 
		 
	 Queue a2= new PriorityQueue();
		 
		a2.offer(9);
		a2.offer(2);
	    a2.offer(8);
		a2.offer(1);
		a2.offer(5);
		a2.offer(7);
		 
		 System.out.println(a2);
		 
		 
		 
	}

}
