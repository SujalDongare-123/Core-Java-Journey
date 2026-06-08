package in.softtronix;

import java.util.StringJoiner;

public class _05_StringJoiner {

	public static void main(String[] args)
	{
		StringJoiner sj=new StringJoiner("-");
		
		sj.add("Softronix");
		sj.add("Software");
		sj.add("Services");
		
		System.out.println(sj);
		
		
        StringJoiner s=new StringJoiner("-","{","}");
		s.add("Softronix");
		s.add("IT");
		s.add("Services");
		
		System.out.println(s);
		
		
		

	}

}
