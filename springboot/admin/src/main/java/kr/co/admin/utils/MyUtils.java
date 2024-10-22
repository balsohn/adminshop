package kr.co.admin.utils;

import java.io.File;

public class MyUtils {

	// 경로와 파일명이 전달되면 파일명 중복체크하여
	// 중복되지 않는 파일명을 리턴해주는 메소드
	public static String getFileName(String fname, String str) {
		
		File ff=new File(str);
	    
	    while(ff.exists()) {
	    	System.out.println("존재한다");
	    	String ran="1234567890qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
	    	
	    	String ranword="";
	    	
	    	for(int i=0;i<4;i++) {
	    		int index=(int)(Math.random()*ran.length());
	    		ranword+=ran.substring(index,index+1);
	    	}
	    	System.out.println(ranword);
	    	int index=str.lastIndexOf(".");
	    	String front=str.substring(0,index);
	    	String back=str.substring(index);
	    	
	    	String nstr=front+ranword+back;
	    	str=nstr;
	    	ff=new File(str);
	    }
	    
	    return str;

	}
}
