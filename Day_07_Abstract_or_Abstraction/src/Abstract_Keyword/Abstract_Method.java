package Abstract_Keyword;

abstract class Manager{
	
	public Manager() {
		
	System.out.println("This is constructor in manager");
	}
	
	public void task() {
		System.out.println("This concrete method ");
	}
	
	abstract void show();
	
}

class Ceo extends Manager{

	@Override
	void show() {
		
	  System.out.println("This is abstract implimentation in CEO");
	}
	 
}



public class Abstract_Method {

	public static void main(String[] args) {
		
		Ceo c=new Ceo();
		c.task();
		c.show();

	}

}
