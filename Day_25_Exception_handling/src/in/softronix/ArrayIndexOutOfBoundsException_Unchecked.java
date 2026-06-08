package in.softronix;

public class ArrayIndexOutOfBoundsException_Unchecked {

	public static void main(String[] args) {
		
		
		int[] a = {5, 10, 15};

        for (int i = 0; i <= a.length; i++) { 
            System.out.println(a[i]);
            
            
//            ❌ Why Error?
//
//            		a.length = 3
//
//            		Loop runs till i = 3
//
//            	a[3] is invalid
            
        }

	}

}
