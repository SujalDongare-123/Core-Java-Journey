package in.softronix;

import java.io.FileInputStream;

public class IOStream_02_01_Byte_Oriented {

	public static void main(String[] args) throws Exception
	{
		FileInputStream fis =new FileInputStream("D:/IOS_file/Stream.txt");
		
		int size = fis.available();  // we use here available method means pura output dikhna chaiye jitna bhi file me store hai 
		System.out.println(size);
		
		byte[] by=new byte[size];
		fis.read(by);
		
		String s=new String (by);
		System.out.println(s);
		
		fis.close();

	}

}
