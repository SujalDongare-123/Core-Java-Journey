package softronix.in;

import java.util.Comparator;
import java.util.TreeSet;

class Compare implements Comparator<Employee>{

	@Override
	public int compare(Employee loc1, Employee loc2) {
		    System.out.println(loc1.name);
		    System.out.println(loc2.name);
		
		int com = loc1.name.compareTo(loc2.name); // soft.copareTo(soft)
		System.out.println(com);
		
		return com;
	}

}


class Employee{
	
	int id;
	String name;
	String loc;
	float sal;
	
	
	public Employee(int id, String name, String loc, float sal) {
		
		this.id = id;
		this.name = name;
		this.loc = loc;
		this.sal = sal;
	}

	@Override
	public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", loc=" + loc + ", sal=" + sal + "]";
	}
}
public class Set_03_TreeSet {

	public static void main(String[] args) {
		
		Employee em1= new Employee(101,"soft","ngp", 50000);
		Employee em2= new Employee(102,"soft2","nashik", 55000);
		Employee em3= new Employee(103,"soft3","pune", 50600);
		Employee em4= new Employee(104,"soft4","mumbai", 70000);
		Employee em5= new Employee(105,"soft5","ngp", 59000);
		
		TreeSet t= new TreeSet(new Compare());

		t.add(em1);   
		t.add(em2);
		t.add(em3); 
		t.add(em4);  
		t.add(em5); 
		
		System.out.println(t);

	}

}
