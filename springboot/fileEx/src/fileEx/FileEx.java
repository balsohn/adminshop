package fileEx;

import java.io.File;

public class FileEx {
	public static void main(String[] args) {
		File file=new File("c:/board");
		
		String[] files=file.list(); // 디렉토리 내의 목록을 배열로 리턴해준다.
		System.out.println(files.length);
		
		for(int i=0;i<files.length;i++) {
			System.out.print(files[i]+" ");
			File file2=new File("c:/board/"+files[i]);
			if(file2.isDirectory()) {
				System.out.print(":디렉토리");
			} else {
				System.out.print(":파일");
			}
			System.out.println();
		}
	}
}
