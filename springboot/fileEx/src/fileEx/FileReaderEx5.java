package fileEx;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReaderEx5 {
	public static void main(String[] args) throws Exception {
		FileReader file=new FileReader("c:/board/pom.xml");
		
		char[] input=new char[100];
		String str="";
		int ch;
		while((ch=file.read(input))==-1) {
			str+=new String(input);
		}
		System.out.println(str);
		file.close();
	}
}
