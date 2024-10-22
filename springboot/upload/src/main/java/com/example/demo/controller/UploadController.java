package com.example.demo.controller;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.example.demo.mapper.TourMapper;
import com.example.demo.utils.MyUtils;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class UploadController {

	@Autowired
	private TourMapper mapper;
	
	@RequestMapping("/")
	public String home() {
		return "redirect:list";
	}
	
	@RequestMapping("upload")
	public String upload() {
		return "upload";
	}
	
/*	@RequestMapping("uploadOk")
	public String uploadOk(MultipartFile file) throws Exception {
		String fname=file.getOriginalFilename();
		System.out.println(fname);
		InputStream is=file.getInputStream();
		BufferedInputStream bis=new BufferedInputStream(is);
		Path path=ResourceUtils.getFile("classpath:static/file").toPath();
		System.out.println(path);
		FileOutputStream fos=new FileOutputStream(path+"/"+fname);
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		
		byte[] input=new byte[500];
		
		int ch;
		String str="";
		while((ch=bis.read(input))!=-1) {
			bos.write(input);
			input = new byte[500];
		}
		
		
		bos.close();
		fos.close();
		bis.close();
		is.close();
		
		return "redirect:/upload";
	}	*/
	
	@RequestMapping("uploadOk")
	public String uploadOk(MultipartFile file) throws Exception {
	    // 파일 이름 가져오기
		System.out.println("---uploadOk---");
	    String fname = file.getOriginalFilename();
	    // 파일 저장 경로 설정
	    String str = ResourceUtils.getFile("classpath:static/file").toPath()+"/"+fname;
	    
	    str=MyUtils.getFileName(fname, str);
	    String saveFile=str.substring(str.lastIndexOf("/")+1);
	    
	    
	    System.out.println(fname+":"+saveFile);
	    
	    // 파일을 해당 경로에 저장
	    Path path=Paths.get(str);
	    Files.copy(file.getInputStream(), path, StandardCopyOption.REPLACE_EXISTING);

	    return "redirect:/upload";
	}
	
	@RequestMapping("uploadOk2")
	public String uploadOk2(HttpServletRequest request) throws Exception {
	    MultipartHttpServletRequest multi=(MultipartHttpServletRequest) request;
	    
	    // 파일 리스트를 가져옴
	    List<MultipartFile> files=multi.getFiles("files");
	    
	    System.out.println("---uploadOk2---");
	    
	    String fnames="";
	    String saveFnames="";
	    for (MultipartFile file : files) {
	        String fname = file.getOriginalFilename();
	        // 파일 저장 경로 설정
	        String str = ResourceUtils.getFile("classpath:static/file").toPath() + "/" + fname;
	        
	        str = MyUtils.getFileName(fname, str);
	        String saveFile = str.substring(str.lastIndexOf("/") + 1);
	        fnames+=fname+"/";
	        saveFnames+=saveFile+"/";
	        
	        System.out.println(fname + ":" + saveFile);
	        
	        // 파일을 해당 경로에 저장
	        Path path = Paths.get(str);
	        Files.copy(file.getInputStream(), path, StandardCopyOption.REPLACE_EXISTING);
	    }
	    System.out.println("기존파일들: "+fnames);
	    System.out.println("중복으로 인한 파일명들: "+saveFnames);
	    return "redirect:/upload";
	}
	
	@RequestMapping("/multiUploadOk")
	public String multiUploadOk(MultipartHttpServletRequest multi) throws Exception {
		Iterator<String> imsi=multi.getFileNames();
		while(imsi.hasNext()) {
			String name=imsi.next(); // type="file"의 name
			MultipartFile file=multi.getFile(name);
			
			String fname=file.getOriginalFilename();
			String str=ResourceUtils.getFile("classpath:static/file").toString()+"/"+fname;					;
			
			str=MyUtils.getFileName(fname,str);
			
			String saveFname=str.substring(str.lastIndexOf("/")+1);
			
			System.out.println(fname+" : "+saveFname);
			
			Path path=Paths.get(str);
			
			Files.copy(file.getInputStream(), path, StandardCopyOption.REPLACE_EXISTING);
		}
		
		return "redirect:multiUpload";
	}

	
}
