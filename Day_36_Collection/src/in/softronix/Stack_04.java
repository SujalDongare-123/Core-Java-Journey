package in.softronix;
import java.util.Stack;
public class Stack_04 {

	public static void main(String[] args) {
		
		Stack<String> st =new Stack<String>();
		
		System.out.println(st);
		
		st.push("Sujal");
		st.push("daddu");
		
		st.push("abhya");
		st.push("babya");
		
		st.push("prathamesh");
		st.push("priyanshu");
		
		System.out.println(st);
	
		System.out.println(st.pop());
		System.out.println(st.pop());
		
		System.out.println(st);
		
		
		System.out.println(st.peek());
		
		System.out.println(st.search("Sujal"));
		

	}

}
