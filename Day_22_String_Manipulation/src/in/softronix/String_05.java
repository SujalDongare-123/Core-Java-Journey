package in.softronix;

public class String_05 {

	public static void main(String[] args) 
	{
		
		String s="Soft";
		String s1="Soft";
		
		String s2=s1;
		
		s1="Soft"+"tronix";    // String is not modified here  . a new String object is created . thats how immutability is preserved 
		
		// String are immutable , but String references are mutable . 
		System.out.println(s1==s1);
		System.out.println(s1.equals(s1));
		
		
		/*Example  int x=10;
		           x=20;  allowed 
		 same concept with String reference .   */
		
		
		
		System.out.println(s1); //Softronix
		System.out.println(s2);//Soft
		
		System.out.println(s1==s2);//false    (different objects )
		System.out.println(s1.equals(s2));//false(content also different )
		
		
		
		// memory :-   s1 and s2  are same  "soft"  i.e SCP  
		
		/*
		Step 2
		s1 = "Soft" + "tronix";


		⚠ Compile-time concatenation

		"Softtronix" is a new String object

		Stored in String Constant Pool

		s1 reference changes

		"Soft" object remains unchanged
		
		*/
		
		
		/*
		Memory now:

			s1 ───> "Softtronix"   (SCP)

			s2 ───> "Soft"         (SCP)
			
			
			🔥 THIS PROVES:

				"Soft" was NOT modified

				A new object was created

				Reference s1 was reassigned

				👉 Immutability is preserved
		*/
		

	}
}
