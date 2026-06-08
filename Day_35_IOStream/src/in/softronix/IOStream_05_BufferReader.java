package in.softronix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOStream_05_BufferReader {

	public static void main(String[] args) throws Exception
	{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the String....");
		
		String line=br.readLine();
		System.out.println(line);
		
		int i = br.read();
		
		System.out.println(i);
 
	}

}
