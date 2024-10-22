package kr.co.serverProgram.dto;

import lombok.Data;

@Data
public class BoardDTO {

	private String title, name, content, fname, writeday;
	private int readnum, id;
	
}
