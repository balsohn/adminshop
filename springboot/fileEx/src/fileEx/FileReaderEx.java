package fileEx;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReaderEx {
	public static void main(String[] args) throws Exception {
		// 파일을 읽는 클래스
		// 2가지가 존재 char단위 byte단위
		
		FileReader fr=new FileReader("c:/board/pom.xml");
		
		while(true) {
			int ch=fr.read();
			if(ch==-1) {
				break;
			} else {
				System.out.print((char)ch);
			}
		}
		fr.close();
	}
}
