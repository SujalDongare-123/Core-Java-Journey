package in.softronix;

class Emp{
	
	private int id;
	protected String name;
	public String loc;
     	
	public Emp(int eid, String ename, String eloc) {
	
		id = eid;
		name = ename;
		loc = eloc;
	}
	
	void show() {
		
		System.out.println("id : "+id);
		System.out.println("name : "+name);
		System.out.println("loc : "+loc);
	}

}

public class Test {

	public static void main(String[] args) {
		
		Emp e=new Emp(2,"siya", "ngp");
		
		//System.out.println(e.id);  this is private var 
		System.out.println(e.name);
		System.out.println(e.loc);
		e.show();
		
	}

}