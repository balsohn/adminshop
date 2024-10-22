package fileEx;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class FileReaderEx4 {
	public static void main(String[] args) throws Exception {
		FileReader file=new FileReader("c:/board/pom.xml");
		
		char[] input=new char[100];
		String str="";
		while(true) {
			int ch=file.read(input);
			if(ch==-1) {
				break;
			}
			
			str+=new String(input);
		}
		System.out.println(str);
		
		FileWriter fw=new FileWriter("c:/board/pkc.txt");
		
		fw.write(str);
		
		fw.close();
		file.close();
	}
}
