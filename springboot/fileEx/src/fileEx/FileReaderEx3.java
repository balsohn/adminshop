package fileEx;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReaderEx3 {
	public static void main(String[] args) throws Exception {
		FileReader file=new FileReader("c:/board/pom.xml");
		
		
		char[] input=new char[100];
		
		int ch=file.read(input);
		
		System.out.print( new String(input,0,ch));
		file.close();
	}
}
