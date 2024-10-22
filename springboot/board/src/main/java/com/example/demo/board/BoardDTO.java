package com.example.demo.board;

import lombok.Data;

@Data
public class BoardDTO {

	private String title,name,pwd,content,writeday;
	private int id,readnum;
}
