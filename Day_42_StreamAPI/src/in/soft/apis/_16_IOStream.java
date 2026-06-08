package in.soft.apis;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class _16_IOStream {

	public static void main(String[] args) throws Exception 
	{
		
		String line="D:/IOS_file/FilesStream.txt";
		Stream<String> li = Files.lines(Paths.get(line));
		li.forEach(s->System.out.println(s));
	}

}
