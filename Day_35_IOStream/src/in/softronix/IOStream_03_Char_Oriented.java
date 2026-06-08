package in.softronix;

import java.io.FileWriter;

public class IOStream_03_Char_Oriented 
{
	public static void main(String[] args) throws Exception
	{
		
		FileWriter fw=new FileWriter("D:/IOS_file/Soft.txt");
		
		String name="Softronix";
		
		char[] c=name.toCharArray();
		
		for (char x : c)
		{
			System.out.println(x);
		}
		
		fw.write(c);// write method 
		fw.close();

	
	}

}
