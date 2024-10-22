package fileEx;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileInputStreamEx {
	public static void main(String[] args) throws Exception {
		
		FileInputStream fis=new FileInputStream("c:/board/pom.xml");
		
		int ch;
		while((ch=fis.read())!=-1) {
			System.out.print((char) ch);
		}
		
		System.out.println((char)ch);
		fis.close();
	}
}
