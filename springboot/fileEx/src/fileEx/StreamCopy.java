package fileEx;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class StreamCopy {
	public static void main(String[] args) throws Exception {
		FileInputStream fis=new FileInputStream("c:/board/5-1.jpg");
		FileOutputStream fos=new FileOutputStream("c:/board/ppp.jpg");
		
		int ch;    
		while((ch=fis.read())!=-1) {
			fos.write(ch);
		}
		
		System.out.println(fos);
		
		
		fis.close();
		fos.close();
		
	}
}
