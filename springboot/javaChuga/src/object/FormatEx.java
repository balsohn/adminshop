package object;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatEx {
	public static void main(String[] args) {
		
		Date today=new Date();
	
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(today));
		
		sdf=new SimpleDateFormat("YY-MM-dd");
		System.out.println(sdf.format(today));
		
		sdf=new SimpleDateFormat("YYMMdd");
		System.out.println(sdf.format(today));
		
		sdf=new SimpleDateFormat("오늘은 E요일");
		System.out.println(sdf.format(today));
	}
}
