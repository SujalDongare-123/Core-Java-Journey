package in.softronix;

public class DemoBuilder {

	public static void main(String[] args) {
		
	StringBuilder sb=new StringBuilder("Softronix");
	
	System.out.println("before using the append method  ");
	
	System.out.println(sb);
	
	
	StringBuilder ap = sb.append("IT Solution ");
	
	
	System.out.println("After  using the append method  ");
	
	System.out.println(sb);
	
	

	}

}
