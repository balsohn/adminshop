package kr.co.oracle;

import lombok.Data;

@Data
public class BoardDTO {

	private int id,readnum;
	private String title,name,content,pwd,writeday;
}
