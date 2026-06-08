package softronix.in;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;


class Campare implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2)
	{
	    System.out.println(o1.name);
	    System.out.println(o2.name);
	
	int com = o1.name.compareTo(o2.name); // sujal.copareTo(sujal)
	System.out.println(com);
	
	return com;
	}
	
}



class Employee{
	
    int id;
	String name;
	String loc;

	public Employee(int id, String name, String loc) {
		
		this.id=id;
		this.name = name;
		this.loc = loc;
	}

	@Override
	public String toString() {
	return "Employee [ NAME=" + name + ", LOC=" + loc + " ID=  "+id+"]";
	}
}

public class Queue_02 {

	public static void main(String[] args)
	{
		Employee e=new Employee(101,"Sujal", "Nagpur");
		Employee e1=new Employee(102,"Bahil", "pune");
		Employee e2=new Employee(103,"Deepanshu", "Delhi");
		Employee e3=new Employee(104,"Anurag", "Hydrabad");
		
		
		
		 Queue a2= new PriorityQueue(new Campare());
		 
			a2.offer(e);
			a2.offer(e1);
		    a2.offer(e2);
			a2.offer(e3);
			 
			 System.out.println(a2);
	}

}
