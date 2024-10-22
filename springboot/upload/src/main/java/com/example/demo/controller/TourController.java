package com.example.demo.controller;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Iterator;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.example.demo.dto.TourDTO;
import com.example.demo.mapper.TourMapper;
import com.example.demo.utils.MyUtils;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class TourController {

	@Autowired
	private TourMapper mapper;
	
	@RequestMapping("list")
	public String list(Model model) {
		ArrayList<TourDTO> list=mapper.list();
		model.addAttribute("tlist",list);
		
		return "list";
	}
	
	@RequestMapping("write")
	public String write() {
		return "write";
	}
	
	@RequestMapping("writeOk")
	public String writeOk(TourDTO tdto, MultipartHttpServletRequest multi) throws Exception {
		// 제목, 이름, 비밀번호, 내용은 tdto에 있다.
		// fname(서버에 저장되는 파일들) , ofname(클라이언트에서 업로드한 원래파일 이름들)
		Iterator<String> imsi=multi.getFileNames(); //type="file"의 name들
		
		String fname="";	// 디비에 저장될 파일명
		String ofname=""; // 클라이언트에서 보낸 파일명
		while(imsi.hasNext()) {
			String name=imsi.next(); // type="file" 하나의 name
			MultipartFile file=multi.getFile(name);
			
			if (file != null && !file.isEmpty()) {
			// 클라이언트에서의 업로드 된 파일명
			String preName=file.getOriginalFilename();
			ofname+=preName+"/";
			
			// 경로와 파일명을 통해서 중복체크를 한 후에 fname에 누적하고 복사
			String str=ResourceUtils.getFile("classpath:static/file").toPath().toString()+"/"+preName;
			System.out.println(str);
			// 중복 체크 메소드에 매개변수 전달
			str=MyUtils.getFileName(preName, str);
			String saveFname=str.substring(str.lastIndexOf("/")+1);
			fname+=saveFname+"/";
			
			// 해당 파일을 서버에 저장
			Path path=Paths.get(str);
			Files.copy(file.getInputStream(), path, StandardCopyOption.REPLACE_EXISTING);
			}
		}
				
		tdto.setFname(fname);
		tdto.setOfname(ofname);
		
		mapper.writeOk(tdto);
		
		return "redirect:list";
	}
	
	@RequestMapping("content")
	public String content(HttpServletRequest request,Model model) throws Exception {
		int id=Integer.parseInt(request.getParameter("id"));
		TourDTO tdto=mapper.content(id);
		tdto.setContent(tdto.getContent().replace("\r\n", "<br>"));
		
		
		String[] files=tdto.getFname().split("/");
		String[] ofiles=tdto.getOfname().split("/");
		
		String[] fileLength=new String[files.length];
		for(int i=0;i<files.length;i++) {
			String str=ResourceUtils.getFile("classpath:static/file")+"/"+files[i];
			File file=new File(str);
			long size=file.length();
			String size2=null;
			if(size>1024) {
				size=size/1024;
				size2=size+"kb";
				if(size>1024) {
					size=size/1024;
					size2=size+"MB";
				}
			} else {
				size2=size+"b";
			}
			fileLength[i]=size2;
		}
		
		tdto.setFileLength(fileLength);
		model.addAttribute("fname",files);
		model.addAttribute("ofname",ofiles);
		model.addAttribute("tdto",tdto);
		
		return "content";
		
	}
	
	@RequestMapping("/down")
	public void down(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String fname=request.getParameter("fname");
		String ofname=request.getParameter("ofname");
		
		response.setHeader("Content-type", "application/octet-stream");
		ofname=URLEncoder.encode(ofname,"utf-8");
		response.setHeader("Content-Disposition", "attachment; filename="+ofname);
		response.setContentType("application/unknown");
		
		String str=ResourceUtils.getFile("classpath:static/file").toPath()+"/"+fname;
		FileInputStream fis=new FileInputStream(str);
		BufferedInputStream bis=new BufferedInputStream(fis);
		BufferedOutputStream bos=new BufferedOutputStream(response.getOutputStream());
		
		byte[] input=new byte[1000];
		
		int ch;
		while((ch=bis.read(input))!=-1) {
			bos.write(input);
			input=new byte[1000];
		}
		
		bis.close();
		bos.close();
		fis.close();
		
		
	}
	
	@RequestMapping("/down2")
	public void down2(HttpServletRequest request, HttpServletResponse response) throws Exception {
	    String fname = request.getParameter("fname");
	    String ofname = request.getParameter("ofname");

	    // 응답 헤더 설정
	    response.setHeader("Content-Type", "application/octet-stream");
	    ofname = URLEncoder.encode(ofname, "utf-8");
	    response.setHeader("Content-Disposition", "attachment; filename=" + ofname);

	    // 파일 경로 설정
	    String str = ResourceUtils.getFile("classpath:static/file").toPath() + "/" + fname;
	    Path path = Paths.get(str);

	    // 파일을 응답으로 전송
	    Files.copy(path, response.getOutputStream());
	    response.getOutputStream().flush();
	}
	
	@RequestMapping("delete")
	public String delete(TourDTO tdto) throws Exception {
		
		if(mapper.isPwd(tdto)) {
			String fname=mapper.getFname(tdto.getId());
			if(!fname.isEmpty()) {
				String[] fnames=fname.split("/");
				
				for(int i=0;i< fnames.length;i++) {
					String str=ResourceUtils.getFile("classpath:static/file").toPath()+"/"+fnames[i];
					Path path=Paths.get(str);
					
					if(Files.exists(path)) {
						Files.delete(path);
					}
					
				/*	File file=new File(str);
					if(file.exists()) {
						file.delete();
					}*/
				}
				
			}
			
			mapper.delete(tdto.getId());
			
			return "redirect:list";
		} else {
			return "redirect:content?err=1&id="+tdto.getId();
		}
		
	}
	
	@RequestMapping("update")
	public String update(TourDTO tdto, Model model) {
		tdto=mapper.content(tdto.getId());
		
		String[] fnames=tdto.getFname().split("/");
		tdto.setFnames(fnames);
		model.addAttribute("tdto", tdto);
		return "update";
	}
	/*
	@RequestMapping("/updateOk")
	public String updateOk(MultipartHttpServletRequest multi, TourDTO tdto) throws Exception
	{
		if(mapper.isPwd(tdto))
		{
		    // 수정작업	
			String delImg=multi.getParameter("delImg");
			String safeImg=multi.getParameter("safeImg");
			
			// 새로 추가되는 이름
			Iterator<String> imsi=multi.getFileNames(); // type="file"의 name들
			
			// 추가되는 그림의 이름집합(원본, 서버에저장)
			String fname=""; // 서버에 저장되는 이름
			String ofname=""; // 원본 이름
			while(imsi.hasNext())
			{
				String formName=imsi.next();
				MultipartFile file=multi.getFile(formName);
				
				if(!file.isEmpty())
				{
					// 원본이름
					String preName=file.getOriginalFilename(); 
					ofname=ofname+preName+"/";
					
					String str=ResourceUtils.getFile("classpath:static/file").toPath()+"/"+preName;
					
					// MyUtils.getFileName(원본이름,경로+파일명)
					str=MyUtils.getFileName(preName, str); // 중복이 없는 경로+파일명
					// c:/springboot/upload/target/classes/static/file/파일명
					
					// 바뀐 파일명
				    String saveFname=str.substring(str.lastIndexOf("/")+1); // 서버에 저장할 이름
				    fname=fname+saveFname+"/";
				    
				    // 파일을 저장
				    Path path=Paths.get(str);
				    Files.copy(file.getInputStream(), path, StandardCopyOption.REPLACE_EXISTING);
				}
				
			}
			
			// 테이블의 fname필드에 저장될 값은 추가된 fname변수의 값과 safeImg의 변수의 값을 더하면 된다..
			//fname=fname+safeImg;
			
			// 테이블 ofname필드의 값은 ofname변수 + ofname필드의 값에서 삭제되는 원본을 제외시킨 파일명 
			
			// delImg를 배열로
			String[] delImgs=delImg.split("/"); // 삭제되는 서버에 저장된 파일명
			// 테이블에 있는 fname(저장된파일명들), ofname(원본파일명들)을 가져와서 배열로 만든다
			TourDTO tdto2=mapper.getFiles(tdto.getId());
			String[] fnames=tdto2.getFname().split("/");
			String[] ofnames=tdto2.getOfname().split("/");
			
			// 보존할 원본이름의 문자열변수
			String oname2="";
			String fname2="";
			for(int i=0;i<delImgs.length;i++)
			{
				System.out.println("삭제");
				for(int j=0;j<fnames.length;j++)
				{
					if(delImgs[i].equals(fnames[j]))
					{
						// 같은 인덱스의 원본파일은 존재해야 된다..
						/*
						oname2=oname2+ofnames[j]+"/";
						fname2=fname2+fnames[j]+"/";
						System.out.println(i+" "+oname2);
						System.out.println(i+" "+fname2);
						*//*
						ofnames[j]=""; // 삭제되는 파일에 해당하는 인덱스의 내용을 비운다
						fnames[j]="";
					}
				}
			}
			for(int i=0;i<fnames.length;i++) // 삭제하는 파일명은 빈칸으로 처리 되어있다..
			{
				if(fnames[i]!="") // 빈칸이 아닌 값들만 문자열로 처리
				{
					oname2=oname2+ofnames[i]+"/";
					fname2=fname2+fnames[i]+"/";
				}
			}
			ofname=ofname+oname2;
			fname=fname+fname2;
			System.out.println(fname);
			// tdto에 위의 값을 저장하고 데이터베이스에 저장하기
			tdto.setOfname(ofname);
			tdto.setFname(fname);
			
			mapper.updateOk(tdto);
			
			return "redirect:/content?id="+tdto.getId();
		}
		else 
		{
			// update로 이동
			return "redirect:/update?id="+tdto.getId();
		}	
	}
	*/

/*	@RequestMapping("/updateOk")
	public String updateOk(MultipartHttpServletRequest multi, TourDTO tdto) throws Exception
	{
		if(mapper.isPwd(tdto))
		{
		    // 수정작업	
			String delImg=multi.getParameter("delImg");
			String safeImg=multi.getParameter("safeImg");
			String safeOimg=multi.getParameter("safeOimg");
			
			// delImg에 있는 삭제할 파일을 삭제하기
			String[] delImgs=delImg.split("/");
			for(int i=0;i<delImgs.length;i++)
			{
				String str=ResourceUtils.getFile("classpath:static/file").toString()+"/"+delImgs[i];
				File file=new File(str);
				if(file.exists())
					file.delete();
			}
			
					
			
			// 새로 추가되는 이름
			Iterator<String> imsi=multi.getFileNames(); // type="file"의 name들
			
			// 추가되는 그림의 이름집합(원본, 서버에저장)
			String fname=""; // 서버에 저장되는 이름
			String ofname=""; // 원본 이름
			while(imsi.hasNext())
			{
				String formName=imsi.next();
				MultipartFile file=multi.getFile(formName);
				
				if(!file.isEmpty())
				{
					// 원본이름
					String preName=file.getOriginalFilename(); 
					ofname=ofname+preName+"/";
					
					String str=ResourceUtils.getFile("classpath:static/file").toPath()+"/"+preName;
					
					// MyUtils.getFileName(원본이름,경로+파일명)
					str=MyUtils.getFileName(preName, str); // 중복이 없는 경로+파일명
					// c:/springboot/upload/target/classes/static/file/파일명
					
					// 바뀐 파일명
				    String saveFname=str.substring(str.lastIndexOf("/")+1); // 서버에 저장할 이름
				    fname=fname+saveFname+"/";
				    
				    // 파일을 저장
				    Path path=Paths.get(str);
				    Files.copy(file.getInputStream(), path, StandardCopyOption.REPLACE_EXISTING);
				}
				
			}
			
			fname=fname+safeImg;
			ofname=ofname+safeOimg;
			
			tdto.setFname(fname);
			tdto.setOfname(ofname);
			
			mapper.updateOk(tdto);
 
			return "redirect:/content?id="+tdto.getId();
		}
		else 
		{
			// update로 이동
			return "redirect:/update?id="+tdto.getId();
		}
	}*/
	
	@RequestMapping("updateOk")
	public String updateOk(MultipartHttpServletRequest multi,TourDTO tdto) throws Exception {
		String delImg=multi.getParameter("delImg");
		System.out.println(delImg);
		String[] delImgs=delImg.split("/");
		
		tdto=mapper.getFiles(tdto.getId());
		String[] fnames=tdto.getFname().split("/");
		String[] ofnames=tdto.getOfname().split("/");
		
		String fname=tdto.getFname();
		String ofname=tdto.getOfname();
		System.out.println("저장되있는 fname"+fname);
		System.out.println("저장되있는 원본"+ofname);
		String uploadDir="C:\\springboot\\upload\\target\\classes\\static\\file/";
		
		for(int i=0;i<delImgs.length;i++) {
			fname=fname.replace(fnames[Integer.parseInt(delImgs[i])]+"/", "");
			ofname=ofname.replace(ofnames[Integer.parseInt(delImgs[i])]+"/","");
			Path path=Paths.get(uploadDir+fnames[Integer.parseInt(delImgs[i])]);
			if(Files.exists(path)) {
				Files.delete(path);				
			}
			System.out.println(fnames[Integer.parseInt(delImgs[i])]);
			System.out.println(ofnames[Integer.parseInt(delImgs[i])]);
		}
		
		Iterator<String> imsi=multi.getFileNames();
		
		String newOname="";
		String newFname="";
		while(imsi.hasNext()) {
			String newName=imsi.next();
			MultipartFile file=multi.getFile(newName);
			
			if(!file.isEmpty()) {
				String preName=file.getOriginalFilename();
				newOname+=preName+"/";
				
				String str=ResourceUtils.getFile("classpath:static/file").toPath()+"/"+preName;
				
				str=MyUtils.getFileName(preName, str);
				
				String saveFname=str.substring(str.lastIndexOf("/")+1);
				newFname+=saveFname+"/";
				
				Path path=Paths.get(str);
				Files.copy(file.getInputStream(), path, StandardCopyOption.REPLACE_EXISTING);
			}
		}
		fname=fname+newFname;
		ofname=ofname+newOname;
		
		tdto.setFname(fname);
		tdto.setOfname(ofname);
		mapper.updateOk(tdto);
		
		return null;
	}
}
