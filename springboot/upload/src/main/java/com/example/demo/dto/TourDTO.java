package com.example.demo.dto;

import lombok.Data;

@Data
public class TourDTO {
	private int id,readnum;
	private String title,name,pwd,content,fname,writeday,ofname;
	
	private String[] fnames,ofnames;
	private String[] fileLength;
}
