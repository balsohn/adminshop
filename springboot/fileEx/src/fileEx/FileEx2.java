package fileEx;

import java.io.File;

public class FileEx2 {
	public static void main(String[] args) {
		File file=new File("c:/board/pkc");
		if(!file.exists()) {
			file.mkdir();
		}
		
		File file2=new File("c:/board/asdf");
		file.renameTo(file2);
		
		if(file.exists()) {
			file.delete();
			file2.delete();
		}
		
		
	}
}
