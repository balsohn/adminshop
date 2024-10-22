package kr.co.board.dto;

import lombok.Data;

@Data
public class BoardDTO {
	private String title, name, pwd, content, writeday, fname;
	private int id, readnum;
	
}
