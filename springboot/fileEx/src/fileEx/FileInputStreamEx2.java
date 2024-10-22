package fileEx;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileInputStreamEx2 {
	public static void main(String[] args) throws Exception {
		
		FileInputStream fis=new FileInputStream("c:/board/pom.xml");
		
		byte[] input=new byte[100];
		
		fis.read(input);
		
		System.out.println(new String(input));
		
		fis.close();
	}
}
