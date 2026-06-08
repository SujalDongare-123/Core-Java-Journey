package softronix.in;

import java.util.Comparator;
import java.util.TreeMap;

class com implements Comparator<Emp>
{

	@Override
	public int compare(Emp o1, Emp o2) {
		
		int c = o1.name.compareTo(o2.name);
		return c;
	}
	
}

class Emp
{
	
	int id;
	String name;
	int sal;
	
	public Emp(int id, String name, int sal)
	{
		this.id = id;
		this.name = name;
		this.sal = sal;
	}

	
	
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
	
	
	
	
	



}

public class _02_Map_TreeMap {

	public static void main(String[] args) 
	{
		Emp em1= new Emp(101,"soft",50000);
		Emp em2= new Emp(102,"soft2",55000);
		Emp em3= new Emp(103,"soft3",50600);
		Emp em4= new Emp(104,"soft4",70000);
		Emp em5= new Emp(105,"soft5",59000);
		
		TreeMap tm=new TreeMap(new com());
		
		tm.put(em1, "emp1");
		tm.put(em2, "emp2");
		tm.put(em3, "emp3");
		tm.put(em4, "emp4");
		
		System.out.println(tm);
		
		
	}

}
