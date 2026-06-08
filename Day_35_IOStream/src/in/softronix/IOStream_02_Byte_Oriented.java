package in.softronix;

import java.io.FileInputStream;


public class IOStream_02_Byte_Oriented {

	public static void main(String[] args) throws Exception
	{
		FileInputStream fis =new FileInputStream("D:/IOS_file/Stream.txt");
		
		byte[] by=new byte[5]; // we use here this to fixed the size we use 5 they show upto the 5 and if you want to show the whole then you have use the fi.available method above 
		fis.read(by);
		 
		String s=new String (by);
		System.out.println(s);
		
		fis.close();

		
		
		

	}

}
