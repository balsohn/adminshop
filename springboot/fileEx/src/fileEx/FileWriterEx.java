package fileEx;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterEx {
	public static void main(String[] args) throws Exception {
		FileWriter fw=new FileWriter("c:/board/pkc.txt",true);
		
		Scanner sc=new Scanner(System.in);
		
		String str=sc.nextLine();
		fw.write(str);
		
		fw.close();
	}
}
