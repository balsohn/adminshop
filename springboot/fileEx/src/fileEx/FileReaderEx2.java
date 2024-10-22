package fileEx;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReaderEx2 {
	public static void main(String[] args) throws Exception {
		FileReader file=new FileReader("c:/board/pom.xml");
		int ch;
		while((ch=file.read())!=-1) {
			System.out.print((char)ch);
		}
		file.close();
	}
}
