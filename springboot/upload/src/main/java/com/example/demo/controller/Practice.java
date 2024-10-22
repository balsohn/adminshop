package com.example.demo.controller;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.example.demo.utils.MyUtils;

import jakarta.servlet.http.HttpServletRequest;


public class Practice {

	@RequestMapping("uploadOk2")
	public String uploadOk2(HttpServletRequest request) throws Exception {
	    System.out.println("파일 업로드 요청이 처리되었습니다.");
	    MultipartHttpServletRequest multi = (MultipartHttpServletRequest) request;
	    List<MultipartFile> files = multi.getFiles("files");

	    for (MultipartFile file : files) {
	        String fname = file.getOriginalFilename();
	        
	        // MIME 타입을 확인하여 이미지 파일인지 체크
	        String mimeType = file.getContentType();
	        if (mimeType != null && mimeType.startsWith("image/")) {
	            System.out.println(fname + "은(는) 이미지 파일입니다. (" + mimeType + ")");
	            // 이미지 파일 처리 로직
	        } else {
	            System.out.println(fname + "은(는) 이미지 파일이 아닙니다. (" + mimeType + ")");
	            // 다른 파일 처리 로직
	        }

	        // 파일 저장 경로 설정
	        String uploadDir = System.getProperty("user.dir") + "/uploads";
	        File uploadDirectory = new File(uploadDir);
	        if (!uploadDirectory.exists()) {
	            uploadDirectory.mkdirs();
	        }
	        String str = uploadDir + "/" + fname;

	        str = MyUtils.getFileName(fname, str);
	        Path path = Paths.get(str);
	        Files.copy(file.getInputStream(), path, StandardCopyOption.REPLACE_EXISTING);

	        System.out.println(fname + "이(가) 성공적으로 업로드되었습니다.");
	    }

	    return "redirect:/upload";
	}

}
