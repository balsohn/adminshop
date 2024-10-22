package kr.co.thboard;

import lombok.Data;

@Data
public class BoardDTO {

	private int id,readnum;
	private String title,name,content,pwd,writeday;
}
