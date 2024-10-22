package fileEx;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileInputStreamEx3 {
	public static void main(String[] args) throws Exception {
		
		FileInputStream fis=new FileInputStream("c:/board/pom.xml");
		byte[] input=new byte[100];
		int ch;
		String str="";
		while((ch=fis.read(input))!=-1) {
			str+=new String(input);
		}
		
		System.out.println(str);
		fis.close();
	}
}
